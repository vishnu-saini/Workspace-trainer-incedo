<%@page import="com.model.persistance.Dog"%>
<%@page import="com.model.persistance.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${customer.dog.dogName}<br/>

<%-- <%
	Customer customer=(Customer)request.getAttribute("customer");
	Dog dog=customer.getDog();
	out.print(dog.getDogName());
%> --%>

</body>
</html>