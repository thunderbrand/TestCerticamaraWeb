<%-- 
    Document   : carro
    Created on : 16/07/2017, 08:02:11 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pista</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Pista</h1>

        <div class="row">

            <div class="col-md-3 display-no" style="display: block;">
                <div class="form-group ui-draggable-handle" style="position: static;">

                    <input class="form-control" id="com" placeholder="Ingrese el comando" type="text">
                    <label for="com">Ingrese el comando</label>

                </div>
            </div>
            <div class="col-md-3 display-no" style="display: block;">
                <div class="form-group pd-right ui-draggable-handle" style="position: static;">
                    <label for="button3"></label>
                    <button id="button3" type="submit" class="btn btn-primary" onclick="actPista();">Enviar</button>
                </div>
            </div>
        </div>

        <div class="row" id="resultados">
            <div class="col-lg-12 col-md-12">
                <div class="panel panel-primary ">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            Pista
                        </h4>

                    </div>
                    <br />
                    <div class="panel-body">
                        <table class="table table-bordered " id="table1">

                            <tbody></tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/carro.js" type="text/javascript"></script>

    </body>
</html>
