package com.mg.demo.api;

import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.SysUser;

/**
 * Created by magang on 2016/12/28.
 */
public interface SysUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    DataGridPage<SysUser> selectAll(Integer page, Integer rows,String userName,String account);

    void deleteByPrimaryKeys(String idList);
}
