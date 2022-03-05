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
int id = Integer.valueOf(request.getParameter("Enclosure_id"));
String type = request.getParameter("Enclosure_type");
String location = request.getParameter("Enclosure_location");
EnclosureManager ecm = new EnclosureManager();
Enclosure enclosure = new Enclosure(id,type,location);
int rowsAffected;
try {

    rowsAffected = ecm.update(enclosure);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>


</body>
</html>