/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.editDlg = '/demo/user/userEditDlg.jsp';

$(function() {
    //搜索面板
    EL.oBtnEdit = $('#oBtnEdit');//修改

    //修改
    EL.oBtnEdit.on('click', function() {

        FN.onEdit({

        });
    });

    //编辑数据
    FN.onEdit = function() {
        window.location.href='/demo/pages/system/setting/set-edit.jsp';
    }
});
