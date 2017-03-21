package com.mg.demo.api;

import com.mg.demo.model.SysSet;

/**
 * Created by magang on 2016/12/28.
 */
public interface SysSetService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSet record);

    int insertSelective(SysSet record);

    SysSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSet record);

    int updateByPrimaryKey(SysSet record);
}
