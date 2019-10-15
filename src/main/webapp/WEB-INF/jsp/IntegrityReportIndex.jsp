<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
	<meta http-equiv="content-type" content="text/html;charset=utf-8"/>
	<title>不完整数据导出</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/laydate/laydate.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script>
		lay('#version').html('-v'+ laydate.v);
		//执行一个laydate实例
		//日期范围
		laydate.render({
		  elem: '#test6'
		  ,range: true
		  ,lang: 'en'
		});
		//时间范围
		laydate.render({
		  elem: '#test9'
		  ,type: 'time'
		  ,lang: 'en'
		  ,range: true
		});

	</script>
	<style>
	  body{padding: 20px;}
	  .shiji-input{padding-left: 10px; height: 38px; min-width: 262px; line-height: 38px; border: 1px solid #e6e6e6;  background-color: #fff;  border-radius: 2px;}
	</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/export/integrityExcelExport" method="post">
						<table align="center" border="0">
								<tr>
									<td>请选择营业日范围:</td>
									<td><input type="text" class="shiji-input" placeholder="年月日选择" id="test6" name="businessDayRang" readOnly ></td>
								</tr>
								<tr>
									<td>请输选择时间范围:</td>
									<td><input type="text" class="shiji-input" placeholder="时间范围" id="test9" name="rangTime" readOnly></td>
									</tr>
									<tr>
									<td>请选择时间类型:</td>
									<td><input type="radio" name="timeType" value="1" checked>open time<input type="radio" value="2" name="timeType">close time</td>
									</tr>
							</table>
							<div align="center" style="margin-left:328px;margin-top:15px;">
							<input type="submit" style="width: 80px;height: 35px" value="导出">
							</div>
	</form>
</body>
<script>
		var responseCode =${Results.status};
		if(responseCode==0)
			alert("请选择营业日!");
		else if(responseCode==1)
			 alert("营业日不存在!");
		else if(responseCode==2)
			alert("查询的数据为空!");
		else if(responseCode==3)
			alert("系统找不到指定路径!");
		else if(responseCode==4)
			alert("导出失败!");
		else if(responseCode==5)
			alert("营业日格式有误!");
		else if(responseCode==200){
			alert("导出成功!");
		}
	</script>
</html>