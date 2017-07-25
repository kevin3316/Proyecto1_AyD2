/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronones_disenio;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import PatronCompositive.compositive_Tablero;
import java.util.ArrayList;
import PatronBuilder.DeporteBuilder;
import PatronBuilder.AnimalBuilder;
import PatronBuilder.ObjetoBuilder;
import PatronBuilder.NodoCarta;
import PatronBuilder.Carta;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author kevin:
 * Contiene las intrucciones que se van a usar en el funcionalidad del juego
 */
public class juego {
    public juego(){
        
    }
    
    public JButton[][] getBotonesFacil(int x, int y){
        JButton[][] matriz = new JButton[x][y];
        return matriz;
    }
    
    public JPanel getTableroFacil(JButton [][] bMatriz, int x, int y){
        JPanel Panel= new JPanel();
        Panel.setLayout(new GridLayout(x, y));
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                String ss = "../Imagenes/inicio.jpg";                               
                ImageIcon imagen = new ImageIcon(getClass().getResource(ss));
                String texto = String.valueOf(j) + "," + String.valueOf(i);
                bMatriz[i][j] = new JButton(imagen);
                bMatriz[i][j].setName(texto);                
                bMatriz[i][j].setBounds(10, 10, 60, 60);                                              
                Panel.setBounds(50, 10, y*100, x*100);                
                Panel.add(bMatriz[i][j]);
            }
        }
        return Panel;
    }
    
    public compositive_Tablero getMatrizFacil(ArrayList<String> imagenes, int x, int y, AnimalBuilder tipo_animal){
        NodoCarta carta_raiz = new NodoCarta();
        carta_raiz.setCartaBuilder(tipo_animal);
        carta_raiz.ConstruirCarta("Raiz", -1);
        return getMatriz(imagenes, x, y, carta_raiz);
    }
    
    public compositive_Tablero getMatrizIntermedio(ArrayList<String> imagenes, int x, int y, DeporteBuilder tipo_deporte){
        NodoCarta carta_raiz = new NodoCarta();
        carta_raiz.setCartaBuilder(tipo_deporte);
        carta_raiz.ConstruirCarta("Raiz", -1);
        return getMatriz(imagenes, x, y, carta_raiz);
    }
    
    public compositive_Tablero getMatrizDificil(ArrayList<String> imagenes, int x, int y, ObjetoBuilder tipo_objeto){
        NodoCarta carta_raiz = new NodoCarta();
        carta_raiz.setCartaBuilder(tipo_objeto);
        carta_raiz.ConstruirCarta("Raiz", -1);
        return getMatriz(imagenes, x, y, carta_raiz);
    }
    
    private compositive_Tablero getMatriz(ArrayList<String> imagenes, int x, int y, NodoCarta carta_raiz){
        //Patron Builder *******************************
        //AnimalBuilder tipo_animal = new AnimalBuilder();
        //NodoCarta carta_raiz = new NodoCarta();
        //carta_raiz.setCartaBuilder(tipo_animal);
        //carta_raiz.ConstruirCarta("Raiz", -1);
        //Patron Builder *******************************
        
        ArrayList<Carta> raiz = new ArrayList<Carta>();
        raiz.add(carta_raiz.getCarta());
        compositive_Tablero Matriz = new compositive_Tablero(raiz);
        
        ArrayList<String> memoria = cartas_rutas(imagenes,(x*y)/2);
        Collections.shuffle(memoria);
        
        int pos = 0;
        for (int i = 0; i < x; i++) {
            ArrayList<Carta> nivel = new ArrayList<Carta>();
            for (int j = 0; j < y; j++) {
                //Patron compositive*****************************
                //NodoCarta carta = new NodoCarta();                
                //carta.setCartaBuilder(tipo_animal);
                carta_raiz.ConstruirCarta(memoria.get(pos), -1);                
                //Patron compositive*****************************
                nivel.add(carta_raiz.getCarta());
                pos = pos + 1;
            }
            compositive_Tablero hoja = new compositive_Tablero(nivel);
            Matriz.agregar(hoja);            
        }
        System.out.println(memoria);
        Matriz.mostrar(0);
        return Matriz;
    }
    
    private ArrayList<String> cartas_rutas(ArrayList<String> imagenes, int cant){
        ArrayList<String> memoria = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cant; j++) {
                memoria.add(imagenes.get(j));
            }
        }
        return memoria;
    }
    
}
