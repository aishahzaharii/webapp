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
  background-color: #f1c7a9;
}

i {
	 font-size: 30px;
}
</style>
<center>
<i>Good Days Start With Coffee and You</i>

<br><br><br><br>

<p>Add any Flavour : RM3</p>
<p>Add any Topping : RM2</p>


<form method="post" action="total.jsp">
Coffee:
<select name="coffee">
<option ></option>
<option value="5.00" >Asian Dolce Latte (RM5)</option>
<option value="5.50">Caramel Macchiato (rm5.5)</option>
<option value="5.00">Caffe Mochae (RM5)</option>
<option value="6.00">Caffe Americano (RM6)</option>
<option value="7.00">Cafe Latte (RM7)</option>

</select>

<br><br>

Flavour:
<select name="flavour">
<option name="" value=""></option>
<option value="3.00">French Vanilla (RM3)</option>
<option value="3.00">Caramel Macchiato (RM3)</option>
<option value="3.00">Mocha (RM3)</option>
<option value="3.00">Hazelnut (RM3)</option>
</select>

<br><br>

Topping:
<select name="topping">
<option name="" value=""></option>
<option value="2.00">Cinnamon (RM2)</option>
<option value="2.00">Nutmeg (RM2)</option>
<option value="2.00">Whipped Cream (RM2)</option>
<option value="2.00">Mint (RM2)</option>
<option value="2.00">Nuttela (RM2)</option>
<option value="2.00">Ice Cream (RM2)</option>
<option value="2.00">Chocolate (RM2)</option>
</select>

<br><br>

Quantity:
<br/>
<select name="quantity" >
<option  value=""></option>
<option  value="1">1</option>
<option  value="2">2</option>
<option  value="3">3</option>
<option  value="4">4</option>
<option  value="5">5</option>
</select>

<br><br>

Temperature:
<br/>
<input type="radio" name="temperature" value="hot"> Hot
<input type="radio" name="temperature" value="cold"> Cold

<br><br>

<h1>Choose whether to pay with Cash or Credit Card:</h1>
<br/>
<input type="radio" name="payment" value="cash"> Cash
<input type="radio" name="payment" value="credit"> Credit Cash

<br><br>

<button type="submit" value="submit"/>Submit</button>
</form>
</center>
</body>
</html>