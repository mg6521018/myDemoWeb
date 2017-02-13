package com.mg.demo.api;

import com.google.common.collect.Lists;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.Org;
import com.mg.demo.model.User;

import java.util.List;

/**
 * Created by magang on 2016/12/28.
 */
public interface OrgService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Org> selectAll(Integer parentId);
}
