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
        fitColumns : false,
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
            sortable : true,
            formatter:function(value,row,index){
                if(value == 1){return "流动资产";}
                if(value == 2){return "非流动资产";}
                if(value == 3){return "流动负债";}
                if(value == 4){return "非流动负债";}
                if(value == 5){return "权益";}
                if(value == 6){return "成本";}
                if(value == 7){return "损益";}
            }
        },
        {
            field : 'direction',
            title : '方向',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "借";}
                if(value == 1){return "贷";}
            }
        },
        {
            field : 'cashAccountClass',
            title : '现金科目类',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
        },
        {
            field : 'bankAccountClass',
            title : '银行科目类',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
        },
        {
            field : 'cashEquivalents',
            title : '现金等价物',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
        },
        {
            field : 'foreignCurrencyAccounting',
            title : '外币核算',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 1){return "人民币";}
                if(value == 2){return "加拿大元";}
                if(value == 3){return "德国马克";}
                if(value == 4){return "新加坡元";}
                if(value == 5){return "日元";}
                if(value == 6){return "欧元";}
                if(value == 7){return "法国法郎";}
                if(value == 8){return "港币";}
                if(value == 9){return "瑞士法郎";}
                if(value == 10){return "美元";}
                if(value == 11){return "英镑";}
                if(value == 12){return "韩国元";}
            }
        },
        {
            field : 'quantityAccounting',
            title : '数量核算',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
        },
        {
            field : 'company',
            title : '单位',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 1){return "块";}
                if(value == 2){return "台";}
                if(value == 3){return "张";}
                if(value == 4){return "组";}
                if(value == 5){return "米";}
                if(value == 6){return "吨";}
                if(value == 7){return "公里";}
                if(value == 8){return "平方米";}
                if(value == 9){return "KG";}
            }
        },
        {
            field : 'currentAccount',
            title : '往来核算',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
        },
        {
            field : 'billAccounting',
            title : '票据核算',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
        },
        {
            field : 'auxiliaryAccounting',
            title : '辅助核算',
            width : 110,
            sortable : true,
            formatter:function(value,row,index){
                if(value == 0){return "否";}
                if(value == 1){return "是";}
            }
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
