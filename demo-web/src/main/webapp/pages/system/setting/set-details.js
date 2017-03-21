/**
 * Created by magang on 2017/2/8.
 */
var EL = EL || {}, GV = GV || {}, FN = FN || {}, Urls = Urls || {};

Urls.load = '/demo/set/loadDetailsData.do';

$(function() {
    //搜索面板
    EL.oBtnEdit = $('#oBtnEdit');//修改
    var params = {};
    //初始化页面数据

    __.post(Urls.load, params, function(vo) {
        $('#name').html(vo.name);
        $('#code').html(vo.code);
        $('#address').html(vo.address);
        $('#legalErson').html(vo.legalErson);
        $('#mobile').html(vo.mobile);
        $('#postcode').html(vo.postcode);
        $('#currencyCode').html(vo.currencyCode);
        $('#currencyName').html(vo.currencyName);
        $('#fiscalYear').html(vo.fiscalYear);
        $('#accountingSystem').html(vo.accountingSystem);
        $('#defaultTable').html(vo.defaultTable);
        $('#cashFlowDuringEntry').html(vo.cashFlowDuringEntry);
        $('#samePerson').html(vo.samePerson);
        $('#mustCheck').html(vo.mustCheck);
        $('#cashierCheck').html(vo.cashierCheck);
        $('#nextMonth').html(vo.nextMonth);
        $('#unitDecimal').html(vo.unitDecimal);
        $('#numberDecimalPlaces').html(vo.numberDecimalPlaces);
        $('#includedDatabase').html(vo.includedDatabase);
        $('#saveAddress').html(vo.saveAddress);
        $('#backups').html(vo.backups);
        $('#canDelete').html(vo.canDelete);
        $('#carryOverProfitLoss').html(vo.carryOverProfitLoss);
        $('#quantityAccounting').html(vo.quantityAccounting);
        $('#foreignCurrencyAccounting').html(vo.foreignCurrencyAccounting);
        $('#immediateAccounting').html(vo.immediateAccounting);
        $('#depreciationCorrelation').html(vo.depreciationCorrelation);
        $('#subjectCode1').html(vo.subjectCode1);
        $('#subjectCode2').html(vo.subjectCode2);
        $('#subjectCode3').html(vo.subjectCode3);
        $('#subjectCode4').html(vo.subjectCode4);
        $('#subjectCode5').html(vo.subjectCode5);
        $('#subjectCode6').html(vo.subjectCode6);
        $('#projectCode1').html(vo.projectCode1);
        $('#projectCode2').html(vo.projectCode2);
        $('#projectCode3').html(vo.projectCode3);
        $('#projectCode4').html(vo.projectCode4);
        $('#projectCode5').html(vo.projectCode5);
        $('#projectCode6').html(vo.projectCode6);
        $('#salesProcessing').html(vo.salesProcessing);
    });


    //修改
    EL.oBtnEdit.on('click', function() {
        FN.onEdit({});
    });

    //编辑数据
    FN.onEdit = function() {
        window.location.href='/demo/pages/system/setting/set-edit.jsp';
    }
});