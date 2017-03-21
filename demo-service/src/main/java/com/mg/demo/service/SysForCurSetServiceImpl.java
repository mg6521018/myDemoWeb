package com.mg.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.mg.demo.api.SysForCurSetService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.dao.SysForCurSetMapper;
import com.mg.demo.model.SysForCurSet;
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
public class SysForCurSetServiceImpl implements SysForCurSetService {

    private static final Logger logger = LoggerFactory.getLogger(SysForCurSetServiceImpl.class);

    @Autowired
    private SysForCurSetMapper sysForCurSetMapper;

    public int insert(SysForCurSet record){
        return sysForCurSetMapper.insert(record);
    }

    public int insertSelective(SysForCurSet record){
        return sysForCurSetMapper.insertSelective(record);
    }

    public int deleteByPrimaryKey(Integer id) {
        return sysForCurSetMapper.deleteByPrimaryKey(id);
    }

    public SysForCurSet selectByPrimaryKey(Integer id) {
        return sysForCurSetMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysForCurSet record) {
        return sysForCurSetMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysForCurSet record) {
        return sysForCurSetMapper.updateByPrimaryKey(record);
    }

    public List<SysForCurSet> selectAll() {
        return  sysForCurSetMapper.selectAll();
    }

    public void deleteByPrimaryKeys(String idList){
        String [] ids = idList.split(",");
        for(String id : ids){
            sysForCurSetMapper.deleteByPrimaryKey(Integer.parseInt(id));
        }
    }
}
