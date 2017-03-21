package com.mg.demo.api;

import com.mg.demo.model.SysDir;

import java.util.List;

/**
 * Created by magang on 2017/2/23.
 */
public interface SysDirService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDir record);

    int insertSelective(SysDir record);

    SysDir selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDir record);

    int updateByPrimaryKey(SysDir record);

    List<SysDir> selectByPid(Integer pId);
}
