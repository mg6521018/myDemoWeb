package com.mg.demo.api;

import com.github.pagehelper.Page;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.User;

import java.util.List;

/**
 * Created by magang on 2016/12/28.
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    DataGridPage<User> selectAll(Integer page, Integer rows,String userName,String account);
}
