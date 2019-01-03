<%--
  Created by IntelliJ IDEA.
  User: justin
  Date: 03/01/2019
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<div id="content">
  <h1>Product Discount Calculator</h1>
  <form method="post" action="/display-discount">
    <div id="data">
      <label>Product Description:</label>
      <input type="text" name="description"/><br/>
      <label>List Price:</label>
      <input type="number" name="price" value="0"/><br/>
      <label>Discount Percent:</label>
      <input type="number" name="discount_percent" value="0"/><br/>
    </div>
    <div id="buttons">
      <label>&nbsp;</label>
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
</div>
</body>
</html>
