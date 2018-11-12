<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">

<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>系统登录 -5678办公系统</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body class="login_bg">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>网络与信息化中心5678学生团队办公系统</h1>
        </header>
        <section class="loginCont">
            <!--登陆过后响应到欢迎页面welcome.html-->
            <form class="loginForm" action="${pageContext.request.contextPath }/login.action" method="post">
                <div class="inputbox">
                    <label for="user">用户名：</label>
                    <input id="user" type="text" name="username" placeholder="请输入用户名(学号)" required/>
                    <span id='userspan'></span>
                </div>
                <div class="inputbox">
                    <label for="mima">密码：</label>
                    <input id="mima" type="password" name="password" placeholder="请输入密码" required/>
                </div>
                <div class="subBtn">
                    <input type="submit" value="登录" />
                    <input type="reset" value="重置"/>
                </div>
            </form>
        </section>
    </section>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            //当用户名输入框失去焦点过后，用ajax技术进行提交
           $("#user").blur(function () {
               //获取管理员的登陆账号
               var managerName = this.value;
               if(managerName == null || managerName == ""){
                   $("#userspan").html("*用户名不能为空");
               }else{
                   //使用ajax进行提交到managerServlet并且得到结果
            	   $.ajax({
              			/* "async":true,//异步提交 */
              			"url":"checkName.action",
              			"data":{"userId":managerName},
              			"type":"POST",
              			"dataType":"json",
              			"success":function(data){
              				//alert(data.isExist);
              				if(data.isExist == "true" || data.isExist == true){
                               $("#userspan").html("*用户名正确");
                           }else{
                               $("#userspan").html("*用户名不存在");
                           }
              			},
              			error:function(){
              				alert("错误！！！！");
              			}
              		});
               }
           });
        });
    </script>
</body>
</html>