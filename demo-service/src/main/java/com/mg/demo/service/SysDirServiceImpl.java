package com.mg.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mg.demo.api.SysDirService;
import com.mg.demo.dao.SysDirMapper;
import com.mg.demo.model.SysDir;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class SysDirServiceImpl implements SysDirService {

    private static final Logger logger = LoggerFactory.getLogger(SysDirServiceImpl.class);

    @Autowired
    private SysDirMapper sysDirMapper;

    public int deleteByPrimaryKey(Integer id) {
        return sysDirMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysDir record) {
        return sysDirMapper.insert(record);
    }

    public int insertSelective(SysDir record) {
        return sysDirMapper.insertSelective(record);
    }

    public SysDir selectByPrimaryKey(Integer id) {
        return sysDirMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysDir record) {
        return sysDirMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysDir record) {
        return sysDirMapper.updateByPrimaryKey(record);
    }

    public List<SysDir> selectByPid(Integer pId) {
        return sysDirMapper.selectByPid(pId);
    }
}
