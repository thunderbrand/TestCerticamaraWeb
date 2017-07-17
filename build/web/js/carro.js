/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function actPista() {

    var com = $('#com').val();
    
    $.ajax({
       type: 'POST',
        url: 'WebService',
       data: {
           com
       },
        success: function (data) {
            $("#table1 tbody").html("");

            var fila1 = data.fila1;
            var fila2 = data.fila2;
            var fila3 = data.fila3;
            var fila4 = data.fila4;
            var fila5 = data.fila5;

            var row1 = "<tr>"
                    + "<td>" + fila1 + "</td>"
                    + "</tr>";

            var row2 = "<tr>"
                    + "<td>" + fila2 + "</td>"
                    + "</tr>";

            var row3 = "<tr>"
                    + "<td>" + fila3 + "</td>"
                    + "</tr>";

            var row4 = "<tr>"
                    + "<td>" + fila4 + "</td>"
                    + "</tr>";

            var row5 = "<tr>"
                    + "<td>" + fila5 + "</td>"
                    + "</tr>";

            $(row1).appendTo("#table1 tbody");
            $(row2).appendTo("#table1 tbody");
            $(row3).appendTo("#table1 tbody");
            $(row4).appendTo("#table1 tbody");
            $(row5).appendTo("#table1 tbody");


        },
        error: function (xhr) {
            alert('error');
        }
    });
}

