package com.mg.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mg.demo.api.UserService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.User;
import com.mg.demo.dao.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    public int insert(User record){
        return userMapper.insert(record);
    }

    public int insertSelective(User record){
        return userMapper.insertSelective(record);
    }

    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    public DataGridPage<User> selectAll(Integer page,Integer rows,String userName,String account) {
        Map <String,Object> params = new HashMap();
        if(StringUtils.isNotBlank(userName)){
            params.put("userName",userName);
        }
        if(StringUtils.isNotBlank(account)){
            params.put("account",account);
        }
        PageHelper.startPage(page,rows);
        List list = userMapper.selectAll(params);
        return DataGridPage.create(list);
    }
}
