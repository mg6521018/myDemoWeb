<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head> 
    <meta charset="utf-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <title>uimaker信息管理系统</title>
    <link href="${ctx}/pages/css/base.css" rel="stylesheet">
    <link href="${ctx}/pages/css/platform.css" rel="stylesheet">
    <link href="${ctx}/custom/uimaker/easyui.css" rel="stylesheet" >
    <script type="text/javascript" src="${ctx}/custom/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/custom/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/pages/js/menu.js"></script>
    <script type="text/javascript" src="${ctx}/pages/js/main.js"></script>
</head> 
<body>
    <div class="container">
        <div id="pf-hd">
            <div class="pf-logo">
                <img src="images/main/main_logo.png" alt="logo">
            </div>
            
            <div class="pf-nav-wrap">
                <div class="pf-nav-ww">
                    <ul class="pf-nav"></ul>
                </div>
                <a href="javascript:;" class="pf-nav-prev disabled iconfont">&#xe606;</a>
                <a href="javascript:;" class="pf-nav-next iconfont">&#xe607;</a>
            </div>

            <div class="pf-user">
                <div class="pf-user-photo">
                    <img src="images/main/user.png" alt="">
                </div>
                <h4 class="pf-user-name ellipsis">uimaker</h4>
                <i class="iconfont xiala">&#xe607;</i>

                <div class="pf-user-panel">
                    <ul class="pf-user-opt">
                        <li>
                            <a href="javascript:;">
                                <i class="iconfont">&#xe60d;</i>
                                <span class="pf-opt-name">用户信息</span>
                            </a>
                        </li>
                        <li class="pf-modify-pwd">
                            <a href="javascript:;">
                                <i class="iconfont">&#xe634;</i>
                                <span class="pf-opt-name">修改密码</span>
                            </a>
                        </li>
                        <li class="pf-logout">
                            <a href="login.jsp">
                                <i class="iconfont">&#xe60e;</i>
                                <span class="pf-opt-name">退出</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div id="pf-bd">
            <div class="pf-sider-wrap">
            </div>

            <div id="pf-page">
            </div>
        </div>

        <jsp:include page="/commons/include/footer.jsp" flush="true"/>
    </div>

    <div id="mm" class="easyui-menu tabs-menu" style="width:120px;">
         <div id="mm-tabclose">关闭</div>
         <div id="mm-tabcloseall">关闭所有</div>
         <div id="mm-tabcloseother">关闭其他</div> 
    </div>
    <!--[if IE 7]>
    <script type="text/javascript">
        $(window).resize(function(){
            $('#pf-bd').height($(window).height()-76);
        }).resize();
    </script>
    <![endif]-->  


    <script type="text/javascript">
        $(document).ready(function(){
            mainPlatform.init();
        });

        $(window).resize(function(){
            $('.tabs-panels').height($("#pf-page").height()-46);
            $('.panel-body').height($("#pf-page").height()-76)
        }).resize();

        var page = 0, pages = ($('.pf-nav').height() / 70) - 1;
        if(pages === 0){
            $('.pf-nav-prev,.pf-nav-next').hide();
        }
        $(document).on('click', '.pf-nav-prev,.pf-nav-next', function(){
            if($(this).hasClass('disabled')) return;
            if($(this).hasClass('pf-nav-next')){
                page++;
                $('.pf-nav').stop().animate({'margin-top': -70*page}, 200);
                if(page == pages){
                    $(this).addClass('disabled');
                    $('.pf-nav-prev').removeClass('disabled');
                }else{
                    $('.pf-nav-prev').removeClass('disabled');
                }
            }else{
                page--;
                $('.pf-nav').stop().animate({'margin-top': -70*page}, 200);
                if(page == 0){
                    $(this).addClass('disabled');
                    $('.pf-nav-next').removeClass('disabled');
                }else{
                    $('.pf-nav-next').removeClass('disabled');
                }
            }
        })
    </script>
</body> 
</html>
