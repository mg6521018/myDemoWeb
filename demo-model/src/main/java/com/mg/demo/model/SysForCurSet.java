package com.mg.demo.model;

public class SysForCurSet {
    private Integer id;

    private String code;

    private String name;

    private String exchangeRate;

    private Integer decimalDigit;

    private String exchangeRateConversion;

    private String exchangeRatePattern;

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

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate == null ? null : exchangeRate.trim();
    }

    public Integer getDecimalDigit() {
        return decimalDigit;
    }

    public void setDecimalDigit(Integer decimalDigit) {
        this.decimalDigit = decimalDigit;
    }

    public String getExchangeRateConversion() {
        return exchangeRateConversion;
    }

    public void setExchangeRateConversion(String exchangeRateConversion) {
        this.exchangeRateConversion = exchangeRateConversion == null ? null : exchangeRateConversion.trim();
    }

    public String getExchangeRatePattern() {
        return exchangeRatePattern;
    }

    public void setExchangeRatePattern(String exchangeRatePattern) {
        this.exchangeRatePattern = exchangeRatePattern == null ? null : exchangeRatePattern.trim();
    }
}