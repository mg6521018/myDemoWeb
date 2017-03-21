package com.mg.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.mg.demo.api.SysUserService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.dao.SysUserMapper;
import com.mg.demo.model.SysUser;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class SysUserServiceImpl implements SysUserService {

    private static final Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);

    @Autowired
    private SysUserMapper sysUserMapper;

    public int insert(SysUser record){
        return sysUserMapper.insert(record);
    }

    public int insertSelective(SysUser record){
        return sysUserMapper.insertSelective(record);
    }

    public int deleteByPrimaryKey(Integer id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    public SysUser selectByPrimaryKey(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    public DataGridPage<SysUser> selectAll(Integer page,Integer rows,String userName,String account) {
        Map <String,Object> params = new HashMap();
        if(StringUtils.isNotBlank(userName)){
            params.put("userName",userName);
        }
        if(StringUtils.isNotBlank(account)){
            params.put("account",account);
        }
        PageHelper.startPage(page,rows);
        List list = sysUserMapper.selectAll(params);
        return DataGridPage.create(list);
    }

    public void deleteByPrimaryKeys(String idList){
        String [] ids = idList.split(",");
        for(String id : ids){
            sysUserMapper.deleteByPrimaryKey(Integer.parseInt(id));
        }
    }
}
