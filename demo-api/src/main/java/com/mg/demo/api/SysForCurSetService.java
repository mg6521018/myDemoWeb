package com.mg.demo.api;

import com.mg.demo.model.SysForCurSet;

import java.util.List;

public interface SysForCurSetService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysForCurSet record);

    int insertSelective(SysForCurSet record);

    SysForCurSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysForCurSet record);

    int updateByPrimaryKey(SysForCurSet record);

    List<SysForCurSet> selectAll();
}