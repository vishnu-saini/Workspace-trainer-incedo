<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Custom Login Form</h2>
  <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
      <font color="red">
        Your login attempt was not successful due to 
        <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>.
      </font>
    </c:if>
    
  <form:form action='j_spring_security_check' method='POST'>
	 <table>
	    <tr>
	      <td>User Name:</td>
	      <td><input type='text' name='j_username' value=''></td>
	    </tr>
	    <tr>
	      <td>Password:</td>
	      <td><input type='password' name='j_password'/></td>
	    </tr>
	    
	    <tr>
	      <td colspan='2'>
	        <input name="submit" type="submit" value="Login"/></td>
	    </tr>
	  </table>
  </form:form>
</body>
</html>