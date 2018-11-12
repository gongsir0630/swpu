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
			margin: 7px;
		}
		.finishOrderForm{
		    border: 1px solid #4287C2;
		    padding: 15px;
		    margin: 10px 0px 10px 10px;
		    width: 890px;
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
		    width: 224px;
		}
		.shebei input{
			width: 30px;
		 }
		 textarea {
			width: 100%;
		}
		.location{
			margin: 5px 0px 10px 0px;
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
   		<div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>工单管理首页>> 工单完工</span>
        </div>
        <div class="imgDiv"><a href="${pageContext.request.contextPath }/showUnfinishOrder.action"><img src="img/imgDiv.png" alt="" width="224" height="426"/> </a> </div>
        <form class="finishOrderForm" action="" method="post">
        <table class="providerTable qiandaoTable" cellpadding="0" cellspacing="0">
            <tr>
                <th>工单编号<input type="hidden" name="id" value="${order.id }"/> </th>
                <td colspan="2">${order.id }</td>
                <th>客户住址</th>
                <td colspan="2">${order.address }</td>
                <th>联系方式</th>
                <td colspan="2">${order.userphone }</td>
            </tr>
            <tr>
                <th>预约时间</th>
                <td colspan="2">${order.appointmenttimeString }</td>
                <th>故障类型</th>
                <td>
                	<c:choose>
                       <c:when test="${order.tabletype==1 }">电信</c:when>
                       <c:when test="${order.tabletype==2 }">深澜</c:when>
                       <c:when test="${order.tabletype==3 }">端口</c:when>
                       <c:otherwise>未知</c:otherwise>
                   </c:choose>
                </td>
                <th>派单人</th>
                <td>${order.startnamestring }</td>
                <th>用户姓名</th>
                <td><input type="text" name="username" value="" style="width: 92px;"/> </td>
            </tr>
            <tr>
                <th>故障描述</th>
                
                <td colspan="8" style="font-size: 14px;font-weight: 600;">
                	${order.description }
                </td>
            </tr>
            <tr>
                <th >派单时间</th>
                <td colspan="2">${order.starttimeString }</td>
                <th  colspan="2">登记人<span style="color: red;">（默认选中当前登陆）</span> </th>
                <td>
               		<select name="recordman" id="recordman">
	                   	<c:forEach items="${allManage }" var="manage">
	                   		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
	                   	</c:forEach>
                   </select>
                </td>
                <th>解决时间</th>
                <td colspan="2">
                     <input type="datetime-local" class="endtime" name="endtime" value="2018-03-13T13:59:59"/> 
                </td>
            </tr>
            <tr>
                <th height="70px">解决人员</th>
                <td colspan="8" style="text-align: left;">
                	<c:forEach items="${allManage }" var="manage" varStatus="number">
                		<c:if test="${number.index%8==0 }"><div class="clearbox"></div> </c:if>
                    	<div class="watchspan">
                    		<label>
                    			<input class="watch" type="checkbox" name="endIds" value="${manage.id }"/>
                    			${manage.realname }
                    		</label>
                    	</div>
                   	</c:forEach>
                </td>
            </tr>
            <tr class="shebei">
                <th>设备使用</th>
                <th>端口</th>
                <td><input type="text" name="duankou" value="" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;个</span> </td>
                <th>网线</th>
                <td><input type="text" name="wangxian" value="" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;条</span></td>
                <th>面板</th>
                <td><input type="text" name="mianban" value="" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;个</span></td>
                <th>水晶头</th> 
                <td><input type="text" name="shuijingtou" value="" style=""/><span style="font-size: 14px;font-weight: 600;">&nbsp;&nbsp;个</span></td>
            </tr>
            <tr>
                <th>故障原因</th>
                <td colspan="8"><textarea rows="2" name="reason" cols="6"></textarea></td>
            </tr>
            <tr>
                <th>解决方法</th>
                <td colspan="8"><textarea rows="2" name="solve" cols=""></textarea></td>
            </tr>
        </table>
        <div class="providerAddBtn">
           <input type="button" value="保   存" style="line-height: 20px;" onclick="finish()"/>
           <input type="button" value="返   回" style="line-height: 20px;" onclick="history.back(-1)"/>
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
	function finish(){
		if(validform().form()){//如果表单校验通过validform().form()
			$.ajax({
				"async":false,//同步提交
				"url":"${pageContext.request.contextPath}/finish.action",
				"data":$(".finishOrderForm").formSerialize(),
				"type":"POST",
				"dataType":"json",
				"success":function(data){
					if(data.finishSuccess){//完工成功
						window.location.href = "${pageContext.request.contextPath }/showUnfinishOrder.action";
					}else{
						alert("完工失败！");
					}
				}//success函数结尾
			});
		}
	};
	
	//定义校验函数
	function validform() {
		return $(".finishOrderForm").validate({
			rules:{
				"recordman":{
					"required":true
				},
				"endtime":{
					"required":true
				},
				"endIds":{
					"required":true
				},
				"duankou":{
					"required":true
				},
				"wangxian":{
					"required":true
				},
				"mianban":{
					"required":true
				},
				"shuijingtou":{
					"required":true
				},
				"reason":{
					"required":true
				},
				"solve":{
					"required":true
				}
			},
			messages:{
				"recordman":{
					"required":"*请选择登记人"
				},
				"endtime":{
					"required":"*完工时间不能为空"
				},
				"endIds":{
					"required":"*请选择完工人"
				},
				"duankou":{
					"required":"*端口数目不能为空"
				},
				"wangxian":{
					"required":"*网线数目不能为空"
				},
				"mianban":{
					"required":"*面板数目不能为空"
				},
				"shuijingtou":{
					"required":"*水晶头数目不能为空"
				},
				"reason":{
					"required":"*请输入故障原因"
				},
				"solve":{
					"required":"*请输入解决方法"
				}
			}
		});
	}  
	
	//一面加载完后开始进行表单验证开始进行表单验证
	$(function(){
		/* validform(); */
		//页面时间初始化
		var date = new Date();
		var foramtDate = date.Format("yyyy-MM-ddTHH:mm:ss");
		$(".endtime").val(foramtDate);
	});
	/* $(validform());  */
	
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