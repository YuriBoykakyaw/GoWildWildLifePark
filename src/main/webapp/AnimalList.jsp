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
<h1>Animal List</h1>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	//Select
	AnimalContentManager kcm = new AnimalContentManager();
	ArrayList<Animal> animalList = kcm.selectAllAnimals();
%>

<table>
<tr>
<th>Animal ID</th>
<th>Animal Name</th>
<th>Animal Gender</th>
<th>Animal Year</th>
<th>Species ID</th>
<th>Keeper ID</th>
<th>Enclosure ID</th>
<th>Diet ID</th>
</tr>
<%
for(Animal eachAnimal:animalList){
	
%>
<tr>
<td><%=eachAnimal.getAnimal_id() %></td>
<td><%=eachAnimal.getName() %></td>
<td><%=eachAnimal.getGender() %></td>
<td><%=eachAnimal. getYear() %></td>
<td><%=eachAnimal.getS_ID()%></td>
<td><%=eachAnimal.getK_ID()%></td>
<td><%=eachAnimal.getE_ID()%></td>
<td><%=eachAnimal.getD_ID()%></td>
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