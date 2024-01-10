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
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 * This JFRAME allows to update the data of a row of the database.
 * 
 * @author Usuario
 */
public class Actualizar extends javax.swing.JFrame implements ItemListener{

    private JFrame frame = this;
    
    private Connection conexion;
    private Statement sta;
    private ResultSet rs;
    
    private JMenuBar menu;
    private JMenu colorFondo;
    private JMenuItem inicio, cerrarSesion, cerrarPrograma, ayuda;
    private JRadioButtonMenuItem rojo, cyan, verde, amarillo, negro;
    private ButtonGroup grupo;
    
    /**
     * This default builder initializes the JDBC 
     * connectors and the menu next to their options.
     * 
     * @throws SQLException Launches an exception in case there is a problem when performing the operation with the database.
     */
    public Actualizar() throws SQLException {
        initComponents();
        
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
        sta = conexion.createStatement();
        mensajeL.setVisible(false);
        
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
        
        //SECOND MENU OPTION
        inicio = new JMenuItem("Inicio");
        
        /**
         * This event is associated with the Start of the menu option. 
         * 
         * This allows you to navigate the starting JFRAME.
         */
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Inicio i = new Inicio();
                    i.setVisible(true);
                    
                    frame.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
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
        
        menu.add(inicio);
        menu.add(colorFondo);
        menu.add(ayuda);
        menu.add(cerrarSesion);
        menu.add(cerrarPrograma);
        
        this.setJMenuBar(menu);
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
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        consultaI = new javax.swing.JTextField();
        buscarB = new javax.swing.JButton();
        mensajeL = new javax.swing.JLabel();
        nombreL = new javax.swing.JLabel();
        nombreI = new javax.swing.JTextField();
        dniL = new javax.swing.JLabel();
        dniI = new javax.swing.JTextField();
        edadL = new javax.swing.JLabel();
        edadI = new javax.swing.JTextField();
        telefonoL = new javax.swing.JLabel();
        telefonoI = new javax.swing.JTextField();
        habitacionL = new javax.swing.JLabel();
        habitacionI = new javax.swing.JTextField();
        fechaL = new javax.swing.JLabel();
        fechaI = new javax.swing.JTextField();
        numeroL = new javax.swing.JLabel();
        numeroI = new javax.swing.JTextField();
        alojadoI = new javax.swing.JTextField();
        alojadoL = new javax.swing.JLabel();
        actualizarB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 153, 51));

        titulo1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        titulo1.setText("ACTUALIZAR REGISTRO");

        titulo2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        titulo2.setText("DNI del cliente:");

        consultaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIActionPerformed(evt);
            }
        });

        buscarB.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buscarB.setText("Buscar");
        buscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBActionPerformed(evt);
            }
        });

        mensajeL.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        mensajeL.setText("SE HAN ACTUALIZADO CORRECTAMENTE LOS DATOS");

        nombreL.setText("Nombre:");

        dniL.setText("DNI:");

        edadL.setText("Edad:");

        telefonoL.setText("Telefono:");

        habitacionL.setText("Habitación:");

        fechaL.setText("FechaLlegada:");

        numeroL.setText("NumeroNoches:");

        alojadoL.setText("Alojado(Si/No):");

        actualizarB.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        actualizarB.setText("Actualizar");
        actualizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBActionPerformed(evt);
            }
        });

        atrasB.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        atrasB.setText("Atras");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(dniL)
                                .addGap(70, 70, 70)
                                .addComponent(dniI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(edadL)
                                .addGap(64, 64, 64)
                                .addComponent(edadI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(telefonoL)
                                .addGap(44, 44, 44)
                                .addComponent(telefonoI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(habitacionL)
                                .addGap(32, 32, 32)
                                .addComponent(habitacionI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(numeroL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(fechaL)
                                    .addGap(18, 18, 18)
                                    .addComponent(fechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(alojadoL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alojadoI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(nombreL)
                                    .addGap(46, 46, 46)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(consultaI, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombreI, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titulo1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(atrasB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(actualizarB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(mensajeL))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titulo1)
                .addGap(23, 23, 23)
                .addComponent(mensajeL)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo2)
                    .addComponent(consultaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscarB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nombreL))
                    .addComponent(nombreI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dniL))
                    .addComponent(dniI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(edadL))
                    .addComponent(edadI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(telefonoL))
                    .addComponent(telefonoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(habitacionL))
                    .addComponent(habitacionI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(fechaL))
                    .addComponent(fechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroL)
                    .addComponent(numeroI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alojadoL)
                    .addComponent(alojadoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atrasB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIActionPerformed
        
    }//GEN-LAST:event_consultaIActionPerformed

    /**
     * This event associated with the search button allows you to 
     * consult the database if the length of the inserted ID is correct. 
     * 
     * Then write the data received in your corresponding entry.
     * 
     * @param evt 
     */
    private void buscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBActionPerformed
        try {
            if(dniI.getText().length() == 9){
                rs = sta.executeQuery("Select * from clientes where DNI='" + consultaI.getText() + "';");
                rs.next();

                nombreI.setText(rs.getString("Nombre"));
                dniI.setText(rs.getString("DNI"));
                edadI.setText(rs.getInt("Edad") + "");
                telefonoI.setText(rs.getString("Telefono"));
                habitacionI.setText(rs.getInt("Habitacion") + "");
                fechaI.setText(rs.getString("FechaLlegada"));
                numeroI.setText(rs.getInt("NumeroNoches") + "");
                alojadoI.setText(rs.getString("Alojado"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarBActionPerformed

    /**
     * This event associated with the Update button allows 
     * you to modify the data desired from an SQL query. 
     * 
     * It shows a descriptive message about the operation on the screen.
     * 
     * @param evt 
     */
    private void actualizarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBActionPerformed
        try {
            if(dniI.getText().length() == 9 && !nombreI.getText().isBlank() && !dniI.getText().isBlank() && !edadI.getText().isBlank() && !telefonoI.getText().isBlank() && !habitacionI.getText().isBlank() && !fechaI.getText().isBlank() && !numeroI.getText().isBlank()){
                sta.executeUpdate("Update clientes set Nombre = '" + nombreI.getText() + "', DNI = '" + dniI.getText() + "', Edad = " + edadI.getText() + ", Telefono = '" + telefonoI.getText() + "', Habitacion = " + habitacionI.getText() + ", FechaLlegada = '" + fechaI.getText() + "', NumeroNoches = " + numeroI.getText() + ", Alojado = '" + alojadoI.getText() + "' where DNI ='" + consultaI.getText() + "';");

                nombreI.setText("");
                dniI.setText("");
                edadI.setText("");
                telefonoI.setText("");
                habitacionI.setText("");
                fechaI.setText("");
                numeroI.setText("");
                alojadoI.setText("");

                mensajeL.setText("SE HAN ACTUALIZADO CORRECTAMENTE LOS DATOS");
                mensajeL.setVisible(true);
            }
        } catch (SQLException ex) {
            if(dniI.getText().isBlank()){
                System.err.println("Introduce el DNI");
            }
            mensajeL.setText("NO SE HAN ACTUALIZADO LOS DATOS");
            mensajeL.setVisible(true);
        }
    }//GEN-LAST:event_actualizarBActionPerformed

    /**
     * This event is associated with the back button and allows you 
     * to navigate the previous JFRAME, in this case it is the start. 
     * 
     * He does it by instance an object and putting this JFRAME as not visible.
     * 
     * @param evt 
     */
    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
        try {
            // TODO add your handling code here:
            Inicio i = new Inicio();

            i.setVisible(true);
            this.setVisible(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atrasBActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Actualizar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarB;
    private javax.swing.JTextField alojadoI;
    private javax.swing.JLabel alojadoL;
    private javax.swing.JButton atrasB;
    private javax.swing.JButton buscarB;
    private javax.swing.JTextField consultaI;
    private javax.swing.JTextField dniI;
    private javax.swing.JLabel dniL;
    private javax.swing.JTextField edadI;
    private javax.swing.JLabel edadL;
    private javax.swing.JTextField fechaI;
    private javax.swing.JLabel fechaL;
    private javax.swing.JTextField habitacionI;
    private javax.swing.JLabel habitacionL;
    private javax.swing.JLabel mensajeL;
    private javax.swing.JTextField nombreI;
    private javax.swing.JLabel nombreL;
    private javax.swing.JTextField numeroI;
    private javax.swing.JLabel numeroL;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField telefonoI;
    private javax.swing.JLabel telefonoL;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables

    
}