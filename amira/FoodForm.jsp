<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<title>Food Form</title>
</head>
<body>

<style>
body {
  background-color: #9FF4C3;
}
</style>

<font face ="arial" size="2" color="000000"  ></font>
<form method="post" action="FoodInfo.jsp">

<center>

<h1>Add New Food</h1>

<table>

<tr>
<td>Code</td>
<td>:</td>
<td><input type ="text" name="code" size="30"> </td>
</tr>

<tr>
<td>Food Name</td>
<td>:</td>
<td><input type ="text" name="food" size="30"> </td>

<tr>
<td>Price</td>
<td>:</td>
<td><input type ="text" name="price" size="30"> </td>
</tr>




</table>
<br><br>

<form action="Added.jsp" method="post">
<button type="submit"  value="Submit">ADD</button>
<button type="clear"  value="Reset">RESET</button>

</form>
</body>
</center>
</html>
