/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronones_disenio;

import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import PatronCompositive.compositive_Tablero;
import javax.swing.ImageIcon;
import PatronBuilder.DeporteBuilder;
import PatronBuilder.AnimalBuilder;
import PatronBuilder.ObjetoBuilder;
import java.awt.Dimension;

/**
 *
 * @author kevin
 */
public class GUI extends javax.swing.JFrame implements ActionListener{

    LinkedList<User> lista = new LinkedList<User>();
    /**
     * Creates new form GUI
     */
    
    //Dificultad del juegp
    public String dificultad;
    //private Compuesto matriz;
    //Matriz de botones
    JButton bMatriz [][];
    compositive_Tablero Matriz;
    //Variables del tamaño del tablero, dependen del nivel x,y
    int Tam_x;
    int Tam_y;
    public GUI(String dificultad) {
        initComponents();
        this.dificultad = "";
        this.jl_NombreUser.setText("Robin");
        this.jl_Puntaje.setText("10");
        this.jp_Juego.setBackground(Color.GRAY);
        this.jp_DatosUser.setBackground(Color.green);
        
        juego acciones_juego = new juego();
        if (dificultad.equals("Facil")) {
            AnimalBuilder tipo_animal = new AnimalBuilder();
            ArrayList<String> imagenes = new ArrayList<String>();
            imagenes.add("perro");imagenes.add("gato");imagenes.add("zorro");
            imagenes.add("aguila");imagenes.add("foca");imagenes.add("elefante");
            Tam_x = 3;
            Tam_y = 4;
            bMatriz = acciones_juego.getBotonesFacil(3,4);
            Matriz = acciones_juego.getMatrizFacil(imagenes, 3, 4, tipo_animal);
            jp_Juego.add(acciones_juego.getTableroFacil(bMatriz,3,4));
            agregarEventos(Tam_x, Tam_y);
            this.setMinimumSize(new Dimension(680, 270));
            this.pack();            
        } else if(dificultad.equals("Intermedio")) {
            DeporteBuilder tipo_deporte = new DeporteBuilder();
            ArrayList<String> imagenes = new ArrayList<String>();
            imagenes.add("futbol");imagenes.add("basket");imagenes.add("beisbol");imagenes.add("tenis");imagenes.add("golf");
            imagenes.add("americano");imagenes.add("vaya");imagenes.add("pesa");imagenes.add("gimnasia");imagenes.add("barca");
            Tam_x = 4;
            Tam_y = 5;
            bMatriz = acciones_juego.getBotonesFacil(4,5);
            Matriz = acciones_juego.getMatrizIntermedio(imagenes, 4, 5, tipo_deporte);
            jp_Juego.add(acciones_juego.getTableroFacil(bMatriz,4,5));
            agregarEventos(Tam_x, Tam_y);
            this.setMinimumSize(new Dimension(800, 480));
            this.pack();            
        }else{
            ObjetoBuilder tipo_objeto = new ObjetoBuilder();
            ArrayList<String> imagenes = new ArrayList<String>();
            imagenes.add("casa");imagenes.add("arbol");imagenes.add("silla");imagenes.add("cama");imagenes.add("puerta");
            imagenes.add("tasa");imagenes.add("tenedor");imagenes.add("cuchara");imagenes.add("carro");imagenes.add("moto");
            imagenes.add("bicicleta");imagenes.add("sofa");imagenes.add("borrador");imagenes.add("lapicero");imagenes.add("pluma");
            imagenes.add("camisa");imagenes.add("cuaderno");imagenes.add("laptop");imagenes.add("raton");imagenes.add("calculadora");
            Tam_x = 5;
            Tam_y = 8;
            bMatriz = acciones_juego.getBotonesFacil(5,8);
            Matriz = acciones_juego.getMatrizDificil(imagenes, 5, 8, tipo_objeto);
            jp_Juego.add(acciones_juego.getTableroFacil(bMatriz,5,8));
            agregarEventos(Tam_x, Tam_y);
            this.setMinimumSize(new Dimension(1100, 580));
            this.pack();
        }
    }
    
    public void agregarEventos(int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                bMatriz[i][j].addActionListener(this);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_DatosUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jl_NombreUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jl_Puntaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_Tiempo1 = new javax.swing.JLabel();
        jp_Juego = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_Nuevo_ = new javax.swing.JMenuItem();
        jmi_Reiniciar_ = new javax.swing.JMenuItem();
        jmi_Salir_ = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_Puntaje_ = new javax.swing.JMenuItem();
        jmi_Top_ = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmi_Acerca_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("GROBOLD", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jl_NombreUser.setFont(new java.awt.Font("GROBOLD", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("GROBOLD", 0, 14)); // NOI18N
        jLabel2.setText("Tiempo:");

        jl_Puntaje.setFont(new java.awt.Font("GROBOLD", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("GROBOLD", 0, 14)); // NOI18N
        jLabel3.setText("Puntaje:");

        jl_Tiempo1.setFont(new java.awt.Font("GROBOLD", 0, 12)); // NOI18N

        javax.swing.GroupLayout jp_DatosUserLayout = new javax.swing.GroupLayout(jp_DatosUser);
        jp_DatosUser.setLayout(jp_DatosUserLayout);
        jp_DatosUserLayout.setHorizontalGroup(
            jp_DatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DatosUserLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jp_DatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jp_DatosUserLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jp_DatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_NombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jp_DatosUserLayout.setVerticalGroup(
            jp_DatosUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DatosUserLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_NombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_Tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_Puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_JuegoLayout = new javax.swing.GroupLayout(jp_Juego);
        jp_Juego.setLayout(jp_JuegoLayout);
        jp_JuegoLayout.setHorizontalGroup(
            jp_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        jp_JuegoLayout.setVerticalGroup(
            jp_JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Nuevo");

        jmi_Nuevo_.setText("Nuevo Juego");
        jmi_Nuevo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Nuevo_ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Nuevo_);

        jmi_Reiniciar_.setText("Reiniciar Juego");
        jmi_Reiniciar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Reiniciar_ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Reiniciar_);

        jmi_Salir_.setText("Salir");
        jmi_Salir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Salir_ActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Salir_);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Estadisticas");

        jmi_Puntaje_.setText("Puntaje");
        jmi_Puntaje_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Puntaje_ActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_Puntaje_);

        jmi_Top_.setText("Top 5");
        jmi_Top_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Top_ActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_Top_);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Extra");

        jmi_Acerca_.setText("Acerca De");
        jmi_Acerca_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Acerca_ActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_Acerca_);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_DatosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_DatosUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //===================================== Botones del menu Nuevo =====================================
    private void jmi_Nuevo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Nuevo_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_Nuevo_ActionPerformed

    private void jmi_Reiniciar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Reiniciar_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_Reiniciar_ActionPerformed

    private void jmi_Salir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Salir_ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmi_Salir_ActionPerformed

    
    //================================== Botones del menu Estadisticas ==================================
    private void jmi_Puntaje_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Puntaje_ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, lista.get(0).getUser());
    }//GEN-LAST:event_jmi_Puntaje_ActionPerformed

    private void jmi_Top_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Top_ActionPerformed
        // TODO add your handling code here:
        User us = new User();
        us.setUser(jl_NombreUser.getText());
        us.setPuntaje(Integer.parseInt(jl_Puntaje.getText()));
        lista.add(us);
    }//GEN-LAST:event_jmi_Top_ActionPerformed

    
    
    //=================================== Botones del menu Extras =====================================
    private void jmi_Acerca_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Acerca_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_Acerca_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel jl_NombreUser;
    public static javax.swing.JLabel jl_Puntaje;
    public static javax.swing.JLabel jl_Tiempo1;
    private javax.swing.JMenuItem jmi_Acerca_;
    private javax.swing.JMenuItem jmi_Nuevo_;
    private javax.swing.JMenuItem jmi_Puntaje_;
    private javax.swing.JMenuItem jmi_Reiniciar_;
    private javax.swing.JMenuItem jmi_Salir_;
    private javax.swing.JMenuItem jmi_Top_;
    private javax.swing.JPanel jp_DatosUser;
    private javax.swing.JPanel jp_Juego;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < Tam_x; i++) {
            for (int j = 0; j < Tam_y; j++) {
                if (e.getSource() == bMatriz[i][j]) {
                    String location[] = bMatriz[i][j].getName().split(",");
                    int x = Integer.parseInt(location[1]);
                    int y = Integer.parseInt(location[0]);
                    String ruta = "../Imagenes/"+Matriz.getRuta(x, y)+".jpg";
                    bMatriz[i][j].setIcon(new ImageIcon(getClass().getResource(ruta)));
                }
            }
        }
    }
}
