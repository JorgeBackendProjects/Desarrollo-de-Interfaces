/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.relacion1_tema5;

import Actividad5.Borrar;
import Actividad5.Buscar;
import Actividad5.Insertar;
import Actividad5.Mostrar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Actividad_5 extends javax.swing.JFrame {

    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;
    private ResultSetMetaData rsmd;

    private JFrame frame;
    private JPanel panel;
    private DefaultTableModel modeloT;
    private JTable tabla;
    private JMenuBar menu;
    private JMenuItem mostrar, buscar, insertar, actualizar, borrar;
    
    private Mostrar mostrarAc;
    private Buscar buscarAc;
    private Insertar insertarAc;
    private Borrar borrarAc;

    /**
     * Creates new form Actividad1
     */
    public Actividad_5() throws SQLException {
        initComponents();

        frame = this;

        conexion();

        inicializar();

    }

    public void inicializar() throws SQLException {

        panel = new JPanel();
        panel.setSize(850, 400);
        panel.setBackground(Color.cyan);
        panel.setVisible(true);
        
        menu = new JMenuBar();
        
        modeloT = new DefaultTableModel();
        modeloT.setColumnCount(6);
        
        tabla = new JTable(modeloT);
        tabla.setSize(700, 200);
        tabla.setLocation(50, 50);
        
        mostrarDatos(modeloT);
        
        mostrar = new JMenuItem("Mostrar");
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    panel.setVisible(false);
                    
                    mostrarAc = new Mostrar();
                    mostrarAc.setSize(1000, 1000);
                    mostrarAc.mostrarDatos(modeloT);
                    mostrarAc.setVisible(true);
                    frame.add(mostrarAc);
                    
                    frame.paint(getGraphics());
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        buscar = new JMenuItem("Buscar");
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    panel.setVisible(false);
                    
                    buscarAc = new Buscar();
                    buscarAc.setSize(1000, 1000);
                    buscarAc.setVisible(true);
                    frame.add(buscarAc);
                    
                    frame.paint(getGraphics());
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        insertar = new JMenuItem("Insertar");
        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    panel.setVisible(false);
                    
                    insertarAc = new Insertar();
                    insertarAc.setSize(1000, 1000);
                    insertarAc.setVisible(true);
                    frame.add(insertarAc);
                    
                    frame.paint(getGraphics());
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        actualizar = new JMenuItem("Actualizar");
        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    panel.setVisible(false);
                    
                    mostrarAc = new Mostrar();
                    mostrarAc.setSize(1000, 1000);
                    mostrarAc.setVisible(true);
                    frame.add(mostrarAc);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        borrar = new JMenuItem("Borrar");
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    panel.setVisible(false);
                    
                    borrarAc = new Borrar();
                    borrarAc.setSize(1000, 1000);
                    borrarAc.setVisible(true);
                    frame.add(borrarAc);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        menu.add(mostrar);
        menu.add(buscar);
        menu.add(insertar);
        menu.add(actualizar);
        menu.add(borrar);

        frame.setJMenuBar(menu);

        panel.add(tabla);
        frame.add(panel);
    }

    public void mostrarDatos(DefaultTableModel modelo) throws SQLException {
        // Borrar todas las filas en la tabla
        modelo.setRowCount(0);
        
        //Campos no editables
        tabla.setEnabled(false);

        String[] nombreColumnas = new String[]{"Nombre", "Tipo", "Otro_Opcion", "Edad", "Descripcion", "Raza"};
        modelo.addRow(nombreColumnas);

        realizarConsulta("Select * from mascota limit 5");
        
        while(rs.next()){
            String[] datosFila = new String[]{rs.getString("nombre"), rs.getString("tipo"), rs.getString("otro_opcion"), rs.getInt("edad") + "", rs.getString("descripcion"), rs.getString("raza")};
            modelo.addRow(datosFila);
        }
        
        frame.paint(getGraphics());
    }
    
    public void insertarDatos(){
        
    }

    public void conexion() throws SQLException {
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
        sta = conexion.createStatement();
    }

    public ResultSet realizarConsulta(String consulta) throws SQLException {
        rs = sta.executeQuery(consulta);
        return rs;
    }

    public void manipularTablas(String consulta) throws SQLException {
        sta.executeUpdate(consulta);
    }

    public void cerrar() throws SQLException {
        rs.close();
        sta.close();
        conexion.close();
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
            java.util.logging.Logger.getLogger(Actividad_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Actividad_5().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_5.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
