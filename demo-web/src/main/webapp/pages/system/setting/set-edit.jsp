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
	<link href="${path}/custom/uimaker/icon.css" rel="stylesheet" type="text/css">
	<script src="${path}/custom/jquery.min.js" type="text/javascript" ></script>
	<script src="${path}/custom/jquery.easyui.min.js"type="text/javascript" ></script>
	<script src="${path}/pages/system/setting/set-edit.js"type="text/javascript" ></script>
	<script src="${path}/pages/js/__/__.js" type="text/javascript" ></script>
	<script src="${path}/custom/jquery-patch.js" type="text/javascript" ></script>
</head> 
<body>
	<div class="container">
		<div class="content">
			<table class="kv-table yes-not">
				<tbody>
				<tr>
					<td>
						<a href="#" class="easyui-linkbutton" iconCls="icon-save" id="oBtnSave">保存</a>
						<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="oBtnCancel">取消</a>
					</td>
				</tr>
				</tbody>
			</table>
			<div id="oDialogPrompt" class="x-prompt-box" style="top: 15px; left: 20px;"></div>
			<form id="oForm">
				<input type="hidden" name="id" value=""/>
				<div class="column"><span class="current">帐套信息</span></div>
				<table class="kv-table">
					<tbody>
						<tr>
							<td class="kv-label">帐套名称</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="name" name="name" style="width:235px;height:35px;line-height:35px;" />
							</td>
							<td class="kv-label">帐套编号</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="code" name="code" style="width:235px;height:35px;line-height:35px;" />
							</td>
							<td class="kv-label">单位地址</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="address" name="address" style="width:235px;height:35px;line-height:35px;" />
							</td>
						</tr>
						<tr>
							<td class="kv-label">法定代表人</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="legalErson" name="legalErson" style="width:235px;height:35px;line-height:35px;" />
							</td>
							<td class="kv-label">联系电话</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="mobile" name="mobile" style="width:235px;height:35px;line-height:35px;" />
							</td>
							<td class="kv-label">邮政编码</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="postcode" name="postcode" style="width:235px;height:35px;line-height:35px;" />
							</td>
						</tr>
						<tr>
							<td class="kv-label">本币代码</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="currencyCode" name="currencyCode" style="width:235px;height:35px;line-height:35px;" />
							</td>
							<td class="kv-label">本币名称</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="currencyName" name="currencyName" style="width:235px;height:35px;line-height:35px;" />
							</td>
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
							<td class="kv-content">
								<input name="fiscalYear" id="fiscalYear" style="width:235px;height:35px;line-height:35px;" value="公历会计年度" />
							</td>
							<td class="kv-label">会计制度</td>
							<td class="kv-content">
								<input class="easyui-textbox" id="accountingSystem" name="accountingSystem" style="width:235px;height:35px;line-height:35px;" />
							</td>
							<td class="kv-label">导出时默认电子表格</td>
							<td class="kv-content">
								<input type="radio" name="defaultTable" value="0">excel</input>
								<input type="radio" name="defaultTable" value="1">wps</input>
							</td>
						</tr>
						<tr>
							<td class="kv-label">录入凭证时现金流量</td>
							<td class="kv-content">
								<input type="radio" name="cashFlowDuringEntry" value="0">否</input>
								<input type="radio" name="cashFlowDuringEntry" value="1">是</input>
							</td>
							<td class="kv-label">审核人与制单人可以为同一人</td>
							<td class="kv-content">
								<input type="radio" name="samePerson" value="0">否</input>
								<input type="radio" name="samePerson" value="1">是</input>
							</td>
							<td class="kv-label">记帐前必须审核</td>
							<td class="kv-content">
								<input type="radio" name="mustCheck" value="0">否</input>
								<input type="radio" name="mustCheck" value="1">是</input>
							</td>
						</tr>
						<tr>
							<td class="kv-label">记帐前现金科目必须出纳复核</td>
							<td class="kv-content">
								<input type="radio" name="cashierCheck" value="0">否</input>
								<input type="radio" name="cashierCheck" value="1">是</input>
							</td>
							<td class="kv-label">起用月份</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="nextMonth" name="nextMonth" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-label">单位小数位数</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="unitDecimal" name="unitDecimal" style="height:35px;line-height:35px;"/>
							</td>
						</tr>
						<tr>
							<td class="kv-label">数量小数位数</td>
							<td class="kv-content">
								<input class="easyui-numberspinner" id="numberDecimalPlaces" name="numberDecimalPlaces" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-label">数量核算时是否允许计入出库</td>
							<td class="kv-content" >
								<input type="radio" name="includedDatabase" value="0">否</input>
								<input type="radio" name="includedDatabase" value="1">是</input>
							</td>
							<td class="kv-label">备份时是否保存帐套地址信息</td>
							<td class="kv-content" >
								<input type="radio" name="saveAddress" value="0">否</input>
								<input type="radio" name="saveAddress" value="1">是</input>
							</td>
						</tr>
						<tr>
							<td class="kv-label">退出时是否备份</td>
							<td class="kv-content">
								<input type="radio" name="backups" value="0">否</input>
								<input type="radio" name="backups" value="1">是</input>
							</td>
							<td class="kv-label">只有作废凭证可以删除</td>
							<td class="kv-content">
								<input type="radio" name="canDelete" value="0">否</input>
								<input type="radio" name="canDelete" value="1">是</input>
							</td>
							<td class="kv-label">每月末必须结转损益</td>
							<td class="kv-content" >
								<input type="radio" name="carryOverProfitLoss" value="0">否</input>
								<input type="radio" name="carryOverProfitLoss" value="1">是</input>
							</td>
						</tr>
						<tr>
							<td class="kv-label">需要数量核算</td>
							<td class="kv-content" >
								<input type="radio" name="quantityAccounting" value="0">否</input>
								<input type="radio" name="quantityAccounting" value="1">是</input>
							</td>
							<td class="kv-label">需要外币核算</td>
							<td class="kv-content">
								<input type="radio" name="foreignCurrencyAccounting" value="0">否</input>
								<input type="radio" name="foreignCurrencyAccounting" value="1">是</input>
							</td>
							<td class="kv-label">保存凭证后立即记帐</td>
							<td class="kv-content" >
								<input type="radio" name="immediateAccounting" value="0">否</input>
								<input type="radio" name="immediateAccounting" value="1">是</input>
							</td>
						</tr>
						<tr>
							<td class="kv-label">固定资产与累记计折旧关联(同步添加、修改、删除)</td>
							<td class="kv-content" >
								<input type="radio" name="depreciationCorrelation" value="0">否</input>
								<input type="radio" name="depreciationCorrelation" value="1">是</input>
							</td>
							<td class="kv-label"></td>
							<td class="kv-content"></td>
							<td class="kv-label"></td>
							<td class="kv-content" ></td>
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
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="subjectCode1" name="subjectCode1" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="subjectCode2" name="subjectCode2" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="subjectCode3" name="subjectCode3" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="subjectCode4" name="subjectCode4" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="subjectCode5" name="subjectCode5" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="subjectCode6" name="subjectCode6" style="height:35px;line-height:35px;"/>
							</td>
						</tr>
						<tr>
							<td class="kv-label">项目编码</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="projectCode1" name="projectCode1" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="projectCode2" name="projectCode2" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="projectCode3" name="projectCode3" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="projectCode4" name="projectCode4" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="projectCode5" name="projectCode5" style="height:35px;line-height:35px;"/>
							</td>
							<td class="kv-content" >
								<input class="easyui-numberspinner" id="projectCode6" name="projectCode6" style="height:35px;line-height:35px;"/>
							</td>
						</tr>
						<tr>
							<td class="kv-label">销售存处理</td>
							<td class="kv-content" colspan="6">
								<input type="radio" name="salesProcessing" value="0">不需要进销存核算</input>
								<input type="radio" name="salesProcessing" value="1">需要进销存核算</input>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>
	
</body> 
</html>
