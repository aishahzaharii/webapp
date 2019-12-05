<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Readymade Coffee For You!</title>
</head>
<body>
<form method="get">

Choice:
<br/>
<select name="readymade">
<option value=5>Asian Dolce Latte RM5.00</option>
<option value=5.5 >Caramel Macchiato RM5.50</option>
<option value=5>Caffè Mocha RM5.00</option>
<option value=6>Caffè Americano RM6.00</option>
<option value=7>"Caffè_Latte">Caffè Latte RM7.00</option>
</select>

Temperature:
<br/>
<input type="radio" name="temperature" value="hot"> Hot
<input type="radio" name="temperature" value="cold"> Cold

<input type="submit" value="submit"/>
</form>
 <%=
  double readymade = request.getParameterValues("readymade"); %>

 
   <%     if( readymade=5)  
  		 {
           return 5;
    	}
   
   		if( readymade=5.5 ) 
		{
      		return 5.5;
		}
   		if( readymade=5 ) 
   		{
   	      	return 5.0;
   		}
   		
   		if( readymade=6 ) 
   	   	{
   	   	     return 6.0;
   	   	}
   		else 
   		{
             return 7.0;
         }
   %> 
    
</body>
</html>
