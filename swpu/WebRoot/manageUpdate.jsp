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
            margin-left: 70px;
            padding-right: 10px;
            text-align: left;
            float: left;
        }
        .updateLeft div, .updateRight div{
        	width: 500px;
        	margin-bottom: 25px;
        	margin-top: 25px;
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
            margin-bottom: 20px;
            margin-top: 43px
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
            <span>用户管理页面 >> 用户修改页面</span>
        </div>
        <div class="providerAdd providerUpdate">
        	<form class ="updateForm" action="">
            	<!--div的class 为error是验证错误，ok是验证成功-->
                <div class="updateLeft">
                    <div>
                        <label for="userId">用户学号：</label>
                        <input type="text" name="id"  class="id" value="${thisManage.id }" placeholder="请输入学号"/>
                        <span><label for="id" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userName">用户姓名：</label>
                        <input type="text" name="realname"  value="${thisManage.realname }" placeholder="请输入用户真实姓名"/>
                        <span ><label for="realname" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userpassword">原来密码：</label>
                        <input type="password" name="oldPassword"  placeholder="请输入原密码验证"/>
                        <span><label for="oldpassword" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userpassword">新的密码：</label>
                        <input type="password" name="password" class="password" placeholder="密码长度必须大于4位小于20位"/>
                        <span><label for="password" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userRemi">确认密码：</label>
                        <input type="password" name="repwd"  placeholder="与密码一致"/>
                        <span><label for="repwd" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label >用户性别：</label>

                        <select name="sex">
                            <option value="1" <c:if test="${thisManage.sex==1 }">selected</c:if> >男</option>
                            <option value="2" <c:if test="${thisManage.sex==2 }">selected</c:if> >女</option>
                        </select>
                        <span></span>
                    </div>
                </div>

                <div class="updateRight">
                    <div>
                        <label for="data">身份证号：</label>
                        <input type="text" name="idcard"   value="${thisManage.idcard }" placeholder="身份证不能为空且为18位"/>
                        <span ><label for="idcard" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="data">年级专业：</label>
                        <input type="text" name="major"  value="${thisManage.major }" placeholder="请输入年级专业"/>
                        <span ><label for="major" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="data">用户 QQ：</label>
                        <input type="text" name="qq"  value="${thisManage.qq }" placeholder="请输入可用qq号"/>
                        <span ><label for="qq" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userphone">电话号码：</label>
                        <input type="text" name="phone"  value="${thisManage.phone }" placeholder="手机号长度11位"/>
                        <span ><label for="phone" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div>
                        <label for="userAddress">用户地址：</label>
                        <input type="text" name="address" value="${thisManage.address }" placeholder="输入住址如s17-110"/>
                        <span ><label for="address" generated="true" class="error" style="width: auto;"></label></span>
                    </div>
                    <div class="typeDiv" style="display: none">
	                     <label >用户类别：</label>
	                     <input type="radio" name="type" value="1" <c:if test="${thisManage.type==1 }">checked</c:if> />组长
	                     <input type="radio" name="type" value="2" <c:if test="${thisManage.type==2 }">checked</c:if> />业务员
                 	</div>
                </div>
                <div class="clear_lr"></div>
                
                <div class="providerAddBtn">
                    <a href="javascript:void(0)" onclick="javascript:updateManage();return false;">确认修改</a>
                    <a href="#"  onclick="history.back(-1)">返回</a>
                    <!--<input type="submit" value="确认修改" onclick=""/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>-->
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
		//自定义校验规则  在后台校验原密码是不是和用户的学号匹配
		 jQuery.validator.addMethod(
				 //自定义规则的名称
				"checkOldPassword",
				//校验的函数
				function(value,element,params){
					 //获取用户的ID 在后台进行密码校验
					 var id = $(".id").val();
					 //alert(id+"    "+value);
				//定义一个标志
				var flag = false;
				//value:输入的内容
				//element:被校验的元素对象
				//params：规则对应的参数值
				//目的：对输入的username进行ajax校验
				jQuery.ajax({
					"async":false,//同步提交
					"url":"${pageContext.request.contextPath}/checkOldPassword.action",
					"data":{"oldPassword":value,"userId":id},
					"type":"POST",
					"dataType":"json",
					"success":function(data){
						flag = data.isRight;
					}
				});
				//返回true代表该校验器不通过
				return flag;
			}
			
		); 
		//定义校验函数
		function validform() {
			return $(".updateForm").validate({
				rules:{
					"id":{
						"required":true
					},
					"oldPassword":{
						"required":true,
						"checkOldPassword":true
					},
					"realname":{
						"required":true
					},
					"password":{
						"rangelength":[4,16]
					},
					"repwd":{
						"rangelength":[4,16],
						"equalTo":".password"
					},
					"major":{
						"required":true
					},
					"qq":{
						"required":true
					},
					"address":{
						"required":true
					},
					"phone":{
						"required":true,
						"rangelength":[11,11]
					},
					"idcard":{
						"required":true,
						"rangelength":[18,18]
					}
				},
				messages:{
					"id":{
						"required":"*用户名不能为空"
					},
					"oldPassword":{
						"required":"*原密码不能为空",
						"checkOldPassword":"*原密码不正确"
					},
					"realname":{
						"required":"*真实姓名不能为空"
					},
					"password":{
						"rangelength":"*密码长度4-16位"
					},
					"repwd":{
						"rangelength":"*密码长度4-16位",
						"equalTo":"*两次密码不一致"
					},
					"major":{
						"required":"*年级专业不能为空"
					},
					"qq":{
						"required":"*qq号不能为空"
					},
					"address":{
						"required":"*地址不能为空"
					},
					"phone":{
						"required":"*手机号不能为空",
						"rangelength":"*手机号长度11位"
					},
					"idcard":{
						"required":"*身份证不能为空",
						"rangelength":"*身份证长度18位",
					}
				}
			});
		}  
		//一面加载完后开始进行表单验证开始进行表单验证
		$(function(){
			validform();
		});
		$(validform()); 
		
	</script>
 	<script type="text/javascript">
		function updateManage(){
			//alert(validform().form());
			//判断是否通过表单校验
			if(validform().form()){//如果表单校验通过
				$.ajax({
					"async":false,//同步提交
					"url":"${pageContext.request.contextPath}/manageUpdate.action",
					"data":$(".updateForm").formSerialize(),
					"type":"POST",
					"dataType":"json",
					"success":function(data){
						var flag = data.updateSuccess;
						if(flag){
							//判断用户的修改模式 1.自己修改自己的 2. 自己修改别人的
							//当前登陆者id
							var userId = $("#userid").val();
							//被修改的人的id
							var thisId = $(".id").val();
							//alert(userId+"++++++"+thisId);
							if(userId == thisId) {
								alert("修改成功，请到登录页重新登陆！");
								location.href = "${pageContext.request.contextPath }/logout.action";
							}else {
								location.href = "${pageContext.request.contextPath }/manageList.action";
							}
						}else{
							alert("修改失败！请尝试重新修改");
						}
					}
				});
			}
			
		}
	</script>
	<script type="text/javascript">
		//验证当前用户是不是组长， 如果是组长 ，显示用户类别修改框
		var logintype = $("#userType").val();
		//alert(logintype);
		if(logintype == 1){
			$(".typeDiv").show();
		}
	</script>
</body>
</html>