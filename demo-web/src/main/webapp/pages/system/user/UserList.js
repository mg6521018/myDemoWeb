/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.pageQuery = '/demo/user/list.do';
Urls.remove = '/demo/user/remove.do';
Urls.editDlg = '/demo/user/userEditDlg.jsp';

$(function() {
    //搜索面板
    EL.oBtnReset = $('#oBtnReset');//重置
    EL.oBtnQuery = $('#oBtnQuery');//查询
    EL.oBtnAdd = $('#oBtnAdd');//添加
    EL.oBtnEdit = $('#oBtnEdit');//修改
    EL.oBtnDel = $('#oBtnDel');//删除

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

    //新增
    EL.oBtnAdd.on('click', function() {
        FN.onEdit();
    });

    //修改
    EL.oBtnEdit.on('click', function() {
        var records = EL.oGrid.datagrid('getSelections');
        var idList = [];
        $.each(records, function(i, record) {
            idList.push(record.ID);
        });
        if (idList.length !== 1) {
            $('#oPrompt').showPrompt('请选择一条数据进行编辑!', 'alert');
            return;
        }
        var id = idList[0]
        FN.onEdit({
            ID : id
        });
    });

    //编辑数据
    FN.onEdit = function(params) {
        __.openDialog({
            title : '测试(用户)管理',
            url : Urls.editDlg,
            width : 630,
            height : 375,
            params : params,
            callback : function(value) {
                $('#oPrompt').showPrompt('保存成功', 'info');
                EL.oGrid.datagrid('reload');
            }
        });
    }

    //点击删除按钮
    EL.oBtnDel.bind('click', function() {
        var records = EL.oGrid.datagrid('getSelections');
        var idList = [];
        $.each(records, function(i, record) {
            idList.push(record.ID);
        });
        if ($.isEmpty(idList)) {
            $('#oPrompt').showPrompt('请选择需要删除的数据!', 'alert');
            return;
        }
        __.confirm('提示', '是否删除选中数据,该操作无法被恢复!', function(result) {
            if (result) {
                FN.onRemoveById(idList);
            }
        });
    });

    //删除数据
    FN.onRemoveById = function(idList) {
        var params = {};
        params.idList = __.encode(idList);
        __.post(Urls.remove, params, function(data) {
            if (__.err(data)) {
                $('#oPrompt').showPrompt(data.message, 'error');
            } else {
                $('#oPrompt').showPrompt('删除成功!', 'info');
                EL.oGrid.datagrid('reload');//刷新列表
            }
        });
    }
});
