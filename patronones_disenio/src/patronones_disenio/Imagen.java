/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronones_disenio;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author robin
 */
public class Imagen extends javax.swing.JPanel{
    public Imagen()
    {
        this.setSize(507, 185);
    }
    
    public void paint(Graphics grafica)
    {
        Dimension height = getSize();
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/memo1.png"));
        grafica.drawImage(img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafica);
    }
}
