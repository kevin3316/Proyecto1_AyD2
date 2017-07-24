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

/**
 *
 * @author kevin
 */
public class juego {
    public juego(){
        
    }
    
    public JButton[][] getBotonesFacil(){
        JButton[][] matriz = new JButton[4][3];
        return matriz;
    }
    
    public JPanel getTableroFacil(JButton [][] bMatriz){
        JPanel Panel= new JPanel();
        Panel.setLayout(new GridLayout(4, 3));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                String ss = "inicio.jpg";                               
                ImageIcon imagen = new ImageIcon(getClass().getResource(ss));
                String texto = String.valueOf(j) + "," + String.valueOf(i);
                bMatriz[i][j] = new JButton(imagen);
                bMatriz[i][j].setName(texto);                
                bMatriz[i][j].setBounds(10, 10, 60, 60);                                              
                Panel.setBounds(50, 10, 500, 400);                
                Panel.add(bMatriz[i][j]);
            }
        }
        return Panel;
    }
}
