<%-- 
    Document   : customerdetail
    Created on : Oct 13, 2017, 4:23:10 PM
    Author     : Misbahul Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">      
    </head>
    <body>
        <h1>ID Produk : ${produk.id}</h1>
        Nama Produk : ${produk.namaproduk}<br/>
        Harga : ${produk.harga}<br/>
        Stok : ${produk.stok}<br/>
        
        <a href="addCarts"><button type="button" class="btn btn-primary">Tambah</button></a>
    </body>
</html>
