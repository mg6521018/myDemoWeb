<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html >
<html>
	<head>
		<title>Dialog</title>
		<%@ include file="/common/meta.jsp"%>
		<%@ include file="/common/s.jsp"%>
	</head>
	<body style="background-image: none; background-color: transparent;">
		<div id="oDialog">
			<iframe id="dialog-content" src="about:blank" style="width: 99%; height: 98%;" frameborder="0" scrolling="yes"></iframe>
		</div>
		<div id="dialog-shim" style="display: none; position: absolute; left: 0; top: 0; width: 100%; height: 100%; background-color: white; filter: alpha(opacity =               30); -moz-opacity: 0.6; -khtml-opacity: 0.6; opacity: 0.6;"></div>
		<script type="text/javascript">
			window['~dlg']={
				id			:	undefined,
				params		:	undefined,
				initialize	:	function(cfg,id){
					window['~dlg'].id		= id;
					window['~dlg'].params	= $.encode(cfg.params||{});
					window['~dlg'].type		= cfg['~type']||'dialog';
					if(window['~dlg'].type === 'confirm'){
						$.messager.confirm(cfg.title||'提示', cfg.message||'是否执行该操作!', function(result) {
							window['~dlg'].callback(__.encode(result));
						}).window({
							onClose : function() {
								setTimeout(function(){
									window['~dlg'].destroy();
								},200);
							}
						});
					}else if(window['~dlg'].type === 'alert'){
						$.messager.alert(cfg.title||'警告', cfg.message||'!', 'info',function(result) {
							window['~dlg'].callback(__.encode(result));
						}).window({
							onClose : function() {
								setTimeout(function(){
									window['~dlg'].destroy();
								},200);
							}
						});
					}else{
						$('#oDialog').dialog({
							title	: (cfg.title||'My Dialog'),
							width	: (cfg.width||500),
							height	: (cfg.height||380),
							modal	: false,
							closed	: false,
							cache	: false,
							onClose	: function(){
								window['~dlg'].destroy();
							}
						});
						$('#dialog-content').attr('src',(cfg.url||'about:blank'));
						if(cfg.modal!==false){
							$('#dialog-shim').show();
						}
					}
					cfg = containerId = null;
				},
				destroy		: function(){
					var containerId = window['~dlg'].id;
					window['~dlg'] = null;
					var frame = $('#dialog-content');
					try{
						frame[0].contentWindow.document.write('');//清空IFRAME的内容
						frame[0].contentWindow.close();//避免IFRAME内存泄漏
					}catch(x){
						frame[0].src='about:blank';
					}finally{
						frame.remove();//删除iframe
						frame=null;
					}
					setTimeout(function(){
						window.parent['__'].closeDialog(containerId);
					},20);
				},
				callback	: function(json){
					window.parent['__']['Dialog->Callback[JSON]'](window['~dlg'].id,json);
				}
			}
		</script>
	</body>
</html>
