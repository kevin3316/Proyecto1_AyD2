/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronCompositive;
import PatronBuilder.Carta;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public abstract class componente_Tablero {
    ArrayList<Carta> nivel = new ArrayList<Carta>();
    public componente_Tablero(ArrayList<Carta> nivel){
        this.nivel = nivel;
    }
    
    abstract public void agregar(componente_Tablero c);
    abstract public String getRuta(int x, int y);
    abstract public void mostrar(int profundidad);
}
