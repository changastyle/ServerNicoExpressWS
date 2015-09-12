<%-- 
    Document   : index
    Created on : 09-sep-2015, 12:46:46
    Author     : NicoLaptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SERVER</title>
    </head>
    <body>
        <h1>SERVER!</h1>
        <%= controller.Controller.recargarParametrosNicoExpress().toString() %>
        <br>
        <%= controller.Controller.pedirDatosTarjeta(111111).toString() %>
    </body>
</html>
