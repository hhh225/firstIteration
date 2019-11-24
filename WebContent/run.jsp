<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ page import="run.*" %>
<%@ page import="java.net.Socket" %>
<%@ page import="java.net.ServerSocket" %>
<%
response.sendRedirect("http://localhost:8080/ACPSample_B2C/deliver");
try{
	ServerSocket ss=new ServerSocket(8008);
	Socket s=ss.accept();
	Thread st=new ServerThread(s);
	st.run();
	
}
catch(Exception e){
	
}
%>
<title>Insert title here</title>
</head>
<body>

</body>
</html>