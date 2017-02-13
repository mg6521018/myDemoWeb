if (window.$) {
	$(function() {
		$('<div id="loading-mask" style="font-size: 30px"></div>'//
				+ '<div id="loading">'//
				+ '	<div class="loading-indicator">'//
				+ '		Loading...'//
				+ '	</div>'//
				+ '</div>').appendTo($(document.body));

		if (window.__) {
			__.i18n_ready();
		}
	});
}