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
            margin-left: 10px;
        }
        .providerView .viewLeft{
            text-align: left;
            margin-left: 10px;
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
        .buttonDiv{
        	text-align: left;
        	margin-left: 10px;
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
        	<form action="${pageContext.request.contextPath }/showOrderPage.action" method="post">
	            <span>
	            	<select name="condition">
	            		<option value="">&nbsp;&nbsp;&nbsp;&nbsp;--请选择--</option>
	            		<option value="1" <c:if test="${condition == 1 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;工单编号</option>
	            		<option value="2" <c:if test="${condition == 2 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;用户地址</option>
	            		<option value="3" <c:if test="${condition == 3 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;用户电话</option>
	            		<option value="4" <c:if test="${condition == 4 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;故障描述</option>
	            		<option value="5" <c:if test="${condition == 5 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;派单姓名</option>
	            		<option value="6" <c:if test="${condition == 6 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;故障原因</option>
	            		<option value="7" <c:if test="${condition == 7 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;解决方法</option>
	            		<option value="8" <c:if test="${condition == 8 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;登单姓名</option>
	            		<option value="9" <c:if test="${condition == 9 }">selected</c:if>>&nbsp;&nbsp;&nbsp;&nbsp;工单类型</option>
	            	</select>
	            </span>
	            <input type="text" name="selectString" value="${selectString }"  placeholder="请输入查询的字段" style="margin-right: 20px;"/>
	            <input type="submit" value="查   询" style="width: 80px;font-size: 12px;"/>
	            <%-- <a href="${pageContext.request.contextPath }/manageAdd.jsp">添加用户</a> --%>
	            <a href="${pageContext.request.contextPath }/toOrderAdd.action">新建工单</a>
            </form>
        </div>
        <!--用户-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="13%">工单编码</th>
                <th width="10%">派单人</th>
                <th width="13%">用户电话</th>
                <th width="10%">用户地址</th>
                <th width="13%">完工时间</th>
                <th width="23%">完工人</th>
                <th width="23%">操作</th>
            </tr>

            <c:forEach items="${page.rows }" var="order">
                <tr>
                    <td>${order.id }</td>
                    <td>${order.startnamestring }</td>
                    <td>${order.userphone }</td>
                    <td>${order.address }</td>
                    <td>${order.endtimeString }</td>
                    <td>
                        <c:forEach items="${order.orderends }" var="end">
                        	<span>${end.manageInfo.realname }</span>
                        </c:forEach>
                    </td>
                    <td>
                        <!-- ${pageContext.request.contextPath }/operateorder.action?operate=manageView&id=${order.id } -->
                        <a href="javascript:void(0)" onclick="viewButton($(this))"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="${pageContext.request.contextPath }/toUpdateOrder.action?orderId=${order.id }&changeBy=${user.id }" class="updateOrder"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="javascript:void(0)" onclick="checkDelPower(${order.id },$(this))" class="removeOrder"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
               <!--  用户详情的隐藏框 -->
                <tr class="hidetr" onmouseout="hideThisTr()">
                    <td colspan="7">
                        <div class="providerView">
                            <div class="viewLeft">
                                <p><strong>工单编号：</strong><span>${order.id }</span></p>
                                <p><strong>客户住址：</strong><span>${order.address }</span></p>
                                <p><strong>联系方式：</strong><span>${order.userphone }</span></p>
                                <p><strong>用户姓名：</strong><span>${order.username }</span></p>
                                <p><strong>工单类型：</strong><span>
				            	<c:choose>
				            		<c:when test="${order.tabletype==1 }">电信</c:when>
				                    <c:when test="${order.tabletype==2 }">Srun</c:when>
				                    <c:when test="${order.tabletype==3 }">端口</c:when>
				                    <c:otherwise></c:otherwise>
				                </c:choose>
				            	</span></p>
                                
                            </div>
                            <div class="viewRight">
                            	<p><strong>派单人员：</strong><span>${order.startnamestring }(${order.startname })</span></p>
                            	<p><strong>处理人员：</strong><span>
                                	<c:forEach items="${order.orderends }" var="end">
			                        	<span>${end.manageInfo.realname }</span>
			                        </c:forEach>
                                </span></p>
                            	<p><strong>预约时间：</strong><span>${order.appointmenttimeString }</span></p>
                                <p><strong>派单时间：</strong><span>${order.starttimeString }</span></p>
                                <p><strong>解决时间：</strong><span>${order.endtimeString }</span></p>
							</div>
                            <div class="viewRight">
                                <p><strong>工单状态：</strong><span>
                                <c:choose>
                                	 <c:when test="${order.station==1 }">未派工</c:when>
                                	 <c:when test="${order.station==2 }">正在派工</c:when>
			                         <c:when test="${order.station==3 }">已完工</c:when>
			                         <c:otherwise></c:otherwise>
			                     </c:choose>
                                </span></p>
                                <p><strong>设备使用：</strong><span>端口${order.duankou }个，面板${order.mianban }个，水晶头${order.shuijingtou }，网线${order.wangxian }条</span></p>
                                <p><strong>最后修改时间：</strong><span>${order.changedateString }</span></p>
                                <p><strong>修改人：</strong><span>${order.changenamestring }</span></p>
                            </div>
                            <div class="clear_lr"></div>
                            <div class="buttonDiv">
                            	<p><strong>故障描述：</strong><span>${order.description }</span></p>
                                <p><strong>具体原因：</strong><span>${order.reason }</span></p>
                                <p><strong>解决方法：</strong><span>${order.solve }</span></p>
                            
                            </div>
                            <%-- <a href="${pageContext.request.contextPath }/manageList.action">返回列表</a>
                            <a href="${pageContext.request.contextPath }/operateorder.action?operate=manageView&id=${order.id }">修改信息</a> --%>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div class="pageDiv">
			<pageutil:page url="${pageContext.request.contextPath }/showOrderPage.action" />
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
	$(function(){
		var result = checkPower();//检查用户的权限，如果不是组长，隐藏签到表管理按钮
		if(!result){
			$(".removeOrder").hide();
			$(".updateOrder").hide();
		}
		
	});
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
    		if(confirm("该操作不可恢复，确认删除该工单？")) {
    			$.ajax({
    	  			"async":true,
    	  			"url":"${pageContext.request.contextPath }/deleteOrder.action",
    	  			"data":{"orderId":id},
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
			alert("对不起，您没有权限！仅组长可以删除工单");
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