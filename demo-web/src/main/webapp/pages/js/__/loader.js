;
var $ctx, $locale, $token;
(function() {

	function forEach(ary, fn) {
		for (var i = 0; i < ary.length; i++) {
			fn(ary[i]);
		}
	};

	var cache = {
		js : {},
		css : {}
	};

	function includeJS(s) {
		(!!s) && (forEach([].concat(s), function(s) {
			(!cache['js'][s]) && (document.write('<script type="text/javascript" src="' + s + '"><\/script>') & (cache['js'][s] = true));
		}));
	};
	function includeCSS(s) {
		(!!s) && (forEach([].concat(s), function(s) {
			(!cache['css'][s]) && (document.write('<link rel="stylesheet" type="text/css" media="screen" href="' + s + '" \/>') & (cache['css'][s] = true));
		}));
	};

	(function(ary, func) {
		if (ary) {
			var i;
			for (i = ary.length - 1; i > -1; i -= 1) {
				if (ary[i] && func(ary[i], i, ary)) {
					break;
				}
			}
		}
	})((function() {
		return document.getElementsByTagName('script');
	})(), function(script) {
		var src = script.src;
		var suffix = 's/__/loader.js';//
		if ((src.length - suffix.length) === (src.indexOf(suffix))) {
			vCurrentScript = script;
			$ctx = $ctx || (src.substring(0, src.indexOf(suffix)));
			$locale = $locale || '';
			$token = $token || 'ICMS_USER_TOKEN';
			return false;
		}
	});

	var vInclude = vCurrentScript.getAttribute('data-include') || 'all';
	var vI18N = vCurrentScript.getAttribute('data-i18n') || '';

	var __ = window.__ == window.__ || {
		ctx : $ctx,
		locale : $locale
	};

	var jsmap = {
		'__' : ['' + $ctx + '/s/__/__.js'],
		'jquery' : ['' + $ctx + '/s/jquery/jquery-1.8.3.js', '' + $ctx + '/s/jquery/jquery-patch.js'],
		'easyui' : ['' + $ctx + '/s/easyui/jquery.easyui.min.js', '' + $ctx + '/s/easyui/jquery.easyui.patch.js', '' + $ctx + '/s/easyui/locale/easyui-lang-' + $locale + '.js'],
		'ckeditor' : ['' + $ctx + '/s/ckeditor/ckeditor.js'],
		'ueditor' : ['' + $ctx + '/s/ueditor/ueditor.all.min.js', $ctx + '/s/ueditor/ueditor.config.js', $ctx + '/s/ueditor/lang/zh-cn.js'],
		'codemirror' : ['' + $ctx + '/s/codemirror/codemirror.js', '' + $ctx + '/s/codemirror/mode/javascript.js', '' + $ctx + '/s/codemirror/mode/htmlmixed.js'],
		'highcharts' : ['' + $ctx + '/s/highcharts/highcharts.js', '' + $ctx + '/s/highcharts/highcharts-more.js'],
		'my97datepicker' : ['' + $ctx + '/s/My97DatePicker/WdatePicker.js'],
		'artTemplate' : ['' + $ctx + '/s/artTemplate/template.js', '' + $ctx + '/s/artTemplate/template-patch.js'],
		'themes' : ['' + $ctx + '/s/__/__loaderafter.js']
	};

	var cssmap = {
		'easyui' : ['' + $ctx + '/s/easyui/themes/blue/easyui.css" id="easyui-themes', '' + $ctx + '/s/easyui/themes/icon.css'],
		'codemirror' : ['' + $ctx + '/s/codemirror/codemirror.css'],
		'themes' : ['' + $ctx + '/s/__/themes/default/css/all.css']
	};

	var includes = ['__',//
			'jquery',//
			'easyui',//
			'ckeditor',//
			'ueditor',//
			'codemirror',//
			'highcharts',//
			'my97datepicker',//
			'artTemplate',//
			'themes'//
	];

	if (vInclude != 'null' && vInclude != 'all' && vInclude == null) {
		vInclude = 'all';
	}

	(function() {
		var require = {}, add = function(ms) {
			forEach(ms, function(m) {
				require[m] = true;
			});
		};
		forEach(vInclude.split(/[\|]/img), function(module) {
			if (module == 'jquery') {
				add(['__', 'jquery']);
			} else if (module == 'easyui') {
				add(['__', 'jquery', 'easyui']);
			} else if (module == 'ckeditor') {
				add(['__', 'jquery', 'ckeditor']);
			} else if (module == 'ueditor') {
				add(['__', 'jquery', 'ueditor']);
			} else if (module == 'codemirror') {
				add(['__', 'jquery', 'codemirror']);
			} else if (module == 'highcharts') {
				add(['__', 'jquery', 'codemirror', 'highcharts']);
			} else if (module == 'my97datepicker') {
				add(['__', 'jquery', 'my97datepicker']);
			} else if (module == 'artTemplate') {
				add(['__', 'jquery', 'artTemplate']);
			} else if (module == 'themes') {
				add(['__', 'jquery', 'themes']);
			} else if (module == 'all') {
				add(['__', 'jquery', 'easyui', 'ckeditor', 'codemirror', 'highcharts', 'my97datepicker', 'artTemplate', 'themes']);
			}
		});

		forEach(includes, function(module) {
			if (require[module] === true) {
				includeJS(jsmap[module]);
				includeCSS(cssmap[module]);
			}
		});
	})();

	if (vI18N) {
		forEach(vI18N.split(/[\|]/img), function(path) {
			if (path.indexOf('@') === 0) {
				path = '';
			} else if (path.indexOf('/') === 0) {
				path = $ctx + path;
			} else {
				path = 'i18n/' + path;
			}
			path && includeJS(path + '_' + ($locale || 'zh_CN') + '.js');
		});
	}

})();