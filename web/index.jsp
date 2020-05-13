<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/05/2020
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/calculator">
<span>Product Description:</span>
<input type="text" name="product" size="25px"><br>
<span>List Price:</span>
<input type="text" name="price" size="25px"><br>
<span>Discount Percent:</span>
<input type="text" name="discountPercent" size="25px">(%)<br>
<input type="submit" value="Calculate Discount">
</form>
</body>
</html>
