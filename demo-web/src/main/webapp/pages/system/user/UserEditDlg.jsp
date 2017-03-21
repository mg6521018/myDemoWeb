<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/include/taglib.jsp"%>
<!DOCTYPE html >
<html>
	<head>
		<title>APP版本管理</title>
		<%@ include file="/common/include/meta.jsp"%>
	</head>
	<body style="background-image: none; background-color: transparent;">
		<div class="x-container" style="width: 550px;">
			<h1 class="x-heading">
				<span id="oTitle">APP版本管理</span>
			</h1>
			<div id="oDialogPrompt" class="x-prompt-box" style="top: 15px; left: 20px;"></div>
			<form id="oForm" method="post" enctype="multipart/form-data" class="x-form">
				<input type="hidden" name="userId" id="userId" />
				<table style="width: 100%; padding:5px 0px 10px 0px;">
					<tr>
						<td class="x-label" style="width: 80px;">
							<span> 用户名称<span class="x-star">*</span><span class="x-separator">：</span> </span>
						</td>
						<td>
							<input class="easyui-validatebox" value=""  id="userName" name="userName" style="width:155px;height:25px;line-height:25px;"/>
						</td>
						<td class="x-label" style="width: 80px;">
							<span> 登录帐号<span class="x-star"></span><span class="x-separator">：</span> </span>
						</td>
						<td>
							<input class="easyui-validatebox" value=""  id="account" name="account" style="width:155px;height:25px;line-height:25px;"/>
						</td>
					</tr>
					<tr>
						<td class="x-label" style="width: 80px;">
							<span> 年龄<span class="x-star">*</span><span class="x-separator">：</span> </span>
						</td>
						<td>
							<input class="easyui-numberspinner" data-options="label:'Age:',labelPosition:'top',min:1,max:100" value=""  id="age" name="age" style="width:160px;height:35px;line-height:35px;" />
						</td>
						<td class="x-label" style="width: 80px;">
							<span> 用户状态<span class="x-star">*</span><span class="x-separator">：</span> </span>
						</td>
						<td>
							未激活<input type="radio" name="status" value="0"/>
							已激活:<input type="radio" name="status" value="1"/>
							禁用:<input type="radio" name="status" value="2"/>
						</td>
					</tr>
					<tr>
						<td class="x-label" style="width: 80px;">
							<span> 密码<span class="x-star">*</span><span class="x-separator">：</span> </span>
						</td>
						<td>
							<input class="easyui-validatebox" value=""  id="password" name="password" style="width:155px;height:25px;line-height:25px;" />
						</td>
						<td class="x-label" style="width: 80px;">
							<span> 确认密码<span class="x-star">*</span><span class="x-separator">：</span> </span>
						</td>
						<td>
							<input class="easyui-validatebox" value=""  id="checkPassword" name="checkPassword" style="width:155px;height:25px;line-height:25px;" />
						</td>
					</tr>
				</table>
			</form>
			<div class="x-buttons">
				<input id="oBtnSave" type="button" class="x-button-confirm" value="保存" />
				<span class="x-spacing"></span>
				<input id="oBtnCancel" type="button" class="x-button-cancel" value="取消" />
			</div>
		</div>
		<script type="text/javascript" src="UserEditDlg.js"></script>
	</body>
</html>