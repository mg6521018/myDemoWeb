package com.mg.demo.model;

import java.io.Serializable;

public class SysAccSub implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private Integer pid;

    private String mnemonicCode;

    private Integer typeId;

    private String direction;

    private String cashAccountClass;

    private String bankAccountClass;

    private String cashEquivalents;

    private String foreignCurrencyAccounting;

    private String quantityAccounting;

    private Integer company;

    private String currentAccount;

    private String billAccounting;

    private String auxiliaryAccounting;

    private String subjectIndex;

    private String reportAttributes;

    private String specificationModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode == null ? null : mnemonicCode.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getCashAccountClass() {
        return cashAccountClass;
    }

    public void setCashAccountClass(String cashAccountClass) {
        this.cashAccountClass = cashAccountClass == null ? null : cashAccountClass.trim();
    }

    public String getBankAccountClass() {
        return bankAccountClass;
    }

    public void setBankAccountClass(String bankAccountClass) {
        this.bankAccountClass = bankAccountClass == null ? null : bankAccountClass.trim();
    }

    public String getCashEquivalents() {
        return cashEquivalents;
    }

    public void setCashEquivalents(String cashEquivalents) {
        this.cashEquivalents = cashEquivalents == null ? null : cashEquivalents.trim();
    }

    public String getForeignCurrencyAccounting() {
        return foreignCurrencyAccounting;
    }

    public void setForeignCurrencyAccounting(String foreignCurrencyAccounting) {
        this.foreignCurrencyAccounting = foreignCurrencyAccounting == null ? null : foreignCurrencyAccounting.trim();
    }

    public String getQuantityAccounting() {
        return quantityAccounting;
    }

    public void setQuantityAccounting(String quantityAccounting) {
        this.quantityAccounting = quantityAccounting == null ? null : quantityAccounting.trim();
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(String currentAccount) {
        this.currentAccount = currentAccount == null ? null : currentAccount.trim();
    }

    public String getBillAccounting() {
        return billAccounting;
    }

    public void setBillAccounting(String billAccounting) {
        this.billAccounting = billAccounting == null ? null : billAccounting.trim();
    }

    public String getAuxiliaryAccounting() {
        return auxiliaryAccounting;
    }

    public void setAuxiliaryAccounting(String auxiliaryAccounting) {
        this.auxiliaryAccounting = auxiliaryAccounting == null ? null : auxiliaryAccounting.trim();
    }

    public String getSubjectIndex() {
        return subjectIndex;
    }

    public void setSubjectIndex(String subjectIndex) {
        this.subjectIndex = subjectIndex == null ? null : subjectIndex.trim();
    }

    public String getReportAttributes() {
        return reportAttributes;
    }

    public void setReportAttributes(String reportAttributes) {
        this.reportAttributes = reportAttributes == null ? null : reportAttributes.trim();
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel == null ? null : specificationModel.trim();
    }
}