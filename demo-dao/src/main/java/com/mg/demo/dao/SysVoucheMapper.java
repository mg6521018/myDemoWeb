package com.mg.demo.dao;

import com.mg.demo.model.SysVouche;

import java.util.List;
import java.util.Map;

public interface SysVoucheMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysVouche record);

    int insertSelective(SysVouche record);

    SysVouche selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysVouche record);

    int updateByPrimaryKey(SysVouche record);

    List<SysVouche> selectAll(Map<String,Object> params);
}