<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'listUsers.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="任务十五/源代码/任务二 添加数据/ssh2/manager/css/style.css" rel="stylesheet" type="text/css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
a:link {
	text-decoration: none;
	color:#000000;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
	color: #ff7300;
}
a:active {
	text-decoration: none;
	color:#0FC;
}
</style>
  </head>

 
<body>
<script language="javascript">
   function del(param1){
       if(window.confirm("你确认要删除此数据吗?")){ 
       		 document.location.href="./del.action?id="+param1;
       	}
    }
</script>  
 <div align="center" >
        
        <table width="90%" height="83" border="1" align="center" bordercolorlight="#000080" bordercolordark="#FFFFFF" id="table1">
	<tr>
	  <td colspan="11" align="center">
	  <div align="right"><a href="./addUsers.jsp"><font size="2">新增</font></a>&nbsp;&nbsp;&nbsp;</div>	  
	  </td>
    </tr>    
  
	<tr>
		<td width="7%" align="center" bgcolor="#B5CDF4">用户ID<br></td>
		<td width="12%" align="center" bgcolor="#B5CDF4">用户名</td>
		<td width="9%" align="center" bgcolor="#B5CDF4">账号	</td>
		<td width="8%" align="center" bgcolor="#B5CDF4">密码</td>
		<td width="8%" align="center" bgcolor="#B5CDF4">头像</td>
		
		<td colspan="2" align="center" bgcolor="#B5CDF4">管理</td>
	</tr>    
	  <s:iterator value="#request.list" status="users"> 
    <tr>
		<td width="7%" height="26" align="center"><font size="2"><a href="#"> </a><s:property value="user_Id"/></font></td>
		<td width="12%" align="center"><font size="2"><s:property value="user_Name"/></font></td>
		<td width="9%" align="center"><font size="2"><s:property value="account"/></font></td>
		<td width="8%" align="center"><font size="2"><s:property value="pwd"/></font></td>
		<td width="8%" align="center"><font size="2"><s:property value="user_Icon"/></font></td>
		
		<td width="7%">
		<font size="2"><a href="javascript:void(0)" onclick="del(<s:property value="user_Id"/>)">删除</a></font>
		<td width="7%"><font size="2"><a href="open.action?id=<s:property value="id"/>">修改</a></font></td>
	</tr>     
	</s:iterator>
   </table>
</body>
</html>
