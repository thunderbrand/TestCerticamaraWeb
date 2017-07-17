/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.carroApp.javatest;

import java.util.Scanner;
import LoginMVC.carroApp.pista.Pista;
import LoginMVC.carroApp.carro.Carro;
import LoginMVC.carroApp.interprete.Interprete;

/**
 *
 * @author juan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int fil, col;
        fil = 5;
        col = 7;
        String com, marcaDelarro;
        char fin;

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        // num1 = teclado.nextInt();
        // num2 = teclado.nextInt();
        Carro mazda = new Carro();

        System.out.println("inicio de la simulación");

        // p.Resultado(num1, num2);
        marcaDelarro = mazda.marcaDelCarro();

        Pista p = new Pista(fil, col, marcaDelarro);

        Interprete cmdint = new Interprete();

        do {

            System.out.println("Escriba el comando");

            com = teclado.next();

            cmdint.recibirCom(com);

            p.indexOf(marcaDelarro);

            p.ModPista(cmdint.VectorPosMagNor, cmdint.VectorPosDirNor, marcaDelarro);

            p.MostrarPista();
            
            System.out.println("seguir? (s/n) ");
            
            fin = teclado.next().charAt(0);
            
            
        } 
        
        while (fin != 'n' );
        /*boolean existe = p.existeElemento(marcaDelarro);

        if (existe) {
            System.out.println(marcaDelarro + " existe");
        } else {
            System.out.println(marcaDelarro + " no existe");
        }*/

        

    
    }

}
