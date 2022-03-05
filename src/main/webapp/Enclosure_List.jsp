<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.crud.*" %>
 <%@ page import="com.dbconnector.*" %>
 <%@ page import="com.content.*" %>
 <%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table, th, td {
  border: 1px solid red;
}

</style>
</head>
<body>
<h1>Enclosure List</h1>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Succesfully");
	//Select
	EnclosureManager enclosureManager = new EnclosureManager();
	ArrayList<Enclosure> enclosures = enclosureManager.selectAll();
%>

<table>
<table style="width:100%">
<tr>
<th>enclosure_id <style="width:10%"></style></th>
<th>type</th>
<th>location</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
for(Enclosure eachEnclosure:enclosures){
	
%>
<tr>
<td><%=eachEnclosure.getEnclosureID()%></td>
<td><%=eachEnclosure.getEnclosureType() %></td>
<td><%=eachEnclosure.getEnclosureLocation()%></td>
<td><a href="enclosureupdate.jsp?id=<%=eachEnclosure.getEnclosureID()%>">Edit</a></td>
<td><a href="enclosure_deleted_action.jsp?id=<%=eachEnclosure.getEnclosureID()%>">Delete</a></td>
</tr>
  <%
}
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</table>
</body>
</html>