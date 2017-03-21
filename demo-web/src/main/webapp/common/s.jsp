<%@page language="java" pageEncoding="UTF-8"%>
<%--|设置JS的环境变量|--%>
<script type="text/javascript">$ctx = "${$ctx}";</script>
<script type="text/javascript">$locale = "${$locale}";</script>

<%--|App|--%>
<script type="text/javascript" src="${$ctx}/s/__/__.js"></script>

<%--|html5|--%>
<!--[if lt IE 9]>
<link rel="stylesheet" type="text/css" href="${$ctx}/s/mossle/css/ie.css" media="screen" />
<script type="text/javascript" src="${$ctx}/s/html5/html5shiv.js"></script>
<![endif]-->


<%--|jQuery|--%>
<script type="text/javascript" src="${$ctx}/s/jquery/jquery-1.8.3.js"></script>
<%--|jQuery|Patch|--%>
<script type="text/javascript" src="${$ctx}/s/jquery/jquery-patch.js"></script>

<%--|jQuery.EasyUI|--%>
<script type="text/javascript" src="${$ctx}/s/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${$ctx}/s/easyui/jquery.easyui.patch.js"></script>
<script type="text/javascript" src="${$ctx}/s/easyui/locale/easyui-lang-${$locale}.js"></script>
<link rel="stylesheet" type="text/css" media="screen" href="${$ctx}/s/easyui/themes/blue/easyui.css" id="easyui-themes" />
<link rel="stylesheet" type="text/css" media="screen" href="${$ctx}/s/easyui/themes/icon.css" />

<%-- |My97DatePicker| --%>
<script type="text/javascript" src="${$ctx}/s/My97DatePicker/WdatePicker.js"></script>

<!-- |CKeditor| -->
<script type="text/javascript" src="${$ctx}/s/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${$ctx}/s/ueditor/ueditor.all.js"></script>
<script type="text/javascript" src="${$ctx}/s/ueditor/zh-cn/zh-cn.js"></script>



<!-- |CodeMirror| -->
<link rel="stylesheet" type="text/css" media="screen" href="${$ctx}/s/codemirror/codemirror.css" />
<script type="text/javascript" src="${$ctx}/s/codemirror/codemirror.js"></script>
<script type="text/javascript" src="${$ctx}/s/codemirror/mode/javascript.js"></script>
<script type="text/javascript" src="${$ctx}/s/codemirror/mode/htmlmixed.js"></script>


<!-- |HighCharts| -->
<script type="text/javascript" src="${$ctx}/s/highcharts/highcharts.js"></script>
<script type="text/javascript" src="${$ctx}/s/highcharts/highcharts-more.js"></script>

<!-- |artTemplate| -->
<script type="text/javascript" src="${$ctx}/s/artTemplate/template.js"></script>
<script type="text/javascript" src="${$ctx}/s/artTemplate/template-patch.js"></script>

<!-- |CSS| -->
<link rel="stylesheet" type="text/css" media="screen" href="${$ctx}/s/__/themes/default/css/all.css" />
<link href="${$ctx}/pages/css/base.css" rel="stylesheet">
<link rel="stylesheet" href="${$ctx}/custom/uimaker/easyui.css">
<link rel="stylesheet" href="${$ctx}/custom/uimaker/icon.css" type="text/css">
<link rel="stylesheet" href="${$ctx}/pages/css/providers.css">

<!--|${pageContext.request.contextPath}|-->