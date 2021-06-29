<%--
  Created by IntelliJ IDEA.
  User: Nguyen Viet Tien
  Date: 06/29/2021
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Calculator</title>
</head>
<body>
<form action="/display-discount" method="post">
    <div>
        <p>Description: <input type="text" name="description" placeholder="Enter description of product"></p>
    </div>
    <div>
        <p>Product price: <input type="text" name="price" placeholder="Product price"></p>
    </div>
    <div>
        <p>Discount percent: <input type="text" name="percent" placeholder="Discount Percent"></p>
    </div>
    <br>
    <input type="submit" id="submit" value="Discount calculate">
</form>
</body>
</html>
