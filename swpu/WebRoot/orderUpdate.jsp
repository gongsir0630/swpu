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
            height: 28px; 
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
	        width: 98px;
        }
        th{
        	font-size: 14px;
        	font-weight: 900;
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
	
			background-color: #E2ECF5;
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
		.watchspan input {
			width: 17px;
			margin-left: 5px;
		}

		td>label {
			font-weight: 700;
		}
		.providerAddBtn{
			margin: 0px;
			text-align: center;
		}
		.providerAddBtn input{
			margin: 0px 7px 0px 7px;
		}
		.updateOrderForm{
		    border: 1px solid #4287C2;
		    padding: 15px;
		    margin: 10px 0px 10px 10px;
		    width: 885px;
		    background-color: #E6E6E6;
		    border-radius: 7px;
		    float: left;
		    
		}
		.imgDiv{
			border-radius: 7px;
			float: left;
			border: 1px solid #4287C2;
			padding: 10px;
		    margin: 10px 0px;
		    width: 244px;
		}
		.shebei input{
			width: 30px;
		 }
		 textarea {
			width: 98%;
			padding: 5px;
		}
		.right{
			width: 85%;
		}
    </style>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <a href="${pageContext.request.contextPath }/toWelcome.action"><h1>网络与信息化中心5678学生团队办公系统</h1></a>

    <div class="publicHeaderR">
    	<input type="hidden" id="userid" value="${user.id }"/>
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
   		<div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>工单管理首页>> 工单完工</span>
        </div>
        <div class="imgDiv"><a href="${pageContext.request.contextPath }/showUnfinishOrder.action"><img src="img/team.jpg" alt="" width="244" height="438"/> </a> </div>
        <form class="updateOrderForm" action="" method="post">
        <table class="providerTable qiandaoTable" cellpadding="0" cellspacing="0">
            <tr>
                <th>工单编号<input type="hidden" name="id" value="${order.id }"/> </th>
                <td colspan="2">${order.id }</td>
                <th>客户住址</th>
                <td colspan="2"><input type="text" name="address" value="${order.address }"/> </td>
                <th>联系方式</th>
                <td colspan="2"><input name="userphone" type="text" value="${order.userphone }"/> </td>
            </tr>
            <tr>
                <th>预约时间</th>
                <td colspan="2"><input name="appointmenttime" type="text" value="${order.appointmenttimeString }"/></td>
                <th>故障类型</th>
                <td>
                	<select class="select2" name="tabletype" style="width: 60px;">
                      <option value="">--请选择--</option>
                      <option value="1" <c:if test="${order.tabletype==1 }">selected</c:if> >电信</option>
                      <option value="2" <c:if test="${order.tabletype==2 }">selected</c:if> >深澜</option>
                      <option value="3" <c:if test="${order.tabletype==3 }">selected</c:if> >端口</option>
                    </select>
                </td>
                <th>派单人</th>
                <td>
                	<select class="select2" name="startname"  style="width: 80px;">
	                    <option value="">--请选择--</option>
	                     <c:forEach items="${allManage }" var="manage">
	                     	<option value="${manage.id }" <c:if test="${manage.id==order.startname }">selected</c:if> >${manage.realname }</option>
	                     </c:forEach>
                    </select>
                </td>
                <th>用户姓名</th>
                <td><input type="text" name="username" value="" style="width: 92px;"/> </td>
            </tr>
            <tr>
                <th>故障描述</th>
                
                <td colspan="8" style="font-size: 14px;font-weight: 600;">
                	<textarea rows="2" name="description" class="description">${order.description }</textarea>
                </td>
            </tr>
            <tr>
                <th >派单时间</th>
                <td colspan="2">
	                <input type="hidden" id="starttime" value="${order.starttime }"/>
	                <input type="datetime-local" class="starttime" name="starttime" value=""/> 
	            </td>
                <th  colspan="2">登记人</th>
                <td>
               		<select name="recordman" id="recordman" style="width: 80px;">
               			<option value="">--请选择--</option>
	                   	<c:forEach items="${allManage }" var="manage">
	                   		<option value="${manage.id }" <c:if test="${manage.id==order.recordman }">selected</c:if> >${manage.realname }</option>
	                   	</c:forEach>
                   </select>
                </td>
                <th>解决时间</th>
                <td colspan="2">
                	<input type="hidden" id="endtime" value="${order.endtime }"/>
                     <input type="datetime-local" class="endtime" name="endtime" value=""/> 
                </td>
            </tr>
            <tr>
                <th height="70px">解决人员</th>
                <td colspan="8" style="text-align: left;">
                	<c:forEach items="${allManage }" var="manage" varStatus="number">
                		<c:if test="${number.index%8==0 }"><div class="clearbox"></div> </c:if>
                    	<div class="watchspan">
                    		<label>
                    			<input class="watch" type="checkbox" name="endIds" value="${manage.id }" <c:if test="${manage.jionFinishOrder==1 }">checked</c:if>/>
                    			${manage.realname }
                    		</label>
                    	</div>
                   	</c:forEach>
                </td>
            </tr>
            <tr class="shebei">
                <th>设备使用</th>
                <th>端口</th>
                <td><input type="text" name="duankou" value="${order.duankou }" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;个</span> </td>
                <th>网线</th>
                <td><input type="text" name="wangxian" value="${order.wangxian }" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;条</span></td>
                <th>面板</th>
                <td><input type="text" name="mianban" value="${order.mianban }" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;个</span></td>
                <th>水晶头</th> 
                <td><input type="text" name="shuijingtou" value="${order.shuijingtou }" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;个</span></td>
            </tr>
            <tr>
                <th>故障原因</th>
                <td colspan="8"><textarea rows="2" name="reason" cols="6">${order.reason }</textarea></td>
            </tr>
            <tr>
                <th>解决方法</th>
                <td colspan="8"><textarea rows="2" name="solve" cols="">${order.solve }</textarea></td>
            </tr>
        </table>
        <div class="providerAddBtn" style="padding-top: 10px;">
           <input type="button" value="确认修改" style="line-height: 20px;" onclick="updateOrder()"/>
           <input type="button" value="返回列表" style="line-height: 20px;" onclick="history.back(-1)"/>
        </div>
        </form>
        <div style="clear: both;"></div>
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
	
//将表单数据提交到后台的controller控制层中   进行完工数据登记
function updateOrder(){
	var userId = $("#userid").val();
	alert(userId);
	if(validform().form()){//如果表单校验通过
		$.ajax({
			"async":false,//同步提交
			"url":"${pageContext.request.contextPath}/updateOrder.action?changeBy="+userId,
			"data":$(".updateOrderForm").formSerialize(),
			"type":"POST",
			"dataType":"json",
			"success":function(data){
				if(data.updateSuccess){//修改成功
					window.location.href = "${pageContext.request.contextPath }/showOrderPage.action";
				}else{
					alert("修改失败！");
				}
			}//success函数结尾
		});
	}
};
	//一面加载完后开始进行表单验证开始进行表单验证
	$(function(){
		//页面时间初始化
		validform();
		var startTime = $("#starttime").val();
		var end = $("#endtime").val();
		var endformatDate = str2Date(end);
		var startformatDate = str2Date(startTime);
		$(".endtime").val(endformatDate);
		$(".starttime").val(startformatDate);
	});
	$(validform()); 
	
	//strl类型转date
	function str2Date(dateStr) {
		var val = Date.parse(dateStr);
		var newDate = new Date(val);
		//格式化时间
		var formatDate = newDate.Format("yyyy-MM-ddTHH:mm:ss");
		return formatDate;
	}
	
	
	//自定义校验规则  在后台校验原密码是不是和用户的学号匹配
	 jQuery.validator.addMethod(
		 //自定义规则的名称
		"checkUserPhone",
		//校验的函数
		function(value,element,params){
			 var numberLength = value.length;
			//定义一个标志
			var flag = false;
			if(numberLength == 11 || numberLength == 8){
				flag = true;
			}
			return flag;
		}
	); 
	//定义校验函数
	function validform() {
		return $(".updateOrderForm").validate({
			rules:{
				"address":{
					"required":true
				},
				"appointmenttime":{
					"required":true
				},
				"starttime":{
					"required":true
				},
				"startname":{
					"required":true,
					"minlength":1
				},
				"userphone":{
					"required":true,
					"checkUserPhone":true
				},
				"description":{
					"required":true
				},
				"tabletype":{
					"required":true,
					"minlength":1
				}
			},
			messages:{
				"address":{
					"required":"*用户住址不能为空"
				},
				"appointmenttime":{
					"required":"*预约时间不能为空"
				},
				"starttime":{
					"required":"*派单时间不能为空"
				},
				"startname":{
					"required":"*派单人不能为空",
					"minlength":"*请选择派单人"
				},
				"userphone":{
					"required":"*联系方式不能为空",
					"checkUserPhone":"*联系方式长度11位或者8位"
				},
				"description":{
					"required":"*故障描述不能为空"
				},
				"tabletype":{
					"required":"*故障类型不能为空",
					"minlength":"*请选择故障类型"
				}
			}
		});
	}  
	
	
	
	//时间格式转换器
	Date.prototype.Format = function (fmt) {    
	    var o = {    
	        "M+": this.getMonth() + 1, //月份     
	        "d+": this.getDate(), //日     
	        "H+": this.getHours(), //小时     
	        "m+": this.getMinutes(), //分     
	        "s+": this.getSeconds(), //秒     
	        "q+": Math.floor((this.getMonth() + 3) / 3), //季度     
	        "S": this.getMilliseconds() //毫秒     
	    };    
	    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));    
	    for (var k in o)    
	    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));    
	    return fmt;    
	};    
	
</script>
</body>
</html>