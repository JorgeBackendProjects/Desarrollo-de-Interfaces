/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relacion_ejercicios_tema_4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Propietario
 */
public class Ejercicio_2 extends javax.swing.JFrame {

    private JButton botonAzul, botonRojo, botonVerde;
    private JPanel panelAmarillo, panelMorado;
    
    public Ejercicio_2() {
        initComponents();
        ejercicio2();
    }
    
    public void ejercicio2(){
        
        this.setLayout(new BorderLayout());

        
        panelAmarillo = new JPanel();
        panelAmarillo.setPreferredSize(new Dimension(300, 100));
        panelAmarillo.setBackground(Color.yellow);
        panelAmarillo.setVisible(true);
        
        panelMorado = new JPanel();
        panelMorado.setPreferredSize(new Dimension(300, 100));
        panelMorado.setBackground(new Color(128, 0, 128));
        panelMorado.setVisible(true);
        
        botonAzul = new JButton();
        botonAzul.setBackground(Color.cyan);
        botonAzul.setText("Boton Azul");
        botonAzul.setVisible(true);
        
        botonRojo = new JButton();
        botonRojo.setBackground(Color.red);
        botonRojo.setText("Boton Rojo");
        botonRojo.setVisible(true);
        
        botonVerde = new JButton();
        botonVerde.setBackground(Color.green);
        botonVerde.setText("Boton Verde");
        botonVerde.setVisible(true);
        
        this.add(panelAmarillo, BorderLayout.NORTH);
        this.add(panelMorado, BorderLayout.SOUTH);
        this.add(botonAzul, BorderLayout.WEST);
        this.add(botonRojo, BorderLayout.CENTER);
        this.add(botonVerde, BorderLayout.EAST);
        
        this.paint(this.getGraphics());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ejercicio_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
