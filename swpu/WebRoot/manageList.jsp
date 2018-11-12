<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="pageutil" uri="http://stutem.met.swpu.edu.cn/common/"%>
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
    <!-- Bootstrap Core CSS -->
	<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet"/>
    <style type="text/css">
    	/* body { 
    		overflow-y: hidden	; 
    	}  */
		.error{
			width:auto;
			text-align:left;
			color:#faca0d
		}
        /*查看部分的样式*/
        .providerView .viewRight{
            text-align: left;
            float: left;
            margin-left: 100px;
        }
        .providerView .viewLeft{
            text-align: left;
            margin-left: 100px;
            float: left;
        }
        .clear_lr{
            clear: both;
        }
        .providerView{
            text-align: center;
            padding-bottom: 5px;
            font-size: 13px;
            line-height: 25px;
        }
        .providerView a {
            /*margin-left: 520px;
            position: relative;
            top: 0px;*/
            width:80px;
            margin-top: 20px;
            margin-left:20px;
            text-align: center;
        }
        .hidetr{
            display: none;
        }
        .pageDiv{
        	text-align: right;
        }
        .pagination{
        	text-align: right;
        }
        
        	/* 	分页的定位 */
	
	.footer{
		position: relative;
	}
	.pageDiv{
		position: absolute;
		top: 530px;
		right: 36px;
	}
	.pageDiv ul{
		margin: 10px 0px; 
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
            <span>业务员信息管理页面</span>
        </div>
        <div class="search">
        	<form action="${pageContext.request.contextPath }/manageList.action" method="post">
	            <span>
	            	<select name="condition">
	            		<option value="">&nbsp;&nbsp;&nbsp;&nbsp;--请选择--</option>
	            		<option value="1" <c:if test="${condition == 1 }">selected</c:if> >&nbsp;&nbsp;&nbsp;&nbsp;学生学号</option>
	            		<option value="2" <c:if test="${condition == 2 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;学生性别</option>
	            		<option value="3" <c:if test="${condition == 3 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;年级专业</option>
	            		<option value="4" <c:if test="${condition == 4 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;真实名字</option>
	            		<option value="5" <c:if test="${condition == 5 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;电话号码</option>
	            		<option value="6" <c:if test="${condition == 6 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;宿舍地址</option>
	            		<option value="7" <c:if test="${condition == 7 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;身份证号</option>
	            	</select>
	            </span>
	            <input type="text" name="selectString" value="${selectString }"  placeholder="请输入查询的字段" style="margin-right: 20px;"/>
	            <input type="submit" value="查   询" style="width: 80px;font-size: 12px;"/>
	            <%-- <a href="${pageContext.request.contextPath }/manageAdd.jsp">添加用户</a> --%>
	            <a href="javascript:void(0)" onclick="checkAddPower()">添加用户</a>
            </form>
        </div>
        <!--用户-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="13%">用户编码</th>
                <th width="10%">用户姓名</th>
                <th width="13%">电话</th>
                <th width="10%">地址</th>
                <th width="10%">性别</th>
                <th width="13%">专业</th>
                <th width="10%">用户类型</th>
                <th width="26%">操作</th>
            </tr>

            <c:forEach items="${page.rows }" var="manage">
                <tr>
                    <td>${manage.id }</td>
                    <td>${manage.realname }</td>
                    <td>${manage.phone }</td>
                    <td>${manage.address }</td>
                    <td>
                        <c:choose>
                            <c:when test="${manage.sex==1 }">男</c:when>
                            <c:when test="${manage.sex==2 }">女</c:when>
                            <c:otherwise></c:otherwise>
                        </c:choose>
                    </td>
                    <td>${manage.major }</td>
                    <td>
                        <c:choose>
                            <c:when test="${manage.type==1 }">组长</c:when>
                            <c:when test="${manage.type==2 }">业务员</c:when>
                            <c:otherwise></c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <!-- ${pageContext.request.contextPath }/operateManage.action?operate=manageView&id=${manage.id } -->
                        <a href="javascript:void(0)" onclick="viewButton($(this))"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="${pageContext.request.contextPath }/operateManage.action?operate=manageUpdateRequest&id=${manage.id }"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="javascript:void(0)" onclick="checkDelPower(${manage.id },$(this))" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
               <!--  用户详情的隐藏框 -->
                <tr class="hidetr" onmouseout="hideThisTr()">
                    <td colspan="8">
                        <div class="providerView">
                            <div class="viewLeft">
                                <p><strong>用户学号：</strong><span>${manage.id }</span></p>
                                <p><strong>真实姓名：</strong><span>${manage.realname }</span></p>
                                <p><strong>用户性别：</strong><span>
				            	<c:choose>
				            		<c:when test="${manage.sex==1 }">男</c:when>
				                    <c:when test="${manage.sex==2 }">女</c:when>
				                    <c:otherwise></c:otherwise>
				                </c:choose>
				            </span></p>
                                <p><strong>qq号码：</strong><span>${manage.qq }</span></p>
                                <p><strong>用户电话：</strong><span>${manage.phone }</span></p>
                                <p><strong>用户地址：</strong><span>${manage.address }</span></p>
                                <p><strong>用户类别：</strong><span>
				            			<c:choose>
				                            <c:when test="${manage.type==1 }">组长</c:when>
				                            <c:when test="${manage.type==2 }">业务员</c:when>
				                            <c:otherwise></c:otherwise>
				                        </c:choose>
				                        </span></p>
                            </div>
                            <div class="viewRight">
                                <p><strong>年级专业：</strong><span>${manage.major }</span></p>
                                <p><strong>身份证号：</strong><span>${manage.idcard }</span></p>
                                <p><strong>创建时间：</strong><span>${manage.createdate }</span></p>
                                <p><strong>最后登陆时间：</strong><span>${manage.lastlogintime }</span></p>
                                <p><strong>最后修改时间：</strong><span>${manage.changetime }</span></p>
                                <p><strong>修改人：</strong><span>${manage.changeby }</span></p>
                            </div>
                            <div class="clear_lr"></div>
                            <%-- <a href="${pageContext.request.contextPath }/manageList.action">返回列表</a>
                            <a href="${pageContext.request.contextPath }/operateManage.action?operate=manageView&id=${manage.id }">修改信息</a> --%>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div class="pageDiv">
			<pageutil:page url="${pageContext.request.contextPath }/manageList.action" />
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
<script type="text/javascript">
    function viewButton(thisTag){
        thisTag.parent().parent().next().toggle();
    };
    function hideThisTr(){
        $(".hidetr").hide();
    };
    
    //添加用户
    function checkAddPower(){
    	if(checkPower()){
    		location.href = "${pageContext.request.contextPath }/manageAdd.jsp";
		}else {
			alert("对不起，您没有权限！仅组长可以添加用户");
		}
    }
    
    //删除用户
    function checkDelPower(id, thisa){
    	//alert(checkPower());
    	if(checkPower()){
    		//ajax删除用户
    		if(confirm("确认删除该成员？")) {
    			$.ajax({
    	  			"async":true,
    	  			"url":"${pageContext.request.contextPath }/deleteManage.action",
    	  			"data":{"userId":id},
    	  			"type":"POST",
    	  			"dataType":"json",
    	  			"success":function(data){
    	  				if(data.delSuccess) {
    	  					//删除成功
    	  					thisa.parent().parent().remove();
    	  				}
    	  				
    	  			},
    	  			error:function(){
    	  				alert("错误！！！");
    	  			}
        		});
    		}
		}else {
			alert("对不起，您没有权限！仅组长可以删除用户");
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