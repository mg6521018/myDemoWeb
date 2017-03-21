package com.mg.demo.utils;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Created by magang on 2017/2/15.
 */
public class SysSetDetailsUtils {

    @NotNull
    public static String toString(Object o ){
        if(o == null){
            return "";
        }
        return o.toString();
    }

    @NotNull
    @Contract(pure = true)
    public static String convertInteger(Integer o){
        if(o == null){
            return "";
        }

        if(o == 0){
            return "否";
        }
        else if(o == 1){
            return "是";
        }
        return "";
    }

    @NotNull
    @Contract(pure = true)
    public static String convertFiscalYear(Integer o){
        if(o == null){
            return "";
        }

        if(o == 1){
            return "公历会计年度";
        }
        else if(o == 2){
            return "阴历会计年度";
        }
        return "";
    }

    @NotNull
    @Contract(pure = true)
    public static String convertAccountingSystem(Integer o){
        if(o == null){
            return "";
        }

        if(o == 1){
            return "小企业会计制度";
        }
        else if(o == 2){
            return "中型企业会计制度";
        }
        return "";
    }


    @NotNull
    @Contract(pure = true)
    public static String convertDefaultTable(Integer o){
        if(o == null){
            return "";
        }

        if(o == 0){
            return "excel";
        }
        else if(o == 1){
            return "wps";
        }
        return "";
    }

    @NotNull
    @Contract(pure = true)
    public static String convertSalesProcessing(Integer o){
        if(o == null){
            return "";
        }

        if(o == 0){
            return "不需要进销存核算";
        }
        else if(o == 1){
            return "需要进销存核算";
        }
        return "";
    }
}
