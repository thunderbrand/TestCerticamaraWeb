/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.carroApp.pista;

/**
 *
 * @author juan
 */
public class Pista implements GenPista {

    // se definiio x como direcciones este oeste y y como direcciones norte sur
    public int fil, col, xact, yact, xfin, yfin;
    public String[][] pista;
    public String east = "E";
    public String west = "O";
    public String north = "N";
    public String south = "S";

    public Pista(int fil, int col, String carro) {
        // TODO Auto-generated method stub

        this.pista = new String[fil][col];
        this.pista[4][0] = carro;
        
        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                if (null == pista[i][j])
                    pista[i][j] = "vacío";

            }
        }

    }

    @Override
    public void ModPista(int[] VectorPosMag, String[] VectorPosDir, String carro) {
        this.fil = 5;
        this.col = 7;

        for (int i = 0; i < VectorPosMag.length; i++) {

            if (VectorPosDir[i].equals(north)) {   //avanza al norte
                this.pista[xact][yact] = "vacío";
                this.pista[xact - VectorPosMag[i]][yact] = carro;
                this.xact = xact - VectorPosMag[i];

            } else if (VectorPosDir[i].equals(south)) {  //avanza al sur
                this.pista[xact][yact] = "vacío";
                this.pista[xact + VectorPosMag[i]][yact] = carro;
                this.xact = xact + VectorPosMag[i];
            } else if (VectorPosDir[i].equals(east)) {  //avanza al este
                this.pista[xact][yact] = "vacío";
                this.pista[xact][yact + VectorPosMag[i]] = carro;
                this.yact = yact + VectorPosMag[i];
            } else if (VectorPosDir[i].equals(west)) {  //avanza al oeste
                this.pista[xact][yact] = "vacío";
                this.pista[xact][yact - VectorPosMag[i]] = carro;
                this.yact = yact - VectorPosMag[i];
            }

        }

        System.out.println("\n" + carro + " está en la posicion " + yact + " , " + xact + "\n");

    }

    @Override
    public boolean existeElemento(String carro) {

        int filas = this.pista.length;
        int columnas = this.pista[0].length;
        boolean encontrado = false;

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (carro.equals(this.pista[fila][columna])) {
                    encontrado = true;
                }
            }
        }

        return encontrado;
    }

    @Override
    public void indexOf(String carro) {

        int filas = pista.length;
        int columnas = pista[0].length;

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (carro.equals(pista[fila][columna])) {
                    this.xact = fila;
                    this.yact = columna;
                }
            }

        }
    }

    @Override
    public void MostrarPista() {
        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                System.out.print(pista[i][j] + "\t");

            }
            System.out.println();
        }
    }

}
