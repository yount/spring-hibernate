<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include  file="/WEB-INF/head.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>INDEX</title>
</head>
<body>
	<table>
		<tr>
<<<<<<< HEAD
			<td><%=basePath %>page/<h3>html</h3></td>
			<td><%=basePath %>page/<h3>user</h3></td>
			<td><%=basePath %>page/<h3>info</h3></td>
		</tr>
		<tr>
			<td><a href="<%=basePath %>page/html/home?<%=new Date() %>"><%=basePath %>page/html/home</a></td>
			<td><a href="<%=basePath %>page/user/home?<%=new Date() %>"><%=basePath %>page/user/home</a></td>
			<td><a href="<%=basePath %>page/info/infoDetail?<%=new Date() %>"><%=basePath %>page/info/infoDetail</a></td>
		</tr>
		<tr>
			<td></td>
			<td><a href="<%=basePath %>page/user/count?<%=new Date() %>"><%=basePath %>page/user/count</a></td>
=======
			<td><%=basePath %>/<h3>html</h3></td>
			<td><%=basePath %>/<h3></h3></td>
			<td><%=basePath %>/<h3></h3></td>
		</tr>
		<tr>
			<td>ModelAndView : <a href="<%=basePath %>html/home?<%=new Date() %>"><%=basePath %>html/home.html</a></td>
			<td><a href=""></a></td>
			<td><a href=""></a></td>
		</tr>
		<tr>
			<td>String : <a href="<%=basePath %>html/home_jsp?<%=new Date() %>"><%=basePath %>html/home.jsp</a></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>String : <a href="<%=basePath %>html/home_html?<%=new Date() %>"><%=basePath %>html/home.html</a></td>
			<td></td>
>>>>>>> 1a8a1267d81a9c874f29a68570dc17bad9948604
			<td></td>
		</tr>
	</table>
</body>
</html>