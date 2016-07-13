<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
		function verify(){
			var name=$.trim($("#name").val());
			$.ajax({
				url:"verify.action?users.name="+name,
				type:"post",
				dataType:"text",
				success:function(r){
					//alert(r);
					if(r=="false"){
						//$("#error").attr("color","green");
						$("#sign").html("该用户名已存在 ！").attr("color","red");
					}else{
						//$("#error").attr("color","green");
						$("#sign").html("用户名可用 ！").attr("color","green");
					}
					if(name==""){
						$("#sign").html("请输入用户名！").attr("color","red");
					}					
				}				
			});
		}
	</script>
		<form name="form1" method="post" action="albumadd.action" onsubmit="return check()" id="form1" enctype="multipart/form-data">
			<div align="center">
				<table width="44%" border="1" bordercolorlight="#000080"
					bordercolordark="#FFFFFF" id="table1">
					<tr>
						<td colspan="2" bgcolor="#B5CDF4" align="center">
							<p align="center">
								<font size="4" face="华文楷体">添加专辑</font>
						</td>
					</tr>
				
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">专辑名</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="album_Name" id="pwd" value="">
						</td>
					</tr>

					
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">艺人名</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="artist_Name" id="textfield" value="">
						</td>
					</tr>
					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">创建日期</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="create_Date" id="textfield" value="">
						</td>
					</tr>

					<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">封面</font>
						</td>
						<td width="69%" align="left">
						<input type="text" value="moren" name="icon">
						<input type="file" name="albumicon"> 
						</td>
						</tr>
							<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">格式</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="spec" id="textfield" value="">
						</td>
						</tr>
							<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">价格</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="price" id="textfield" value="">
						</td>
						</tr>
							<tr>
						<td width="31%" height="40" align="center" class="style1">
							<font face="华文楷体">简介</font>
						</td>
						<td width="69%" align="left">
							<input type="text" name="synopsis" id="textfield" value="">
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
