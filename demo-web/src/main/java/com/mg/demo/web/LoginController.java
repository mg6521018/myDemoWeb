package com.mg.demo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mg.demo.api.UserService;
import com.mg.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private UserService userService;

    /**
     * 新增user
     */
    @RequestMapping("/login.do")
    @ResponseBody
    public boolean login(){
        return true;
    }
}
