package com.mg.demo.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mg.demo.api.UserService;
import com.mg.demo.core.DataGridPage;
import com.mg.demo.model.User;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private UserService userService;

    /**
     * 新增user
     */
    @RequestMapping("/insert.do")
    @ResponseBody
    public DataGridPage<User> insert(HttpServletRequest request){
        User user = new User(1,"jack",18);
        userService.insert(user);
        return getUsers(request,1,10,"");
    }

    /**
     * 按条件新增user
     */
    @RequestMapping("/insertSelective.do")
    @ResponseBody
    public DataGridPage<User> insertSelective(HttpServletRequest request){
        User user = new User(2,"ivan",25);
        userService.insertSelective(user);
        return getUsers(request,1,10,"");
    }

    /**
     * 查询所有用户
     */
    @RequestMapping("/list.do")
    @ResponseBody
    public DataGridPage<User> getUsers(HttpServletRequest request,
                                       @RequestParam(required=false,defaultValue="1") Integer page,
                                       @RequestParam(required=false,defaultValue="10") Integer rows,
                                       String filters){
        String userName = "";
        String account = "";
        if(StringUtils.isNotBlank(filters)){
            JSONObject json = JSON.parseObject(filters);
            userName = json.getString("userName");
            account = json.getString("account");
        }
        logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", page,rows);
        return userService.selectAll(page,rows,userName,account);
    }

    /**
     *根据id获取user
     *@param id
     */
    @RequestMapping("/one.do")
    @ResponseBody
    public User getUserById(String id){
        return userService.selectByPrimaryKey(Integer.valueOf(id));
    }

    /**
     *根据id删除user
     *@param id
     */
    @RequestMapping("/delete.do")
    @ResponseBody
    public DataGridPage<User> deleteUserById(String id,HttpServletRequest request){
        userService.deleteByPrimaryKey(Integer.valueOf(id));
        return getUsers(request,1,10,"");
    }

    /**
     *根据id更新user
     *@param id
     */
    @RequestMapping("/updateById.do")
    @ResponseBody
    public User updateUserById(String id){
        User user = new User(Integer.valueOf(id),"ivan",30);
        userService.updateByPrimaryKey(user);
        return userService.selectByPrimaryKey(Integer.valueOf(id));
    }
}