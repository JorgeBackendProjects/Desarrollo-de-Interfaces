/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.di_final;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This JFRAME is dynamically created, allows you to consult the database.
 * 
 * @author Usuario
 */
public class Consultar extends javax.swing.JFrame implements ItemListener{

    private JFrame frame = this;
    private JPanel panel, botones;
    
    private Connection conexion;
    private Statement sta;
    private ResultSet rs;
    
    private JLabel titulo, dniL;
    private JTextField dniI;
    private JButton atrasB, consultarB;
    private JTextArea datos;
    private JScrollPane scroll;
    
    private JMenuBar menu;
    private JMenu colorFondo;
    private JMenuItem inicio, cerrarSesion, cerrarPrograma, ayuda;
    private JRadioButtonMenuItem rojo, cyan, verde, amarillo, negro;
    private ButtonGroup grupo;
    
    /**
     * This parameter builder initializes the JDBC connectors, 
     * a panel on which some of the elements, the menu and 
     * their options will be added and finally use of 
     * BorderLayout to place the elements.
     * 
     * @throws SQLException Launches an exception in case there is a problem when performing the operation with the database.
     */
    public Consultar() throws SQLException {
        initComponents();
        
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
        sta = conexion.createStatement();
        
        panel = new JPanel();
        panel.setSize(1000, 1000);
        panel.setLocation(0, 0);
        panel.setVisible(true);
        
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

        
        scroll = new JScrollPane();
        
        titulo = new JLabel("CONSULTAR CLIENTE");
        titulo.setFont(new java.awt.Font("Serif", 1, 24));
        titulo.setSize(500, 50);
        titulo.setLocation(100, 50);
        titulo.setVisible(true);

        dniL = new JLabel("DNI del cliente:");
        dniL.setFont(new java.awt.Font("Serif", 1, 12));
        dniL.setSize(100, 50);
        dniL.setLocation(25, 25);
        dniL.setVisible(true);

        dniI = new JTextField();
        dniI.setPreferredSize(new Dimension(100, 25));
        dniI.setLocation(125, 25);
        dniI.setVisible(true);
        
        datos = new JTextArea();
        datos.setSize(300, 200);
        datos.setLocation(25, 175);
        datos.setColumns(20);
        datos.setRows(5);
        scroll.setViewportView(datos);
        datos.setVisible(false);

        consultarB = new JButton("Consultar");
        consultarB.setSize(100, 35);
        consultarB.setLocation(240, 190);
        consultarB.setVisible(true);
        
        /**
         * This event associated with the Box Consult allows you to 
         * consult a customer through its DNI, and then show your data 
         * on screen through a JTextArea.
         */
        consultarB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    rs = sta.executeQuery("Select * from clientes where DNI='" + dniI.getText() + "';");
                    rs.next();
                    
                    
                    datos.setText(
                    "Nombre: " + rs.getString("Nombre") + "\n"
                    + "DNI: " + rs.getString("DNI") + "\n"
                    + "Nacionalidad: " + rs.getString("Nacionalidad") + "\n"
                    + "Edad: " + rs.getInt("Edad") + "\n"
                    + "Telefono: " + rs.getString("Telefono") + "\n"
                    + "Habitación: " + rs.getInt("Habitacion") + "\n"
                    + "Fecha llegada: " + rs.getString("FechaLlegada") + "\n"
                    + "Numero noches: " + rs.getInt("NumeroNoches") + "\n"
                    + "Alojado: " + rs.getString("Alojado"));
                    
                    datos.setVisible(true);
                } catch (SQLException ex) {
                    if(dniI.getText().isBlank()){
                        System.err.println("Introduce el DNI");
                    }
                }
            }
        });

        atrasB = new JButton("Atras");
        atrasB.setSize(100, 50);
        atrasB.setLocation(50, 600);
        atrasB.setVisible(true);
        
        /**
         * This event is associated with the back button and allows you 
         * to navigate the previous JFRAME, in this case it is the start. 
         * 
         * He does it by instance an object and putting this JFRAME as not visible.
         */
        atrasB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Inicio i = new Inicio();
                    i.setVisible(true);
                    frame.setVisible(false);

                } catch (SQLException ex) {
                    Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        this.setBackground(Color.green);
        panel.setBackground(Color.green);
        
        //LAYOUT
        
        botones = new JPanel();
        botones.setSize(500, 200);
        botones.add(consultarB);
        botones.add(atrasB);
        
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        this.add(titulo, BorderLayout.NORTH);
        this.add(botones, BorderLayout.SOUTH);
       
        panel.add(dniL);
        panel.add(dniI);
        panel.add(datos);
        
        this.add(panel);
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
            .addGap(0, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consultar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
