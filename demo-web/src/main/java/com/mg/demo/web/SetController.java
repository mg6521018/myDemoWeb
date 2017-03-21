package com.mg.demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mg.demo.api.SysSetService;
import com.mg.demo.model.SysSet;
import com.mg.demo.utils.SysSetDetailsUtils;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/set")
public class SetController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(SetController.class);
    @Reference
    private SysSetService sysSetService;

    /**
     * 修改获取数据
     */
    @RequestMapping("/loadEditData.do")
    @ResponseBody
    public SysSet loadEditData(HttpServletRequest request,@RequestParam(required=false,defaultValue="-1") Integer id){
        SysSet sysSet = sysSetService.selectByPrimaryKey(1);
        return sysSet;
    }

    /**
     * 查看详细数据
     */
    @RequestMapping("/loadDetailsData.do")
    @ResponseBody
    public Map <String,String> loadDetailsData(HttpServletRequest request,@RequestParam(required=false,defaultValue="-1") Integer id){
        SysSet sysSet = sysSetService.selectByPrimaryKey(1);
        Map<String, String> map = getStringMap(sysSet);
        return map;
    }

    /**
     * 查看详细数据
     */
    @RequestMapping("/save.do")
    @ResponseBody
    public Map <String,Object> save(HttpServletRequest request,SysSet sysSet){

        Map<String, Object> map = new HashMap();
        try {
            sysSetService.updateByPrimaryKeySelective(sysSet);
            map.put("success", true);
        }
        catch (Exception e){
            e.printStackTrace();
            map.put("success", false);
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @NotNull
    private Map<String, String> getStringMap(SysSet sysSet) {
        Map <String,String> map = new HashMap();
        if(null == sysSet){
            return map;
        }
        map.put("id", SysSetDetailsUtils.toString(sysSet.getId()));
        map.put("name",sysSet.getName());
        map.put("code",sysSet.getCode());
        map.put("address",sysSet.getAddress());
        map.put("legalErson",sysSet.getLegalErson());
        map.put("mobile",sysSet.getMobile());
        map.put("postcode",sysSet.getPostcode());
        map.put("currencyCode",sysSet.getCurrencyCode());
        map.put("currencyName",sysSet.getCurrencyName());
        map.put("fiscalYear",SysSetDetailsUtils.convertFiscalYear(sysSet.getFiscalYear()));
        map.put("accountingSystem",SysSetDetailsUtils.convertAccountingSystem(sysSet.getAccountingSystem()));
        map.put("defaultTable",SysSetDetailsUtils.convertDefaultTable(sysSet.getDefaultTable()));
        map.put("cashFlowDuringEntry",SysSetDetailsUtils.convertInteger(sysSet.getCashFlowDuringEntry()));
        map.put("samePerson",SysSetDetailsUtils.convertInteger(sysSet.getSamePerson()));
        map.put("mustCheck",SysSetDetailsUtils.convertInteger(sysSet.getMustCheck()));
        map.put("cashierCheck",SysSetDetailsUtils.convertInteger(sysSet.getCashierCheck()));
        map.put("nextMonth",SysSetDetailsUtils.toString(sysSet.getNextMonth()));
        map.put("unitDecimal",SysSetDetailsUtils.toString(sysSet.getUnitDecimal()));
        map.put("numberDecimalPlaces",SysSetDetailsUtils.toString(sysSet.getNumberDecimalPlaces()));
        map.put("includedDatabase",SysSetDetailsUtils.convertInteger(sysSet.getIncludedDatabase()));
        map.put("saveAddress",SysSetDetailsUtils.convertInteger(sysSet.getSaveAddress()));
        map.put("backups",SysSetDetailsUtils.convertInteger(sysSet.getBackups()));
        map.put("canDelete",SysSetDetailsUtils.convertInteger(sysSet.getCanDelete()));
        map.put("carryOverProfitLoss",SysSetDetailsUtils.convertInteger(sysSet.getCarryOverProfitLoss()));
        map.put("quantityAccounting",SysSetDetailsUtils.convertInteger(sysSet.getQuantityAccounting()));
        map.put("foreignCurrencyAccounting",SysSetDetailsUtils.convertInteger(sysSet.getForeignCurrencyAccounting()));
        map.put("immediateAccounting",SysSetDetailsUtils.convertInteger(sysSet.getImmediateAccounting()));
        map.put("depreciationCorrelation",SysSetDetailsUtils.convertInteger(sysSet.getDepreciationCorrelation()));
        map.put("subjectCode1",SysSetDetailsUtils.toString(sysSet.getSubjectCode1()));
        map.put("subjectCode2",SysSetDetailsUtils.toString(sysSet.getSubjectCode2()));
        map.put("subjectCode3",SysSetDetailsUtils.toString(sysSet.getSubjectCode3()));
        map.put("subjectCode4",SysSetDetailsUtils.toString(sysSet.getSubjectCode4()));
        map.put("subjectCode5",SysSetDetailsUtils.toString(sysSet.getSubjectCode5()));
        map.put("subjectCode6",SysSetDetailsUtils.toString(sysSet.getSubjectCode6()));
        map.put("projectCode1",SysSetDetailsUtils.toString(sysSet.getProjectCode1()));
        map.put("projectCode2",SysSetDetailsUtils.toString(sysSet.getProjectCode2()));
        map.put("projectCode3",SysSetDetailsUtils.toString(sysSet.getProjectCode3()));
        map.put("projectCode4",SysSetDetailsUtils.toString(sysSet.getProjectCode4()));
        map.put("projectCode5",SysSetDetailsUtils.toString(sysSet.getProjectCode5()));
        map.put("projectCode6",SysSetDetailsUtils.toString(sysSet.getProjectCode6()));
        map.put("salesProcessing",SysSetDetailsUtils.convertSalesProcessing(sysSet.getSalesProcessing()));
        return map;
    }
}