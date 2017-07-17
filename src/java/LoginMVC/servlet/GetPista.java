/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

// se importan las clases de la app principal
import LoginMVC.carroApp.pista.Pista;
import LoginMVC.carroApp.carro.Carro;
import LoginMVC.carroApp.interprete.Interprete;

/**
 *
 * @author juan
 */
public class GetPista extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
        int fil, col;
        fil = 5;
        col = 7;
        String com, marcaDelarro;

        //com recibe del post ajax
        com  = "0,N";
        //inicializacion de todos los objetos
        Carro mazda = new Carro();
        marcaDelarro = mazda.marcaDelCarro();
        Pista p = new Pista(fil, col, marcaDelarro);
        Interprete cmdint = new Interprete();
        cmdint.recibirCom(com);
        p.indexOf(marcaDelarro);

        p.ModPista(cmdint.VectorPosMagNor, cmdint.VectorPosDirNor, marcaDelarro);
        
        JSONObject obj = new JSONObject();
        
        /*
        obj.put("Blog", "http://javainutil.blogspot.com");
        obj.put("Temas", "Informatica");
        obj.put("Inicio", new Integer(2012));
        */

        JSONArray fila1 = new JSONArray();
        fila1.add(p.pista[0][0]);
        fila1.add(p.pista[0][1]);
        fila1.add(p.pista[0][2]);
        fila1.add(p.pista[0][3]);
        fila1.add(p.pista[0][4]);
        fila1.add(p.pista[0][5]);
        fila1.add(p.pista[0][6]);
        
        JSONArray fila2 = new JSONArray();
        fila2.add(p.pista[1][0]);
        fila2.add(p.pista[1][1]);
        fila2.add(p.pista[1][2]);
        fila2.add(p.pista[1][3]);
        fila2.add(p.pista[1][4]);
        fila2.add(p.pista[1][5]);
        fila2.add(p.pista[1][6]);
        
        JSONArray fila3 = new JSONArray();
        fila3.add(p.pista[2][0]);
        fila3.add(p.pista[2][1]);
        fila3.add(p.pista[2][2]);
        fila3.add(p.pista[2][3]);
        fila3.add(p.pista[2][4]);
        fila3.add(p.pista[2][5]);
        fila3.add(p.pista[2][6]);
        
        JSONArray fila4 = new JSONArray();
        fila4.add(p.pista[3][0]);
        fila4.add(p.pista[3][1]);
        fila4.add(p.pista[3][2]);
        fila4.add(p.pista[3][3]);
        fila4.add(p.pista[3][4]);
        fila4.add(p.pista[3][5]);
        fila4.add(p.pista[3][6]);
        
        JSONArray fila5 = new JSONArray();
        fila5.add(p.pista[4][0]);
        fila5.add(p.pista[4][1]);
        fila5.add(p.pista[4][2]);
        fila5.add(p.pista[4][3]);
        fila5.add(p.pista[4][4]);
        fila5.add(p.pista[4][5]);
        fila5.add(p.pista[4][6]);
        
        obj.put("fila1", fila1);
        obj.put("fila2", fila2);
        obj.put("fila3", fila3);
        obj.put("fila4", fila4);
        obj.put("fila5", fila5);

        /*
        JSONObject innerObj = new JSONObject();
        innerObj.put("PostX", "Escribir un JSON");
        innerObj.put("PostY", "Leer un JSON");
        innerObj.put("PostZ", "lalala");

        obj.put("Posts", innerObj);
        */

        out.print(obj.toString());
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
