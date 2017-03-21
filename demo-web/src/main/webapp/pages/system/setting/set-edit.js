/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.load = '/demo/set/loadEditData.do';
Urls.save = '/demo/set/save.do';
$(function() {
    //搜索面板

    EL.oBtnSave = $('#oBtnSave');//添加
    EL.oBtnCancel = $('#oBtnCancel');//取消

    GV.vOriginalData = {};//初始的表单数据
    EL.oForm = $('#oForm');
    var params = {};
    //初始化页面数据
    __.post(Urls.load, params, function(vo) {
        GV.vOriginalData = vo;
        EL.oForm.form('load', vo);
    });

    //保存
    EL.oBtnSave.on('click', function() {
        EL.oForm.submit();
    });

    $('#oForm').form({
        url : Urls.save ,
        onSubmit : function() {
            var isValid = $(this).form('validate');
            if (!isValid) {}
            return isValid;
        },
        success : function(result) {
            result = $.parseJSON(result);
            if (result.success) {
                window.location.href='/demo/pages/system/setting/set-details.jsp';
            } else {
                $('#oDialogPrompt').showPrompt(result.msg, 'error');
            }
        }
    });

    //取消
    EL.oBtnCancel.on('click', function() {
        window.location.href='/demo/pages/system/setting/set-details.jsp';
    });

    $('#accountingSystem').combobox({
        url : '/demo/select/opinionAccountingSystem.do?type=1',
        valueField : 'dicValue',
        textField : 'dicName',
        editable : false,
        panelHeight : 'auto',
        onLoadSuccess : function(data) {
        }
    });

    $('#fiscalYear').combobox({
        url : '/demo/select/opinionFiscalYear.do',
        valueField : 'dicValue',
        textField : 'dicName',
        editable : false,
        panelHeight : 'auto',
        onLoadSuccess : function(data) {
        }
    });
});
