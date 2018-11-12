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
	<link href="<%=basePath%>css/reveal.css" rel="stylesheet"/>
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
        .alltr{
			background-color: #FFFFFF!important;
		}
        .color1{
        	background-color: #FFFFFF!important;
        }
        .color2{
        	background-color: #F6F7F9!important;
        } 
        .trover{
        	background-color: #E9F9CA!important;
        }
		.providerAddBtn{
			text-align: center;
			margin: 0 auto;
			padding: 0px;
			margin: 0px;
		}
		.providerTable td a{
			margin-top: 0px;
			margin-right: 0px;
		}
		.providerAddBtn a{
			width: 63px;
		    height: 30px;
		    line-height: 30px;
		    padding-left: 0px;
		    margin: 0px;
		}
		td span{
			font-size: 14px;
		}
		.search {
		    height: 35px;
		    line-height: 35px;
		    background: none;
		}
		.search .firsta{
			background: red;
		}
		.search a{
			margin: 5px 20px;
		}
		#addTable th,td{
			font-size: 13px;
		}
		.pai a{
			text-decoration:none; 
			border-bottom:1px solid blue; /* #ccc换成链接的颜色 */
			display: inline-block; 
			padding-bottom:1px;  /*这里设置你要空的距离*/
		}
		.pai a:link    {color:blue;text-decoration:none;}
		.pai a:visited {color:blue;}
		.pai a:hover   {color:#CC3300;}
		.pai a:active  {color:yellow;}
		
		.search select {
		    margin: 0px 0px 0px 0px;
		    width: 60px;
		    height: 30px;
		    border-radius: 4px;
		    border: 1px solid #0c89de;
		    outline: none;
		}
		.search input {
			margin-bottom: 0px;
    		margin-right: 0px;
    		width: 50px;
   		    padding: 6px 5px;
		}
		
	/* 	分页的定位 */
	
	.footer{
		position: relative;
	}
	.pageDiv{
		position: absolute;
		top: 520px;
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
            <span>工单管理首页(未完工工单列表)</span>
        </div>
        <div class="search">
        	<!-- <span style="font-weight: 700;font-size: 22px;margin-left: 300px;">未&nbsp;&nbsp;完&nbsp;&nbsp;工&nbsp;&nbsp;工&nbsp;&nbsp;单&nbsp;&nbsp;列&nbsp;&nbsp;&nbsp;表</span> -->
        	<a class="firsta" href="${pageContext.request.contextPath }/showOrderPage.action">工单列表</a>
        	<a href="${pageContext.request.contextPath }/toOrderAdd.action">新建工单</a>
        </div>
        <!--用户-->
        <table class="providerTable" id="addTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="12%">工单编号</th>
                <th width="8%">工单类型</th>
                <th width="8%">地址</th>
                <th width="10%">联系电话</th>
                <th width="13%">预约时间</th>
                <th width="10%">派单人</th>
                <th width="13%">派单时间</th>
                <th width="26%" colspan="2">操作</th>
            </tr>

            <c:forEach items="${page.rows }" var="order" varStatus="status">
                <tr class="alltr tr${status.index }">
                    <td>${order.id }</td>
                    <td>
                    	<c:choose>
                            <c:when test="${order.tabletype==1 }">电信</c:when>
                            <c:when test="${order.tabletype==2 }">深澜</c:when>
                            <c:when test="${order.tabletype==3 }">端口</c:when>
                            <c:otherwise></c:otherwise>
                        </c:choose>
                    </td>
                    <td>${order.address }</td>
                    <td>${order.userphone }</td>
                    <td>${order.appointmenttimeString }</td>
                    <td>${order.startnamestring }</td>
                    <td>${order.starttimeString }</td>
                    <c:choose>
                         <c:when test="${order.station==1 }">
                         	<td rowspan="2" width="10%"><span>未派工</span></td>
                         	<td rowspan="2" width="16%">
                         	
	                         	<div class="search" style="padding-left: 0px;">
						        	<form class="chuDanForm" action="" method="post">
							            <span>
							            	<select name="realname" id="realname">
						                    	<c:forEach items="${allManage }" var="manage">
						                    		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
						                    	</c:forEach>
						                    </select>
							            </span>
							            <div class="providerAddBtn" style="float: right;margin: 0px 25px 0px 0px; ">
						                   <a href="javascript:void(0)" onclick="chuDan(${order.id },$(this))" style="margin-left: 5px;">派&nbsp;工</a>
						                </div>
						                <div style="clear: both;"></div>
						            </form>
						        </div>
						        
						        
						      	<!-- 该div是当点击派工后显示的     页面加载时处于隐藏状态-->
						        <%-- <div class="providerAddBtn" style="display: none;">
	                          		<!-- 完工和取消派工 -->
				                   <a href="${pageContext.request.contextPath }/finishOrder.action?orderId=${order.id }" style="margin-right: 5px;margin-left: 0px;">完&nbsp;工</a>
				                   <a href="javascript:void(0)" onclick="exitChudan(${order.id },$(this))" style="margin-left: 10px;">取&nbsp;消</a>
				                </div> --%>
	                		</td>
                         </c:when>
                         
                         
                         <c:when test="${order.station==2 }">
                         	<td rowspan="2" width="10%"><span class="pai"><a href="javascrip:void(0)" onclick="showchudanInf($(this))">正在派工. . .</a> </span></td>
                         	<td rowspan="2" width="13%">
	                          	<div class="providerAddBtn">
	                          		<!-- 完工和取消派工 -->
				                   <a href="${pageContext.request.contextPath }/finishOrder.action?orderId=${order.id }" style="margin-right: 5px;margin-left: 0px;">完&nbsp;工</a>
				                   <a href="javascript:void(0)" onclick="exitChudan(${order.id },$(this))" style="margin-left: 10px;">取&nbsp;消</a>
				                </div>
				                
				             	<!--  这个div会在点击取消派单过后显示     页面加载时处于隐藏状态  start-->
				                
						        <%-- <div class="search" style="padding-left: 0px;display: none;">
						        	<form class="chuDanForm" action="" method="post">
							            <span>
							            	<select name="realname" id="realname">
						                    	<c:forEach items="${allManage }" var="manage">
						                    		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
						                    	</c:forEach>
						                    </select>
							            </span>
							            <div class="providerAddBtn" style="float: right;margin: 0px 25px 0px 0px; ">
						                   <a href="javascript:void(0)" onclick="chuDan(${order.id },$(this))" style="margin-left: 5px;">派&nbsp;工</a>
						                </div>
						                <div style="clear: both;"></div>
						            </form>
						        </div> --%>
						        <!--    这个div会在点击取消派单过后显示     end-->
						        
				                
	                		</td>
                         </c:when>
                         <c:when test="${order.station==3 }">已完工</c:when>
                         <c:otherwise></c:otherwise>
                     </c:choose>
                    	
                </tr>
               <!--  用户详情的隐藏框 class="hidetr" onmouseout="hideThisTr()" -->
                <tr class="alltr tr${status.index }"  >
                    <th>故障描述:</th>
                    <td colspan="6" style="font-size:14px; text-align: left;font-style: normal;">${order.description }</td>
                </tr>
                <tr class="chudanInfo" style="background-color: #538ED1; display: none;">
                	<th>出单地址&nbsp;：&nbsp;${order.address }</th>
					<th colspan="2">出&nbsp;单&nbsp;人&nbsp;：&nbsp;&nbsp;${order.chudan.realname }</th>   
	                <th colspan="2">出单人电话&nbsp;：&nbsp;${order.chudan.phone }</th>
	                <th colspan="2">出单时间&nbsp;：&nbsp;${order.chudandatesString }</th> 
	                <th colspan="2">累计时长&nbsp;：&nbsp;${order.dateDiff }</th>  
	            </tr>
            </c:forEach>
        </table>
        <div class="pageDiv">
			<pageutil:page url="${pageContext.request.contextPath }/showUnfinishOrder.action" />
		</div>
    </div>
    
    <!-- 弹框信息 -->
	<div id="myModal" class="reveal-modal">
	    <h3>出单信息详情</h3>
	    <table width="100%">
	    	<tr><th>出单人姓名:</th><td>${order.chudan.realname }</td></tr>
	    	<tr><th>出单人电话：</th><td>${order.chudan.phone }</td></tr>
	    	<tr><th>出单时间:</th><td>${order.chudandatesString }</td></tr>
	    </table>
		<a class="close-reveal-modal">×</a>
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
<script type="text/javascript" src="js/jquery.reveal.js"></script>
<script type="text/javascript">

	//显示出单详情的方法
 	function showchudanInf(thisa){
 		var station = thisa.parent().parent().parent().next().next().css("display");
 		//alert(station);
 		if(station != "none"){//如果隐藏的tr已经显示
 			$(".chudanInfo").hide();
 		}else {
 			thisa.parent().parent().parent().next().next().toggle();
 		}
 		
 	}
 	
 	//取消派工的方法
 	function exitChudan(orderId,thisOrder){
 		if(confirm("是否确认取消派工？")) {
   			$.ajax({
   	  			"async":true,
   	  			"url":"${pageContext.request.contextPath }/exitChudan.action",
   	  			"data":{"orderId":orderId},
   	  			"type":"POST",
   	  			"dataType":"json",
   	  			"success":function(data){
   	  				if(data.exitSuccess) {
   	  					//取消成功    页面按钮切换
   	  					/* $(thisOrder).parent().parent().prev().html("未派工");
   	  					$(thisOrder).parent().hide();
   	  					$(thisOrder).parent().next(".search").show(); */
   	  					location.href="${pageContext.request.contextPath }/showUnfinishOrder.action";
   	  				}
   	  			},
   	  			error:function(){
   	  				alert("错误！！！");
   	  			}
       		});
   		}
 	}
 	
 	
 	//取消派工的方法
 	function chuDan(orderId,thisOrder){
 		$.ajax({
  			"async":true,
  			"url":"${pageContext.request.contextPath }/chuDan.action?orderId="+orderId,
  			"data":$(thisOrder).parent().parent().formSerialize(),
  			"type":"POST",
  			"dataType":"json",
  			"success":function(data){
  				if(data.chuDanSuccess) {
  					//派工成功    页面按钮切换
  					/* $(thisOrder).parent().parent().parent().parent().prev().html("<span class='pai'><a href='javascrip:void()' class='big-link' data-reveal-id='myModal'>正在派工. . .</a> </span>");
  					$(thisOrder).parent().parent().parent().hide();
  					$(thisOrder).parent().parent().parent().next(".providerAddBtn").show(); */
  					window.location.href="${pageContext.request.contextPath }/showUnfinishOrder.action";
  				}
  			},
  			error:function(){
  				alert("错误！！！");
  			}
   		});
 	}
	
 	$(function(){
 		
 		//设置每两行一个颜色
		$("#addTable tr").each(function(i){
			if(i%2==0){
				$(".tr"+i).addClass("color1");
			}else {
				$(".tr"+i).addClass("color2");
			}
		});
		
		 //鼠标移入该行和鼠标移除该行的事件
        $("#addTable tr").mouseover(function () {
        	var trIndex = $(this).attr("class").substring(6,9);
        	//alert(trIndex);
            $("."+trIndex).addClass("trover");
        }).mouseout(function () {
        	var trIndex = $(this).attr("class").substring(6,9);
        	 $("."+trIndex).removeClass("trover");
        });
		
	}); 
</script>
</body>
</html>