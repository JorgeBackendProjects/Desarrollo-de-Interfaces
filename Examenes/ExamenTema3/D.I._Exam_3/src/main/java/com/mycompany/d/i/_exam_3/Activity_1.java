/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.d.i._exam_3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author tarde
 */
public class Activity_1 extends javax.swing.JFrame{

    private JPanel greenPanel;
    private JButton blueButton, pinkButton, cleanButton;
    private JLabel textLabel;
    private JScrollPane scrollPanel;
    private JList scrollList;

    /**
     * Creates new form Activity_1
     */
    public Activity_1() {
        initComponents();
        initNewComponents();
    }

    public void initNewComponents() {

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setSize(500, 200);
        greenPanel.setLocation(10, 10);
        greenPanel.setVisible(true);

        blueButton = new JButton();
        blueButton.setSize(70, 25);
        blueButton.setLocation(10, 340);
        blueButton.setText("Blue");
        blueButton.setVisible(true);

        pinkButton = new JButton();
        pinkButton.setSize(70, 25);
        pinkButton.setLocation(220, 340);
        pinkButton.setText("Pink");
        pinkButton.setVisible(true);

        cleanButton = new JButton();
        cleanButton.setSize(70, 25);
        cleanButton.setLocation(440, 340);
        cleanButton.setText("Clean");
        cleanButton.setVisible(true);

        textLabel = new JLabel();
        textLabel.setText("This is the panel which gets the events");
        textLabel.setSize(225, 25);
        textLabel.setLocation(250, 25);
        textLabel.setForeground(Color.black);
        textLabel.setVisible(true);

        scrollPanel = new JScrollPane();
        scrollPanel.setSize(500,100);
        scrollPanel.setLocation(10, 220);
        scrollPanel.setVisible(true);
        
        scrollList = new JList();
        scrollList.setSize(500,100);
        scrollList.setLocation(10, 220);
        scrollList.setVisible(true);
        
        scrollPanel.add(scrollList);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                greenPanel.setBackground(Color.blue);
                JLabel t = new JLabel();
                t.setText("you have pressed the blue button");
                scrollList.add(t);
            }
        };
        
        blueButton.addActionListener(al);
        
        ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                greenPanel.setBackground(Color.pink);
                JLabel t = new JLabel();
                t.setText("you have pressed the pink button");
                scrollList.add(t);
            }
        };
        
        pinkButton.addActionListener(al2);
        
        ActionListener al3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                scrollList.removeAll();
                greenPanel.setBackground(Color.green);
            }
        };
        
        cleanButton.addActionListener(al3);
        
        this.changePanel();
        
        this.add(greenPanel);
        this.add(blueButton);
        this.add(pinkButton);
        this.add(cleanButton);
        this.add(textLabel);
        this.add(scrollPanel);
        this.add(scrollList);
        
        this.paint(this.getGraphics());
               
    }
    
    public void changePanel(){
        
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                greenPanel.setBackground(Color.black);
                textLabel.setForeground(Color.white);
                textLabel.setBackground(Color.yellow);
                JLabel t = new JLabel();
                t.setText("you have on the panel");
                scrollList.add(t);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                greenPanel.setBackground(Color.green);
                textLabel.setForeground(Color.black);
                JLabel t = new JLabel();
                t.setText("you have out the panel");
                scrollList.add(t);
            }
        }; 
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
            java.util.logging.Logger.getLogger(Activity_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
