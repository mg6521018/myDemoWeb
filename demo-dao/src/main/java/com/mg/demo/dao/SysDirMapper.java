package com.mg.demo.dao;

import com.mg.demo.model.SysDir;

import java.util.List;

public interface SysDirMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDir record);

    int insertSelective(SysDir record);

    SysDir selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDir record);

    int updateByPrimaryKey(SysDir record);

    List<SysDir> selectByPid(Integer pId);
}