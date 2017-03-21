/**
 * jQuery +扩充 Library v1.0<br>
 * 提供了一些jQuery缺失的函数和变量.<br>
 * @author : YaoYiLang
 * @email : redrainyi@gmail.com
 * @version 1.0 α.1
 */

(function($) {
	//
	$.extend({
		isDate : function(v) {
			return Object.prototype.toString.call(v) === "[object Date]";
		},
		isRegExp : function(v) {
			return Object.prototype.toString.call(v) === "[object RegExp]";
		},
		isEmpty : function(v, allowBlank) {
			return v === null || v === undefined || (($.isArray(v) && !v.length)) || (!allowBlank ? v === '' : false);
		},
		defer : function(fn, millis) {
			millis = !isNaN(millis) && millis > 0 ? millis : 1;
			return setTimeout(fn, millis);
		},
		decode : function(json, unsafe) {
			try {
				return $.parseJSON(json);
			} catch (e) {
				if (unsafe === true) {
					try {
						return eval('(' + json + ')');
					} catch (e) {
					}
				}
			}
			return undefined;
		},
		encode : (function() {
			var I = !!{}.hasOwnProperty, _ = function(I) {
				return I < 10 ? "0" + I : I;
			}, A = {
				"\b" : "\\b",
				"\t" : "\\t",
				"\n" : "\\n",
				"\f" : "\\f",
				"\r" : "\\r",
				"\"" : "\\\"",
				"\\" : "\\\\"
			};
			return (function(C) {
				if (typeof C == "undefined" || C === null) {
					return "null";
				} else {
					if (Object.prototype.toString.call(C) === "[object Array]") {
						var B = ["["], G, E, D = C.length, F;
						for (E = 0; E < D; E += 1) {
							F = C[E];
							switch (typeof F) {
								case "undefined" :
								case "function" :
								case "unknown" :
									break;
								default :
									if (G) {
										B.push(",");
									}
									B.push(F === null ? "null" : $.encode(F));
									G = true;
							}
						}
						B.push("]");
						return B.join("");
					} else {
						if ((Object.prototype.toString.call(C) === "[object Date]")) {
							return "\"" + C.getFullYear() + "-" + _(C.getMonth() + 1) + "-" + _(C.getDate()) + "T" + _(C.getHours()) + ":" + _(C.getMinutes()) + ":" + _(C.getSeconds()) + "\"";
						} else {
							if (typeof C == "string") {
								return "\"" + C.replace(/([\x00-\x1f\\"])/g, function(B, _) {
									var I = A[_];
									if (I) {
										return I;
									}
									return '';
								}).replace(/[^\u0000-\u00FF]/g, function($0) {
									return escape($0).replace(/(%u)(\w{4})/gi, "\\u$2")
								}) + "\"";
							} else {
								if (typeof C == "number") {
									return isFinite(C) ? String(C) : "null";
								} else {
									if (typeof C == "boolean") {
										return String(C);
									} else {
										B = ["{"], G, E, F;
										for (E in C) {
											if (!I || C.hasOwnProperty(E)) {
												F = C[E];
												if (F === null) {
													continue;
												}
												switch (typeof F) {
													case "undefined" :
													case "function" :
													case "unknown" :
														break;
													default :
														if (G) {
															B.push(",");
														}
														B.push($.encode(E), ":", $.encode(F));
														G = true;
												}
											}
										}
										B.push("}");
										return B.join("");
									}
								}
							}
						}
					}
				}
			});
		})(),
		encodeHTML : function(v) {
			return $("<div/>").text(String(v)).html().replace(new RegExp('[\"\'<>&\s]', 'g'), function($0) {
				switch ($0) {
					case '"' :
						return '&quot;';
					case "'" :
						return '&apos;';
					case '>' :
						return '&gt;';
					case '<' :
						return '&lt;';
					case ' ' :
						return '&nbsp;';
					default :
						return $0;
				}
			});
		},
		setCookie : function(name, value, option) {
			// (document.location.protocol);
			// (document.location.host);
			// (document.location.pathname);
			option = option || {};
			if (value == null) {
				option.expireDays = -1;
			}
			var str = name + '=' + escape(value);
			if (option.expireDays) {
				var date = new Date();
				var ms = option.expireDays * 24 * 3600 * 1000;
				date.setTime(date.getTime() + ms);
				str += '; expires=' + date.toGMTString();
			} else if (option.expireMillisecond) {
				var date = new Date();
				var ms = option.expireMillisecond;
				date.setTime(date.getTime() + ms);
				str += '; expires=' + date.toGMTString();
			}
			if (option.path) {
				str += '; path=' + path;
			}
			if (option.domain) {
				str += '; domain' + domain;
			}
			if (option.secure) {
				str += '; true';
			}
			document.cookie = str;
		},
		getCookie : function(name) {
			var cookieArray = document.cookie.split("; ");
			for (var i = 0; i < cookieArray.length; i++) {
				var arr = cookieArray[i].split("=");
				if (arr[0] == name) {
					return unescape(arr[1]);
				}
			}
			return null;
		},
		parseDate : function(dateString, pattern) {
			try {
				var matchs1 = (pattern || "yyyy-MM-dd").match(/([yMdHsm])(\1*)/g);
				var matchs2 = dateString.match(/(\d)+/g);
				if (matchs1.length == matchs2.length) {
					var $d = new Date(1970, 0, 1);
					for (var i = 0; i < matchs1.length; i++) {
						var $i = parseInt(matchs2[i], 10);
						eval((({
							"y" : "$d.setFullYear($i);",
							"M" : "$d.setMonth($i-1);",
							"d" : "$d.setDate($i);   ",
							"H" : "$d.setHours($i);  ",
							"m" : "$d.setMinutes($i);",
							"s" : "$d.setSeconds($i);"
						}[matchs1[i].charAt(0)]) || "pattern=undefined"));
					}
					return $d;
				}
			} catch (err) {
			}
			return null;
		},
		formatDate : function() {
			var SIGN_RG = /([yMdHsm])(\1*)/g;
			function padding(s, len) {
				var len = len - (s + "").length;
				for (var i = 0; i < len; i++) {
					s = "0" + s;
				}
				return s;
			}
			return function(value, pattern) {
				if (!$.isDate(value)) {
					return '';
				}
				try {
					pattern = pattern || "yyyy-MM-dd";
					return pattern.replace(SIGN_RG, function($0) {
						switch ($0.charAt(0)) {
							case "y" :
								return padding(value.getFullYear(), $0.length);
							case "M" :
								return padding(value.getMonth() + 1, $0.length);
							case "d" :
								return padding(value.getDate(), $0.length);
							case "w" :
								return value.getDay() + 1;
							case "H" :
								return padding(value.getHours(), $0.length);
							case "m" :
								return padding(value.getMinutes(), $0.length);
							case "s" :
								return padding(value.getSeconds(), $0.length);
							case "q" :
								return Math.floor((this.getMonth() + 3) / 3);
							default :
								return '';
						}
					});
				} catch (err) {
					return '';
				}
			};
		}()
	});

	$.fn.extend({
		showPrompt : function(msg, level) {
			this.stop(true, true).html(['<span class="x-prompt-msg-', level, '">', $.encodeHTML(msg), '</span>'].join('')).show().delay(2500).fadeOut(1000);
		},
		hidePrompt : function() {
			this.stop(true, true).hide();
		}
	});

})(jQuery);
