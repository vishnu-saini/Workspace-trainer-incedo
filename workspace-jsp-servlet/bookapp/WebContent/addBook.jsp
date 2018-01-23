<%@page import="com.bookapp.web.listners.ActiveUserCountListner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isThreadSafe="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Welcome ${user.name}<br/>
<a href="logout.do">logout</a><br/>



	<form action="addBook.do" method="POST">
		ISBN : <input type="text" name="isbn" value="" size="15" /> <BR>
		Title : <input type="text" name="title" value="" size="50" /> <BR>
		Author : <input type="text" name="author" value="" size="50" /> <BR>
		Price : <input type="text" name="price" value="" size="10" /> <BR>
		<input type="submit" value="Add" />
	</form>
</body>
</html>