package com.mg.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.mg.demo.api.SysAccSubService;
import com.mg.demo.api.SysAccSubService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.dao.SysAccSubMapper;
import com.mg.demo.model.SysAccSub;
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
public class SysAccSubServiceImpl implements SysAccSubService {

    private static final Logger logger = LoggerFactory.getLogger(SysAccSubServiceImpl.class);

    @Autowired
    private SysAccSubMapper sysAccSubMapper;

    public int deleteByPrimaryKey(Integer id) {
        return sysAccSubMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysAccSub record) {
        return sysAccSubMapper.insert(record);
    }

    public int insertSelective(SysAccSub record) {
        return sysAccSubMapper.insertSelective(record);
    }

    public SysAccSub selectByPrimaryKey(Integer id) {
        return sysAccSubMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysAccSub record) {
        return sysAccSubMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysAccSub record) {
        return sysAccSubMapper.updateByPrimaryKey(record);
    }

    public List<SysAccSub> selectByPid(Integer pId,String typeId,String code) {
        Map<String,Object> params = new HashMap();
        if(StringUtils.isNotBlank(typeId)){
            params.put("typeId",typeId);
        }
        if(StringUtils.isNotBlank(code)){
            params.put("code",code);
        }
        params.put("pId",pId);
        return sysAccSubMapper.selectByPid(params);
    }

    public DataGridPage<SysAccSub> selectAll(Integer page, Integer rows, String code) {
        Map<String,Object> params = new HashMap();
        if(StringUtils.isNotBlank(code)){
            params.put("code",code);
        }
        PageHelper.startPage(page,rows);
        List list = sysAccSubMapper.selectAll(params);
        return DataGridPage.create(list);
    }
}
