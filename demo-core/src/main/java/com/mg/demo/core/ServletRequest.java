package com.mg.demo.core;

import javax.servlet.http.HttpServletRequest;
/**
 * Created by magang on 2017/2/8.
 */
public class ServletRequest {
    public static int getInt(HttpServletRequest request,String name,int defaultValue){
        Object obj = request.getParameter(name);
        if(null == obj)
            return defaultValue;
        try{
            return Integer.parseInt(obj.toString());
        }
        catch(Exception e){
            e.printStackTrace();
            return defaultValue;
        }
    }
}
