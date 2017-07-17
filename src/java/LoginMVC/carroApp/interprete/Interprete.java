/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.carroApp.interprete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author juan
 */
public class Interprete implements DefInterprete {

    public int[] VectorPosMag;
    public int[] VectorPosMagNor;
    public String[] VectorPosDir;
    public String[] VectorPosDirNor;

    @Override
    public void recibirCom(String com) {

        String delim = ";|,";  // desglosar el comando
        String[] comSepar; // se almacenan los comandos separados por ;
        comSepar = com.split(delim); // las posiciones pares empezando desde 0
        // equivalen a la cantidad de casillas a
        // avanzar y las impares a la direccion

        this.VectorPosMag = new int[comSepar.length];  // arreglo que contiene la magnitud de la posicion
        this.VectorPosDir = new String[comSepar.length]; // arreglo que contiene la direccion de la posicion

        for (int i = 0; i < comSepar.length; i++) {
            if (i % 2 == 0) {
                this.VectorPosMag[i] = Integer.parseInt(comSepar[i]); // se llena el arreglo de magnitud con el valor numerico del comando
            }
            if ((i == 1 || i % 2 != 0)) {
                this.VectorPosDir[i] = comSepar[i]; // se llena el arreglo de direccion con el valor letra del comando
            }

        }

        //normalizacion de los arreglos
        ArrayList<Integer> list1 = new ArrayList<Integer>(VectorPosMag.length);

        for (int i = 0; i < VectorPosMag.length; i++) {
            list1.add(Integer.valueOf(VectorPosMag[i]));
        }

        ArrayList<String> list2 = new ArrayList(Arrays.asList(VectorPosDir));

        list1.removeAll(Collections.singleton(0));
        list2.removeAll(Collections.singleton(null));

        int[] VectorPosMagAux = list1.stream().mapToInt(i -> i).toArray();
        String[] VectorPosDirAux = list2.toArray(new String[list2.size()]);

        this.VectorPosMagNor = new int[VectorPosDirAux.length];  // arreglo que contiene la magnitud de la posicion normalizado
        this.VectorPosDirNor = new String[VectorPosMagAux.length]; // arreglo que contiene la direccion de la posicion normalizado

        for (int i = 0; i < VectorPosDirAux.length; i++) {

            this.VectorPosMagNor[i] = VectorPosMagAux[i];
            this.VectorPosDirNor[i] = VectorPosDirAux[i];

        }
    }

}
