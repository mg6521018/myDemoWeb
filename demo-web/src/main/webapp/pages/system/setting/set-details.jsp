<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" scope="session" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en"> 
<head> 
    <meta charset="utf-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <title>基本信息</title> 
    <link href="${path}/pages/css/base.css" rel="stylesheet">
    <link href="${path}/custom/uimaker/easyui.css" rel="stylesheet" >
    <link href="${path}/pages/css/system-set.css" rel="stylesheet">
	<link rel="stylesheet" href="${path}/custom/uimaker/icon.css" type="text/css">
	<script src="${path}/custom/jquery.min.js" type="text/javascript" ></script>
	<script src="${path}/custom/jquery.easyui.min.js"type="text/javascript" ></script>
	<script src="${path}/pages/system/setting/set-details.js"type="text/javascript" ></script>
</head> 
<body>
	<div class="container">
		<div class="content">
			<table class="kv-table yes-not">
				<tbody>
				<tr>
					<td><a href="#" class="easyui-linkbutton" iconCls="icon-edit" id="oBtnEdit">修改</a></td>
				</tr>
				</tbody>
			</table>
			<div class="column"><span class="current">帐套信息</span></div>
			<table class="kv-table">
				<tbody>
					<tr>
						<td class="kv-label">帐套名称</td>
						<td class="kv-content">苏州电子科技有限公司</td>
						<td class="kv-label">帐套编号</td>
						<td class="kv-content">左江胜</td>
						<td class="kv-label">单位地址</td>
						<td class="kv-content">香河安平</td>
					</tr>
					<tr>
						<td class="kv-label">法定代表人</td>
						<td class="kv-content">驴</td>
						<td class="kv-label">联系电话</td>
						<td class="kv-content">1234567890</td>
						<td class="kv-label">邮政编码</td>
						<td class="kv-content">111111</td>
					</tr>
					<tr>
						<td class="kv-label">本币代码</td>
						<td class="kv-content">人民币</td>
						<td class="kv-label">本币名称</td>
						<td class="kv-content">RMB</td>
						<td class="kv-label"></td>
						<td class="kv-content"></td>
					</tr>
				</tbody>
			</table>
			<div class="column"><span class="current">会计政策及其它</span></div>
			<table class="kv-table">
				<tbody>
					<tr>
						<td class="kv-label">会计年度</td>
						<td class="kv-content">公历会计年度</td>
						<td class="kv-label">会计制度</td>
						<td class="kv-content">小企业会计制度</td>
						<td class="kv-label">导出时默认电子表格</td>
						<td class="kv-content">excel,wps</td>
					</tr>
					<tr>
						<td class="kv-label">录入凭证时现金流量</td>
						<td class="kv-content">是</td>
						<td class="kv-label">审核人与制单人可以为同一人</td>
						<td class="kv-content">是</td>
						<td class="kv-label">记帐前必须审核</td>
						<td class="kv-content">是</td>
					</tr>
					<tr>
						<td class="kv-label">记帐前现金科目必须出纳复核</td>
						<td class="kv-content">是</td>
						<td class="kv-label">起用月份</td>
						<td class="kv-content" >1</td>
						<td class="kv-label">单位小数位数</td>
						<td class="kv-content" >1</td>
					</tr>
					<tr>
						<td class="kv-label">数量小数位数</td>
						<td class="kv-content">2</td>
						<td class="kv-label">数量核算时是否允许计（）出库</td>
						<td class="kv-content" >是</td>
						<td class="kv-label">备份时是否保存帐套地址信息</td>
						<td class="kv-content" >是</td>
					</tr>
					<tr>
						<td class="kv-label">退出时是否备份</td>
						<td class="kv-content">是</td>
						<td class="kv-label">数量核算时是否允许计（）出库</td>
						<td class="kv-content" >是</td>
						<td class="kv-label">备份时是否保存帐套地址信息</td>
						<td class="kv-content" >是</td>
					</tr>
					<tr>
						<td class="kv-label">只有作废凭证可以删除</td>
						<td class="kv-content">是</td>
						<td class="kv-label">每月末必须结转损益</td>
						<td class="kv-content" >是</td>
						<td class="kv-label">需要数量核算</td>
						<td class="kv-content" >是</td>
					</tr>
					<tr>
						<td class="kv-label">需要外币核算</td>
						<td class="kv-content">是</td>
						<td class="kv-label">保存凭证后立即记帐</td>
						<td class="kv-content" >是</td>
						<td class="kv-label">固定资产与累记计折旧关联(同步添加、修改、删除)</td>
						<td class="kv-content" >是</td>
					</tr>
				</tbody>
			</table>
			<div class="column"><span class="current">编码信息</span></div>
			<table class="kv-table">
				<tbody>
					<tr>
						<td class="kv-label">编码级次</td>
						<td class="kv-content" >一级</td>
						<td class="kv-content" >二级</td>
						<td class="kv-content" >三级</td>
						<td class="kv-content" >四级</td>
						<td class="kv-content" >五级</td>
						<td class="kv-content" >六级</td>
					</tr>
					<tr>
						<td class="kv-label">科目编码</td>
						<td class="kv-content" >1</td>
						<td class="kv-content" >2</td>
						<td class="kv-content" >3</td>
						<td class="kv-content" >4</td>
						<td class="kv-content" >5</td>
						<td class="kv-content" >6</td>
					</tr>
					<tr>
						<td class="kv-label">项目编码</td>
						<td class="kv-content" >2</td>
						<td class="kv-content" >2</td>
						<td class="kv-content" >2</td>
						<td class="kv-content" >2</td>
						<td class="kv-content" >2</td>
						<td class="kv-content" >2</td>
					</tr>
					<tr>
						<td class="kv-label">销售存处理</td>
						<td class="kv-content" colspan="6">需要进销存核算  不需要进销存核算</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
</body> 
</html>
