<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" scope="session" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>基本信息</title>
    <link rel="stylesheet" href="${path}/pages/css/base.css">
    <link rel="stylesheet" href="${path}/custom/uimaker/easyui.css">
    <link rel="stylesheet" href="${path}/pages/css/basic_info.css">
    <script type="text/javascript" src="${path}/custom/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/custom/jquery.easyui.min.js"></script>
</head>
<body>
<div class="container">

    <div class="left-tree">
        <ul class="easyui-tree" id="orgTree"></ul>
    </div>
    <div class="content">
        <div class="easyui-tabs1" style="width:100%;">
            <div title="基本信息" data-options="closable:false"></div>
            <div title="人员列表" data-options="closable:false"></div>
            <div title="岗位列表" data-options="closable:false"></div>
            <div title="角色列表" data-options="closable:false"></div>
        </div>
        <iframe id="viewPage" width="100%" height="550" src="${path}/pages/system/org/orgDetail.jsp"></iframe>
    </div>
</div>

</body>
</html>

<script type="text/javascript">
    $('.easyui-tabs1').tabs({
        tabHeight: 36
    });
    $(window).resize(function(){
        $('.easyui-tabs1').tabs("resize");
    }).resize();

    $(document).ready(function(){
        $('#orgTree').tree({
            url:'${path}/org/loadOrgData.do',
            onClick: function(node){
                alert(node.text);
            },
            onContextMenu: function(e, node){
                e.preventDefault();
                alert(node.id);
            }
        });

        var tabs = $(".easyui-tabs1").tabs().tabs('tabs');
        var title = "";
        for (var i = 0; i < tabs.length; i++) {
            //以下代码是为页签动态绑定单击事件
            tabs[i].panel('options').tab.unbind().bind('click', { index: i }, function (e) {
                title = ($(this).find(".tabs-title").html());
                switch (title) {
                    case "基本信息":
                        $("#viewPage").attr('src','${path}/pages/system/org/orgDetail.jsp');
                        break;
                    case "人员列表":
                        $("#viewPage").attr('src','${path}/pages/system/org/userOrgList.jsp');
                        break;
                    case "岗位列表":
                        $("#viewPage").attr('src','${path}/pages/system/org/userOrgList.jsp');
                        break;
                    case "角色列表":
                        $("#viewPage").attr('src','${path}/pages/system/org/userOrgList.jsp');
                        break;
                }
            });
        }
    });
</script>
