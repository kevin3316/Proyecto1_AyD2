/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronCompositive;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class compositive_Tablero extends componente_Tablero{
    private ArrayList<componente_Tablero> hijo = new ArrayList<componente_Tablero>();
    public compositive_Tablero(String nombre){
        super(nombre);
    }

    @Override
    public void agregar(componente_Tablero c) {
        hijo.add(c);
    }

    @Override
    public String getRuta(int x, int y) {
        return hijo.get(x).nombre;
    }
    
}
