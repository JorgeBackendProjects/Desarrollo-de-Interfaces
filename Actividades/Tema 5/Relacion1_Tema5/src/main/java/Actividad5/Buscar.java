/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Actividad5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Buscar extends javax.swing.JPanel {

    private JPanel panel;

    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;

    private DefaultTableModel modeloT;
    private JTable tabla;
    private JLabel nombreL, tipoL;
    private JTextField nombreI;
    private ButtonGroup group;
    private JRadioButton tipo1, tipo2, tipo3, tipo4, tipo5, tipo6;
    private JButton buscar;

    /**
     * Creates new form Buscar
     */
    public Buscar() throws SQLException {
        initComponents();

        panel = this;

        conexion();

        inicializar();

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!nombreI.getText().isEmpty()) {
                    if (tipo1.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'perro' and nombre = '" + nombreI.getText() + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo2.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'gato' and nombre = '" + nombreI.getText() + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo3.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'canario' and nombre = '" + nombreI.getText() + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo4.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'hamster' and nombre = '" + nombreI.getText() + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo5.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'conejo' and nombre = '" + nombreI.getText() + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo6.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'otro' and nombre = '" + nombreI.getText() + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                }

                if (nombreI.getText().isEmpty()) {
                    if (tipo1.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'perro';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo2.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'gato';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo3.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'canario';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo4.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'hamster';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo5.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'conejo';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                    if (tipo6.isSelected()) {
                        try {
                            consultar(modeloT, "Select * from mascota where tipo = 'otro';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                            JLabel mensaje = new JLabel("No se ha encontrado resultado");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(50, 220);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                }

                if (tipo1.isSelected() == false && tipo2.isSelected() == false && tipo3.isSelected() == false && tipo4.isSelected() == false && tipo5.isSelected() == false && tipo6.isSelected() == false) {
                    try {
                        consultar(modeloT, "Select * from mascota where nombre = '" + nombreI.getText() + "';");
                    } catch (SQLException ex) {
                        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);

                        JLabel mensaje = new JLabel("No se ha encontrado resultado");
                        mensaje.setSize(500, 75);
                        mensaje.setLocation(50, 220);
                        mensaje.setForeground(Color.red);
                        mensaje.setVisible(true);

                        panel.add(mensaje);
                    }
                }

            }
        });

    }

    public void inicializar() {
        modeloT = new DefaultTableModel();
        modeloT.setColumnCount(6);

        tabla = new JTable(modeloT);
        tabla.setSize(700, 200);
        tabla.setLocation(50, 220);
        tabla.setVisible(false);

        nombreL = new JLabel("Nombre: ");
        nombreL.setLocation(25, 25);
        nombreL.setSize(70, 25);
        nombreL.setVisible(true);

        nombreI = new JTextField();
        nombreI.setLocation(100, 25);
        nombreI.setSize(100, 25);
        nombreI.setVisible(true);

        tipoL = new JLabel("Tipo: ");
        tipoL.setLocation(25, 75);
        tipoL.setSize(50, 25);
        tipoL.setVisible(true);

        group = new ButtonGroup();

        tipo1 = new JRadioButton("Perro");
        tipo1.setLocation(50, 75);
        tipo1.setSize(70, 10);
        tipo1.setVisible(true);

        tipo2 = new JRadioButton("Gato");
        tipo2.setLocation(120, 75);
        tipo2.setSize(70, 10);
        tipo2.setVisible(true);

        tipo3 = new JRadioButton("Canario");
        tipo3.setLocation(190, 75);
        tipo3.setSize(70, 10);
        tipo3.setVisible(true);

        tipo4 = new JRadioButton("Hamster");
        tipo4.setLocation(50, 100);
        tipo4.setSize(70, 10);
        tipo4.setVisible(true);

        tipo5 = new JRadioButton("Conejo");
        tipo5.setLocation(120, 100);
        tipo5.setSize(70, 10);
        tipo5.setVisible(true);

        tipo6 = new JRadioButton("Otro");
        tipo6.setLocation(190, 100);
        tipo6.setSize(70, 10);
        tipo6.setVisible(true);

        group.add(tipo1);
        group.add(tipo2);
        group.add(tipo3);
        group.add(tipo4);
        group.add(tipo5);
        group.add(tipo6);

        buscar = new JButton("Buscar");
        buscar.setSize(100, 50);
        buscar.setLocation(25, 150);
        buscar.setVisible(true);

        this.add(tabla);
        this.add(nombreI);
        this.add(nombreL);
        this.add(tipoL);
        this.add(tipo1);
        this.add(tipo2);
        this.add(tipo3);
        this.add(tipo4);
        this.add(tipo5);
        this.add(tipo6);
        this.add(buscar);
    }

    public void consultar(DefaultTableModel modelo, String consulta) throws SQLException {
        // Borrar todas las filas en la tabla
        modelo.setRowCount(0);

        //Campos no editables
        tabla.setEnabled(false);

        String[] nombreColumnas = new String[]{"Nombre", "Tipo", "Otro_Opcion", "Edad", "Descripcion", "Raza"};
        modelo.addRow(nombreColumnas);

        realizarConsulta(consulta);

        while (rs.next()) {
            String[] datosFila = new String[]{rs.getString("nombre"), rs.getString("tipo"), rs.getString("otro_opcion"), rs.getInt("edad") + "", rs.getString("descripcion"), rs.getString("raza")};
            modelo.addRow(datosFila);
        }

        tabla.setVisible(true);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
