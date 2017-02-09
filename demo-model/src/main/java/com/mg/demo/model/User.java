package com.mg.demo.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class User implements Serializable{
    private Integer id;
    private String userName;
    private String account;
    private Integer status;
    private Long createTime;
    private Integer isExpired;
    private Integer isLock;
    private Integer age;

    public User(Integer id, String userName, String account, Integer status, Long createTime, Integer isExpired, Integer isLock, Integer age) {
        this.id = id;
        this.userName = userName;
        this.account = account;
        this.status = status;
        this.createTime = createTime;
        this.isExpired = isExpired;
        this.isLock = isLock;
        this.age = age;
    }

    public User(Integer id, String userName, Integer age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Integer isExpired) {
        this.isExpired = isExpired;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (account != null ? !account.equals(user.account) : user.account != null) return false;
        if (status != null ? !status.equals(user.status) : user.status != null) return false;
        if (createTime != null ? !createTime.equals(user.createTime) : user.createTime != null) return false;
        if (isExpired != null ? !isExpired.equals(user.isExpired) : user.isExpired != null) return false;
        if (isLock != null ? !isLock.equals(user.isLock) : user.isLock != null) return false;
        return age != null ? age.equals(user.age) : user.age == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isExpired != null ? isExpired.hashCode() : 0);
        result = 31 * result + (isLock != null ? isLock.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", account='" + account + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", isExpired=" + isExpired +
                ", isLock=" + isLock +
                ", age=" + age +
                '}';
    }
}