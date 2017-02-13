package com.mg.demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mg.demo.api.OrgService;
import com.mg.demo.api.UserService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.Org;
import com.mg.demo.model.User;
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

import static com.sun.tools.doclint.Entity.or;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/org")
public class OrgController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(OrgController.class);
    @Reference
    private OrgService orgService;

    /**
     * 新增user
     */
    @RequestMapping("/loadOrgData.do")
    @ResponseBody
    public List loadOrgData(HttpServletRequest request,@RequestParam(required=false,defaultValue="-1") Integer id){
        List<Org> list = orgService.selectAll(id);
        return covertTree(list);
    }

    private List covertTree(List<Org> list) {
        if(null == list || list.size() == 0){
            return null;
        }
        List <Map<String,Object>> json = new ArrayList();
        for(Org org : list){
            Map<String,Object> map = new HashMap();
            map.put("id",org.getId());
            map.put("text",org.getName());
            if(null != org.getHavSub() && 1 == org.getHavSub()){
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