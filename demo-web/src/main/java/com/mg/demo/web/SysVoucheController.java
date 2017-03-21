package com.mg.demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mg.demo.api.SysDirService;
import com.mg.demo.api.SysVoucheService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.SysDir;
import com.mg.demo.model.SysVouche;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang.StringUtils.isNotBlank;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/vouche")
public class SysVoucheController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(SysVoucheController.class);

    @Reference
    private SysVoucheService sysVoucheService;
    @Reference
    private SysDirService sysDirService;
    /**
     * 新增Vouche
     */
    @RequestMapping("/insert.do")
    @ResponseBody
    public DataGridPage<SysVouche> insert(HttpServletRequest request){
        SysVouche Vouche = new SysVouche();
        sysVoucheService.insert(Vouche);
        return getVouches(request,1,10,"","");
    }

    /**
     * 按条件新增Vouche
     */
    @RequestMapping("/save.do")
    @ResponseBody
    public Map<String,Object> insertSelective(HttpServletRequest request,SysVouche vouche){
        Map<String,Object> map = new HashMap();
        if(null == vouche.getId()){
            sysVoucheService.insertSelective(vouche);
        }
        else{
            sysVoucheService.updateByPrimaryKeySelective(vouche);
        }
        map.put("success",true);
        return map;
    }

    /**
     * 按条件新增Vouche
     */
    @RequestMapping("/remove.do")
    @ResponseBody
    public Map<String,Object> remove(HttpServletRequest request,String idList){
        Map<String,Object> map = new HashMap();
        if(null != idList){
            //sysVoucheService.deleteByPrimaryKeys(idList);
            map.put("success",true);
        }
        else{

            map.put("success",false);
            map.put("msg","失败了");
        }

        return map;
    }

    /**
     * 查询所有用户
     */
    @RequestMapping("/list.do")
    @ResponseBody
    public DataGridPage<SysVouche> getVouches(HttpServletRequest request,
                                       @RequestParam(required=false,defaultValue="1") Integer page,
                                       @RequestParam(required=false,defaultValue="10") Integer rows,
                                       String filters,String typeId){
        String name = "";
        if(isNotBlank(filters)){
            JSONObject json = JSON.parseObject(filters);
            name = json.getString("name");
        }
        logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", page,rows);
        DataGridPage<SysVouche> data = sysVoucheService.selectAll(page,rows,name,typeId);
        List <SysVouche> list = data.getRows();
        if(null != list && list.size()>0 && StringUtils.isNotBlank(typeId)){
            SysDir sysDir = sysDirService.selectByPrimaryKey(Integer.parseInt(typeId));
            for(SysVouche sysVouche : list){
                sysVouche.setTypeName(sysDir.getName());
                sysVouche.setDirCode(sysDir.getCode());
            }
        }

        return data;
    }

    /**
     *根据id获取Vouche
     *@param id
     */
    @RequestMapping("/load.do")
    @ResponseBody
    public SysVouche getVoucheById(String id){
        return sysVoucheService.selectByPrimaryKey(Integer.valueOf(id));
    }

    /**
     *根据id删除Vouche
     *@param id
     */
    @RequestMapping("/delete.do")
    @ResponseBody
    public DataGridPage<SysVouche> deleteVoucheById(String id,HttpServletRequest request){
        sysVoucheService.deleteByPrimaryKey(Integer.valueOf(id));
        return getVouches(request,1,10,"","");
    }

    /**
     *根据id更新Vouche
     *@param id
     */
    @RequestMapping("/updateById.do")
    @ResponseBody
    public SysVouche updateVoucheById(String id){
        SysVouche Vouche = new SysVouche();
        sysVoucheService.updateByPrimaryKey(Vouche);
        return sysVoucheService.selectByPrimaryKey(Integer.valueOf(id));
    }
}