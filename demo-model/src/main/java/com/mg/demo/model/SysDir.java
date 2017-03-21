package com.mg.demo.model;

import java.io.Serializable;

public class SysDir implements Serializable {
    private Integer id;

    private String name;

    private Integer pid;

    private String demo;

    private String code;

    private String havSub;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo == null ? null : demo.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getHavSub() {
        return havSub;
    }

    public void setHavSub(String havSub) {
        this.havSub = havSub;
    }

    public SysDir() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysDir sysDir = (SysDir) o;

        if (id != null ? !id.equals(sysDir.id) : sysDir.id != null) return false;
        if (name != null ? !name.equals(sysDir.name) : sysDir.name != null) return false;
        if (pid != null ? !pid.equals(sysDir.pid) : sysDir.pid != null) return false;
        if (demo != null ? !demo.equals(sysDir.demo) : sysDir.demo != null) return false;
        if (code != null ? !code.equals(sysDir.code) : sysDir.code != null) return false;
        return havSub != null ? havSub.equals(sysDir.havSub) : sysDir.havSub == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (demo != null ? demo.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (havSub != null ? havSub.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SysDir{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", demo='" + demo + '\'' +
                ", code='" + code + '\'' +
                ", havSub='" + havSub + '\'' +
                '}';
    }
}