<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome ${user.name}
<a href="logout.do">logout</a>
Book id: ${book.id}<br/>
Book isbn: ${book.isbn}<br/>
Book title: ${book.title}<br/>
Book Author: ${book.author}<br/>
Book Price: ${book.price}<br/>

</body>
</html>