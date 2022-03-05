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
<form action="Keeper_updated_action.jsp">
<%
int id= Integer.valueOf(request.getParameter("id"));
out.print("Id is "+ id);
KeeperManager ecm= new KeeperManager();
try{
	Keeper e = ecm.getById(id);
%>
<br><br>
<label>Keeper ID: </label> <input class="text-box" type="text" name="keeperId"  value="<%=e.getKeeperID() %>"required>
<br><br>
<label>Keeper  Name: </label> <input class="text-box" type="text" name="keepername"  value="<%=e.getKeeperName() %>"required>
<br><br><br><br>
<label>Keeper   DOB:  </label> <input  class="text-box" type="date" name="DOB"  value="<%=e. getKeeperDOB()%>" required>
<br><br><br><br>
<label>Keeper Email: </label> <input class="text-box" type="email" name="Email" value="<%=e. getKeeperEmail()%>" required>
<br><br><br><br>
<label>Keeper Phone: </label> <input class="text-box" type="number"pattern="[0-9]{2}-[0-9]{9}" placeholder="09-778623136" name="Phone" value="<%=e. getKeeperPhone()%>"  required>
<br><br><br><br>
<label>Keeper  Type:  </label><input class="text-box"  type="text" name="Type" value="<%=e.getKeeperType()%>" required>
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