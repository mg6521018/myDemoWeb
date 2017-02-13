;
/**
 * 项目应用函数库.<br>
 * 主要提供一些前后端交互的函数,比如AJAX应用.<br>
 * 为方便项目扩展和管理,AJAX相关请求优先采用__.post函数,(不直接使用jQuery的ajax函数).<br>
 * 前端调用函数__.post传递数据时后台需要使用[com.icitic.framework.core.wabapp.base.AjaxBaseAction]类的子类进行数据交互.<br>
 * 
 * <pre>
 * //使用例子AJAX交互:
 * __.post('test.action',{data:'test'},function(response){
 * 	alert(response);
 * }
 * </pre>
 * 
 * @version 1.0 2014-01-25
 */

(function() {
	var __ = window.__;

	window.App = __;//别名

	var vI18nCache = {};
	var vMaskHash = {};
	var vDlgFnCache = {};

	window.__ = __ = ({
		id : (function() {
			var idSerial = 0;
			return function() {
				return '__' + (idSerial++);
			}
		})(),
		/**
		 * AJAX请求方法.<br>
		 * @param url 请求的URL
		 * @param data 传递到后台的数据
		 * @param callback ajax回调函数
		 */
		post : function(url, params, callback) {
			__.mask();
			if (typeof(params) === 'function') {
				callback = params;
				params = {};
			}
			for (var n in params) {
				var v = params[n];
				if (!!v) {
					if ($.isPlainObject(v)) {
						params[n] = $.encode(v);
					} else if ($.isArray(v)) {
						params[n] = $.encode(v);
					}
				}
			};
			$.post(url, params, function(response, status, xhr) {
				__.unmask();
				var headers = {};
				try {
					//alert(xhr.getAllResponseHeaders());
					var value = xhr.getResponseHeader('@REDIRECT');
					if (!$.isEmpty(value)) {
						__.getRootWindow().location.href = $ctx + '/' + value;
					}
				} catch (e) {
				}
				if ($.isFunction(callback)) {
					callback($.decode(response));
				}
			}, 'text');
		},
		/**
		 * 错误检验.<br>
		 * 如果AJAX出现异常,那么会返回异常对象,否则返回false.
		 * @param o 后台返回的对象
		 * @return 如果对象为一个异常则返回true，否则返回false.
		 */
		err : function(o) {
			if (o && o['@failure'] === true) {
				return o;
			}
			return false;
		},
		/**
		 * 将JS对象，序列化为JSON字符串
		 * @param value JS对象
		 * @return 对象的JSON字符串
		 */
		encode : function(value) {
			return $.encode(value);
		},
		/**
		 * 将JSON字符串，反序列化为JS对象
		 * @param json JSON字符串
		 * @return JS对象
		 */
		decode : function(json) {
			return $.decode(json, true);
		},
		/**
		 * 转义正则字符
		 */
		encodeReg : function(value) {
			return String(value).replace(/([.*+?^=!:${}()|[\]/\\])/g, '\\$1');
		},
		/**
		 * 转义HTML字符
		 */
		encodeHTML : function(content) {
			return $.encodeHTML(content);
		},
		/**
		 * 获得最顶层窗口(有访问权限的)
		 * @return 有访问权限的最顶层窗口
		 */
		getRootWindow : function() {
			var win = window;
			while (win != win.parent) {
				try {
					var pd = win.parent.document; //在没权限访问parent中的对象时会出错
					var all = pd.getElementsByTagName('*');
				} catch (ex) {
					return win;
				}
				if (typeof win.parent['__'] === 'undefined') {
					return win;
				}
				win = win.parent;
			}
			return win;
		},
		/**
		 * 国际化字符串
		 * @param key 字符串的编码
		 * @return 字符串
		 */
		i18n : function(key, text) {
			var value = vI18nCache[key];
			return $.isEmpty(value, true) ? ($.isEmpty(text, true) ? key : text) : value;
		},
		/**
		 * 国际页面元素
		 */
		i18n_ready : function() {
			$('[data-i18n]').each(function(i, dom) {
				var k = dom.getAttribute('data-i18n');
				if (/^(span)$/i.test(dom.nodeName)) {
					dom.innerHTML = __.i18n(k, dom.innerHTML);
				} else if (/^(input)$/i.test(dom.nodeName) && /^(button)$/i.test(dom.type)) {
					dom.value = __.i18n(k, dom.value);
				} else if (/^(script)$/i.test(dom.nodeName)) {
					/* Ignore */
				} else if (!!dom.nodeName) {
					dom.innerHTML = __.i18n(k, dom.innerHTML);
				} else {
					/* Ignore */
				}
			});
		},
		/**
		 * 注册多语言
		 */
		i18n_register : function(props) {
			if (props) {
				for (var k in props) {
					vI18nCache[k] = props[k]
				}
			}
		},
		/**
		 * 私有方法，注册多语言
		 */
		'@REGISTER_I18N' : function(props) {
			if (props) {
				for (var k in props) {
					vI18nCache[k] = props[k]
				}
			}
		},
		/**
		 * 为页面添加蒙版
		 */
		mask : function(key) {
			vMaskHash[key + ''] = true;
			if ($('#loading').show().length > 0) {
				$('#loading-mask').show().css({
					'filter' : 'alpha(opacity=50)',
					'-moz-opacity' : '0.5',
					'-khtml-opacity' : '0.5',
					'opacity' : '0.5',
					'width' : '100%',
					'height' : '100%'
				});
			}
		},
		/**
		 * 取消页面蒙版
		 */
		unmask : function(key) {
			delete vMaskHash[key + ''];
			if ($('#loading').hide().length > 0) {
				$('#loading-mask').fadeOut();
			}
		},
		encodeUrlParams : function(params) {
			var search = [];
			var addFields = function(key, val) {
				if (val == null) {
					return;
				}
				search.push([encodeURIComponent((key + '').replace(/ /g, '+')), '=', encodeURIComponent((val + '').replace(/ /g, '+'))].join(''));
			}
			$.each(params, function(key, val) {
				if (val == null) {
					return;
				}
				if ($.isArray(val)) {
					$.each(val, function() {
						addFields(key, this);
					});
				} else {
					addFields(key, val);
				}
			});
			return search.join('&');
		},
		decodeUrlParams : function(search) {
			search = search || location.search;
			var params = {};
			// (remove any leading ? || #)(remove any trailing & || ;)(replace
			// +'s with spaces)(split & || ;)
			jQuery.each(search.replace(/^[?#]/, '').replace(/[;&]$/, '').replace(/[+]/g, ' ').split(/[&;]/), function(i, o) {
				var key = decodeURIComponent(this.split('=')[0] || '');
				var val = decodeURIComponent(this.split('=')[1] || '');
				if (!key) {
					return;
				}
				if ($.isArray(params[key])) {
					params[key].push(val);
				} else if (params[key] != null) {
					params[key] = [params[key], val];
				} else {
					params[key] = val;
				}
			});
			return params;
		},
		download : (function() {
			return function(url, params) {
				var oForm = document.createElement('form'), html = '';
				oForm.style.display = 'none';
				oForm.method = 'post';
				oForm.action = url;
				document.body.appendChild(oForm);
				if (params) {
					for (var n in params) {
						var v = params[n];
						if (!!v) {
							if ($.isPlainObject(v)) {
								v = $.encode(v);
							} else if ($.isArray(v)) {
								v = $.encode(v);
							}
						}
						html += '<input name="' + __.encodeHTML(n) + '" value="' + __.encodeHTML(v) + '" type="hidden" />\n'
					}
				};
				oForm.innerHTML = html;
				oForm.submit();
				setTimeout(function() {
					document.body.removeChild(oForm);
					oForm = null;
				}, 10 * 1000);
			};
		})(),
		/**
		 * 警告框
		 */
		alert : function(title, message, callback) {
			return __.getRootWindow()['__']['Dialog->Open']({
				'~type' : 'alert',
				title : title,
				message : message,
				callback : callback
			}, window.self);
		},
		/**
		 * 确认框
		 */
		confirm : function(title, message, callback) {
			return __.getRootWindow()['__']['Dialog->Open']({
				'~type' : 'confirm',
				title : title,
				message : message,
				callback : callback
			}, window.self);
		},
		/**
		 * 弹出对话框
		 */
		openDialog : function(options) {
			return __.getRootWindow()['__']['Dialog->Open'](options, window.self);
		},
		/**
		 * 关闭对话框
		 */
		closeDialog : function(id) {
			var frame = $('#' + id);
			try {
				frame[0].contentWindow.document.write('');//清空IFRAME的内容
				frame[0].contentWindow.close();//避免IFRAME内存泄漏
			} finally {
				frame.remove();//删除iframe
			}
			delete vDlgFnCache[id];
		},
		/**
		 * 获得父窗体传递过来的参数(与openDlg配合使用)
		 * @return 父窗体传递来的参数
		 */
		dialogParams : function() {
			return $.decode(window.parent['~dlg'].params);
		},
		dialogClose : function() {
			return window.parent['~dlg'].destroy();
		},
		dialogCallback : function(params) {
			window.parent['~dlg'].callback($.encode(params || {}))
		},
		'Dialog->Open' : function(options, openerWin) {
			var id = __.id();
			var bh = $(document).outerHeight();
			var bw = $(document).width();
			var o$Iframe = $(['<iframe ',//
					' id="', id, '"',//
					' src="', $ctx, '/s/__/widgets/dialog.jsp" ',//
					' frameborder="0" ',//
					' scrolling="no" ',//
					' allowTransparency="true" ',//
					' style="position:absolute;left:0px;top:0px;width:', bw, 'px;height:', bh, 'px;display: none;z-index:10000;">',//
					'</iframe>'].join(''));
			vDlgFnCache[id] = (!options.callback) ? false : $.proxy(options.callback, openerWin);
			o$Iframe.appendTo($(document.body));
			o$Iframe.on('load', function() {
				o$Iframe.show().prop('contentWindow')['~dlg'].initialize(options, id)
			});
			return id;
		},
		'Dialog->Callback[JSON]' : function(id, json, openerWin) {
			var fn = vDlgFnCache[id];
			if (fn) {
				return fn($.decode(json));
			}
			return 0;
		}
	});
})();