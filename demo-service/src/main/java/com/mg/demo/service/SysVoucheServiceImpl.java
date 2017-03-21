package com.mg.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.mg.demo.api.SysVoucheService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.dao.SysVoucheMapper;
import com.mg.demo.model.SysVouche;
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
public class SysVoucheServiceImpl implements SysVoucheService {

    private static final Logger logger = LoggerFactory.getLogger(SysVoucheServiceImpl.class);

    @Autowired
    private SysVoucheMapper sysVoucheMapper;

    public int deleteByPrimaryKey(Integer id) {
        return sysVoucheMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysVouche record) {
        return sysVoucheMapper.insert(record);
    }

    public int insertSelective(SysVouche record) {
        return sysVoucheMapper.insertSelective(record);
    }

    public SysVouche selectByPrimaryKey(Integer id) {
        return sysVoucheMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysVouche record) {
        return sysVoucheMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysVouche record) {
        return sysVoucheMapper.updateByPrimaryKey(record);
    }

    public DataGridPage<SysVouche> selectAll(Integer page, Integer rows, String name, String typeId){
        Map<String,Object> params = new HashMap();
        if(StringUtils.isNotBlank(name)){
            params.put("name",name);
        }
        if(StringUtils.isNotBlank(typeId)){
            params.put("typeId",typeId);
        }
        PageHelper.startPage(page,rows);
        List list = sysVoucheMapper.selectAll(params);
        return DataGridPage.create(list);
    }
}
