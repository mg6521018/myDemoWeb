package com.mg.demo.api;

import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.SysAccSub;
import com.mg.demo.model.SysVouche;

import java.util.List;

public interface SysAccSubService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAccSub record);

    int insertSelective(SysAccSub record);

    SysAccSub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAccSub record);

    int updateByPrimaryKey(SysAccSub record);

    List<SysAccSub> selectByPid(Integer pId,String typeId,String code);

    DataGridPage<SysAccSub> selectAll(Integer page, Integer rows, String code);
}