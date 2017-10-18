<%-- 
    Document   : keranjangBelanja
    Created on : 18-Oct-2017, 08:11:13
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="keranjang" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Keranjang Detail</title>
    </head>
    <body>
        <h1>Keranjang</h1>
        <keranjang:forEach items="${produk}" var="k">
            <p>
                ${k.namaproduk}
            </p>
        </keranjang:forEach>
            <a href="produk/all"><button>Kembali</button></a>
    </body>
</html>
