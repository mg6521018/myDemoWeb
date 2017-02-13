/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.pageQuery = '/demo/user/list.do';
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
        columns : [[{
            field : '-ck',
            checkbox : true
        }, {
            field : 'userName',
            title : '用户名',
            width : 150,
            sortable : true
        }, {
            field : 'account',
            title : '登录名',
            width : 150,
            sortable : true
        }, {
            field : 'status',
            title : '状态',
            width : 150,
            sortable : false,
            formatter:function(value,row,index){
                if(value == 0){return "未激活";}
                if(value == 1){return "已激活";}
                if(value == 2){return "已锁定";}
            }
        }, {
            field : 'createTime',
            title : '创建时间',
            width : 150,
            sortable : false,
            formatter:function(value,row,index){
                var unixTimestamp = new Date(value);
                return unixTimestamp.toLocaleString();
            }
        }, {
            field : 'isExpired',
            title : '是否过期',
            width : 150,
            sortable : false,
            formatter:function(value,row,index){
                if(value == 0){return "未过期";}
                if(value == 1){return "已过期";}
            }
        }, {
            field : 'isLock',
            title : '是否可用',
            width : 150,
            sortable : false,
            formatter:function(value,row,index){
                if(value == 0){return "可用";}
                if(value == 1){return "不可用";}
            }
        }]]
    });

    //点击查询按钮
    EL.oBtnQuery.on('click', function() {
        var filters = {};
        filters.userName = EL.Q_USERNAME.val();
        filters.account = EL.Q_ACCOUNT.val();
        EL.oGrid.datagrid('load', {
            filters : JSON.stringify(filters)
    });
    });

    //点击重置按钮
    EL.oBtnReset.on('click', function() {
        EL.Q_USERNAME.val('');
        EL.Q_ACCOUNT.val('');
    });
});
