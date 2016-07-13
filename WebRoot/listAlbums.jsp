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
       if(window.confirm("你确认要删除此数据吗?"+param1)){ 
       		 document.location.href="./albumdel.action?album_Id="+param1;
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
		<td width="7%" align="center" bgcolor="#B5CDF4">专辑编号<br></td>
		<td width="12%" align="center" bgcolor="#B5CDF4">专辑名</td>
		<td width="9%" align="center" bgcolor="#B5CDF4">艺人名称</td>
		<td width="8%" align="center" bgcolor="#B5CDF4">创建日期</td>
		<td width="8%" align="center" bgcolor="#B5CDF4">格式</td>
		<td width="16%" align="center" bgcolor="#B5CDF4">简介</td>
		<td width="16%" align="center" bgcolor="#B5CDF4">封面</td>
		<td width="12%" align="center" bgcolor="#B5CDF4">价格</td>
		<td colspan="2" align="center" bgcolor="#B5CDF4">管理</td>
	</tr>    
	  <s:iterator value="#request.list" status="albums"> 
    <tr>
		<td width="7%" height="26" align="center"><font size="2"><a href="#"> </a><s:property value="album_Id"/></font></td>
		<td width="12%" align="center"><font size="2"><s:property value="album_Name"/></font></td>
		<td width="9%" align="center"><font size="2"><s:property value="artist_Name"/></font></td>
		<td width="8%" align="center"><font size="2"><s:property value="create_Date"/></font></td>
		<td width="8%" align="center"><font size="2"><s:property value="spec"/></font></td>
		<td width="16%" align="center"><font size="2"><s:property value="synopsis"/></font></td>
		<td align="center"><img height="120px" width="120px" src=icon/<s:property value="icon"/>></td>
		<td align="center"><s:property value="price"/></td>
		<td width="7%">
		<font size="2"><a href="javascript:void(0)" onclick="del(<s:property value="album_Id"/>)">删除</a></font>
		<td width="7%"><font size="2"><a href="open.action?id=<s:property value="album_Id"/>">修改</a></font></td>
		<td width="7%"><font size="2"><a href="addSings.jsp?id=<s:property value="album_Id"/>">添加专辑歌曲</a></font></td>
	</tr>     
	</s:iterator>
   </table>
</body>
</html>
