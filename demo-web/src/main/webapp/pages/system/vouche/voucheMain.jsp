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
        <iframe id="viewPage" width="100%" height="550" src="${path}/pages/system/vouche/dirVoucheList.jsp?typeId=1"></iframe>
    </div>
</div>

</body>
</html>

<script type="text/javascript">
    $(document).ready(function(){
        $('#orgTree').tree({
            url:'${path}/dir/loadDirData.do?id=5',
            onClick: function(node){
                $('#viewPage').attr("src","${path}/pages/system/vouche/dirVoucheList.jsp?typeId="+node.id);
            },
            onContextMenu: function(e, node){
                e.preventDefault();
                alert(node.id);
            }
        });
    });
</script>
