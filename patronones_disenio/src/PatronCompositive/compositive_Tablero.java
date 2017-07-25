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
public class compositive_Tablero extends componente_Tablero{
    private ArrayList<componente_Tablero> hijo = new ArrayList<componente_Tablero>();
    public compositive_Tablero(ArrayList<Carta> nivel){
        super(nivel);
    }

    @Override
    public void agregar(componente_Tablero c) {
        hijo.add(c);
    }

    @Override
    public String getRuta(int x, int y) {
        return hijo.get(x).nivel.get(y).getRuta();
    }

    @Override
    public void mostrar(int profundidad) {
        String nombre = "";
        for (int i = 0; i < nivel.size(); i++) {
            Carta temp = nivel.get(i);
            nombre = nombre + temp.getRuta() + "-" + temp.getTipo() + "<-->";
        }
        System.out.println(nombre + " nivel: " + profundidad);
        for (int i = 0; i < hijo.size(); i++)
                hijo.get(i).mostrar(profundidad + 1);
    }
    
}
