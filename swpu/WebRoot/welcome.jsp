<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">

<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>网络与信息化中心5678学生团队办公系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <style type="text/css">

		/* .publicMian {
		    background: url(img/teammenu.jpg) 0px 0 repeat-x;
		} */
		.right{
			background: url(img/teammenu.jpg) 0px 0 no-repeat;
			border: 1px solid #4287C2;
			width: 1223px;
		}
		.providerAddBtn {
		    margin-left: 0px;
		    padding-top: 0px;
		}
		
		.leftDiv{
			text-align: center;
			border-radius: 7px;
			float: left;
			border: 2px solid #4287C2;
			padding: 10px;
		    margin: 10px 20px 10px 10px;
		    width: 295px;
		}
		.rightDiv{
			text-align: center;
			border-radius: 7px;
			float: left;
			border: 2px solid #4287C2;
			padding: 10px;
		    margin: 10px 0px;
		    width: 840px;
		}
		.workLink,.superLink{
			text-align: center;
			border-radius: 7px;
			float: left;
			border: 2px solid #826171;
			padding: 10px;
		    margin: 5px 0px;
		    width: 270px;
		}
		.leftDiv a{
			margin: 5px 15px 15px 15px;
		}
		.workLink h1,.superLink h1{
			margin-bottom: 7px;
			color: #101020
		}
		
		.clear{
			clear: both;
		}
		.emailDiv{
			float: left;
			border-radius: 7px;
			border: 1px solid orange;
			width: 85px;height: 85px;
			padding: 5px;
			margin-top: 25px;
			margin-left: 10px;
		}
		.wordsDiv{
			float: left;
			width: 650px;
			margin: 15px;
			color: white;
			line-height: 25px;
		}
    </style>
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
            </ul>
        </nav>
    </div>
    <!--中间主体部分-->
    <div class="right">
		<div class="leftDiv">
			<h1 style="font-size: 30px;">快速导航</h1> 
		
			<div class="providerAddBtn">
	           
	           	<div class="superLink">
	           		<h1>快速办公</h1>
	           	   <a href="${pageContext.request.contextPath }/signList.action">签到表管理</a>
		           <a href="${pageContext.request.contextPath }/showOrderPage.action">工单管理</a><br />
		           <a href="${pageContext.request.contextPath }/toOrderAdd.action">新建工单</a>
		           <a href="">本班备注</a><br />
		           <a href="${pageContext.request.contextPath }/showOrderPage.action">工单查询</a>
	           	</div>
	           	<div class="workLink">
					<h1>常用链接</h1>
					<a href="http://172.16.253.72/sensorlist.htm" target="_blank">流量监控</a>
				   <a href="https://hqservice.swpu.edu.cn/pc/account/login/1" target="_blank">后勤报修平台</a><br />
		           <a href="https://m.sctel.com.cn/manhourpool/login.jsp" target="_blank">电信报修平台</a>
		           <a href="http://met.swpu.edu.cn" target="_blank">中心首页</a><br />
		           <a href="http://dbxb.swpu.edu.cn/index/bgdh/bgdh.htm" target="_blank">常用办公电话</a>
		           <a href="http://www.swpu.edu.cn/"  target="_blank">swpu首页</a><br />
				</div>
	        </div>
       </div>
       <div class="rightDiv">
       		<a href="http://met.swpu.edu.cn" target="_blank">
       			<img src="img/swpu.jpg" alt="现代教育与技术中心首页"/> 
       		</a> 
       </div>
       <div class="rightDiv">
       		<div class="wordsDiv">
	       		<h2 style="margin-bottom: 13px;">使用说明</h2>
	       		<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本系统由个人和西南石油大学网络与信息化中心用户事务部学生团队联合开发，如在使用过程中发现网页的功能有错误或者漏洞，请及时点击右方图片联系开发人员，另外，如您在使用的过程中有更好的建议或者有认为设计的不合理之处，我们也欢迎您提出宝贵的意见，我们将努力完善我们的系统，谢谢！</h3>
       		</div>
       		<div class="emailDiv">
       			<a href="mailto:13032820513@163.com"><img src="img/email.png" alt="" width="80"/></a>
       		</div>
       		<div class="clear"></div>
       </div>
       <div class="clear"></div>
       
    </div>
</section>
<footer class="footer">
    Copyright@ 2018 网络与信息化中心用户事务部学生团队
</footer>
<script src="js/jquery-1.8.3.min.js" ></script>
<script src="js/time.js"></script>
</body>
</html>