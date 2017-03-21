package com.mg.demo.dao;

import com.mg.demo.model.SysSet;

public interface SysSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSet record);

    int insertSelective(SysSet record);

    SysSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSet record);

    int updateByPrimaryKey(SysSet record);
}