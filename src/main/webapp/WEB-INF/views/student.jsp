<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String)request.getAttribute("name");
		Integer roll = (Integer)request.getAttribute("roll");
	%>
	<h1>My name is: <%=name %></h1>
	<h1>roll no: <%=roll %></h1>
</body>
</html>