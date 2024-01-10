/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Propietario
 */
public class Activity_5 extends javax.swing.JFrame {

    private JPanel firstPane, secondPane;
    private JLabel name, surname, phone, gender, mail, address, number, city, postalCode;
    private JComboBox tgender, tcity;
    private JTextField tname, tsurname, tphone, tmail, taddress, tnumber, tpostal;
    private JButton next, previous, finish;
            
    /**
     * Creates new form Activity_5
     */
    public Activity_5() {
        initComponents();
        init();
    }

    public void init(){
        
        firstPane = new JPanel();
        firstPane.setSize(340, 500);
        firstPane.setBackground(Color.cyan);
        
        name = new JLabel("Name");
        tname = new JTextField();
        tname.setPreferredSize(new Dimension(100, 25));
        
        surname = new JLabel("Surname");
        tsurname = new JTextField();
        tsurname.setPreferredSize(new Dimension(100, 25));
        
        phone = new JLabel("Phone number");
        tphone = new JTextField();
        tphone.setPreferredSize(new Dimension(100, 25));
        
        gender = new JLabel("Gender");
        tgender = new JComboBox<String>();
        tgender.addItem(new String("Female"));
        tgender.addItem(new String("Male"));
        tgender.addItem(new String("Non-Binary"));
        
        mail = new JLabel("Mail");
        tmail = new JTextField();
        tmail.setPreferredSize(new Dimension(100, 25));
        
        next = new JButton("Next");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(!tname.getText().isEmpty() && !tsurname.getText().isEmpty() && !tphone.getText().isEmpty() && !tmail.getText().isEmpty()){
                    firstPane.setVisible(false);
                    secondPane.setVisible(true);
                }else{
                    JLabel message = new JLabel("Enter all the data");
                    firstPane.add(message);
                }
            }
        });
        
        firstPane.add(name);
        firstPane.add(tname);
        firstPane.add(surname);
        firstPane.add(tsurname);
        firstPane.add(phone);
        firstPane.add(tphone);
        firstPane.add(gender);
        firstPane.add(tgender);
        firstPane.add(mail);
        firstPane.add(tmail);
        firstPane.add(next);
        
        
        secondPane = new JPanel();
        secondPane.setSize(500, 500);
        secondPane.setBackground(Color.cyan);
        secondPane.setVisible(false);
        
        address = new JLabel("Address");
        taddress = new JTextField();
        taddress.setPreferredSize(new Dimension(100, 25));

        
        number = new JLabel("Number");
        tnumber = new JTextField();
        tnumber.setPreferredSize(new Dimension(100, 25));

        
        city = new JLabel("Address");
        tcity = new JComboBox<String>();
        tcity.addItem(new String("Ceuta"));
        tcity.addItem(new String("Granada"));
        tcity.addItem(new String("Almería"));
        tcity.addItem(new String("Málaga"));
        tcity.addItem(new String("Cádiz"));
        tcity.addItem(new String("Tenerife"));
        tcity.addItem(new String("Murcia"));
        
        postalCode = new JLabel("Postal Code");
        tpostal = new JTextField();
        tpostal.setPreferredSize(new Dimension(100, 25));

        previous = new JButton("Previous");
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondPane.setVisible(false);
                firstPane.setVisible(true);
            }
        });
        
        finish = new JButton("Finish");
        finish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Are you want send this form?");
                
                if(JOptionPane.YES_OPTION == 0){
                    System.exit(WIDTH);
                }
                
            }
        });
        
        secondPane.add(address);
        secondPane.add(taddress);
        secondPane.add(number);
        secondPane.add(tnumber);
        secondPane.add(city);
        secondPane.add(tcity);
        secondPane.add(postalCode);
        secondPane.add(tpostal);
        secondPane.add(previous);
        secondPane.add(finish);
        
        this.add(firstPane);
        this.add(secondPane);
        
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
            java.util.logging.Logger.getLogger(Activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
