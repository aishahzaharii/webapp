<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
body {
  background-color: #9FF4C3;
}
</style>

<a href = http://localhost:9090/Restaurant_1/login.jsp>Logout</a>
<p>Hai Nurul Amira!</p>

<form action="EmployeeForm.jsp" method ="post" align = "center">
<input type="submit" name="submit" id="submit" value="EMPLOYEE" width="100" height="100">
</form>
<br><br><br>             

<form action="Option.jsp" method ="post" align = "center">
<input type="submit" name="submit" id="submit" value="MENU" width="48" height="48">  
</form>

</body>
</html>