<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>网络与信息化中心5678学生团队办公系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <a href="${pageContext.request.contextPath }/toWelcome.action"><h1>网络与信息化中心5678学生团队办公系统</h1></a>

    <div class="publicHeaderR">
        <p><span>您好！</span><span style="color: #fff21b"> ${user.realname } ${user.id }</span> , 欢迎你！</p>
        <!--退出后返回到登陆页面-->
        <a href="${pageContext.request.contextPath }/logout.action">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian">
    <!--功能列表一栏-->
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="${pageContext.request.contextPath }/showBefSig.action">签到交接</a></li>
                <li><a href="${pageContext.request.contextPath }/showUnfinishOrder.action">工单管理</a></li>
                <li><a href="${pageContext.request.contextPath }/manageList.action">业务员信息管理</a></li>
                <li><a href="#">管理员平台</a></li>
                <li><a href="${pageContext.request.contextPath }/logout.action">退出系统</a></li>
        </nav>
    </div>
    <!--中间主体部分-->
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户信息查看页面</span>
        </div>
        <div class="providerView">
            <p><strong>用户编号(学号)：</strong><span>${thisManage.id }</span></p>
            <p><strong>用户真实姓名：</strong><span>${thisManage.realname }</span></p>
            <p><strong>用户性别：</strong><span>
            	<c:choose>
            		<c:when test="${thisManage.sex==1 }">男</c:when>
                    <c:when test="${thisManage.sex==2 }">女</c:when>
                    <c:otherwise></c:otherwise>
                </c:choose>
            </span></p>
            <p><strong>qq号码：</strong><span>${thisManage.qq }</span></p>
            <p><strong>用户电话：</strong><span>${thisManage.phone }</span></p>
            <p><strong>用户地址：</strong><span>${thisManage.address }</span></p>
            <p><strong>用户类别：</strong><span>
            			<c:choose>
                            <c:when test="${thisManage.type==1 }">组长</c:when>
                            <c:when test="${thisManage.type==2 }">业务员</c:when>
                            <c:otherwise></c:otherwise>
                        </c:choose>
                        </span></p>
            <p><strong>年级专业：</strong><span>${thisManage.major }</span></p>
            <p><strong>身份证号：</strong><span>${thisManage.idcard }</span></p>
            <p><strong>创建时间：</strong><span>${thisManage.createdate }</span></p>
            <p><strong>最后登陆时间：</strong><span>${thisManage.lastlogintime }</span></p>
            <p><strong>最后修改时间：</strong><span>${thisManage.changetime }</span></p>
            <p><strong>修改人：</strong><span>${thisManage.changeby }</span></p>
            <a href="${pageContext.request.contextPath }/manageList.action">返回列表</a>
            <a href="${pageContext.request.contextPath }/operateManage.action?operate=manageView&id=${thisManage.id }">修改信息</a>
        </div>
    </div>
</section>
<footer class="footer">
Copyright@ 2018 网络与信息化中心用户事务部学生团队
</footer>
<script src="js/time.js"></script>
</body>
</html>