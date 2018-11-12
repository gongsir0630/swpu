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
            margin-left: 20px;
        }
        .providerView .viewLeft{
            text-align: left;
            margin-left: 20px;
            float: left;
        }
        .providerView .viewMiddle{
            text-align: left;
            margin-left: 20px;
            float: left;
        }
        .providerView strong{
        	width: 80px;
        	text-align: right;
        }
        .providerView .row{
        	text-align: left;
        	margin-left: 20px;
        }
        .providerView .viewLeft,.viewRight,.viewMiddle{
        	width: 370px;
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
            <span>签到信息管理页面</span>
        </div>
        <div class="search">
        	<form action="${pageContext.request.contextPath }/signList.action" method="post">
	            <span>
	            	<select name="condition" style="width: 110px;">
	            		<option value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--请选择--</option>
	            		<option value="1" <c:if test="${condition == 1 }">selected</c:if> >&nbsp;&nbsp;&nbsp;&nbsp;签到表编号</option>
	            		<option value="2" <c:if test="${condition == 2 }">selected</c:if> >&nbsp;&nbsp;&nbsp;&nbsp;填写人编号</option>
	            		<option value="3" <c:if test="${condition == 3 }">selected</c:if> >&nbsp;&nbsp;&nbsp;&nbsp;确认人编号</option>
	            		<option value="4" <c:if test="${condition == 4 }">selected</c:if> >&nbsp;&nbsp;&nbsp;&nbsp;该班备注</option>
	            	</select>
	            </span>
	            <input type="text" name="selectString" value="${selectString }"  placeholder="请输入查询的字段" style="margin-right: 20px;"/>
	            <input type="submit" value="查   询" style="width: 80px;font-size: 12px;"/>
            </form>
        </div>
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="15%">签到表编号</th>
                <th width="45%">值班人员</th>
                <th width="10%">填写人姓名</th>
                <th width="10%">确认人姓名</th>
                <th width="20%">操作</th>
            </tr>

            <c:forEach items="${page.rows }" var="sign">
                <tr>
                    <td>${sign.id }</td>
                    <td>
                    	<c:forEach items="${sign.watchsArray }" var="watch">
                    		${watch.realName }&nbsp;&nbsp;&nbsp;
                    	</c:forEach>
                    </td>
                    <td>${sign.create }</td>
                    <td>${sign.confir}</td>
                    <td>
                        <!-- ${pageContext.request.contextPath }/operatesign.action?operate=manageView&id=${sign.id } -->
                        <a href="javascript:void(0)" onclick="viewButton($(this))"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="javascript:void(0)" onclick="updateButton(${sign.id })" class="updateSign"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="javascript:void(0)" onclick="deleteSign(${sign.id },$(this))" class="removeSign"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
               <!--  用户详情的隐藏框 -->
                <tr class="hidetr" onmouseout="hideThisTr()"><!-- onmouseout="hideThisTr()" -->
                    <td colspan="5">
                        <div class="providerView">
                            <div class="viewLeft">
                                <p><strong>编&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</strong><span>${sign.id }</span></p>
                                <p><strong>创建时间：</strong><span>${sign.createtime }</span></p>
                                <p><strong>当日星期：</strong><span>
                                	<c:choose>
				                        <c:when test="${sign.week==1 }">星期一</c:when>
				                        <c:when test="${sign.week==2 }">星期二</c:when>
				                        <c:when test="${sign.week==3 }">星期三</c:when>
				                        <c:when test="${sign.week==4 }">星期四</c:when>
				                        <c:when test="${sign.week==5 }">星期五</c:when>
				                        <c:when test="${sign.week==6 }">星期六</c:when>
				                        <c:when test="${sign.week==7 }">星期日</c:when>
				                        <c:otherwise>未填写</c:otherwise>
				                    </c:choose>
                                </span></p>
                                <p><strong>本班班次：</strong><span>
                                	<c:choose>
				                        <c:when test="${sign.banci==1 }">上午1、2</c:when>
				                        <c:when test="${sign.banci==2 }">上午3、4、5</c:when>
				                        <c:when test="${sign.banci==3 }">下午6、7</c:when>
				                        <c:when test="${sign.banci==4 }">下午8、9</c:when>
				                        <c:when test="${sign.banci==5 }">晚上10、11、12</c:when>
				                        <c:otherwise>未填写</c:otherwise>
				                    </c:choose>
                                
                                </span></p>
                                <p><strong>创&nbsp;建&nbsp;者：</strong><span>${sign.create }(${sign.createname })</span></p>
                                <p><strong>确&nbsp;认&nbsp;者：</strong><span>${sign.confir }(${sign.confirmname })</span></p>
                       
                            </div>
                            <div class="viewMiddle">
                            	<p><strong>公共自行车：</strong><span>
                                <c:forEach items="${sign.bikesArray }" var="bike" varStatus="num">
                                	<c:if test="${num.index==2 }"><br/></c:if>
                                	${bike.bikeName }<c:if test="${bike.station==2 }"><span style="color: red;">(不在班)</span></c:if>&nbsp;
                                </c:forEach>
                                </span></p>
                                 <p><strong>自行车备注：</strong><span>${sign.bikesdes }</span></p>
                                <p><strong>值班室钥匙：</strong><span>
                                <c:forEach items="${sign.keysArray }" var="key" varStatus="num">
                                	<%-- <c:if test="${num.index==2 }"><br/></c:if> --%>
                                	${key.keyName }<c:if test="${key.station==2 }"><span style="color: red;">(不在班)</span></c:if>&nbsp;
                                	
                                </c:forEach>
                                </span></p>
                                <p><strong>附钥匙备注：</strong><span>${sign.keysdes }</span></p>
                                <p><strong>电信网125：</strong><span>${sign.cdmd125 }</span></p>
                                
                            </div>
                            <div class="viewRight">
                            <!-- 7条属性 -->
                                <p><strong>电信网182：</strong><span>${sign.cdmd182 }</span></p>
                                <p><strong>联通网端口：</strong><span>${sign.cuq }</span></p>
                                <p><strong>教育网出口：</strong><span>${sign.edu }</span></p>
                                <p><strong>后勤未受理：</strong><span>${sign.logistics1 }</span></p>
                                <p><strong>后勤未完工：</strong><span>${sign.logistics2 }</span></p>
                                <p><strong>电信待完成：</strong><span>${sign.cdmdunfinish }</span></p>
                            </div>
                            <div class="clear_lr"></div>  
                            <div class="row"><p><strong>值班人员：</strong><span>
                                <c:forEach items="${sign.watchsArray }" var="watch" varStatus="num">
                                	${watch.realName }(${watch.manageid })
                                	<c:choose>
				                        <c:when test="${watch.staion==1 }">[<span style="color: green;">正常</span>]&nbsp;</c:when>
				                        <c:when test="${watch.staion==2 }">[<span style="color: orange;">迟到</span>]&nbsp;</c:when>
				                        <c:when test="${watch.staion==3 }">[<span style="color: red;">旷班</span>]&nbsp;</c:when>
				                        <c:otherwise>未填写</c:otherwise>
				                    </c:choose>
                                </c:forEach>
                                </span></p>
                            </div>
                            <div class="row"><p><strong>工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;具：</strong><span>
                                <c:forEach items="${sign.toolsArray }" var="tool" varStatus="num">
                                	${tool.toolName }<c:if test="${tool.station==2 }"><span style="color: red;">(不在班)</span></c:if>&nbsp;
                                	
                                </c:forEach>
                                </span></p>
                            </div>
                            <div class="row"><p><strong>本班备注：</strong><span>${sign.remarks }</span></p></div>
                            <%-- <a href="${pageContext.request.contextPath }/signList.action">返回列表</a>
                            <a href="${pageContext.request.contextPath }/operatesign.action?operate=manageView&id=${sign.id }">修改信息</a> --%>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div class="pageDiv">
			<pageutil:page url="${pageContext.request.contextPath }/signList.action" />
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
			$(".removeSign").hide();
			$(".updateSign").hide();
		}
		
	});

    function viewButton(thisTag){
        thisTag.parent().parent().next().toggle();
    };
    function hideThisTr(){
        $(".hidetr").hide();
    }; 
    
    function updateButton(signId){
    	//alert(window.location.pathname);
    	location.href = "${pageContext.request.contextPath }/showSignById.action?signId="+signId+"&address="+window.location.href+"";
    }
    //删除签到表
    function deleteSign(id, thisa){
   		//ajax删除用户
   		if(confirm("该操作会删除本班次的记录，是否继续删除？")) {
   			$.ajax({
   	  			"async":true,
   	  			"url":"${pageContext.request.contextPath }/deleteSign.action",
   	  			"data":{"signId":id},
   	  			"type":"POST",
   	  			"dataType":"json",
   	  			"success":function(data){
   	  				if(data.delSuccess) {
   	  					//删除成功
   	  					alert("删除成功！");
   	  					thisa.parent().parent().remove();
   	  				}
   	  			},
   	  			error:function(){
   	  				alert("错误！！！");
   	  			}
       		});
   		}
    }
    //检查用户的权限，如果是组长则可以进行修改和删除，如果不是组长则隐藏删除和修改的按钮  （这个方法暂时没有用）
    //该方法的检验是通过将登陆用户的ID传到后台，在后台进行校验登陆用户的身份，根据用户的身份进行权限校验
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