<!-- set the session to true -->
<%@ page session="true" %>

<jsp:useBean id="EmployeeInfo" class="restoran.Employee" scope="session" />
<jsp:setProperty name = "EmployeeInfo" property = "*"/>
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
<td colspan="3" align="center"><font face="Arial, Helvetica, sans-serif" size="2"><b>Employee Registration</b></font></td>
</tr>

</tr>
<tr>
<td width="100"><font face="Arial, Helvetica, sans-serif" size="2">Id</font></td>
<td width="10"><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="id" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Name</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="name" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Gender</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="gender" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Ic No</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="icno" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Date of Birth</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="dateOfBirth" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Address</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="address" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Marital Status</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="marital" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Religion</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="religion" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Phone No</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="phoneno" /></font></td>
</tr>
<tr>
<td><font face="Arial, Helvetica, sans-serif" size="2">Department</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2">:</font></td>
<td><font face="Arial, Helvetica, sans-serif" size="2"><jsp:getProperty name="EmployeeInfo" property="department" /></font></td>
</tr>
<tr>
<td colspan="3">&nbsp;</td>
</tr>


</table>
</body>
</html>
