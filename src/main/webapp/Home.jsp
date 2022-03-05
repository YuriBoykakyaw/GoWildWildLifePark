<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go Wild WildLife Park</title>
</head>
<style>
body {
  background-image: url('images/Zoo.jpg');
  height:750px;
  width: 1200px;
  display:flex;
  justify-content:center;
  background-size:cover;
  color:yellow;
  font-size:19px;
}
label{
color:yellow;}
.btnAlign{
 text-align:center;
}
</style>
<br><br>
<body>
<ul>
<h1>Go Wild WildLife Park</h1>
<p><a href="https://animals.sandiegozoo.org/animals"><li><label>Home</label></li><br></a></p>
<p><a href="Keeper_Master.html"><li><label>Add Keeper</label></li></a></p>
<p><a href="Keeper_list.jsp"><li><label>View and edit Keepers</label></li><br></a></p>
<p><a href="Animal_Insert.html"><li><label>Add Animal</label></li></a></p>
<li><a href="AnimalList.jsp"><label>View Animal List</label></a>
<br>
<p><a href="EnclosureInsert.html"><li><label>Add Enclosure</label></li></a></p>
<p><a href="Enclosure_List.jsp"><li><label>View and edit Enclosures</label></li><br></a></p>

<p><a href="Diet_Insert.html"><li><label>Add Diet</label></li></a></p>
<p><a href="Species_Insert.html"><li><label>Add Species</label></li></a></p>
<li><a href="report1.jsp"><label>Report 1</label></a></li>
<li><a href="report2.jsp"><label>Report 2</label></a></li>


</ul>
</body>
</html>