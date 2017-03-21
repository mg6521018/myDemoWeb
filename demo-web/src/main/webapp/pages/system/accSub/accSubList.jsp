<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" scope="session" value="${pageContext.request.contextPath}"/>

<%
    String code = request.getParameter("code");
%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>用户列表</title>

        <link href="${path}/pages/css/base.css" rel="stylesheet">
        <link rel="stylesheet" href="${path}/custom/uimaker/easyui.css">
        <link rel="stylesheet" href="${path}/custom/uimaker/icon.css" type="text/css">
        <link rel="stylesheet" href="${path}/pages/css/providers.css">
        <script type="text/javascript">
            code = <%=code%>
        </script>
        <script type="text/javascript" src="${path}/custom/jquery.min.js"></script>
        <script type="text/javascript" src="${path}/custom/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="${path}/custom/easyui-lang-zh_CN.js"></script>
        <script type="text/javascript" src="${path}/pages/system/accSub/accSubList.js"></script>
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
        </div>
    </body>
</html>
