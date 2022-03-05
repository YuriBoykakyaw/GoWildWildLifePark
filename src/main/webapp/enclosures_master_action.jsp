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
<title>Enclosure_Master_action</title>
</head>
<body>
<%
String Enclosure_type =request.getParameter("Enclosure_type");
String Enclosure_location =request.getParameter("Enclosure_location");
	DBManager dbManager= new DBManager();
	try{
		dbManager.getConnection();
		out.println("Connection Successfully");
		Enclosure ec= new Enclosure(Enclosure_type, Enclosure_location);
	    EnclosureManager lcm= new EnclosureManager();
		int rowInserted= lcm.insert(ec);
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