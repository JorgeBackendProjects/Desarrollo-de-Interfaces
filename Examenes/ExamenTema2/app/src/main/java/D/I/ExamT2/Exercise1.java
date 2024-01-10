/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package D.I.ExamT2;

import java.awt.Color;
import javax.swing.JPanel;
import org.checkerframework.checker.units.qual.g;

/**
 *
 * @author tarde
 */
public class Exercise1 extends javax.swing.JFrame {

    private boolean firstTime = true;
    javax.swing.JPanel newPanel;
    javax.swing.JComboBox outputComboBox;
    javax.swing.JRadioButton output1RadioButton;
    javax.swing.JRadioButton output2RadioButton;
    javax.swing.JRadioButton output3RadioButton;
    javax.swing.JLabel message;
    
    /**
     * Creates new form Exercise1
     */
    public Exercise1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createButton = new javax.swing.JButton();
        input1TextField = new javax.swing.JTextField();
        input2TextField = new javax.swing.JTextField();
        input3TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(input2TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(input3TextField))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(input1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(input2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(input3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(createButton)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        if(input1TextField.getText().length()>=1 && input2TextField.getText().length()>=1 && input3TextField.getText().length()>=1){
            
            newPanel = new javax.swing.JPanel();
            outputComboBox = new javax.swing.JComboBox();
            output1RadioButton = new javax.swing.JRadioButton();
            output2RadioButton = new javax.swing.JRadioButton(); 
            output3RadioButton = new javax.swing.JRadioButton();

            output1RadioButton.setText(input1TextField.getText());
            output2RadioButton.setText(input2TextField.getText());
            output3RadioButton.setText(input3TextField.getText());
                
            outputComboBox.setBackground(Color.green);
            outputComboBox.add(output1RadioButton);
            outputComboBox.add(output2RadioButton);
            outputComboBox.add(output3RadioButton);
                
            newPanel.setLocation(200, 200);
            newPanel.setSize(100,100);
            newPanel.setVisible(true);

            

            newPanel.add(outputComboBox);
            newPanel.add(output1RadioButton);
            newPanel.add(output2RadioButton);
            newPanel.add(output3RadioButton);
            
            this.add(newPanel);
            this.paint(getGraphics());
            
        }else{
            
            message = new javax.swing.JLabel();
            message.setVisible(true);
            message.setText("Fill in all the fields");
            this.add(message);
            this.paint(getGraphics());
            
        }  
    }//GEN-LAST:event_createButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Exercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JTextField input1TextField;
    private javax.swing.JTextField input2TextField;
    private javax.swing.JTextField input3TextField;
    // End of variables declaration//GEN-END:variables
}
