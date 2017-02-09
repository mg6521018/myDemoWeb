<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>uimaker信息管理系统</title>
        <link href="css/base.css" rel="stylesheet">
        <link href="css/login/login.css" rel="stylesheet">
    </head>
    <body class="default">
        <div class="login-hd">
            <div class="left-bg"></div>
            <div class="right-bg"></div>
            <div class="hd-inner">
                <span class="logo"></span>
                <span class="split"></span>
                <span class="sys-name">采购协同平台</span>
            </div>
        </div>
        <div class="login-bd">
            <div class="bd-inner">
                <div class="inner-wrap">
                    <div class="lg-zone">
                        <div class="lg-box">
                            <div class="lg-label"><h4>用户登录</h4></div>
                            <div class="alert alert-error">
                                <i class="iconfont">&#xe62e;</i>
                                <span>请输入用户名</span>
                            </div>
                            <form>
                                <div class="lg-username input-item clearfix">
                                    <i class="iconfont">&#xe60d;</i>
                                    <input type="text" placeholder="账号/邮箱">
                                </div>
                                <div class="lg-password input-item clearfix">
                                    <i class="iconfont">&#xe634;</i>
                                    <input type="password" placeholder="请输入密码">
                                </div>
                                <div class="lg-check clearfix">
                                    <div class="input-item">
                                        <i class="iconfont">&#xe633;</i>
                                        <input type="text" placeholder="验证码">
                                    </div>
                                    <span class="check-code">XD34F</span>
                                </div>
                                <div class="tips clearfix">
                                    <label><input type="checkbox" checked="checked">记住用户名</label>
                                    <a href="javascript:;" class="register">立即注册</a>
                                    <a href="javascript:;" class="forget-pwd">忘记密码？</a>
                                </div>
                                <div class="enter">
                                    <a href="javascript:;" class="purchaser" onClick="javascript:login()">采购商登录</a>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="lg-poster"></div>
                </div>
            </div>
        </div>
        <jsp:include page="/commons/include/footer.jsp" flush="true"/>
    </body>
</html>

<script type="text/javascript">
    function login(){
        window.location='main.jsp';
    }
</script>
