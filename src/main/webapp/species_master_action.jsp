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
<title>species_master_action</title>
</head>
<body>
<%
String Type =request.getParameter("Type");
String Group =request.getParameter("Group");
String Lifestyle =request.getParameter("Lifestyle");
String  Status=request.getParameter("Status");
	DBManager dbManager= new DBManager();
	try{
		dbManager.getConnection();
		out.println("Connection Successfully");
		Species ec= new Species(Type,Group,Lifestyle,Status);
	    SpeciesContentManager lcm= new SpeciesContentManager();
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