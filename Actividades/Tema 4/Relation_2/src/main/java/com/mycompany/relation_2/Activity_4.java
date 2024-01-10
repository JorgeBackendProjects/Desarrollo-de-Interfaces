/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author Propietario
 */
public class Activity_4 extends javax.swing.JFrame {

    private JToolBar toolBar;
    private JMenu fontSize, colorText;
    int textSize = 10;
    private JMenuItem increase, decrease, red, green, black, blue, exitOption;
    private JPanel pane;
    private JLabel label;
    private JTextField textField;
    
    /**
     * Creates new form Activity_3
     */
    public Activity_4() {
        initComponents();
        init();
    }
    
    public void init(){
        
        this.setLayout(new BorderLayout());
        
        pane = new JPanel();
        pane.setSize(500, 250);
        pane.setBackground(Color.cyan);
        
        label = new JLabel("Commentaries");
        label.setSize(100, 50);
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        
        pane.add(label);
        pane.add(textField);
        
        toolBar = new JToolBar();
        toolBar.setVisible(true);
        
        //First menu
        increase = new JMenuItem("Increase size label");
        increase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(textSize == 20){
                    textField.setFont(new Font("FONT", Font.ITALIC, 20));
                    increase.setVisible(false);
                }else{
                    textSize++;
                    textField.setFont(new Font("FONT", Font.ITALIC, textSize));
                    decrease.setVisible(true);
                }   
            }
        });
        
        decrease = new JMenuItem("Decrease size label");
        decrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(textSize <= 1){
                    textField.setFont(new Font("FONT", Font.ITALIC, 1));
                    decrease.setVisible(false);
                }else{
                    textSize--;
                    textField.setFont(new Font("FONT", Font.ITALIC, textSize));
                    increase.setVisible(true);
                }   
            }
        });
        
        
        //Second menu
        red = new JMenuItem("Red color label");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.red);
            }
        });
        
        green = new JMenuItem("Green color label");
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.green);
            }
        });
        
        black = new JMenuItem("Black color label");
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.black);
            }
        });
        
        blue = new JMenuItem("Blue color label");
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setForeground(Color.blue);
            }
        });
        
        
        //Third menu
        exitOption = new JMenuItem("Exit");
        exitOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Are you sure that you want to go out for the program?");
                
                if(JOptionPane.YES_OPTION == 0){
                    System.exit(WIDTH);
                }
            }
        });
                
        
        toolBar.add(increase);
        toolBar.add(decrease);
        toolBar.addSeparator();
        toolBar.add(red);
        toolBar.add(green);
        toolBar.add(black);
        toolBar.add(blue);
        toolBar.addSeparator();
        toolBar.add(exitOption);
        
        this.add(toolBar, BorderLayout.WEST);
        this.add(pane);
        
        this.paint(this.getGraphics());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
            java.util.logging.Logger.getLogger(Activity_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
