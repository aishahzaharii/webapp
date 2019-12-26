<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="FoodInfo" class="restoran.Food" scope="session" />
<html>
<head>
<title>Restaurant Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
<br>
<br>
<table width="400" cellspacing="1" cellpadding="1" border="0" align="center">
<tr>
<td colspan="3" align="center"><font face="Arial, Helvetica, sans-serif" size="2"><b>Add New Food</b></font></td>
</tr>
<tr>
<td width="100"><font face="Arial, Helvetica, sans-serif" size="2">Code</font></td>
<td width="10"><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="FoodInfo" property="code" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Food Name</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="FoodInfo" property="food" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Price</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="FoodInfo" property="price" /></font></td>
</tr>

</body>
</html>