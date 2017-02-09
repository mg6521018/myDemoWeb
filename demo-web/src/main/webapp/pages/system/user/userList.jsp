<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" scope="session" value="${pageContext.request.contextPath}"/>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>用户列表</title>

        <link href="${path}/pages/css/base.css" rel="stylesheet">
        <link rel="stylesheet" href="${path}/custom/uimaker/easyui.css">
        <link rel="stylesheet" href="${path}/custom/uimaker/icon.css" type="text/css">
        <link rel="stylesheet" href="${path}/pages/css/providers.css">

        <script type="text/javascript" src="${path}/custom/jquery.min.js"></script>
        <script type="text/javascript" src="${path}/custom/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${path}/custom/easyui-lang-zh_CN.js"></script>
        <script type="text/javascript" src="${path}/pages/system/user/UserList.js"></script>
    </head>
    <body>
        <div class="container">
            <table id="oGrid" style="width:100%;height:554px" title="全体供应商列表" data-options="
                        rownumbers:true,
                        singleSelect:false,
                        autoRowHeight:false,
                        pagination:true,
                        fitColumns:true,
                        striped:true,
                        checkOnSelect:false,
                        selectOnCheck:false,
                        collapsible:true,
                        toolbar:'#tb',
                        pageSize:10">
            </table>
            <div id="tb" style="padding:0 30px;">
                用户名:
                <input class="easyui-textbox" type="text" name="code" style="width:166px;height:35px;line-height:35px;"></input>
                登录名:
                <input class="easyui-textbox" type="text" name="name" style="width:166px;height:35px;line-height:35px;"></input>
                <a href="#" class="easyui-linkbutton" iconCls="icon-search" data-options="selected:true">查询</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-reload">重置</a>
            </div>
        </div>
    </body>
</html>
