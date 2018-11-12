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
    	.clearbox{
			clear: both;
		}
        .qiandaoTable input,select{
            /* width: 200px; */
            height: 26px;
            outline: none;
            padding-left: 0px;
            border: 1px solid #8ab2d5;
            border-radius: 4px;
            text-align: center;
        }
        option{
        	background-color: green;
        }
        tr,td,th{
            border: #87C212 1px solid;
        }
        th,td{
        	width: 108px;
        }
        input[type="checkbox"]{
            vertical-align: middle;
            margin-right: 5px;
        }
        input[type="radio"]{
        	vertical-align: middle;
        }
		.number{
			width: 70px;
		}
		textarea {
	
			background-color: #FFE793
		}
		.watchspan{
			vertical-align:middle;
			background-color: orange;
			border: 1px red solid; 
			margin-left: 10px;
			display: inline-block;
			margin-bottom: 4px;
			margin-top: 4px;
		}
		.watchspan > label { 
			font-size: 14px;
			font-weight: 700;
			vertical-align: middle;
			float: left;
			width: 80px;
			
		}
		.watchspan > label label {
			 
		}
		.watchspan input {
			width: 17px;
			margin-left: 5px;
		}
		.watchspan .hidespan{
			display: none;
			float: left;
			
		}
		td>label {
			font-weight: 700;
		}
		.providerAddBtn{
			margin: 0px;
			text-align: center;
		}
		.providerAddBtn input[type='button']:hover,
		.providerAddBtn input[type='button']:focus{
		    background: linear-gradient(to bottom, #7aaed4, #578bb4, #406e99, #225792, #0d2d54);
		}
		.righttopdiv{
			padding:5px 0px 5px 0px;
			vertical-align: middle;
		}
		.providerAddBtn a{
			margin-right: 22px;
		}
		.location{
			margin-bottom: 10px;
		}
		.bike{
			margin-right: 5px;
			font-size: 12px; 
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
        <input type="hidden" id="userid" value="${user.id }"/>
        <input type="hidden" id="userType" value="${user.type }"/>
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
    	<div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>签到管理主页</span>
        </div>
        <div class="location">
            <span>签到表编号：</span>
            <span>${lastsign.id }</span>
        </div>
        <form action="${pageContext.request.contextPath }/confirmSign.action" method="post" onsubmit="return confirmCheck()">
        <input  type="hidden" name="signTableId" value="${lastsign.id }"/>
        <table class="providerTable qiandaoTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th>日期</th>
                <td  colspan="2">${lastsign.createtime }</td>
                <th>星期</th>
                <td colspan="1">
                	<c:choose>
                        <c:when test="${lastsign.week==1 }">星期一</c:when>
                        <c:when test="${lastsign.week==2 }">星期二</c:when>
                        <c:when test="${lastsign.week==3 }">星期三</c:when>
                        <c:when test="${lastsign.week==4 }">星期四</c:when>
                        <c:when test="${lastsign.week==5 }">星期五</c:when>
                        <c:when test="${lastsign.week==6 }">星期六</c:when>
                        <c:when test="${lastsign.week==7 }">星期日</c:when>
                        <c:otherwise></c:otherwise>
                    </c:choose>
                </td>
                <th>班次</th>
                <td>
                	<c:choose>
                        <c:when test="${lastsign.banci==1 }">上午1、2</c:when>
                        <c:when test="${lastsign.banci==2 }">上午3、4、5</c:when>
                        <c:when test="${lastsign.banci==3 }">下午6、7</c:when>
                        <c:when test="${lastsign.banci==4 }">下午8、9</c:when>
                        <c:when test="${lastsign.banci==5 }">晚上10、11、12</c:when>
                        <c:otherwise></c:otherwise>
                    </c:choose>
                </td>
                <th colspan="1">填写人签字</th>
                <td colspan="1">${lastsign.create }</td>
                <th colspan="1">接班人签字</th>
                <td colspan="1">
                	<input class="confirInput" type="hidden" value="${lastsign.confir}"/>
                	<c:choose>
                        <c:when test="${lastsign.confir==null }">
                        	<select name="confirmname" id="confirmname">
		                        <c:forEach items="${allManage }" var="manage">
		                        	<!-- 默认选中当前登陆的人员 -->
		                    		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
		                    	</c:forEach>
		                    </select>
                        </c:when>
                      	<c:otherwise>${lastsign.confir}</c:otherwise>
                    </c:choose>
                    
                </td>
            </tr>
            <tr>
                <th height="50px">实际值班人员</th>
                <td colspan="10" style="text-align: left;">
                	<c:forEach items="${lastsign.watchsArray }" var="manage" varStatus="number">
                    	<label style="margin-right: 20px; margin-left: 5px;">${manage.realName }
	               		<span <c:if test="${manage.staion==2 }">style="color: orange;"</c:if> <c:if test="${manage.staion==3 }">style="color: red;"</c:if> >             		
	               		（<c:choose>
                            <c:when test="${manage.staion==1 }">正常</c:when>
                            <c:when test="${manage.staion==2 }">迟到</c:when>
                            <c:when test="${manage.staion==3 }">旷班</c:when>
                            <c:otherwise></c:otherwise>
                        </c:choose>）
                        </span>
                    	</label>
                   	</c:forEach>
                </td>
            </tr>
            <tr>
                <th colspan="2">公共自行车</th>
                <td colspan="3">
                	<c:forEach items="${lastsign.bikesArray }" var="bike">
	                	<label class="bike" <c:if test="${bike.station==2 }">style="color: red;"</c:if>><input type="checkbox" name="bikes" disabled="disabled" value="${bike.id }" <c:if test="${bike.station==1 }">checked</c:if> />${bike.bikeName}</label>
	                </c:forEach>
                </td>
                <th>描述</th>
                <td colspan="5">${lastsign.bikesdes }</td>
            </tr>
            <tr>
                <th rowspan="2">钥匙</th>
                <c:forEach items="${lastsign.keysArray }" var="key">
                <td colspan="2"><label <c:if test="${key.station==2 }">style="color: red;"</c:if> ><input type="checkbox" name="keys" disabled="disabled" value="${key.id }" <c:if test="${key.station==1 }">checked</c:if> />${key.keyName }</label> </td>
                </c:forEach>
                <th colspan="2">持钥匙人</th>
                <td colspan="2"></td>
            </tr>
            <tr>	 
            	<th>描述</th><td colspan="9">${lastsign.keysdes }</td>
            </tr>
            <tr>
                <th>工具</th>
                <c:forEach items="${lastsign.toolsArray }" var="tool">
                	<td><label <c:if test="${tool.station==2 }">style="color: red;"</c:if>><input type="checkbox" name="tools" value="${tool.id }" disabled="disabled" <c:if test="${tool.station==1 }">checked</c:if>/>${tool.toolName }</label></td>
                </c:forEach>
            </tr>
            <tr>
                <th rowspan="2">流量</th>
                <td colspan="2">电信出口（125）</td>
                <td colspan="3">${lastsign.cdmd125 } </td>
                <td colspan="2">联通出口</td>
                <td colspan="3">${lastsign.cuq } </td>
            </tr>
            <tr>
            	<td colspan="2">电信出口（182）</td>
                <td colspan="3">${lastsign.cdmd182 } </td>
                <td colspan="2">教育网出口</td>
                <td colspan="3">${lastsign.edu } </td>
            </tr>
            <tr>
                <th colspan="2" class="danger">运维系统</th>
                <td colspan="2">后勤平台未受理数量</td>
                <td>${lastsign.logistics1 } </td>
                <td colspan="2">后勤平台未完工数量</td>
                <td>${lastsign.logistics2 } </td>
                <td colspan="2">电信平台待完成数量</td>
                <td>${lastsign.cdmdunfinish } </td>
            </tr>
            <tr>
                <th>交接特殊情况备注</th>
                <td colspan="10" style="height: 70px;">
                	${lastsign.remarks }
                </td>
            </tr>
        </table>
        <div class="providerAddBtn">
           <input class="subInput" type="submit" value="确认签字" style="line-height: 20px;"/>
           <a href="javascript:checkConfirIsNotNull()">本班签到</a>
           <a class="signManage" href="${pageContext.request.contextPath }/signList.action">签到表管理</a>
        </div>
        </form>
    </div>
</section>
<footer class="footer">
 Copyright@ 2018 网络与信息化中心用户事务部学生团队
</footer>
<script src="js/jquery-1.8.3.min.js" ></script>
<script src="js/time.js"></script>
<!-- 引入表单校验jquery插件<script type="text/javascript" src="js/jquery.validate.min.js" ></script> -->
<script src="js/jquery.validate.min.js" ></script>
<script src="js/jquery.form.js" ></script>
<script type="text/javascript">
	$(function(){
		//如果签到表已经被签到，则会隐藏确认签到按钮
		var confir = $(".confirInput").val();
		if(confir == null || confir == ""){
			
		}else {
			$(".subInput").hide();
		}
		
		/* var result = checkPower();//检查用户的权限，如果不是组长，隐藏签到表管理按钮
		if(result){
			$(".signManage").show();
		}else {
			$(".signManage").hide();
		} */
	});
	
	//对签到人的名字进行一系列的校验
	function confirmCheck(){
		var confirId = $("#confirmname option:selected").val();
		var loginId = $("#userid").val();
		if(confirId == loginId){//如果登陆人的名字和选中人的名字是一样的
			if(confirm("当前签到表的确认人学号为《"+confirId+"》，确认无误请点击确定！")){
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
	
	//点击本班签到，先验证是否签字
	function checkConfirIsNotNull(){
		var confir = $(".confirInput").val();
		if(confir == null || confir == ""){
			if(confirm("您还没有签字，忽略请点击确定！")){
				location.href = "${pageContext.request.contextPath }/toSignAdd.action";
			}
		}else {
			location.href = "${pageContext.request.contextPath }/toSignAdd.action";
		}
	}
	
	//检查用户的权限  
    function checkPower(){
    	//当前登陆者id
		var userId = $("#userid").val();
    	//alert(userId);
    	var result = false;
    	$.ajax({
  			"async":false,//是否异步提交
  			"url":"${pageContext.request.contextPath }/checkPower.action",
  			"data":{"userId":userId},
  			"type":"POST",
  			"dataType":"json",
  			"success":function(data){
  				result = data.isTeamer;
  			},
  			error:function(){
  				alert("错误！！！！");
  			}
  		});
    	return result;
	}
	
</script>
</body>
</html>