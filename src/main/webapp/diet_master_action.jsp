<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.dbconnector.*" %>
    <%@page import="java.sql.*" %>
    <%@page import="java.util.*" %>
    <%@page import="com.content.*" %>
    <%@page import="com.crud.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>diet_master_action</title>
</head>
<body>
<%
String Diet_type =request.getParameter("diettype");
int Diet_NOF = Integer.valueOf(request.getParameter("no_of_feeds"));
DBManager dbManager= new DBManager();
try{
	dbManager.getConnection();
    out.print("Connection Successfully");
    Diet c= new Diet(Diet_type,Diet_NOF);
	DietContentManager kcm= new DietContentManager();
	int rowInserted= kcm.insert(c);
	if (rowInserted==1){
		out.println("Successfully inserted");
	}
}
catch(SQLException e){
	e.printStackTrace();
}

%>
</body>
</html>
          
