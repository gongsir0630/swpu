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
		.signAddForm {
		    border: 1px solid #4287C2;
		    padding: 5px;
		    margin: 5px;
		}
		
		.providerAddBtn a:active,
		.providerAddBtn a:focus,
		.providerAddBtn a:hover,
		.providerAddBtn input[type='button']:hover,
		.providerAddBtn input[type='button']:focus{
		    background: linear-gradient(to bottom, #7aaed4, #578bb4, #406e99, #225792, #0d2d54);
		}
		.providerAddBtn input[type='button']{
		    margin-right: 20px;
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
            <span>签到交接 >> 签到表管理 >> 修改签到表</span>
        </div>
        <form class="signUpdateForm" action="" method="post">
        <table class="providerTable qiandaoTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th>编号</th>
                <input type="hidden" id="address" name="address" value="${address }"/>
                <input type="hidden" name="createtime" value="${sign.createtime }"/>
                <input type="hidden" id="signId" name="id" value="${sign.id }"/>
                <td  colspan="2">${sign.id} <%-- <input type="date" name="createtime" id="yearmonth" value="${sign.createtime }"/> --%></td>
                <th>星期</th>
                <td colspan="1">
                <input type="hidden" id="weekInput" value="${sign.week }"/>
                	<select name="week" id="select_today">
                        <option value="1">星期一</option>
                        <option value="2">星期二</option>
                        <option value="3">星期三</option>
                        <option value="4">星期四</option>
                        <option value="5">星期五</option>
                        <option value="6">星期六</option>
                        <option value="7">星期日</option>
                    </select>
                </td>
                <th>班次</th>
                <td>
                <input type="hidden" id="banciInput" name="banci" value="${sign.banci }"/>
                	<c:choose>
                        <c:when test="${sign.banci==1 }">上午1、2</c:when>
                        <c:when test="${sign.banci==2 }">上午3、4、5</c:when>
                        <c:when test="${sign.banci==3 }">下午6、7</c:when>
                        <c:when test="${sign.banci==4 }">下午8、9</c:when>
                        <c:when test="${sign.banci==5 }">晚上10、11、12</c:when>
                        <c:otherwise>未填写</c:otherwise>
                    </c:choose>
                    <!-- <select name="banci" id="banci">
                        <option value="1">上午1/2</option>
                        <option value="2">上午3/4/5</option>
                        <option value="3">下午6/7</option>
                        <option value="4">下午8/9</option>
                        <option value="5">晚上10/11/12</option>
                    </select> -->
                </td>
                <th colspan="1">填写人签字</th>
                <td colspan="1">
                <input type="hidden" id="creatNameInput" value="${sign.createname }"/>
                    <select name="createname" id="createname">
                    	<c:forEach items="${allManage }" var="manage">
                    		<option value="${manage.id }">${manage.realname }</option>
                    	</c:forEach>
                    </select>
                </td>
                <th colspan="1">接班人签字</th>
                <td colspan="1">
                <input type="hidden" id="confirmNameInput" value="${sign.confirmname }"/>
                    <select name="confirmname" id="confirmname">
                    	<option value="0">--请选择--</option>
                        <c:forEach items="${allManage }" var="manage">
                    		<option value="${manage.id }">${manage.realname }</option>
                    	</c:forEach>
                    </select> 
                </td>
            </tr>
            <tr>
                <th height="70px">实际值班人员</th>
                <td colspan="10" style="text-align: left;">
                	<c:forEach items="${watchs }" var="manage" varStatus="number">
                		<c:if test="${number.index==10 }"><div class="clearbox"></div> </c:if>
                    	<div class="watchspan" onmouseover="showTog($(this))" onmouseout="hideTog($(this))">
                    	<%-- <c:forEach items="${sign.watchsArray }" var="watch"></c:forEach> --%>
                    		<label class="watchLable">
                    			<input class="watch" type="checkbox" name="watchs" onclick="showspan($(this))" value="${manage.id }" <c:if test="${manage.exist==1 }">checked</c:if>/>
                    			${manage.realName }
                    		</label>
                    		<span class="hidespan">
                    			<label><input type="radio" name="${manage.id }" value="1" <c:if test="${manage.station==1 }">checked</c:if> />正常</label>
                    			<label><input type="radio" name="${manage.id }" value="2" <c:if test="${manage.station==2 }">checked</c:if> />迟到</label>
                    			<label><input type="radio" name="${manage.id }" value="3" <c:if test="${manage.station==3 }">checked</c:if> />旷班</label>
                    		</span>
                    		<div class="clearbox"></div>
                    	</div>
                   	</c:forEach>
                   	<div class="clearbox"></div>
                </td>
            </tr>
            <tr>
                <th colspan="2"><label>公共自行车 <input type="checkbox" id="checkallbikes"/> </label></th>
                <td colspan="3">
                	<c:forEach items="${sign.bikesArray }" var="bike">
	                	<label style="margin-right: 5px;font-size: 12px;"><input type="checkbox" name="bikes" value="${bike.bikeid }" <c:if test="${bike.station==1 }">checked</c:if> />${bike.bikeName}</label>
	                </c:forEach>
                </td>
                <th>描述</th>
                <td colspan="5">
                	<textarea name="bikesdes" rows="1" cols="6" style="width: 540px;height: 28px;">${sign.bikesdes }</textarea>
                </td>
            </tr>
            <tr>
                <th rowspan="2"> <label> 钥匙 <input type="checkbox" id="checkallkeys"/></label></th>
                <c:forEach items="${sign.keysArray }" var="key">
                	<td colspan="2"><label><input type="checkbox" name="keys" value="${key.keyid }" <c:if test="${key.station==1 }">checked</c:if> />${key.keyName }</label> </td>
                </c:forEach>
                <th colspan="2">持钥匙人</th>
                <td colspan="2"></td>
            </tr>
            <tr>	
            	<th>描述</th>
                <td colspan="9">
                	<textarea name="keysdes" rows="1" cols="9" style="width: 985px;height: 28px;">${sign.keysdes }</textarea>
                </td>
            </tr>
            <tr>
                <th><label>工具 <input type="checkbox" id="checkalltools"/> </label></th>
                <c:forEach items="${sign.toolsArray }" var="tool">
                	<td><label><input type="checkbox" name="tools" value="${tool.toolid }" <c:if test="${tool.station==1 }">checked</c:if> />${tool.toolName }</label></td>
                </c:forEach>
            </tr>
            <tr>
                <th rowspan="2">流量</th>
                <td colspan="2">电信出口（125）</td>
                <td colspan="3"><input type="text" name="cdmd125" value="${sign.cdmd125 }"/></td>
                <td colspan="2">联通出口</td>
                <td colspan="3"><input type="text" name="cuq" value="${sign.cuq }"/></td>
            </tr>
            <tr>
            	<td colspan="2">电信出口（182）</td>
                <td colspan="3"><input type="text" name="cdmd182" value="${sign.cdmd182 }"/></td>
                <td colspan="2">教育网出口</td>
                <td colspan="3"><input type="text" name="edu" value="${sign.edu }"/></td>
            </tr>
            <tr>
                <th colspan="2" class="danger">运维系统</th>
                <td colspan="2">后勤平台未受理数量</td>
                <td><input type="text" name="logistics1" class="number" value="${sign.logistics1 }"/></td>
                <td colspan="2">后勤平台未完工数量</td>
                <td><input type="text" name="logistics2"  class="number" value="${sign.logistics2 }"/></td>
                <td colspan="2">电信平台待完成数量</td>
                <td><input type="text" name="cdmdunfinish" class="number" value="${sign.cdmdunfinish }"/></td>
            </tr>
            <tr>
                <th>交接特殊<br />情况备注</th>
                <td colspan="10">
                	<textarea rows="4" name="remarks" cols="10" style="width: 1095px;font-size: 14px;">${sign.remarks }</textarea>
                </td>
            </tr>
        </table>
        <div class="providerAddBtn">
           <input type="button" value="确认修改" style="line-height: 20px;" onclick="updateSign()"/>
           <input type="button" value="返   回" onclick="history.back(-1)"/>
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
	var week = $("#weekInput").val();
	var banci = $("#banciInput").val();
	var createName = $("#creatNameInput").val();
	var confireName = $("#confirmNameInput").val();
	//选中周末
	$("#select_today").val(week);
	//选中班次
	$("#banci").val(banci);
	//选中创建人
	$("#createname").val(createName);
	//选中确人人
	$("#confirmname").val(confireName);
	//页面加载完成后初始化选中一些选项
    $(function(){
    	
    });

	//将表单数据提交到后台的controller控制层中
	function updateSign(){
		$.ajax({
			"async":false,//同步提交
			"url":"${pageContext.request.contextPath}/updateSign.action",
			"data":$(".signUpdateForm").formSerialize(),
			"type":"POST",
			"dataType":"json",
			"success":function(data){
				if(data.updateSuccess){
						//修改成功返回上一页并且刷新
						window.location.href = document.referrer;
				}else{
					alert("修改失败！");
				}
			}//success函数结尾
		});
	};
	
	
	//全选设置选项
	$("#checkalltools").click(function(){ 
		if(this.checked){ 
			$("input[name='tools']").each(function(){this.checked=true;}); 
		}else{ 
			$("input[name='tools']").each(function(){this.checked=false;}); 
		} 
	});
	$("#checkallbikes").click(function(){ 
		if(this.checked){ 
			$("input[name='bikes']").each(function(){this.checked=true;}); 
		}else{ 
			$("input[name='bikes']").each(function(){this.checked=false;}); 
		} 
	});
	$("#checkallkeys").click(function(){ 
		if(this.checked){ 
			$("input[name='keys']").each(function(){this.checked=true;}); 
		}else{ 
			$("input[name='keys']").each(function(){this.checked=false;}); 
		} 
	});
	function showspan(thisinput){
		$(".hidespan").hide();
		if(thisinput.attr('checked')){
			thisinput.parent().next().show();
		}else{
			thisinput.parent().next().hide();
		}
	};

	function showTog(thisDiv){
		thisDiv.children(".hidespan").show();
	}
	function hideTog(thisDiv){
		thisDiv.children(".hidespan").hide();
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