<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Add Student</title>
</head>
<body>
<h1>
	Student Details  
</h1>
<br>
<center>
<form action="success" method="get">
<table>
<tr><td colspan="2" align="center">Employee Details</td></tr>
<tr><td>Id        :</td><td><input type="number" name="id"></td></tr>
<tr><td>Name        :</td><td><input type="text" name="name"></td></tr>
<tr><td>Type         :</td><td><input type="text" name="type"></td></tr>
<tr><td>Salary       :</td><td><input type="number" name="salary"></td></tr>
<tr><td>Location       :</td><td><input type="text" name="location"></td></tr>
<tr><td>Pincode       :</td><td><input type="number" name="pincode"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Submit"></td><tr>
</table>
</form>
</center>
<br>
<center><a href="home">Go Home</a></center>
</body>
</html>