<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>用户登录</title>
  </head>
  
  <body>
    <form action="login.action" method="post"> 
    	户名：<input type="text" name="users.name"/>
    	密码：<input type="password" name="users.pwd" />
    	<input type="submit" value="登 录">
    </form>
  </body>
</html>