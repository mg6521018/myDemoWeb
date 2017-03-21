package com.mg.demo.api;

import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.SysVouche;

/**
 * Created by magang on 2017/2/23.
 */
public interface SysVoucheService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysVouche record);

    int insertSelective(SysVouche record);

    SysVouche selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysVouche record);

    int updateByPrimaryKey(SysVouche record);

    DataGridPage<SysVouche> selectAll(Integer page, Integer rows, String name, String typeId);

}
