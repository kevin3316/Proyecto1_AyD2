/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder;

/**
 *
 * @author robin
 */
public class Carta {
    private String Tipo = "";
    private String Ruta = "";
    private int match = 0;
    private Carta Arriba = null;
    private Carta Abajo = null;
    private Carta Derecha = null;
    private Carta Izquierda = null;

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public void setArriba(Carta Arriba) {
        this.Arriba = Arriba;
    }

    public void setAbajo(Carta Abajo) {
        this.Abajo = Abajo;
    }

    public void setDerecha(Carta Derecha) {
        this.Derecha = Derecha;
    }

    public void setIzquierda(Carta Izquierda) {
        this.Izquierda = Izquierda;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getRuta() {
        return Ruta;
    }

    public int getMatch() {
        return match;
    }

    public Carta getArriba() {
        return Arriba;
    }

    public Carta getAbajo() {
        return Abajo;
    }

    public Carta getDerecha() {
        return Derecha;
    }

    public Carta getIzquierda() {
        return Izquierda;
    }
    
}
