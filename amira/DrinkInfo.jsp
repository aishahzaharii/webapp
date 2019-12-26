<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<jsp:useBean id="DrinkInfo" class="restoran.Drink" scope="session" />
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
<td colspan="3" align="center"><font face="Arial, Helvetica, sans-serif" size="2"><b>Add New Drink</b></font></td>
</tr>
<tr>
<td width="100"><font face="Arial, Helvetica, sans-serif" size="2">Code</font></td>
<td width="10"><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="DrinkInfo" property="code" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Drink Name</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="DrinkInfo" property="drink" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Price</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="DrinkInfo" property="price" /></font></td>
</tr>

</body>
</html>

