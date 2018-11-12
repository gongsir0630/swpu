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
        <form action="" method="post">
        <table class="providerTable qiandaoTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th>日期</th>
                <td  colspan="2"></td>
                <th>星期</th>
                <td colspan="1">
                </td>
                <th>班次</th>
                <td>
                </td>
                <th colspan="1">填写人签字</th>
                <td colspan="1">
                </td>
                <th colspan="1">接班人签字</th>
                <td colspan="1">
                    <select name="confirmname" id="confirmname">
                        <c:forEach items="${allManage }" var="manage">
                        	<!-- 默认选中当前登陆的人员 -->
                    		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
                    	</c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th height="70px">实际值班人员</th>
                <td colspan="10" style="text-align: left;">
                	<c:forEach items="${allManage }" var="manage" varStatus="number">
                		<c:if test="${number.index==10 }"><div class="clearbox"></div> </c:if>
                    	<div class="watchspan">
                    		
                    		<label>
                    			<input class="watch" type="checkbox" name="watchs" onclick="showspan($(this))" value="${manage.id }"/>
                    			${manage.realname }
                    		</label>
                    		<span class="hidespan"  <c:if test="${number.index==0 }">style="display:block;"</c:if>>
                    			<label><input type="radio" name="${manage.id }" value="1" />正常</label>
                    			<label><input type="radio" name="${manage.id }" value="2" />迟到</label>
                    			<label><input type="radio" name="${manage.id }" value="3" />旷班</label>
                    		</span>
                    		<div class="clearbox"></div>
                    	</div>
                   	</c:forEach>
                   	<div class="clearbox"></div>
                </td>
            </tr>
            <tr>
                <th colspan="2">公共自行车</th>
                <td colspan="3">
                	<c:forEach items="${bikes }" var="bike">
	                	<label style="margin-right: 5px;font-size: 12px;"><input type="checkbox" name="bikes" value="${bike.id }"/>${bike.bikename}</label>
	                </c:forEach>
                </td>
                <th>描述</th>
                <td colspan="5">
                
                </td>
            </tr>
            <tr>
                <th rowspan="2">钥匙</th>
                <c:forEach items="${keys }" var="key">
                <td colspan="2"><label><input type="checkbox" name="keys" value="${key.id }"/>${key.keyname }</label> </td>
                </c:forEach>
                <th colspan="2">持钥匙人</th>
                <td colspan="2"></td>
            </tr>
            <tr>	 
            	<th>描述</th>
                <td colspan="9">
                	
                </td>
            </tr>
            <tr>
                <th>工具</th>
                <c:forEach items="${tools }" var="tool">
                	<td><label><input type="checkbox" name="tools" value="${tool.id }"/>${tool.toolname }</label></td>
                </c:forEach>
                
            </tr>
            <tr>
                <th rowspan="2">流量</th>
                <td colspan="2">电信出口（125）</td>
                <td colspan="3"> </td>
                <td colspan="2">联通出口</td>
                <td colspan="3"> </td>
            </tr>
            <tr>
            	<td colspan="2">电信出口（182）</td>
                <td colspan="3"> </td>
                <td colspan="2">教育网出口</td>
                <td colspan="3"> </td>
            </tr>
            <tr>
                <th colspan="2" class="danger">运维系统</th>
                <td colspan="2">后勤平台未受理数量</td>
                <td> </td>
                <td colspan="2">后勤平台未完工数量</td>
                <td> </td>
                <td colspan="2">电信平台待完成数量</td>
                <td> </td>
            </tr>
            <tr>
                <th>交接特殊情况备注</th>
                <td colspan="10">
                	
                </td>
            </tr>
        </table>
        <div class="providerAddBtn">
           <input type="submit" value="保   存" style="line-height: 20px;" onclick="addManage()"/>
           <input type="button" value="返   回" onclick="history.back(-1)"/>
        </div>
        <div class="search">
            <span>供应商名称：</span>
            <input type="text" placeholder="请输入供应商的名称"/>
            <input type="button" value="查询"/>
            <a href="providerAdd.html">本班次签到</a>
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
	
	
	
</script>
</body>
</html>