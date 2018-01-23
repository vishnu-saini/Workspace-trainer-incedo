<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ob" class="com.model.persistance.Customer" scope="request">
		<jsp:setProperty property="name" name="ob" value="xxxxx"/>
		<jsp:setProperty property="address" name="ob" value="rrrrr"/>
		<jsp:setProperty property="salary" name="ob" value="4444"/>
	</jsp:useBean>


	<jsp:getProperty property="name" name="ob"/>
</body>
</html>