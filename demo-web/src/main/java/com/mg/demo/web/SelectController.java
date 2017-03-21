package com.mg.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/select")
public class SelectController {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(SelectController.class);

    /**
     * 新增user
     */
    @RequestMapping("/opinionAccountingSystem.do")
    @ResponseBody
    public List <Map<String,String>> opinionaAccountingSystem(HttpServletRequest request){
        List <Map<String,String>> list = new ArrayList();
        Map<String,String> map1 = new HashMap();
        map1.put("dicValue","1");
        map1.put("dicName","小企业会计制度");
        list.add(map1);
        Map<String,String> map2 = new HashMap();
        map2.put("dicValue","2");
        map2.put("dicName","中型企业会计制度");
        list.add(map2);
        return list;
    }

    /**
     * 新增user
     */
    @RequestMapping("/opinionFiscalYear.do")
    @ResponseBody
    public List <Map<String,String>> opinionaFiscalYear(HttpServletRequest request){
        List <Map<String,String>> list = new ArrayList();
        Map<String,String> map1 = new HashMap();
        map1.put("dicValue","1");
        map1.put("dicName","公历会计年度");
        list.add(map1);
        Map<String,String> map2 = new HashMap();
        map2.put("dicValue","2");
        map2.put("dicName","阴历会计年度");
        list.add(map2);
        return list;
    }
}