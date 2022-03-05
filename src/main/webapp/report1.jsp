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
<title>Report 1</title>
<style >
body {
 background-image: url('images/kk1.jpg');
 background-size: cover;
 text-align: center;
 display: flex;
 color:yellow;
}
table, th, td {
  border: 3px solid red;

}
table{
width: 100%;
}
th {
  height: 50px;
}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	//select
	AnimalContentManager animalContentManager = new AnimalContentManager();
	ArrayList<Animal> animals = animalContentManager.selectAllAnimalsByKeeperName();
%>
<table>
<tr>
<th>Animal ID</th>
<th>Animal Name</th>
<th>Gender</th>
<th>Animal Year</th>
<th>Keeper ID</th>
<th>Keeper Name</th>
</tr>
<%
for(Animal eachAnimal:animals ){
%>
<tr>
<td><%=eachAnimal. getAnimal_id() %></td>
<td><%=eachAnimal.getName() %></td>
<td><%=eachAnimal.getGender() %></td>
<td><%=eachAnimal.getYear() %></td>
<td><%=eachAnimal.getK_ID()%></td>
<td><%=eachAnimal.getKeepername()%></td>
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
</body>
</html>