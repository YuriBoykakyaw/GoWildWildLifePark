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
</head>
<style>
body {
 background-image: url('images/kzp.jpg');
 background-size: cover;
 text-align: center;
 display: flex;
 justify-content:center;
}
label{
color:#FFFF00;
font-size: 120%;
}
</style>
<body>
<form action="enclosure_updated_action.jsp">
<%
int id= Integer.valueOf(request.getParameter("id"));
out.print("Id is "+ id);
EnclosureManager ecm= new EnclosureManager();
try{
	Enclosure e = ecm.getById(id);
%>

<br><br>
<label>Enclosure ID:</label> <input type="text" name="Enclosure_id" value="<%=e.getEnclosureID() %>">
<br><br>
<label>Enclosure Type:</label> <input type="text" name="Enclosure_type" value="<%=e.getEnclosureType() %> "required>
<br><br>
<label>Enclosure Location:</label> <input type="text" name="Enclosure_location" value="<%=e.getEnclosureLocation() %>"required>
<br><br><br><br>
<div class="btnAlign">
<button  class="bth" type="submit" value="Save">Update</button>
<button  class="bth" type="reset" value="Reset">Clear</button >
</div>
<%
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</form>
</body>
</html>