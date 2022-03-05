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
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.valueOf(request.getParameter("keeperId"));
String keeperName =request.getParameter("keepername");
String keeperDOB =request.getParameter("DOB");
String keeperEmail =request.getParameter("Email");
String keeperPhone =request.getParameter("Phone");
String keeperType=request.getParameter("Type");
KeeperManager ecm = new KeeperManager();
Keeper keeper = new Keeper(id,keeperName,keeperDOB,keeperEmail,keeperPhone,keeperType);
int rowsAffected;
try {

    rowsAffected = ecm.update(keeper);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>


</body>
</html>