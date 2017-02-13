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
    <link rel="stylesheet" href="${path}/pages/css/orgDetail.css">
    <script type="text/javascript" src="${path}/custom/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/custom/jquery.easyui.min.js"></script>
</head>
<body>
    <table class="kv-table">
        <tbody>
        <tr>
            <td class="kv-label">企业名称</td>
            <td class="kv-content">苏州电子科技有限公司</td>
            <td class="kv-label">企业法人</td>
            <td class="kv-content">左江胜</td>
            <td class="kv-label">注册资金(万元)</td>
            <td class="kv-content">103</td>
        </tr>
        <tr>
            <td class="kv-label">企业类型</td>
            <td class="kv-content">其他</td>
            <td class="kv-label">企业性质</td>
            <td class="kv-content">贸易商</td>
            <td class="kv-label">主公品类</td>
            <td class="kv-content">IT设备</td>
        </tr>
        <tr>
            <td class="kv-label">注册地址</td>
            <td class="kv-content" colspan="5">江苏省苏州市</td>
        </tr>
        <tr>
            <td class="kv-label">公司地址</td>
            <td class="kv-content" colspan="5">河滨路88号</td>
        </tr>
        <tr>
            <td class="kv-label">邮编</td>
            <td class="kv-content">214000</td>
            <td class="kv-label">成立年份</td>
            <td class="kv-content" colspan="3">2016</td>
        </tr>
        <tr>
            <td class="kv-label">厂房所有</td>
            <td class="kv-content">自有</td>
            <td class="kv-label">厂房面积</td>
            <td class="kv-content">1253</td>
            <td class="kv-label">建筑面积</td>
            <td class="kv-content">68</td>
        </tr>
        </tbody>
    </table>
</body>
</html>
