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
<title>Keeper List</title>

<style>
table, th, td {
  border: 2px solid red;
}

</style>
</head>
<body>
<h1>Keeper List</h1>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	//Select
	KeeperManager keeperManager = new KeeperManager();
	ArrayList<Keeper> keepers = keeperManager.selectAll();
%>

<table>
<tr>
<th>keepers_id </th>
<th>name</th>
<th>date_of_birth</th>
<th>email</th>
<th>phone</th>
<th>rank</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
for(Keeper eachKeeper:keepers){
	
%>
<tr>
<td><%=eachKeeper.getKeeperID()%></td>
<td><%=eachKeeper.getKeeperName() %></td>
<td><%=eachKeeper.getKeeperDOB() %></td>
<td><%=eachKeeper.getKeeperEmail()%></td>
<td><%=eachKeeper.getKeeperPhone()%></td>
<td><%=eachKeeper.getKeeperType()%></td>
<td><a href="Keeperupdate.jsp?id=<%=eachKeeper.getKeeperID()%>">Edit</a></td>
<td><a href="Keeper_deleted_action.jsp?id=<%=eachKeeper.getKeeperID()%>">Delete</a></td>
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