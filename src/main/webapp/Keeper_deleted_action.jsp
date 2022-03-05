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
 int keeperId = Integer.valueOf(request.getParameter("id"));

           KeeperManager ecm = new KeeperManager();
           int rowsAffected;
            try {

                rowsAffected = ecm.delete(keeperId);
                out.println("No of rows affected - " + rowsAffected);

             }catch (SQLException e){
                  out.println(e.getMessage());

              }
%>
</body>
</html>