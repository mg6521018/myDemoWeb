package com.mg.demo.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mg.demo.api.SysUserService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.SysUser;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ivan
 */
@Controller
@RequestMapping("/user")
public class SysUserController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @Reference
    private SysUserService sysUserService;

    /**
     * 新增user
     */
    @RequestMapping("/insert.do")
    @ResponseBody
    public DataGridPage<SysUser> insert(HttpServletRequest request) {
        SysUser user = new SysUser();
        sysUserService.insert(user);
        return getUsers(request, 1, 10, "");
    }

    /**
     * 按条件新增user
     */
    @RequestMapping("/save.do")
    @ResponseBody
    public Map<String, Object> insertSelective(HttpServletRequest request, SysUser user) {
        Map<String, Object> map = new HashMap();
        if (null == user.getUserId()) {
            user.setCreatetime(System.currentTimeMillis());
            sysUserService.insertSelective(user);
        } else {
            sysUserService.updateByPrimaryKeySelective(user);
        }
        map.put("success", true);
        return map;
    }

    /**
     * 按条件新增user
     */
    @RequestMapping("/remove.do")
    @ResponseBody
    public Map<String, Object> remove(HttpServletRequest request, String idList) {
        Map<String, Object> map = new HashMap();
        if (null != idList) {
            sysUserService.deleteByPrimaryKeys(idList);
            map.put("success", true);
        } else {

            map.put("success", false);
            map.put("msg", "失败了");
        }

        return map;
    }

    /**
     * 查询所有用户
     */
    @RequestMapping("/list.do")
    @ResponseBody
    public DataGridPage<SysUser> getUsers(HttpServletRequest request,
                                          @RequestParam(required = false, defaultValue = "1") Integer page,
                                          @RequestParam(required = false, defaultValue = "10") Integer rows,
                                          String filters) {
        String userName = "";
        String account = "";
        if (StringUtils.isNotBlank(filters)) {
            JSONObject json = JSON.parseObject(filters);
            userName = json.getString("userName");
            account = json.getString("account");
        }
        logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", page, rows);
        return sysUserService.selectAll(page, rows, userName, account);
    }

    /**
     * 根据id获取user
     *
     * @param id
     */
    @RequestMapping("/load.do")
    @ResponseBody
    public SysUser getUserById(String id) {
        return sysUserService.selectByPrimaryKey(Integer.valueOf(id));
    }

    /**
     * 根据id删除user
     *
     * @param id
     */
    @RequestMapping("/delete.do")
    @ResponseBody
    public DataGridPage<SysUser> deleteUserById(String id, HttpServletRequest request) {
        sysUserService.deleteByPrimaryKey(Integer.valueOf(id));
        return getUsers(request, 1, 10, "");
    }

    /**
     * 根据id更新user
     *
     * @param id
     */
    @RequestMapping("/updateById.do")
    @ResponseBody
    public SysUser updateUserById(String id) {
        SysUser user = new SysUser();
        sysUserService.updateByPrimaryKey(user);
        return sysUserService.selectByPrimaryKey(Integer.valueOf(id));
    }
}