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
<title >Report 2</title>
<style >
body {
 background-image: url('images/LOL2.jpg');
 background-size: cover;
 text-align: center;
 display: flex;
 color:yellow;
}
table, th, td {
  border: 4px solid white;
  border-collapse: collapse;
}
table{
width: 50%;
}
th {
  height: 60px;
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
	ArrayList<Animal> animals = animalContentManager.selectTotalAnimalCount();
%>
<table>
<tr>
<th>Keeper Name</th>
<th>Total Animal</th>
</tr>
<%
for(Animal eachAnimal:animals ){
%>
<tr>
<td><%=eachAnimal.getKeepername()%></td>
<td><%=eachAnimal.getTotalanimals()%></td>
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