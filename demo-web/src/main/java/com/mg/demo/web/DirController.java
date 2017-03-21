package com.mg.demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mg.demo.api.SysDirService;
import com.mg.demo.model.SysDir;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/dir")
public class DirController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(DirController.class);
    @Reference
    private SysDirService sysDirService;

    /**
     * 新增user
     */
    @RequestMapping("/loadDirData.do")
    @ResponseBody
    public List loadOrgData(HttpServletRequest request, @RequestParam(required=false,defaultValue="-1") Integer id){
        List<SysDir> list = sysDirService.selectByPid(id);
        return covertTree(list);
    }

    private List covertTree(List<SysDir> list) {
        if(null == list || list.size() == 0){
            return null;
        }
        List<Map<String,Object>> json = new ArrayList();
        for(SysDir dir : list){
            Map<String,Object> map = new HashMap();
            map.put("id",dir.getId());
            map.put("text",dir.getName());
            if(StringUtils.isNotBlank(dir.getHavSub()) && "1".equals(dir.getHavSub())){
                map.put("state","closed");
            }
            else{
                map.put("state","open");
            }

            json.add(map);
        }
        return json;
    }
}