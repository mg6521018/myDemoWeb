package com.mg.demo.model;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer userId;

    private String userName;

    private Integer age;

    private String account;

    private Integer status;

    private Long createtime;

    private Integer isexpired;

    private Integer islock;

    public SysUser(Integer userId, String userName, Integer age, String account, Integer status, Long createtime, Integer isexpired, Integer islock) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.account = account;
        this.status = status;
        this.createtime = createtime;
        this.isexpired = isexpired;
        this.islock = islock;
    }

    public SysUser() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Integer getIsexpired() {
        return isexpired;
    }

    public void setIsexpired(Integer isexpired) {
        this.isexpired = isexpired;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUser sysUser = (SysUser) o;

        if (userId != null ? !userId.equals(sysUser.userId) : sysUser.userId != null) return false;
        if (userName != null ? !userName.equals(sysUser.userName) : sysUser.userName != null) return false;
        if (age != null ? !age.equals(sysUser.age) : sysUser.age != null) return false;
        if (account != null ? !account.equals(sysUser.account) : sysUser.account != null) return false;
        if (status != null ? !status.equals(sysUser.status) : sysUser.status != null) return false;
        if (createtime != null ? !createtime.equals(sysUser.createtime) : sysUser.createtime != null) return false;
        if (isexpired != null ? !isexpired.equals(sysUser.isexpired) : sysUser.isexpired != null) return false;
        return islock != null ? islock.equals(sysUser.islock) : sysUser.islock == null;

    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (isexpired != null ? isexpired.hashCode() : 0);
        result = 31 * result + (islock != null ? islock.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", account='" + account + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                ", isexpired=" + isexpired +
                ", islock=" + islock +
                '}';
    }
}