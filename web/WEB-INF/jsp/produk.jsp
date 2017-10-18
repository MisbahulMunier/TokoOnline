<%-- 
    Document   : customer
    Created on : Oct 13, 2017, 3:34:00 PM
    Author     : Misbahul Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Produk</h1>
        <h3>Total Keranjang: ${keranjang.size()}</h3>
        <c:forEach var="c" items="${produk}">
            <p><a href="${c.id}">${c.namaproduk}</a></p>
        </c:forEach>
            
            <a href="../keranjangbelanja">Lihat Keranjang</a>
    </body>
</html>
