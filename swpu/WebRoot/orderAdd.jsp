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
    
	<style>
		.error{
			width:auto;
			text-align:left;
			color:#faca0d
		}
		.clear_lr{
            clear: both;
        }
		/*修改部分的样式*/
        .updateLeft, .updateRight{
            margin-left: 170px;
            padding-right: 10px;
            text-align: left;
            float: left;
            width: 300px;
        }
        .updateLeft div, .updateRight div{
        	width: 500px;
        	margin-bottom: 40px;
        	margin-top: 25px;
        }
        .providerAdd input{
        	width: 200px;
        }
        .providerAddBtn{
            margin: 15px 0px 25px 0px;
            padding-top: 0px;
            text-align: center;
        }
        .providerAddBtn a{
            margin: 5px 10px 5px 10px;
        }
        .providerUpdate{
            margin: 5px;
            padding: 0px;
        }
        .providerUpdate label{
            width: auto;
            font-size: 14px;
            font-weight: 700;
        }
        /* .providerUpdate div{
            margin-top: 2px;
            margin-bottom: 5px;
        } */
        /* 设置updateTr的行进行隐藏 */
        .updateTr{
        	display: none;
        }
        .providerUpdate .providerAddBtn{
            margin-bottom: 30px;
            margin-top: 43px
        }
        
        .updateForm textarea {
        	display:inline-block; 
        	margin-right:3px; 
        	vertical-align:middle;
        	width:700px;
			border-radius: 4px;
			border: 1px solid #4987c0;
    		box-shadow: 1px 1px 1px #99afc4;
		}
	    .buttomDiv{
	 		margin-left: 170px;
            padding-right: 10px;
            text-align: left;
	    }
	    .description{
	    	vertical-align: middle;
	    	width: 690px;
		    border-radius: 4px;
		    outline: none;
		    padding: 10px;
		    border: 1px solid #4987c0;
		    box-shadow: 1px 1px 1px #99afc4;
		    font-size: 16px;
	    }
	</style>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <a href="${pageContext.request.contextPath }/toWelcome.action"><h1>网络与信息化中心5678学生团队办公系统</h1></a>

    <div class="publicHeaderR">
        <p><span>您好！</span><span style="color: #fff21b"> ${user.realname } ${user.id }</span> , 欢迎你！</p>
        <input type="hidden" id="userid" value="${user.id }"/>
        <input type="hidden" id="userType" value="${user.type }"/>
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
            <span>工单管理平台 >> 新建工单</span>
        </div>
        <div class="providerAdd providerUpdate">
        	<form class ="orderAddForm" action="">
            	<!--div的class 为error是验证错误，ok是验证成功-->
                <div class="updateLeft">
                    <div>
                        <label for="address">客户住址：</label>
                        <input type="text" name="address"  class="address" value="" placeholder="请输入用户住址"/>
                        <span><label for="address" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userphone">联系方式：</label>
                        <input type="text" name="userphone"  value="" placeholder="请输入用户联系方式"/>
                        <span ><label for="userphone" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="appointmenttime">预约时间：</label>
                        <input type="datetime-local" class="appointmenttime" name="appointmenttime" value="2018-03-13T13:59:59"/>
                        <span><label for="appointmenttime" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                </div>

                <div class="updateRight">
                    <div>
                        <label for="starttime">派单时间：</label>
                        <input type="datetime-local" class="starttime" name="starttime" value="2018-03-13T13:59:59"/>
                        <span><label for="starttime" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="tabletype">故障类型：</label>
                        <select class="select2" name="tabletype" style="width: 100px;">
                         	 <option value="">--请选择--</option>
	                         <option value="1">电信</option>
	                         <option value="2">深澜</option>
	                         <option value="3">端口</option>
                        </select>
                        <span><label for="tabletype" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="startname">派 &nbsp;单  人：</label>
                        <select class="select2" name="startname"  style="width: 100px;">
                        <option value="">--请选择--</option>
	                        <c:forEach items="${allManage }" var="manage">
	                        	<option value="${manage.id }">${manage.realname }</option>
	                        </c:forEach>
                        </select>
                        <span><label for="startname" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                </div>
                <div class="clear_lr"></div>
                <div class="buttomDiv">
                    <label for="description">故障描述：</label>
                    <textarea rows="3" name="description" class="description"></textarea>
                    <span><label for="description" generated="true" class="error" style="width: auto;"></label></span>
                </div>
                <div class="providerAddBtn">
                    <a href="#" onclick="addOrder()">添加工单</a>
                    <a href="#"  onclick="history.back(-1)">返回</a>
                </div>
            </form>
    	</div>
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
<!-- 引入表单验证插件-->
	<script type="text/javascript">
		//提交表单的请求
		function addOrder(){
			//判断是否通过表单校验
			if(validform().form()){//如果表单校验通过
				$.ajax({
					"async":false,//同步提交
					"url":"${pageContext.request.contextPath}/orderAdd.action",
					"data":$(".orderAddForm").formSerialize(),
					"type":"POST",
					"dataType":"json",
					"success":function(data){
						var flag = data.addSuccess;
						if(flag){
							if(confirm("添加成功！是否继续添加？")){
								//添加成功后置空表单
								$(".orderAddForm").reset();
								var date = new Date();
								var foramtDate = date.Format("yyyy-MM-ddTHH:mm:ss");
								$(".appointmenttime").val(foramtDate);
								$(".starttime").val(foramtDate);
							}else {
								location.href = "${pageContext.request.contextPath}/showUnfinishOrder.action";
							}
						}else{
							alert("添加失败！请联系管理员！");
						}
					}
				});
			}
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
				return $(".orderAddForm").validate({
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
		//一面加载完后开始进行表单验证开始进行表单验证
		$(function(){
			validform();
			//页面时间初始化
			var date = new Date();
			var foramtDate = date.Format("yyyy-MM-ddTHH:mm:ss");
			$(".appointmenttime").val(foramtDate);
			$(".starttime").val(foramtDate);
		});
		$(validform()); 
		
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