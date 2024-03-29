/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.relacion1_tema5;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Actividad_3 extends javax.swing.JFrame {

    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;

    private JFrame frame;
    private JLabel dniL, mensaje;
    private JTextField dniI;
    private JTextArea result;
    private JButton consultar, borrar;

    /**
     * Creates new form Actividad1
     */
    public Actividad_3() throws SQLException {
        initComponents();

        frame = this;

        conexion();

        dniL = new JLabel("DNI: ");
        dniL.setSize(50, 50);
        dniL.setLocation(60, 50);

        dniI = new JTextField();
        dniI.setSize(150, 30);
        dniI.setLocation(100, 60);

        consultar = new JButton("CONSULTAR");
        consultar.setSize(130, 30);
        consultar.setLocation(50, 100);

        consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dniI.getText().length() == 9) {
                    try {
                        ResultSet res = realizarConsulta("select * from persona where DNI = " + "'" + dniI.getText() + "';");

                        res.next(); //HAY QUE EJECUTAR ESTE METODO PARA PODER RESCATAR LOS DATOS.

                        int id = res.getInt("ID");
                        String nombre = res.getString("nombre");
                        String apellido = res.getString("apellido");
                        String telefono = res.getString("telefono");
                        String dni = res.getString("dni");
                        String genero = res.getString("genero");
                        String descripcion = res.getString("descripcion");
                        String mail = res.getString("mail");

                        result = new JTextArea("\nID: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nDNI: " + dni + "\nGenero: " + genero + "\nDescripcion: " + descripcion + "\nMail: " + mail);
                        result.setSize(300, 200);
                        result.setLocation(50, 150);

                        frame.add(result);
                        frame.paint(frame.getGraphics());

                    } catch (SQLException ex) {
                        Logger.getLogger(Actividad_2.class.getName()).log(Level.SEVERE, null, ex);
                        
                        mensaje = new JLabel("NO HAY REGISTROS");
                        mensaje.setForeground(Color.red);
                        mensaje.setSize(200, 50);
                        mensaje.setLocation(50, 150);

                        frame.add(mensaje);
                        frame.paint(frame.getGraphics());
                    }
                }
            }
        });

        borrar = new JButton("Eliminar datos");
        borrar.setSize(300, 30);
        borrar.setLocation(50, 370);

        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    manipularTablas("Delete from persona where dni = '" + dniI.getText() + "';");

                    result.setText("");
                    result.setVisible(false);
                    borrar.setVisible(false);

                    mensaje = new JLabel("SE HA ELIMINADO CORRECTAMENTE");
                    mensaje.setSize(300, 50);
                    mensaje.setLocation(50, 170);

                    frame.add(mensaje);
                    frame.paint(frame.getGraphics());

                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        this.add(dniL);
        this.add(dniI);
        this.add(consultar);
        this.add(borrar);

        this.paint(this.getGraphics());
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
            java.util.logging.Logger.getLogger(Actividad_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Actividad_3().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
