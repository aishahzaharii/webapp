<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

<style>
body {
  background-color: #9FF4C3;
}
</style>

<font face ="arial" size="2" color="000000"  ></font>
<form method="post" action="EmployeeInfo.jsp">

<center>

<h1>Employee Registration</h1>

<table>

<tr>
<td>Id</td>
<td>:</td>
<td><input type ="text" name="id" size="30"> </td>
</tr>


<tr>
<td>Name</td>
<td>:</td>
<td><input type ="text" name="Name" size="30"> </td>
</tr>


<tr>
<td>Gender</td>
<td>:</td>
<td> 
     <input type="radio" name="gender" value="Male"> Male<br>
     <input type="radio" name="gender" value="Female"> Female<br> </td>
</tr>

<tr>
<td>Ic No</td>
<td>:</td>
<td><input type ="text" name="icno" size="30"> </td>
</tr>


<tr>
<td>Date of Birth</td>
<td>:</td>
<td><input type ="text" name="dateOfBirth" size="30"> </td>
</tr>

<tr>
<td>Address</td>
<td>:</td>
<td><input type ="text" name="address" size="30"> </td>
</tr>


<tr>
<td>Marital Status</td>
<td>:</td>
<td> 
     <input type="radio" name="gender" value="single"> Single<br>
     <input type="radio" name="gender" value="married"> Married<br> </td>
</tr>

<tr>
<td>Religion</td>
<td>:</td>
<td> 
<select name="religion">
<option value="" ></option>
<option value="islam" >Islam</option>
<option value="christian" >Buddhist</option>
<option value="christian" >Christian</option>
<option value="christian" >Hindu</option>
</select> 
</td>
</tr>

<tr>
<td>Phone No</td>
<td>:</td>
<td><input type ="text" name="phoneno" size="30"> </td>
</tr>

<tr>
<td>Department</td>
<td>:</td>
<td> 
<select name="department">
<option value="" ></option>
<option value="waiter" >Waiter</option>
<option value="chef" >Chef</option>
<option value="cashier" >Cashier</option>
</select> 
</td>
</tr>




</table>
<br><br>


<button type="submit"  value="Submit">ADD</button>
<button type="clear"  value="Reset">RESET</button>


</form>
</body>
</center>
</html>