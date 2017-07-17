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
public interface GenPista {
        
    public void indexOf(String carro);
    public void ModPista(int[] VectorPosMag, String[] VectorPosDir, String carro);
    public boolean existeElemento(String elemento);
    public void MostrarPista();
    
}
