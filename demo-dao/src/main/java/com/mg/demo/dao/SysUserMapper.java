package com.mg.demo.dao;

import com.mg.demo.model.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> selectAll(Map<String,Object> params);
}
