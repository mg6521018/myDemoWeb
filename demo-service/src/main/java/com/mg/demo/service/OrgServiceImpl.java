package com.mg.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.mg.demo.api.OrgService;
import com.mg.demo.api.UserService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.dao.OrgMapper;
import com.mg.demo.dao.UserMapper;
import com.mg.demo.model.Org;
import com.mg.demo.model.User;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
public class OrgServiceImpl implements OrgService {

    private static final Logger logger = LoggerFactory.getLogger(OrgServiceImpl.class);

    @Autowired
    private OrgMapper orgMapper;

    public int insert(User record){
        return orgMapper.insert(record);
    }

    public int insertSelective(User record){
        return orgMapper.insertSelective(record);
    }

    public int deleteByPrimaryKey(Integer id) {
        return orgMapper.deleteByPrimaryKey(id);
    }

    public User selectByPrimaryKey(Integer id) {
        return orgMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record) {
        return orgMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return orgMapper.updateByPrimaryKey(record);
    }

    public List<Org> selectAll(Integer parentId) {
        Map <String,Object> params = new HashMap();
        if(null != parentId){
            params.put("parentId",parentId);
        }

        List<Org> list = orgMapper.selectAll(params);
        return list;
    }
}
