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
		.providerTable td a {
		    margin-top: 0px;
		    display: inline-block;
		    margin-right: 0px;
		    font-size: 13px;
		    text-decoration: underline;
		}
		tr a{
			font-weight:700;
			font-size: 14px;
		    text-decoration: underline;
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
            <span>签到交接 >> 本班签到(新增签到)</span>
        </div>
        <form class="signAddForm" action="" method="post">
        <table class="providerTable qiandaoTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th>日期</th>
                <td  colspan="2"><input type="date" name="createtime" id="yearmonth" value="2018-01-05"/></td>
                <th>星期</th>
                <td colspan="1">
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
                    <select name="banci" id="banci">
                        <option value="1">上午1/2</option>
                        <option value="2">上午3/4/5</option>
                        <option value="3">下午6/7</option>
                        <option value="4">下午8/9</option>
                        <option value="5">晚上10/11/12</option>
                    </select>
                </td>
                <th colspan="1">填写人签字</th>
                <td colspan="1">
                    <select name="createname" id="createname">
                    	<c:forEach items="${allManage }" var="manage">
                    		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
                    	</c:forEach>
                    </select>
                </td>
                <th colspan="1">接班人签字</th>
                <td colspan="1">
                    <%-- <select name="confirmname" id="confirmname">
                        <c:forEach items="${allManage }" var="manage">
                        	<!-- 默认选中当前登陆的人员 -->
                    		<option value="${manage.id }" <c:if test="${manage.id==user.id }">selected</c:if> >${manage.realname }</option>
                    	</c:forEach>
                    </select> --%>
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
                    		<span class="hidespan">
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
                <th colspan="2"><label>公共自行车 <input type="checkbox" id="checkallbikes"/> </label></th>
                <td colspan="3">
                	<c:forEach items="${bikes }" var="bike">
	                	<label style="margin-right: 5px;font-size: 12px;"><input type="checkbox" name="bikes" value="${bike.id }"/>${bike.bikename}</label>
	                </c:forEach>
                </td>
                <th>描述</th>
                <td colspan="5">
                	<textarea name="bikesdes" rows="1" cols="6" style="width: 540px;height: 28px;"></textarea>
                </td>
            </tr>
            <tr>
                <th rowspan="2"> <label> 钥匙 <input type="checkbox" id="checkallkeys"/></label></th>
                <c:forEach items="${keys }" var="key">
                <td colspan="2"><label><input type="checkbox" name="keys" value="${key.id }"/>${key.keyname }</label> </td>
                </c:forEach>
                <th colspan="2">持钥匙人</th>
                <td colspan="2"></td>
            </tr>
            <tr>	
            	<th>描述</th>
                <td colspan="9">
                	<textarea name="keysdes" rows="1" cols="9" style="width: 985px;height: 28px;"></textarea>
                </td>
            </tr>
            <tr>
                <th><label>工具 <input type="checkbox" id="checkalltools"/> </label></th>
                <c:forEach items="${tools }" var="tool">
                	<td><label><input type="checkbox" name="tools" value="${tool.id }"/>${tool.toolname }</label></td>
                </c:forEach>
                
            </tr>
            <tr>
                <th rowspan="2"><a href="http://172.16.253.72/sensorlist.htm" target="_blank">流&nbsp;&nbsp;量</a></th>
                <td colspan="2">电信出口（125）</td>
                <td colspan="3"><input type="text" name="cdmd125" value="12345"/></td>
                <td colspan="2">联通出口</td>
                <td colspan="3"><input type="text" name="cuq" value="12345"/></td>
            </tr>
            <tr>
            	<td colspan="2">电信出口（182）</td>
                <td colspan="3"><input type="text" name="cdmd182" value="12345"/></td>
                <td colspan="2">教育网出口</td>
                <td colspan="3"><input type="text" name="edu" value="12345"/></td>
            </tr>
            <tr>
                <th colspan="2" class="danger">运维系统</th>
                <td colspan="2"><a href="https://hqservice.swpu.edu.cn/pc/account/login/1" target="_blank">后勤平台未受理数量</a></td>
                <td><input type="text" name="logistics1" class="number" value="10"/></td>
                <td colspan="2"><a href="https://hqservice.swpu.edu.cn/pc/account/login/1" target="_blank">后勤平台未完工数量</a></td>
                <td><input type="text" name="logistics2"  class="number" value="20"/></td>
                <td colspan="2"><a href="https://m.sctel.com.cn/manhourpool/login.jsp" target="_blank">电信平台待完成数量</a></td>
                <td><input type="text" name="cdmdunfinish" class="number" value="30"/></td>
            </tr>
            <tr>
                <th>交接特殊<br />情况备注</th>
                
                <td colspan="10">
                	<textarea rows="4" name="remarks" cols="10" style="width: 1095px;font-size: 14px;"></textarea>
                </td>
            </tr>
        </table>
        <div class="providerAddBtn">
           <input type="button" value="保   存" style="line-height: 20px;" onclick="addSign()"/>
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
	//将表单数据提交到后台的controller控制层中
	function addSign(){
		$.ajax({
			"async":false,//同步提交
			"url":"${pageContext.request.contextPath}/addSign.action",
			"data":$(".signAddForm").formSerialize(),
			"type":"POST",
			"dataType":"json",
			"success":function(data){
				if(data.isExist) {//如果订单已经存在
					if(confirm("本班次的签到表已经存在，请确认班次是否选择正确，如果正确，点击确定将覆盖之前的信息，否者请点击取消！")) {
						//二次提交会附加一个特有的参数secondCommit
						$.ajax({
							"async":false,//同步提交
							"url":"${pageContext.request.contextPath}/addSign.action?secondCommit=yes",
							"data":$(".signAddForm").formSerialize(),
							"type":"POST",
							"dataType":"json",
							"success":function(data1){
								if(data1.addSuccess){
									if(confirm("签到成功，是否立即查看本班未完工工单？")){
										//跳转到查看本班为完工工单
										location.href = "${pageContext.request.contextPath }/showUnfinishOrder.action";
									}
								}else{
									alert("保存失败！");
								}
							}//success函数结尾
						}); 
					}
				}else {
					if(data.addSuccess){
						if(confirm("签到成功，是否立即查看本班未完工工单？")){
							//跳转到查看本班为完工工单
							location.href = "${pageContext.request.contextPath }/showUnfinishOrder.action";
						}
					}else{
						alert("保存失败！");
					}
				}
			}//success函数结尾
		});
	};
	
	
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

	$(function(){
		//页面时间初始化
		var date = new Date();
		var foramtDate = date.Format("yyyy-MM-dd");
		var hhmmss = date.Format("HHmmss");
		$("#yearmonth").val(foramtDate);
		$("#select_today").val(date.getDay());
		var timeInt = parseInt(hhmmss);
		//判断当前时间在哪个区间
		if(timeInt >= 70000 && timeInt <= 93500){//上午12
			$("#banci").val(1);
		}else if(timeInt > 93500 && timeInt <= 121500){//上午三四五
			$("#banci").val(2);
		}else if(timeInt >143000 && timeInt <= 160500){//下午12
			$("#banci").val(3);
		}else if(timeInt >160500 && timeInt <= 180000){//下午34
			$("#banci").val(4);
		}else if(timeInt >183000 && timeInt <= 221000){//晚上
			$("#banci").val(5);
		}
		
	});
	
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