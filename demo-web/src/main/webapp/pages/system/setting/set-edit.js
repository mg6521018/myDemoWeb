/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.pageQuery = '/demo/user/list.do';
Urls.remove = '/demo/user/remove.do';
Urls.editDlg = '/demo/user/userEditDlg.jsp';

$(function() {
    //搜索面板

    EL.oBtnSave = $('#oBtnSave');//添加
    EL.oBtnCancel = $('#oBtnCancel');//取消

    //保存
    EL.oBtnSave.on('click', function() {
        alert('保存');
    });

    //取消
    EL.oBtnCancel.on('click', function() {
        alert('取消');
    });

    $('#bigFileSplit').combobox({
        url : '/demo/select/opinion.do?type=1',
        valueField : 'dicValue',
        textField : 'dicName',
        editable : false,
        panelHeight : 'auto',
        onLoadSuccess : function(data) {
        }
    });
});
