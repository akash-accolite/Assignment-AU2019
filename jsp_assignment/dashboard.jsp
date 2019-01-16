<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! static int myStatic = 0; %> 
<% 
if(request.getParameter("password").equals("Hello")) {
	%>

<%
out.println("your password is correct :");
%>
<br/>
Name:
<% 
	out.println(request.getParameter("name"));
myStatic++;
%>
password:
<%
out.println(request.getParameter("password"));


%>	
<%
out.println("you entered this page "+myStatic+"times");
%>
	
<%
}
else{
	out.println("Password was wrong");
}

%>


</body>
</html>