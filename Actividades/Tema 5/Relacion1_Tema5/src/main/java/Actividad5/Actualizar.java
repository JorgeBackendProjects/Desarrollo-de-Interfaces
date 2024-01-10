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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Actualizar extends javax.swing.JPanel {

    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;

    private DefaultTableModel modeloT;
    private JTable tabla;
    private JPanel panel;
    private JTextField consultaI;
    private JButton buscar, actualizar;
    
    /**
     * Creates new form Actualizar
     */
    public Actualizar() throws SQLException {
        initComponents();
        
        conexion();
        
        inicializar();

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    consultar(modeloT, consultaI.getText());
                    actualizar.setVisible(true);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);

                    JLabel mensaje = new JLabel("No se ha encontrado resultado");
                    mensaje.setSize(500, 75);
                    mensaje.setLocation(50, 220);
                    mensaje.setForeground(Color.red);
                    mensaje.setVisible(true);

                    panel.add(mensaje);
                }
            }
        });
        
        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nFilas = tabla.getRowCount();
                boolean marcado = false;
                
                for(int i = 0; i<nFilas; i++){
                    marcado = Boolean.valueOf(tabla.getValueAt(i, 6).toString());
                    
                    if(marcado == true){
                        try {
                            manipularTablas("Delete from mascota where nombre = '" + tabla.getValueAt(i, 0) + "' and raza = '" + tabla.getValueAt(i, 5) + "';");
                        } catch (SQLException ex) {
                            Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });

        this.add(consultaI);
        this.add(buscar);
        this.add(actualizar);
        this.add(tabla);
        
    }
    
    public void inicializar(){
        consultaI = new JTextField();
        consultaI.setSize(300, 50);
        consultaI.setLocation(50, 50);
        consultaI.setText("Select * from mascota where nombre = '___';");
        consultaI.setVisible(true);

        buscar = new JButton("Buscar");
        buscar.setSize(100, 50);
        buscar.setLocation(50, 110);
        buscar.setVisible(true);
        
        modeloT = new DefaultTableModel();
        modeloT.setColumnCount(7);

        tabla = new JTable(modeloT);
        tabla.setSize(500, 200);
        tabla.setLocation(50, 200);
        tabla.setVisible(false);
        
        actualizar = new JButton("Borrar");
        actualizar.setSize(100, 50);
        actualizar.setLocation(50, 400);
        actualizar.setVisible(false);
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
