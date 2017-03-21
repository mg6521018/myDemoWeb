package com.mg.demo.model;

import java.io.Serializable;

public class SysVouche implements Serializable {
    private Integer id;

    private String name;

    private Integer typeId;

    private String detailCode;

    private String voucheNo;

    private Integer condition1;

    private Integer condition2;

    private Integer condition3;

    private Integer condition4;

    private Integer condition5;

    private Integer condition6;

    private Integer status;

    private String dirCode;
    private String typeName;

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode == null ? null : detailCode.trim();
    }

    public String getVoucheNo() {
        return voucheNo;
    }

    public void setVoucheNo(String voucheNo) {
        this.voucheNo = voucheNo == null ? null : voucheNo.trim();
    }

    public Integer getCondition1() {
        return condition1;
    }

    public void setCondition1(Integer condition1) {
        this.condition1 = condition1;
    }

    public Integer getCondition2() {
        return condition2;
    }

    public void setCondition2(Integer condition2) {
        this.condition2 = condition2;
    }

    public Integer getCondition3() {
        return condition3;
    }

    public void setCondition3(Integer condition3) {
        this.condition3 = condition3;
    }

    public Integer getCondition4() {
        return condition4;
    }

    public void setCondition4(Integer condition4) {
        this.condition4 = condition4;
    }

    public Integer getCondition5() {
        return condition5;
    }

    public void setCondition5(Integer condition5) {
        this.condition5 = condition5;
    }

    public Integer getCondition6() {
        return condition6;
    }

    public void setCondition6(Integer condition6) {
        this.condition6 = condition6;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDirCode() {
        return dirCode;
    }

    public void setDirCode(String dirCode) {
        this.dirCode = dirCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public SysVouche() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysVouche sysVouche = (SysVouche) o;

        if (id != null ? !id.equals(sysVouche.id) : sysVouche.id != null) return false;
        if (name != null ? !name.equals(sysVouche.name) : sysVouche.name != null) return false;
        if (typeId != null ? !typeId.equals(sysVouche.typeId) : sysVouche.typeId != null) return false;
        if (detailCode != null ? !detailCode.equals(sysVouche.detailCode) : sysVouche.detailCode != null) return false;
        if (voucheNo != null ? !voucheNo.equals(sysVouche.voucheNo) : sysVouche.voucheNo != null) return false;
        if (condition1 != null ? !condition1.equals(sysVouche.condition1) : sysVouche.condition1 != null) return false;
        if (condition2 != null ? !condition2.equals(sysVouche.condition2) : sysVouche.condition2 != null) return false;
        if (condition3 != null ? !condition3.equals(sysVouche.condition3) : sysVouche.condition3 != null) return false;
        if (condition4 != null ? !condition4.equals(sysVouche.condition4) : sysVouche.condition4 != null) return false;
        if (condition5 != null ? !condition5.equals(sysVouche.condition5) : sysVouche.condition5 != null) return false;
        if (condition6 != null ? !condition6.equals(sysVouche.condition6) : sysVouche.condition6 != null) return false;
        return status != null ? status.equals(sysVouche.status) : sysVouche.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (detailCode != null ? detailCode.hashCode() : 0);
        result = 31 * result + (voucheNo != null ? voucheNo.hashCode() : 0);
        result = 31 * result + (condition1 != null ? condition1.hashCode() : 0);
        result = 31 * result + (condition2 != null ? condition2.hashCode() : 0);
        result = 31 * result + (condition3 != null ? condition3.hashCode() : 0);
        result = 31 * result + (condition4 != null ? condition4.hashCode() : 0);
        result = 31 * result + (condition5 != null ? condition5.hashCode() : 0);
        result = 31 * result + (condition6 != null ? condition6.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SysVouche{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeId=" + typeId +
                ", detailCode='" + detailCode + '\'' +
                ", voucheNo='" + voucheNo + '\'' +
                ", condition1=" + condition1 +
                ", condition2=" + condition2 +
                ", condition3=" + condition3 +
                ", condition4=" + condition4 +
                ", condition5=" + condition5 +
                ", condition6=" + condition6 +
                ", status=" + status +
                '}';
    }
}