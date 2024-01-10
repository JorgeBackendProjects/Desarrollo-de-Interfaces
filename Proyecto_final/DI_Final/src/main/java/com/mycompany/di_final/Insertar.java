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
 * This JFrame is created with the intention of 
 * inserting a row in the client table of the 
 * database using the data entered in the form.
 */
public class Insertar extends javax.swing.JFrame implements ItemListener {

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
     * This default constructor initializes the JDBC 
     * connectors and adds the options to the menu.
     * 
     * @throws SQLException Launches an exception in case there is a problem when performing the operation with the database.
     */
    public Insertar() throws SQLException {
        initComponents();
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
        sta = conexion.createStatement();

        groupAlojado.add(radioSi);
        groupAlojado.add(radioNo);
        
        groupTerminos.add(checkSi);
        groupTerminos.add(checkNo);

        scrollPane.setVisible(false);
        datos.setVisible(false);
        
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

        groupAlojado = new javax.swing.ButtonGroup();
        groupTerminos = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        nombreL = new javax.swing.JLabel();
        edadL = new javax.swing.JLabel();
        telefonoL = new javax.swing.JLabel();
        habitacionL = new javax.swing.JLabel();
        fechaL = new javax.swing.JLabel();
        nombreI = new javax.swing.JTextField();
        edadI = new javax.swing.JTextField();
        telefonoI = new javax.swing.JTextField();
        habitacionI = new javax.swing.JTextField();
        fechaI = new javax.swing.JTextField();
        dniL = new javax.swing.JLabel();
        dniI = new javax.swing.JTextField();
        nacionalidadL = new javax.swing.JLabel();
        nacionalidadI = new javax.swing.JComboBox<>();
        mensajeL = new javax.swing.JLabel();
        numeroL = new javax.swing.JLabel();
        numeroI = new javax.swing.JTextField();
        insertarB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        scrollPane = new javax.swing.JScrollPane();
        datos = new javax.swing.JTextArea();
        alojadoL = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        radioSi = new javax.swing.JRadioButton();
        radioNo = new javax.swing.JRadioButton();
        terminosL = new javax.swing.JLabel();
        checkSi = new javax.swing.JCheckBox();
        checkNo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 102, 102));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        titulo1.setText("INSERTAR UN CLIENTE");
        panel.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 29, -1, -1));

        nombreL.setText("Nombre:");
        panel.add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        edadL.setText("Edad:");
        panel.add(edadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        telefonoL.setText("Telefono:");
        panel.add(telefonoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        habitacionL.setText("Habitación:");
        panel.add(habitacionL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        fechaL.setText("FechaLlegada:");
        panel.add(fechaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));
        panel.add(nombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 123, -1));
        panel.add(edadI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 123, -1));
        panel.add(telefonoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 123, -1));
        panel.add(habitacionI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 123, -1));
        panel.add(fechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 123, -1));

        dniL.setText("DNI:");
        panel.add(dniL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        panel.add(dniI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 123, -1));

        nacionalidadL.setText("Nacionalidad:");
        panel.add(nacionalidadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        nacionalidadI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Francés", "Italiano", "Alemán", "Sueco", "Inglés", "Americano", "Africano", "Nórdico", "Chino" }));
        panel.add(nacionalidadI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 120, -1));

        mensajeL.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        mensajeL.setText("SE HAN INSERTADO LOS DATOS CORRECTAMENTE:");
        panel.add(mensajeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 96, -1, -1));

        numeroL.setText("NumeroNoches:");
        panel.add(numeroL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));
        panel.add(numeroI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 123, -1));

        insertarB.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        insertarB.setText("Insertar");
        insertarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBActionPerformed(evt);
            }
        });
        panel.add(insertarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 125, 46));

        atrasB.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        atrasB.setText("Atras");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });
        panel.add(atrasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 125, 46));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 123, 10));
        panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 123, 10));
        panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 123, 10));
        panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 123, 10));
        panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 123, 10));
        panel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 123, 10));
        panel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 123, 10));

        datos.setColumns(20);
        datos.setRows(5);
        scrollPane.setViewportView(datos);

        panel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 310, 310));

        alojadoL.setText("Alojado:");
        panel.add(alojadoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));
        panel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 123, 10));

        radioSi.setText("Si");
        radioSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiActionPerformed(evt);
            }
        });
        panel.add(radioSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        radioNo.setText("No");
        radioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoActionPerformed(evt);
            }
        });
        panel.add(radioNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        terminosL.setText("¿Aceptas los términos? :");
        panel.add(terminosL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, -1, -1));

        checkSi.setText("Si");
        panel.add(checkSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 40, -1));

        checkNo.setText("No");
        panel.add(checkNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method associates an event with the insert button, 
     * whose function is to verify that data has been entered 
     * in all fields and that the DNI has 9 characters. 
     * 
     * If it is fulfilled, it makes an SQL statement of data 
     * insertion and displays it on the screen using a JTextArea 
     * and a message descriptive of the operation. 
     * 
     * In case any data does not meet these conditions, a descriptive 
     * message will be displayed saying that the data has not been inserted.
     * 
     * @param evt 
     */
    private void insertarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBActionPerformed
        try {

            //COMPROBATION OF DNI DATA
            if(checkSi.isSelected()){
                
                if (radioSi.isSelected() && dniI.getText().length() == 9 && !nombreI.getText().isBlank() && !dniI.getText().isBlank() && !nacionalidadI.getSelectedItem().toString().isBlank() && !edadI.getText().isBlank() && !telefonoI.getText().isBlank() && !habitacionI.getText().isBlank() && !fechaI.getText().isBlank() && !numeroI.getText().isBlank()) {
                    sta.executeUpdate("Insert into clientes (Nombre, DNI, Nacionalidad, Edad, Telefono, Habitacion, FechaLlegada, NumeroNoches, Alojado) values ('" + nombreI.getText() + "', '" + dniI.getText() + "', '" + nacionalidadI.getSelectedItem() + "', " + edadI.getText() + ", '" + telefonoI.getText() + "', " + habitacionI.getText() + ", '" + fechaI.getText() + "', " + numeroI.getText() + ", 'Si');");
                    mensajeL.setVisible(true);
                    datos.setText("Nombre: " + nombreI.getText() + "\n"
                            + "DNI: " + dniI.getText() + "\n"
                            + "Edad: " + edadI.getText() + "\n"
                            + "Nacionalidad: " + nacionalidadI.getSelectedItem() + "\n"
                            + "Telefono: " + telefonoI.getText() + "\n"
                            + "Habitacion: " + habitacionI.getText() + "\n"
                            + "FechaLlegada: " + fechaI.getText() + "\n"
                            + "NumeroNoches: " + numeroI.getText() + "\n"
                            + "Alojado: Si");
                } else if(radioNo.isSelected() && dniI.getText().length() == 9 && !nombreI.getText().isBlank() && !dniI.getText().isBlank() && !nacionalidadI.getSelectedItem().toString().isBlank() && !edadI.getText().isBlank() && !telefonoI.getText().isBlank() && !habitacionI.getText().isBlank() && !fechaI.getText().isBlank() && !numeroI.getText().isBlank()){
                    sta.executeUpdate("Insert into clientes (Nombre, DNI, Nacionalidad, Edad, Telefono, Habitacion, FechaLlegada, NumeroNoches, Alojado) values ('" + nombreI.getText() + "', '" + dniI.getText() + "', '" + nacionalidadI.getSelectedItem().toString() + "', " + edadI.getText() + ", '" + telefonoI.getText() + "', " + habitacionI.getText() + ", '" + fechaI.getText() + "', " + numeroI.getText() + ", 'No');");
                    mensajeL.setVisible(true);
                    datos.setText("Nombre: " + nombreI.getText() + "\n"
                            + "DNI: " + dniI.getText() + "\n"
                            + "Edad: " + edadI.getText() + "\n"
                            + "Nacionalidad: " + nacionalidadI.getSelectedItem().toString() + "\n"
                            + "Telefono: " + telefonoI.getText() + "\n"
                            + "Habitacion: " + habitacionI.getText() + "\n"
                            + "FechaLlegada: " + fechaI.getText() + "\n"
                            + "NumeroNoches: " + numeroI.getText() + "\n"
                            + "Alojado: No");
                }

                nombreI.setText("");
                dniI.setText("");
                edadI.setText("");
                telefonoI.setText("");
                habitacionI.setText("");
                fechaI.setText("");
                numeroI.setText("");

                alojadoL.setVisible(false);
                dniI.setVisible(false);
                dniL.setVisible(false);
                edadI.setVisible(false);
                edadL.setVisible(false);
                fechaI.setVisible(false);
                fechaL.setVisible(false);
                habitacionI.setVisible(false);
                habitacionL.setVisible(false);
                jSeparator2.setVisible(false);
                jSeparator3.setVisible(false);
                jSeparator4.setVisible(false);
                jSeparator5.setVisible(false);
                jSeparator6.setVisible(false);
                jSeparator7.setVisible(false);
                jSeparator8.setVisible(false);
                jSeparator9.setVisible(false);
                nombreI.setVisible(false);
                nombreL.setVisible(false);
                numeroI.setVisible(false);
                numeroL.setVisible(false);
                nacionalidadI.setVisible(false);
                nacionalidadL.setVisible(false);

                radioNo.setVisible(false);
                radioSi.setVisible(false);

                telefonoI.setVisible(false);
                telefonoL.setVisible(false);

                scrollPane.setVisible(true);
                datos.setVisible(true);
            
            }else{
                mensajeL.setVisible(true);
                mensajeL.setText("El usuario debe aceptar las condiciones");
            }

        } catch (SQLException ex) {
            mensajeL.setText("NO SE HAN INSERTADO LOS DATOS");
            mensajeL.setVisible(true);
        }
    }//GEN-LAST:event_insertarBActionPerformed

    /**
     * This method associates an event with the back button, 
     * which allows you to switch windows by instantiating an 
     * object in the window and setting the current visibility to false.
     * 
     * @param evt 
     */
    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
        try {
            // TODO add your handling code here:
            Inicio i = new Inicio();

            this.setVisible(false);
            i.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atrasBActionPerformed

    private void radioSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSiActionPerformed

    private void radioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNoActionPerformed

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
        if (e.getItem() == rojo) {
            panel.setBackground(Color.red);

        }

        if (e.getItem() == amarillo) {
            panel.setBackground(Color.yellow);

        }

        if (e.getItem() == verde) {
            panel.setBackground(Color.green);

        }

        if (e.getItem() == cyan) {
            panel.setBackground(Color.cyan);

        }
        if (e.getItem() == negro) {
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
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Insertar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alojadoL;
    private javax.swing.JButton atrasB;
    private javax.swing.JCheckBox checkNo;
    private javax.swing.JCheckBox checkSi;
    private javax.swing.JTextArea datos;
    private javax.swing.JTextField dniI;
    private javax.swing.JLabel dniL;
    private javax.swing.JTextField edadI;
    private javax.swing.JLabel edadL;
    private javax.swing.JTextField fechaI;
    private javax.swing.JLabel fechaL;
    private javax.swing.ButtonGroup groupAlojado;
    private javax.swing.ButtonGroup groupTerminos;
    private javax.swing.JTextField habitacionI;
    private javax.swing.JLabel habitacionL;
    private javax.swing.JButton insertarB;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel mensajeL;
    private javax.swing.JComboBox<String> nacionalidadI;
    private javax.swing.JLabel nacionalidadL;
    private javax.swing.JTextField nombreI;
    private javax.swing.JLabel nombreL;
    private javax.swing.JTextField numeroI;
    private javax.swing.JLabel numeroL;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioSi;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField telefonoI;
    private javax.swing.JLabel telefonoL;
    private javax.swing.JLabel terminosL;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables

    
}
