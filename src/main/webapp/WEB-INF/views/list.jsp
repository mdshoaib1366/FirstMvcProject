<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<String> al = (List<String>)request.getAttribute("alist");
		//Date date = (Date)request.getAttribute("date");
		for(String list : al)
		{	
			 %>
			 <h1>Number : <%=list %></h1>
			 <% 
		}
		
	%>
	<b>date :</b><%=request.getAttribute("date") %>
</body>
</html>