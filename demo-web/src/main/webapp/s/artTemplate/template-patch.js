(function() {

	template.config('openTag', '<#');
	template.config('closeTag', '#>');
	template.config('cache', false);

	//模板函数
	__.template = function(str, data) {
		var dom = document.getElementById(str), source = str, container = false;
		if (dom) {
			source = dom[/^(textarea|input)$/i.test(dom.nodeName) ? 'value' : 'innerHTML'];
		} else {
			dom = false;
		}

		var render = template.compile(source);
		return {
			apply : function(data) {
				return fn(data);
			},
			bind : function(data) {
				this.bindData = data;
				return this;
			},
			render : function() {
				if (container === false) {
					container = document.createElement('div');
					container.id = 'y-template-container-' + (+new Date());
					if (dom === false) {
						document.body.appendChild(container);
					} else {
						dom.parentElement.insertBefore(container, dom);
					}
				}
				container.innerHTML = render(this.bindData || {});
			},
			renderTo : function(container) {
				var container = typeof(container) === 'string' ? document.getElementById(container) : container;
				container.innerHTML = render(this.bindData || {});
			}
		}
	};
})();