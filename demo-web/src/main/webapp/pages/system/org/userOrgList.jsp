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
        <script type="text/javascript" src="${path}/pages/system/org/UserOrgList.js"></script>
        <script type="text/javascript" src="${path}/custom/JSON2.js"></script>
    </head>
    <body>
        <div class="container">
            <table id="oGrid" style="width:100%;height:524px" data-options="
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
            <form>
                用户名:<input class="easyui-validatebox" name="userName" id="userName" />
                登录名:<input class="easyui-validatebox" name="account" id="account" />
                <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="oBtnQuery" data-options="selected:true">查询</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-reload" id="oBtnReset">重置</a>
            </form>
            </div>
        </div>
    </body>
</html>
