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
<title>animal_master_action</title>
</head>
<body>
<%
String Animal_Name =request.getParameter("animalsname");
String Animal_Gender =request.getParameter("gender");
int Animal_Year =Integer.valueOf(request.getParameter("Year"));
int SID = Integer.valueOf(request.getParameter("SID"));
int DID = Integer.valueOf(request.getParameter("KID"));
int KID = Integer.valueOf(request.getParameter("EID"));
int EID = Integer.valueOf(request.getParameter("DID"));
DBManager dbManager= new DBManager();
try{
	dbManager.getConnection();
    out.print("Connection Successfully");
    Animal c= new Animal(Animal_Name,Animal_Gender,Animal_Year,SID,DID,KID,EID);
	AnimalContentManager kcm= new AnimalContentManager();
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