/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package D.I.Tema2;

/**
 *
 * @author tarde
 */
public class actividad8 extends javax.swing.JFrame {

    private javax.swing.JPanel newPanel;
    private javax.swing.JComboBox newComboBox;
    private javax.swing.JRadioButton option1RadioButton, option2RadioButton, option3RadioButton, option4RadioButton; 
    private boolean firstTime = true;
    
    /**
     * Creates new form actividad8
     */
    public actividad8() {
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

        optionTextField1 = new javax.swing.JTextField();
        optionLabel1 = new javax.swing.JLabel();
        optionLabel2 = new javax.swing.JLabel();
        optionLabel3 = new javax.swing.JLabel();
        optionLabel4 = new javax.swing.JLabel();
        optionTextField2 = new javax.swing.JTextField();
        optionTextField3 = new javax.swing.JTextField();
        optionTextField4 = new javax.swing.JTextField();
        panelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        optionLabel1.setText("Opcion 1");

        optionLabel2.setText("Opcion 2");

        optionLabel3.setText("Opcion 3");

        optionLabel4.setText("Opcion 4");

        panelButton.setText("Generar");
        panelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(optionTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionLabel3)
                            .addComponent(optionLabel2)
                            .addComponent(optionLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(optionTextField1)
                            .addComponent(optionTextField3)
                            .addComponent(optionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionLabel1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionLabel2)
                    .addComponent(optionTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionLabel3)
                    .addComponent(optionTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionLabel4)
                    .addComponent(optionTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(panelButton)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelButtonActionPerformed
        // TODO add your handling code here:
        createPanel();
    }//GEN-LAST:event_panelButtonActionPerformed

    private void createPanel(){
        
        if(firstTime == false){
            this.remove(newPanel);
        }
        
        newPanel = new javax.swing.JPanel();
        newPanel.setVisible(true);
        newPanel.setSize(100, 100);
        
        //Asignamos los valores introducidos en la aplicacion
        newPanel.setLocation(200, 75);
        java.awt.Color color = new java.awt.Color(173, 216, 230);
        newPanel.setBackground(color);
        newPanel.setSize(300, 400);
        
        this.add(newPanel);
        this.paint(getGraphics());
        firstTime = false;
        
        newComboBox = new javax.swing.JComboBox();
        
        newComboBox.addItem(optionTextField1.getText());
        newComboBox.addItem(optionTextField2.getText());
        newComboBox.addItem(optionTextField3.getText());
        newComboBox.addItem(optionTextField4.getText());
        
        option1RadioButton = new javax.swing.JRadioButton();
        option2RadioButton = new javax.swing.JRadioButton();
        option3RadioButton = new javax.swing.JRadioButton();
        option4RadioButton = new javax.swing.JRadioButton();
        
        option1RadioButton.setText(optionTextField1.getText());
        option2RadioButton.setText(optionTextField2.getText());
        option3RadioButton.setText(optionTextField3.getText());
        option4RadioButton.setText(optionTextField4.getText());
        
        newPanel.add(newComboBox);
        newPanel.add(option1RadioButton);
        newPanel.add(option2RadioButton);
        newPanel.add(option3RadioButton);
        newPanel.add(option4RadioButton);
        
    }
    
    
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
            java.util.logging.Logger.getLogger(actividad8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actividad8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actividad8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actividad8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actividad8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel optionLabel1;
    private javax.swing.JLabel optionLabel2;
    private javax.swing.JLabel optionLabel3;
    private javax.swing.JLabel optionLabel4;
    private javax.swing.JTextField optionTextField1;
    private javax.swing.JTextField optionTextField2;
    private javax.swing.JTextField optionTextField3;
    private javax.swing.JTextField optionTextField4;
    private javax.swing.JButton panelButton;
    // End of variables declaration//GEN-END:variables
}