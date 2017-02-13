package com.mg.demo.model;

import java.io.Serializable;

/**
 * Created by magang on 2017/2/10.
 */
public class Org implements Serializable{
    private Integer id;
    private String name;
    private String code;
    private Integer parentId;
    private Long createTime;
    private Long updateTime;
    private Integer havSub;

    public Org() {
    }

    public Org(Integer id, String name, String code, Integer parentId, Long createTime, Long updateTime,Integer havSub) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.parentId = parentId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.havSub = havSub;
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
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getHavSub() {
        return havSub;
    }

    public void setHavSub(Integer havSub) {
        this.havSub = havSub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Org org = (Org) o;

        if (id != null ? !id.equals(org.id) : org.id != null) return false;
        if (name != null ? !name.equals(org.name) : org.name != null) return false;
        if (code != null ? !code.equals(org.code) : org.code != null) return false;
        if (parentId != null ? !parentId.equals(org.parentId) : org.parentId != null) return false;
        if (createTime != null ? !createTime.equals(org.createTime) : org.createTime != null) return false;
        return updateTime != null ? updateTime.equals(org.updateTime) : org.updateTime == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Org{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", parentId=" + parentId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
