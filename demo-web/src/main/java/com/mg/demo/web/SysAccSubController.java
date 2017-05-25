package com.mg.demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mg.demo.api.SysDirService;
import com.mg.demo.api.SysAccSubService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.SysDir;
import com.mg.demo.model.SysAccSub;
import com.mg.demo.model.SysUser;
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

import static org.apache.commons.lang.StringUtils.isNotBlank;

/**
 * @author ivan
 */
@Controller
@RequestMapping("/accSub")
public class SysAccSubController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(SysAccSubController.class);

    @Reference
    private SysAccSubService sysAccSubService;

    /**
     * 查询所有用户
     */
    @RequestMapping("/list.do")
    @ResponseBody
    public DataGridPage<SysAccSub> getUsers(HttpServletRequest request,
                                            @RequestParam(required = false, defaultValue = "1") Integer page,
                                            @RequestParam(required = false, defaultValue = "10") Integer rows,
                                            String filters, String code) {
        logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", page, rows);
        return sysAccSubService.selectAll(page, rows, code);
    }

    /**
     * 新增user
     */
    @RequestMapping("/loadDirData.do")
    @ResponseBody
    public List loadOrgData(HttpServletRequest request, @RequestParam(required = false, defaultValue = "0") Integer id, @RequestParam(required = false) String typeId, @RequestParam(required = false) String code) {
        List<SysAccSub> list = sysAccSubService.selectByPid(id, typeId, code);
        return covertTree(list);
    }

    private List covertTree(List<SysAccSub> list) {
        if (null == list || list.size() == 0) {
            return null;
        }
        List<Map<String, Object>> json = new ArrayList();
        for (SysAccSub sysAccSub : list) {
            Map<String, Object> map = new HashMap();
            map.put("id", sysAccSub.getId());
            map.put("text", sysAccSub.getCode() + "-" + sysAccSub.getName());
            map.put("code", sysAccSub.getCode());
            map.put("state", "closed");
            json.add(map);
        }
        return json;
    }
}