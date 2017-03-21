package com.mg.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mg.demo.api.SysSetService;
import com.mg.demo.dao.SysSetMapper;
import com.mg.demo.model.SysSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class SysSetServiceImpl implements SysSetService {

    private static final Logger logger = LoggerFactory.getLogger(SysSetServiceImpl.class);

    @Autowired
    private SysSetMapper sysSetMapper;

    public int deleteByPrimaryKey(Integer id) {
        return sysSetMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysSet record) {
        return sysSetMapper.insert(record);
    }

    public int insertSelective(SysSet record) {
        return sysSetMapper.insertSelective(record);
    }

    public SysSet selectByPrimaryKey(Integer id) {
        return sysSetMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysSet record) {
        return sysSetMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysSet record) {
        return sysSetMapper.updateByPrimaryKey(record);
    }
}
