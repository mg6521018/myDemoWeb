/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.pageQuery = '/demo/vouche/list.do?typeId='+typeId;
Urls.remove = '/demo/user/remove';
Urls.editDlg = '/demo/user/demo/demoUser/DemoUserEditDlg.jsp';

$(function() {
    //搜索面板
    EL.oBtnReset = $('#oBtnReset');//重置
    EL.oBtnQuery = $('#oBtnQuery');//查询
    //搜索字段
    EL.Q_USERNAME = $('#userName');//人员编号
    EL.Q_ACCOUNT = $('#account');//中文名

    //列表控件
    EL.oGrid = $('#oGrid');
    //列表加载
    EL.oGrid.datagrid({//
        url : Urls.pageQuery,
        striped : true,
        remoteSort : true,
        pagination : true,
        fitColumns : true,
        columns : [[ {
            field : 'typeId',
            title : '类别编号',
            width : 110,
            sortable : true
        }, {
            field : 'detailCode',
            title : '明细编号',
            width : 110,
            sortable : true
        }, {
            field : 'typeName',
            title : '类别名称',
            width : 300,
            sortable : false
        }, {
            field : 'name',
            title : '凭证名称',
            width : 150,
            sortable : false
        }, {
            field : 'voucheNo',
            title : '凭证字',
            width : 110,
            sortable : false
        }, {
            field : 'condition1',
            title : '借方必有',
            width : 120,
            sortable : false
        }, {
            field : 'condition2',
            title : '借方必无',
            width : 120,
            sortable : false
        }, {
            field : 'condition3',
            title : '贷方必有',
            width : 120,
            sortable : false
        }, {
            field : 'condition4',
            title : '贷方必无',
            width : 120,
            sortable : false
        }, {
            field : 'condition5',
            title : '凭证必有',
            width : 120,
            sortable : false
        }, {
            field : 'condition6',
            title : '凭证必无',
            width : 120,
            sortable : false
        }, {
            field : 'status',
            title : '状态',
            width : 150,
            sortable : false
        }]]
    });

});
