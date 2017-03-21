/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.pageQuery = '/demo/accSub/list.do?code='+code;
Urls.remove = '/demo/user/remove';
Urls.editDlg = '/demo/user/demo/demoUser/DemoUserEditDlg.jsp';

$(function() {
    //搜索面板
    EL.oBtnReset = $('#oBtnReset');//重置
    EL.oBtnQuery = $('#oBtnQuery');//查询
    //搜索字段

    //列表控件
    EL.oGrid = $('#oGrid');
    //列表加载
    EL.oGrid.datagrid({//
        url : Urls.pageQuery,
        striped : true,
        remoteSort : true,
        pagination : true,
        fitColumns : true,
        columns : [[{
            field : 'code',
            title : '科目编码',
            width : 110,
            sortable : true
        },
        {
            field : 'name',
            title : '科目名称',
            width : 110,
            sortable : true
        },
        {
            field : 'mnemonicCode',
            title : '助记码',
            width : 110,
            sortable : true
        },
        {
            field : 'typeId',
            title : '类别',
            width : 110,
            sortable : true
        },
        {
            field : 'direction',
            title : '方向',
            width : 110,
            sortable : true
        },
        {
            field : 'cashAccountClass',
            title : '现金科目类',
            width : 110,
            sortable : true
        },
        {
            field : 'bankAccountClass',
            title : '银行科目类',
            width : 110,
            sortable : true
        },
        {
            field : 'cashEquivalents',
            title : '现金等价物',
            width : 110,
            sortable : true
        },
        {
            field : 'foreignCurrencyAccounting',
            title : '外币核算',
            width : 110,
            sortable : true
        },
        {
            field : 'quantityAccounting',
            title : '数量核算',
            width : 110,
            sortable : true
        },
        {
            field : 'company',
            title : '单位',
            width : 110,
            sortable : true
        },
        {
            field : 'currentAccount',
            title : '往来核算',
            width : 110,
            sortable : true
        },
        {
            field : 'billAccounting',
            title : '票据核算',
            width : 110,
            sortable : true
        },
        {
            field : 'auxiliaryAccounting',
            title : '辅助核算',
            width : 110,
            sortable : true
        },
        {
            field : 'subjectIndex',
            title : '科目级次',
            width : 110,
            sortable : true
        },
        {
            field : 'reportAttributes',
            title : '报表属性',
            width : 110,
            sortable : true
        },
        {
            field : 'specificationModel',
            title : '规格型号',
            width : 110,
            sortable : true
        }]]
    });

});
