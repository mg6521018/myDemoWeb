package com.mg.demo.model;

import java.io.Serializable;

public class SysSet implements Serializable {
    private Integer id;

    private String name;

    private String code;

    private String address;

    private String legalErson;

    private String mobile;

    private String postcode;

    private String currencyCode;

    private String currencyName;

    private Integer fiscalYear;

    private Integer accountingSystem;

    private Integer defaultTable;

    private Integer cashFlowDuringEntry;

    private Integer samePerson;

    private Integer mustCheck;

    private Integer cashierCheck;

    private Integer nextMonth;

    private Integer unitDecimal;

    private Integer numberDecimalPlaces;

    private Integer includedDatabase;

    private Integer saveAddress;

    private Integer backups;

    private Integer canDelete;

    private Integer carryOverProfitLoss;

    private Integer quantityAccounting;

    private Integer foreignCurrencyAccounting;

    private Integer immediateAccounting;

    private Integer depreciationCorrelation;

    private Integer subjectCode1;

    private Integer subjectCode2;

    private Integer subjectCode3;

    private Integer subjectCode4;

    private Integer subjectCode5;

    private Integer subjectCode6;

    private Integer projectCode1;

    private Integer projectCode2;

    private Integer projectCode3;

    private Integer projectCode4;

    private Integer projectCode5;

    private Integer projectCode6;

    private Integer salesProcessing;

    public SysSet() {
    }

    public SysSet(Integer id, String name, String code, String address, String legalErson, String mobile, String postcode, String currencyCode, String currencyName, Integer fiscalYear, Integer accountingSystem, Integer defaultTable, Integer cashFlowDuringEntry, Integer samePerson, Integer mustCheck, Integer cashierCheck, Integer nextMonth, Integer unitDecimal, Integer numberDecimalPlaces, Integer includedDatabase, Integer saveAddress, Integer backups, Integer canDelete, Integer carryOverProfitLoss, Integer quantityAccounting, Integer foreignCurrencyAccounting, Integer immediateAccounting, Integer depreciationCorrelation, Integer subjectCode1, Integer subjectCode2, Integer subjectCode3, Integer subjectCode4, Integer subjectCode5, Integer subjectCode6, Integer projectCode1, Integer projectCode2, Integer projectCode3, Integer projectCode4, Integer projectCode5, Integer projectCode6, Integer salesProcessing) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.address = address;
        this.legalErson = legalErson;
        this.mobile = mobile;
        this.postcode = postcode;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.fiscalYear = fiscalYear;
        this.accountingSystem = accountingSystem;
        this.defaultTable = defaultTable;
        this.cashFlowDuringEntry = cashFlowDuringEntry;
        this.samePerson = samePerson;
        this.mustCheck = mustCheck;
        this.cashierCheck = cashierCheck;
        this.nextMonth = nextMonth;
        this.unitDecimal = unitDecimal;
        this.numberDecimalPlaces = numberDecimalPlaces;
        this.includedDatabase = includedDatabase;
        this.saveAddress = saveAddress;
        this.backups = backups;
        this.canDelete = canDelete;
        this.carryOverProfitLoss = carryOverProfitLoss;
        this.quantityAccounting = quantityAccounting;
        this.foreignCurrencyAccounting = foreignCurrencyAccounting;
        this.immediateAccounting = immediateAccounting;
        this.depreciationCorrelation = depreciationCorrelation;
        this.subjectCode1 = subjectCode1;
        this.subjectCode2 = subjectCode2;
        this.subjectCode3 = subjectCode3;
        this.subjectCode4 = subjectCode4;
        this.subjectCode5 = subjectCode5;
        this.subjectCode6 = subjectCode6;
        this.projectCode1 = projectCode1;
        this.projectCode2 = projectCode2;
        this.projectCode3 = projectCode3;
        this.projectCode4 = projectCode4;
        this.projectCode5 = projectCode5;
        this.projectCode6 = projectCode6;
        this.salesProcessing = salesProcessing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLegalErson() {
        return legalErson;
    }

    public void setLegalErson(String legalErson) {
        this.legalErson = legalErson == null ? null : legalErson.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName == null ? null : currencyName.trim();
    }

    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Integer getAccountingSystem() {
        return accountingSystem;
    }

    public void setAccountingSystem(Integer accountingSystem) {
        this.accountingSystem = accountingSystem;
    }

    public Integer getDefaultTable() {
        return defaultTable;
    }

    public void setDefaultTable(Integer defaultTable) {
        this.defaultTable = defaultTable;
    }

    public Integer getCashFlowDuringEntry() {
        return cashFlowDuringEntry;
    }

    public void setCashFlowDuringEntry(Integer cashFlowDuringEntry) {
        this.cashFlowDuringEntry = cashFlowDuringEntry;
    }

    public Integer getSamePerson() {
        return samePerson;
    }

    public void setSamePerson(Integer samePerson) {
        this.samePerson = samePerson;
    }

    public Integer getMustCheck() {
        return mustCheck;
    }

    public void setMustCheck(Integer mustCheck) {
        this.mustCheck = mustCheck;
    }

    public Integer getCashierCheck() {
        return cashierCheck;
    }

    public void setCashierCheck(Integer cashierCheck) {
        this.cashierCheck = cashierCheck;
    }

    public Integer getNextMonth() {
        return nextMonth;
    }

    public void setNextMonth(Integer nextMonth) {
        this.nextMonth = nextMonth;
    }

    public Integer getUnitDecimal() {
        return unitDecimal;
    }

    public void setUnitDecimal(Integer unitDecimal) {
        this.unitDecimal = unitDecimal;
    }

    public Integer getNumberDecimalPlaces() {
        return numberDecimalPlaces;
    }

    public void setNumberDecimalPlaces(Integer numberDecimalPlaces) {
        this.numberDecimalPlaces = numberDecimalPlaces;
    }

    public Integer getIncludedDatabase() {
        return includedDatabase;
    }

    public void setIncludedDatabase(Integer includedDatabase) {
        this.includedDatabase = includedDatabase;
    }

    public Integer getSaveAddress() {
        return saveAddress;
    }

    public void setSaveAddress(Integer saveAddress) {
        this.saveAddress = saveAddress;
    }

    public Integer getBackups() {
        return backups;
    }

    public void setBackups(Integer backups) {
        this.backups = backups;
    }

    public Integer getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Integer canDelete) {
        this.canDelete = canDelete;
    }

    public Integer getCarryOverProfitLoss() {
        return carryOverProfitLoss;
    }

    public void setCarryOverProfitLoss(Integer carryOverProfitLoss) {
        this.carryOverProfitLoss = carryOverProfitLoss;
    }

    public Integer getQuantityAccounting() {
        return quantityAccounting;
    }

    public void setQuantityAccounting(Integer quantityAccounting) {
        this.quantityAccounting = quantityAccounting;
    }

    public Integer getForeignCurrencyAccounting() {
        return foreignCurrencyAccounting;
    }

    public void setForeignCurrencyAccounting(Integer foreignCurrencyAccounting) {
        this.foreignCurrencyAccounting = foreignCurrencyAccounting;
    }

    public Integer getImmediateAccounting() {
        return immediateAccounting;
    }

    public void setImmediateAccounting(Integer immediateAccounting) {
        this.immediateAccounting = immediateAccounting;
    }

    public Integer getDepreciationCorrelation() {
        return depreciationCorrelation;
    }

    public void setDepreciationCorrelation(Integer depreciationCorrelation) {
        this.depreciationCorrelation = depreciationCorrelation;
    }

    public Integer getSubjectCode1() {
        return subjectCode1;
    }

    public void setSubjectCode1(Integer subjectCode1) {
        this.subjectCode1 = subjectCode1;
    }

    public Integer getSubjectCode2() {
        return subjectCode2;
    }

    public void setSubjectCode2(Integer subjectCode2) {
        this.subjectCode2 = subjectCode2;
    }

    public Integer getSubjectCode3() {
        return subjectCode3;
    }

    public void setSubjectCode3(Integer subjectCode3) {
        this.subjectCode3 = subjectCode3;
    }

    public Integer getSubjectCode4() {
        return subjectCode4;
    }

    public void setSubjectCode4(Integer subjectCode4) {
        this.subjectCode4 = subjectCode4;
    }

    public Integer getSubjectCode5() {
        return subjectCode5;
    }

    public void setSubjectCode5(Integer subjectCode5) {
        this.subjectCode5 = subjectCode5;
    }

    public Integer getSubjectCode6() {
        return subjectCode6;
    }

    public void setSubjectCode6(Integer subjectCode6) {
        this.subjectCode6 = subjectCode6;
    }

    public Integer getProjectCode1() {
        return projectCode1;
    }

    public void setProjectCode1(Integer projectCode1) {
        this.projectCode1 = projectCode1;
    }

    public Integer getProjectCode2() {
        return projectCode2;
    }

    public void setProjectCode2(Integer projectCode2) {
        this.projectCode2 = projectCode2;
    }

    public Integer getProjectCode3() {
        return projectCode3;
    }

    public void setProjectCode3(Integer projectCode3) {
        this.projectCode3 = projectCode3;
    }

    public Integer getProjectCode4() {
        return projectCode4;
    }

    public void setProjectCode4(Integer projectCode4) {
        this.projectCode4 = projectCode4;
    }

    public Integer getProjectCode5() {
        return projectCode5;
    }

    public void setProjectCode5(Integer projectCode5) {
        this.projectCode5 = projectCode5;
    }

    public Integer getProjectCode6() {
        return projectCode6;
    }

    public void setProjectCode6(Integer projectCode6) {
        this.projectCode6 = projectCode6;
    }

    public Integer getSalesProcessing() {
        return salesProcessing;
    }

    public void setSalesProcessing(Integer salesProcessing) {
        this.salesProcessing = salesProcessing;
    }
}