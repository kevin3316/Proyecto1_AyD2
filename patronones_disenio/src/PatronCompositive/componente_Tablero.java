/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronCompositive;

/**
 *
 * @author kevin
 */
public abstract class componente_Tablero {
    String nombre;
    public componente_Tablero(String nombre){
        this.nombre = nombre;
    }
    
    abstract public void agregar(componente_Tablero c);
    abstract public String getRuta(int x, int y);
}
