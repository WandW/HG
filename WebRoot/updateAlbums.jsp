<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'addNews.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="../manager/css/style.css" rel="stylesheet" type="text/css">
		<script src="jquery-easyui-1.4.3/jquery.min.js"></script>
		<script src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
		<script src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>

	</head>


	<body>
	<script type="text/javascript">
		function check(){
			if( $("#name").val() == ""){
				alert("用户名为空！");
				$("#name").focus();
				return false;
			} 
			if( $("#pwd").val() == ""){
				alert("密码为空！");
				$("#pwd").focus();
				return false;
			} 
		}	
		
		$(function(){		
			var sex=$("#h_sex").val();
			//alert(sex);
			if(sex=="男"){
				$("#sex_man").attr("checked","CHECKED");
			}else if(sex=="女"){
				$("#sex_woman").attr("checked","CHECKED");
			}
		});
		
		
	</script>
		<form name="form1" method="post" action="update.action" onsubmit="return check()">
			<div align="center">
				<table width="44%" border="1" bordercolorlight="#000080"
					bordercolordark="#FFFFFF" id="table1">
					<tr>
						<td colspan="2" bgcolor="#B5CDF4" align="center">
							<p align="center">
								<font size="4" face="华文楷体">修改专辑</font>
						</td>
					</tr>
				
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">专辑名</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.album_Name" id="pwd" value="${albums.album_Name}" >
						</td>
					</tr>

					
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">艺人名</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.artist_Name" id="textfield" value="${albums.artist_Name}" >
						</td>
					</tr>
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">创建日期</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.create_Date" id="textfield" value="${albums.create_Date}" >
						</td>
					</tr>

					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">封面</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.icon" id="textfield" value="${albums.icon}" >
						</td>
						</tr>
							<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">格式</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.spec" id="textfield" value="${albums.spec}">
						</td>
						</tr>
							<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">价格</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.price" id="textfield" value="${albums.price}">
						</td>
						</tr>
							<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">简介</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="albums.synopsis" id="textfield" value="${albums.synopsis}">
						</td>
						</tr>
				</table>
			</div>
		</form>
	</body>
</html>
