<%-- 
    Document   : index
    Created on : 13/11/2014, 07:14:29 AM
    Author     : hackro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <title>Inicio</title>
        
    </head>
    <body>
        <h1>Inicio de sesión</h1>
        
        <div>
            <form action="Autenticacion" method="post">
                <p><input type="text" name="user" id="user"/></p>
                <p><input type="password" name="pass" id="pass"/></p>
                <p><input type="submit" name="Entrar" id="Entrar" value="Entrar"/></p>
                
            </form>
            
        </div>
        
        <input type="button" value="Saluda" onclick = "Saluda()"/>
        
        <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/carro.js" type="text/javascript"></script>
        
    </body>
</html>
