(function() {
	var rform = /form/i, rselectTextarea = /select|textarea/i, rinput = /color|date|datetime|email|hidden|month|number|password|range|search|tel|text|time|url|week/i, rradiocheckbox = /radio|checkbox/i;
	//jquery.easyui.patch
	if ($.fn.datebox) {
		$.fn.datebox.defaults.formatter = function(date) {
			return $.formatDate(date, 'yyyy-MM-dd');
		};
		$.fn.datebox.defaults.parser = function(value) {
			var v = $.parseDate(value, 'yyyy-MM-dd');
			return v == null ? new Date() : v;
		};
	}
	$.fn.extend({
		markInvalid : function(errors) {
			if (this.length == 0) {
				return;
			}
			this.clearInvalid();
			var el = this[0] || {};
			if (rform.test(el.nodeName)) {
				for (var name in errors) {
					this.find("[name=" + name + "]").markInvalid(errors[name]);// field
				}
			} else if (rselectTextarea.test(el.nodeName) || rradiocheckbox.test(this.type) || rinput.test(el.type)) {
				$(el).addClass("validatebox-invalid").data('validatebox').message = errors;
			}
			return this;
		},
		clearInvalid : function() {
			if (this.length == 0) {
				return;
			}
			var el = this[0] || {};
			if (rform.test(el.nodeName)) {
				this.map(function() {
					return this.elements ? $.makeArray(this.elements) : this;
				}).filter(function() {
					return this.name && (rselectTextarea.test(this.nodeName) || rradiocheckbox.test(this.type) || rinput.test(this.type));
				}).map(function(i, elem) {
					$(this).clearInvalid();
				});
			} else if (rselectTextarea.test(el.nodeName) || rradiocheckbox.test(this.type) || rinput.test(el.type)) {// field
				$(el).removeClass("validatebox-invalid").data('validatebox').message = '';
			}
			return this;
		}
	});

	/**
	 * From扩展 getData 获取数据接口
	 * @param {Object} jq
	 * @param {Object} params 设置为true的话，会把string型"true"和"false"字符串值转化为boolean型。
	 */
	$.extend($.fn.form.methods, {
		markInvalid : function(jq, params) {
			jq.markInvalid(params);
		},
		clearInvalid : function(jq) {
			jq.markInvalid();
		},
		getData : function(jq, params) {
			var formArray = jq.serializeArray();
			var oRet = {};
			for (var i in formArray) {
				if (typeof(oRet[formArray[i].name]) == 'undefined') {
					if (params) {
						oRet[formArray[i].name] = (formArray[i].value == "true" || formArray[i].value == "false") ? formArray[i].value == "true" : formArray[i].value;
					} else {
						oRet[formArray[i].name] = formArray[i].value;
					}
				} else {
					if (params) {
						oRet[formArray[i].name] = (formArray[i].value == "true" || formArray[i].value == "false") ? formArray[i].value == "true" : formArray[i].value;
					} else {
						oRet[formArray[i].name] += "," + formArray[i].value;
					}
				}
			}
			return oRet;
		}
	});

})();