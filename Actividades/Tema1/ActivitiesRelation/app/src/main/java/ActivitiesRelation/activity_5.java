/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ActivitiesRelation;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tarde
 */
public class activity_5 extends javax.swing.JFrame {

    /**
     * Creates new form activity_5
     */
    public activity_5() {
        initComponents();
        
        listButtonGroup.add(azListRadioButton);
        listButtonGroup.add(zaListRadioButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listButtonGroup = new javax.swing.ButtonGroup();
        azListRadioButton = new javax.swing.JRadioButton();
        zaListRadioButton = new javax.swing.JRadioButton();
        azListTextField = new javax.swing.JTextField();
        zaListTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        azListRadioButton.setText("A-Z List");
        azListRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azListRadioButtonActionPerformed(evt);
            }
        });

        zaListRadioButton.setText("Z-A List");
        zaListRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zaListRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zaListRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zaListTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(azListRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(azListTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(azListRadioButton)
                .addGap(32, 32, 32)
                .addComponent(azListTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(zaListRadioButton)
                .addGap(34, 34, 34)
                .addComponent(zaListTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void azListRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azListRadioButtonActionPerformed
        // TODO add your handling code here:
        
        ArrayList <String> arrayAZ = new ArrayList <String>();
        
        arrayAZ.add("Atihoka");
        arrayAZ.add("Beans");
        arrayAZ.add("Zucchini");
        arrayAZ.add("Onion");
        arrayAZ.add("Pumpkin");
        arrayAZ.add("Mushrooms");
        arrayAZ.add("Pine");
        
        Collections.sort(arrayAZ);
        
        azListTextField.setText(arrayAZ.get(0) + ", " + arrayAZ.get(1) + ", " + arrayAZ.get(2) + ", " + arrayAZ.get(3) + ", " + arrayAZ.get(4) + ", " + arrayAZ.get(5) + ", " + arrayAZ.get(6));
        zaListTextField.setText("");
        
    }//GEN-LAST:event_azListRadioButtonActionPerformed

    private void zaListRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zaListRadioButtonActionPerformed
        // TODO add your handling code here:
        
        ArrayList <String> arrayZA = new ArrayList <String>();
        
        arrayZA.add("Atihoka");
        arrayZA.add("Beans");
        arrayZA.add("Zucchini");
        arrayZA.add("Onion");
        arrayZA.add("Pumpkin");
        arrayZA.add("Mushrooms");
        arrayZA.add("Pine");
        
        Collections.sort(arrayZA);
        
        zaListTextField.setText(arrayZA.get(6) + ", " + arrayZA.get(5) + ", " + arrayZA.get(4) + ", " + arrayZA.get(3) + ", " + arrayZA.get(2) + ", " + arrayZA.get(1) + ", " + arrayZA.get(0));
        azListTextField.setText("");
        
    }//GEN-LAST:event_zaListRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new activity_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton azListRadioButton;
    private javax.swing.JTextField azListTextField;
    private javax.swing.ButtonGroup listButtonGroup;
    private javax.swing.JRadioButton zaListRadioButton;
    private javax.swing.JTextField zaListTextField;
    // End of variables declaration//GEN-END:variables
}