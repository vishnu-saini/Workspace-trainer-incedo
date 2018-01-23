<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table border=1>
        <thead>
            	<tr>Book Id</th>
                <th>isbn</th>
                <th>title</th>
                <th>author</th>
		 <th>price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td><c:out value="${book.id}" /></td>
                    <td><c:out value="${book.isbn}" /></td>
		   			 <td><c:out value="${book.title}" /></td>
                    <td><c:out value="${book.author}" /></td>
		     		<td><c:out value="${book.price}" /></td>

                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>