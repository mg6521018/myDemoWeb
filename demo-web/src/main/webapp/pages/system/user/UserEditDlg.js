var EL = EL || {}, FN = FN || {}, GV = GV || {}, Urls = Urls || {};

Urls.load = $ctx + '/user/load.do';
Urls.save = $ctx + '/user/save.do';

$(function() {

	var dlgParams = __.dialogParams();
	EL.oForm = $('#oForm');
	EL.oBtnSave = $('#oBtnSave');
	EL.oBtnCancel = $('#oBtnCancel');
	var params = dlgParams;
	GV.vOriginalData = {};//初始的表单数据
	//初始化页面数据
	__.post(Urls.load, params, function(vo) {
		GV.vOriginalData = vo;
		EL.oForm.form('load', vo);
	});

	//点击保存按钮
	EL.oBtnSave.bind('click', function() {
		$('#oForm').submit();
	});

	$('#oForm').form({
		url : Urls.save,
		onSubmit : function() {
			var isValid = $(this).form('validate');
			if (!isValid) {
			}
			return isValid;
		},
		success : function(result) {
			result = $.parseJSON(result);
			if (result.success) {
				__.dialogCallback({});
				__.dialogClose(); 
			} else {
				alert(result.msg);
			}
		}
	});
	
	EL.oBtnCancel.on('click', function() {
		__.dialogClose();
	});
});