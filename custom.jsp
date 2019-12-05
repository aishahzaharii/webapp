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
  background-color: #dbc5b6;
}

i {
	 font-size: 30px;
}
</style>
<center>
<i>Good Days Start With Coffee and You</i>

<br><br>

<form method="post" action="total.jsp">
Coffee:
<select >
<option name="coffee" value="5"></option>
<option name="coffee" value="5">Asian Dolce Latte (RM5)</option>
<option name="coffee" value="5.5">Caramel Macchiato (rm5.5)</option>
<option name="coffee" value="5">Caffe Mochae (RM5)</option>
<option name="coffee" value="6">Caffe Americano (RM6)</option>
<option name="coffee" value="7">Cafe Latte (RM7)</option>

</select>

<br><br>

Flavour:
<select >
<option name="flavour" value="3"></option>
<option name="flavour" value="3">French Vanilla (RM3)</option>
<option name="flavour" value="3">Caramel Macchiato (RM3)</option>
<option name="flavour" value="3">Mocha (RM3)</option>
<option name="flavour" value="3">Hazelnut (RM3)</option>
</select>

<br><br>

Topping:
<select >
<option name="topping" value="2"></option>
<option name="topping" value="2">Cinnamon (RM2)</option>
<option name="topping" value="2">Nutmeg (RM2)</option>
<option name="topping" value="2">Whipped Cream (RM2)</option>
<option name="topping" value="2">Mint (RM2)</option>
<option name="topping" value="2">Nuttela (RM2)</option>
<option name="topping" value="2">Ice Cream (RM2)</option>
<option name="topping" value="2">Chocolate (RM2)</option>
</select>

<br><br>

Quantity:
<br/>
<select >
<option quantity="quantity" value="1"></option>
<option quantity="quantity" value="1">1</option>
<option quantity="quantity" value="2">2</option>
<option quantity="quantity" value="3">3</option>
<option quantity="quantity" value="4">4</option>
<option quantity="quantity" value="5">5</option>
</select>

<br><br>

Temperature:
<br/>
<input type="radio" name="temperature" value="hot"> Hot
<input type="radio" name="temperature" value="cold"> Cold
<br><br>


<button type="submit" value="submit"/>Submit</button>
</form>
</center>
</body>
</html>