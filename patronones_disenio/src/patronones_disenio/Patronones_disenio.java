/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronones_disenio;
import PatronBuilder.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Patronones_disenio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        GUI ventana = new GUI();
        ventana.show(true);
        
        /*DeporteBuilder dep = new DeporteBuilder();
        AnimalBuilder ab = new AnimalBuilder();
        ObjetoBuilder ob = new ObjetoBuilder();
        NodoCarta nc = new NodoCarta();
        nc.setCartaBuilder(ab);
        nc.ConstruirCarta("ruta especificada",1);
        
        Carta c = nc.getCarta();
        JOptionPane.showMessageDialog(null," tipo:" + c.getTipo() + "  ruta: " + c.getRuta());
        */
    }
    
}
