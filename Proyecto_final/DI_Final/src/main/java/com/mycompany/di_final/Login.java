/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.di_final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 * This is the main frame that will allow a hotel employee 
 * to log in to perform several operations with the database 
 * regarding their customers.
 * 
 * @author Usuario
 */
public class Login extends javax.swing.JFrame implements ItemListener{

    private JFrame frame = this;
    
    private Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
    private Statement sta = conexion.createStatement();
    private ResultSet rs;
    
    private JMenuBar menu;
    private JMenu colorFondo;
    private JMenuItem cerrarSesion, cerrarPrograma, ayuda;
    private JRadioButtonMenuItem rojo, cyan, verde, amarillo, negro;
    private ButtonGroup grupo;
    
    /**
     * This is the default constructor, it initializes the menu 
     * with its options and assigns images to JLabel components.
     */
    
    /**
     * This is the default constructor, it initializes the menu 
     * with its options and assigns images to JLabel components.
     * 
     * @throws SQLException Launches an exception in case there is a problem when performing the operation with the database.
     */
    public Login() throws SQLException{
        initComponents();
        
        menu = new JMenuBar();
        
        //FIRST MENU OPTION
        colorFondo = new JMenu("Color de Fondo");
        grupo = new ButtonGroup();
        rojo = new JRadioButtonMenuItem("Rojo");
        rojo.addItemListener(this);
        grupo.add(rojo);
        cyan = new JRadioButtonMenuItem("Cyan");
        grupo.add(cyan);
        cyan.addItemListener(this);
        verde = new JRadioButtonMenuItem("Verde");
        verde.addItemListener(this);
        grupo.add(verde);
        amarillo = new JRadioButtonMenuItem("Amarillo");
        amarillo.addItemListener(this);
        grupo.add(amarillo);
        negro = new JRadioButtonMenuItem("Negro");
        grupo.add(negro);
        negro.addItemListener(this);
        colorFondo.add(rojo);
        colorFondo.add(cyan);
        colorFondo.add(verde);
        colorFondo.add(amarillo);
        colorFondo.add(negro);
        
        //THIRD MENU OPTION
        cerrarSesion = new JMenuItem("Cerrar Sesion");
        
        /**
         * This event is associated with the Menu Close Session option. 
         * 
         * This allows to navigate to the login screen, in which we must log in.
         */
        cerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Login i = new Login();
                    i.setVisible(true);
                    
                    frame.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //FOURTH MENU OPTION
        ayuda = new JMenuItem("Ayuda");
        
        /**
         * This event is associated with the Help option. 
         * 
         * This sample on the screen a modal dialog that will block the 
         * interaction with the rest of the application through the 
         * ShowMessageDialog method of the JOptionpane class, indicating 
         * on what frame should appear and a message.
         */
        ayuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Has accedido a la ayuda de la app");
            }
        });
        
        //FIFTH MENU OPTION
        cerrarPrograma = new JMenuItem("Cerrar Programa");
        
        /**
         * This event is associated with the Close Program.
         * 
         * This closes the program by clicking on him.
         */
        cerrarPrograma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        menu.add(colorFondo);
        menu.add(ayuda);
        menu.add(cerrarSesion);
        menu.add(cerrarPrograma);
        
        this.setJMenuBar(menu);

        
        ImageIcon user = new ImageIcon("src\\main\\java\\imagenes\\usuario.png");
        userImage1.setIcon(user);
        
        ImageIcon password = new ImageIcon("src\\main\\java\\imagenes\\password.png");
        passwordImage.setIcon(password);
        
        ImageIcon login = new ImageIcon("src\\main\\java\\imagenes\\acceder.png");
        botonAcceso.setIcon(login);
        
        ImageIcon i = new ImageIcon("src\\main\\java\\imagenes\\dondo2.jpg");
        image.setIcon(i);
        
        this.paint(getGraphics());   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        userI = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordI = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        titulo2 = new javax.swing.JLabel();
        botonAcceso = new javax.swing.JButton();
        passwordImage = new javax.swing.JLabel();
        userImage1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(255, 248, 220));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userI.setBackground(new java.awt.Color(255, 248, 220));
        userI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userI.setBorder(null);
        panel.add(userI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 290, -1));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 290, 10));

        passwordI.setBackground(new java.awt.Color(255, 248, 220));
        passwordI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordI.setBorder(null);
        panel.add(passwordI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 290, -1));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 290, 10));

        titulo2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        titulo2.setText("ACCESO AL PERSONAL DEL HOTEL");
        panel.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 368, -1));

        botonAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccesoActionPerformed(evt);
            }
        });
        panel.add(botonAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 80, 40));
        panel.add(passwordImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 51, 49));
        panel.add(userImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 51, 49));
        panel.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -1, 540, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method associates an event with the login button. 
     * 
     * Make a query with the name received from the user and 
     * check if the data entered corresponds to those received 
     * from the query to allow access and switch windows.
     * 
     * @param evt 
     */
    private void botonAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccesoActionPerformed
        try {
            rs = sta.executeQuery("Select * from personal where nombre = '" + userI.getText() + "';");
            rs.next();

            if(userI.getText().equals(rs.getString("nombre")) && passwordI.getText().equals(rs.getString("password")) && passwordI.getText().length()<=18){
                panel.setVisible(false);
        
                Inicio inicio = new Inicio();
                inicio.setVisible(true);

                this.setVisible(false); 
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
            userI.setText("Usuario o contraseña incorrecto/a");
            passwordI.setText("Usuario o contraseña incorrecto/a");
        }       
    }//GEN-LAST:event_botonAccesoActionPerformed

    /**
     * This overwritten method belongs to the ItemListener interface. 
     * 
     * In this case it is used to give functionality to the color 
     * options of the menu, detecting when each one is pressed
     * by means of if checks.
     * 
     * @param e 
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getItem() == rojo){
            panel.setBackground(Color.red);
            
        }
        
        if(e.getItem() == amarillo){
            panel.setBackground(Color.yellow);
        
        }
        
        if(e.getItem() == verde){
            panel.setBackground(Color.green);
        
        }
        
        if(e.getItem() == cyan){
            panel.setBackground(Color.cyan);
        
        }
        if(e.getItem() == negro){
            panel.setBackground(Color.black);        
        }   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceso;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField passwordI;
    private javax.swing.JLabel passwordImage;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField userI;
    private javax.swing.JLabel userImage1;
    // End of variables declaration//GEN-END:variables

    

    
}
