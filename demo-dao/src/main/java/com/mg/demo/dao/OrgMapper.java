package com.mg.demo.dao;


import com.mg.demo.model.Org;
import com.mg.demo.model.User;

import java.util.List;
import java.util.Map;

public interface OrgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Org> selectAll(Map<String, Object> params);
}
