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
								<font size="4" face="华文楷体">修改用户信息</font>
						</td>
					</tr>
					<tr>
						<td height="31" align="center">
							<font face="华文楷体">用户名</font>
						</td>
						<td>
							<input type="text" name="users.name" id="name" value="${users.name}" readonly="readonly" />
							<input type="hidden" name="users.user_Id" id="id" value="${users.user_Id}" />
						</td>
					</tr>
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">账号</font>
						</td>
						<td width="69%" align="left">
							<input type="password" name="users.account" id="pwd" value="${users.account}" />
						</td>
					</tr>

				
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">密码</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="users.pwd" id="textfield" value="${users.pwd}" />
						</td>
					</tr>
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">头像</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="users.auser_Icon" id="textfield" value="${users.auser_Icon}" />
						</td>
					</tr>

				
					<tr>
						<td height="22" colspan="2" align="center" class="style1">
							<input type="submit" name="button" id="button" value="保存" />
							<input type="reset" name="button2" id="button2" value="重置" />
						</td>
					</tr>

				</table>
			</div>
		</form>
	</body>
</html>
