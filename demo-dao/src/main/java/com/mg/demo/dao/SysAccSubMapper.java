package com.mg.demo.dao;

import com.mg.demo.model.SysAccSub;

import java.util.List;
import java.util.Map;

public interface SysAccSubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAccSub record);

    int insertSelective(SysAccSub record);

    SysAccSub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAccSub record);

    int updateByPrimaryKey(SysAccSub record);

    List<SysAccSub> selectByPid(Map<String,Object> params);

    List<SysAccSub> selectAll(Map<String,Object> params);
}