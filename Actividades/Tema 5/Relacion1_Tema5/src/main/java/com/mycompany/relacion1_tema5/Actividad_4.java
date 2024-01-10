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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Actividad_4 extends javax.swing.JFrame {

    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;

    private JFrame frame;
    private JLabel titulo, nombreL, apellidoL, telefonoL, dniL2, generoL, descripcionL, mailL, dniL, mensaje;
    private JTextField nombreI, apellidoI, telefonoI, dniI2, mailI, dniI;
    private JTextArea descripcionI;
    private JRadioButton opcion1, opcion2, opcion3;
    private ButtonGroup generoI;
    private JButton consultar, modificar;
    private String botonSeleccionado;

    /**
     * Creates new form Actividad1
     */
    public Actividad_4() throws SQLException {
        initComponents();

        frame = this;

        conexion();

        inicializar();

        consultar = new JButton("CONSULTAR");
        consultar.setSize(130, 30);
        consultar.setLocation(350, 50);

        consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dniI.getText().length() == 9) {

                    nombreL.setVisible(true);
                    nombreI.setVisible(true);
                    apellidoL.setVisible(true);
                    apellidoI.setVisible(true);
                    telefonoL.setVisible(true);
                    telefonoI.setVisible(true);
                    dniL2.setVisible(true);
                    dniI2.setVisible(true);
                    generoL.setVisible(true);
                    opcion1.setVisible(true);
                    opcion2.setVisible(true);
                    opcion3.setVisible(true);
                    descripcionL.setVisible(true);
                    descripcionI.setVisible(true);
                    mailL.setVisible(true);
                    mailI.setVisible(true);
                    modificar.setVisible(true);

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

                        nombreI.setText(nombre);
                        apellidoI.setText(apellido);
                        telefonoI.setText(telefono);
                        dniI2.setText(dni);

                        switch (genero) {
                            case "m":
                                opcion1.setSelected(true);
                                break;
                            case "f":
                                opcion2.setSelected(true);
                                break;
                            case "nb":
                                opcion3.setSelected(true);
                                break;
                        }

                        descripcionI.setText(descripcion);
                        mailI.setText(mail);

                        dniL.setVisible(false);
                        dniI.setText("");
                        dniI.setVisible(false);
                        consultar.setVisible(false);
                        titulo.setText("Modifica los datos para actualizar:");

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

        modificar = new JButton("Actualizar datos");
        modificar.setSize(200, 30);
        modificar.setLocation(50, 450);
        modificar.setVisible(false);

        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dniI2.getText().length() == 9 && nombreI.getText().length() <= 18 && apellidoI.getText().length() <= 50 && telefonoI.getText().length() <= 9 && mailI.getText().length() <= 25){
                    try {

                        if(opcion1.isSelected()){
                            botonSeleccionado = "m";
                        }if(opcion3.isSelected()){
                            botonSeleccionado = "f";
                        }if(opcion3.isSelected()){
                            botonSeleccionado = "nb";
                        }

                        manipularTablas("Update persona set nombre = '" + nombreI.getText() + "', apellido = '" + apellidoI.getText() + "', telefono = '" + telefonoI.getText() + "', dni = '" + dniI2.getText() + "', genero = '" + botonSeleccionado + "', descripcion = '" + descripcionI.getText() + "', mail = '" + mailI.getText() + "' where dni = '" + dniI2.getText() + "';");

                        modificar.setVisible(false);

                        mensaje = new JLabel("SE HA ACTUALIZADO CORRECTAMENTE");
                        mensaje.setSize(300, 50);
                        mensaje.setLocation(50, 500);

                        nombreL.setVisible(false);
                        nombreI.setVisible(false);
                        apellidoL.setVisible(false);
                        apellidoI.setVisible(false);
                        telefonoL.setVisible(false);
                        telefonoI.setVisible(false);
                        dniL2.setVisible(false);
                        dniI2.setVisible(false);
                        generoL.setVisible(false);
                        opcion1.setVisible(false);
                        opcion2.setVisible(false);
                        opcion3.setVisible(false);
                        descripcionL.setVisible(false);
                        descripcionI.setVisible(false);
                        mailL.setVisible(false);
                        mailI.setVisible(false);
                        modificar.setVisible(false);

                        dniL.setVisible(true);
                        dniI.setVisible(true);
                        consultar.setVisible(true);
                        titulo.setText("Selecciona sobre que DNI se van a modificar datos:");

                        frame.add(mensaje);
                        frame.paint(frame.getGraphics());

                    } catch (SQLException ex) {
                        Logger.getLogger(Actividad_3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        this.add(dniL);
        this.add(dniI);
        this.add(consultar);
        this.add(modificar);

        this.add(titulo);
        this.add(nombreL);
        this.add(dniL2);
        this.add(apellidoL);
        this.add(telefonoL);
        this.add(nombreI);
        this.add(dniI2);
        this.add(apellidoI);
        this.add(telefonoI);
        this.add(generoL);
        this.add(opcion1);
        this.add(opcion2);
        this.add(opcion3);
        this.add(descripcionI);
        this.add(descripcionL);
        this.add(mailI);
        this.add(mailL);

        this.paint(this.getGraphics());
    }

    public void inicializar() {

        titulo = new JLabel("Selecciona sobre que DNI se van a modificar datos:");
        titulo.setSize(400, 50);
        titulo.setLocation(50, 0);

        dniL = new JLabel("DNI:");
        dniL.setSize(70, 50);
        dniL.setLocation(50, 40);

        dniI = new JTextField();
        dniI.setSize(150, 30);
        dniI.setLocation(150, 50);

        nombreL = new JLabel("Nombre: ");
        nombreL.setSize(70, 50);
        nombreL.setLocation(50, 100);
        nombreL.setVisible(false);

        nombreI = new JTextField();
        nombreI.setSize(150, 40);
        nombreI.setLocation(150, 100);
        nombreI.setVisible(false);

        apellidoL = new JLabel("Apellido: ");
        apellidoL.setSize(70, 50);
        apellidoL.setLocation(50, 150);
        apellidoL.setVisible(false);

        apellidoI = new JTextField();
        apellidoI.setSize(150, 40);
        apellidoI.setLocation(150, 150);
        apellidoI.setVisible(false);

        telefonoL = new JLabel("Telefono: ");
        telefonoL.setSize(70, 50);
        telefonoL.setLocation(50, 200);
        telefonoL.setVisible(false);

        telefonoI = new JTextField();
        telefonoI.setSize(150, 40);
        telefonoI.setLocation(150, 200);
        telefonoI.setVisible(false);

        dniL2 = new JLabel("DNI: ");
        dniL2.setSize(70, 50);
        dniL2.setLocation(50, 250);
        dniL2.setVisible(false);

        dniI2 = new JTextField();
        dniI2.setSize(150, 40);
        dniI2.setLocation(150, 250);
        dniI2.setVisible(false);

        generoL = new JLabel("Genero: ");
        generoL.setSize(70, 50);
        generoL.setLocation(50, 300);
        generoL.setVisible(false);

        generoI = new ButtonGroup();

        opcion1 = new JRadioButton("m");
        opcion1.setSize(50, 25);
        opcion1.setLocation(150, 310);
        opcion1.setVisible(false);

        opcion2 = new JRadioButton("f");
        opcion2.setSize(50, 25);
        opcion2.setLocation(200, 310);
        opcion2.setVisible(false);

        opcion3 = new JRadioButton("nb");
        opcion3.setSize(50, 25);
        opcion3.setLocation(250, 310);
        opcion3.setVisible(false);

        generoI.add(opcion1);
        generoI.add(opcion2);
        generoI.add(opcion3);

        descripcionL = new JLabel("Descripcion: ");
        descripcionL.setSize(100, 50);
        descripcionL.setLocation(50, 350);
        descripcionL.setVisible(false);

        descripcionI = new JTextArea();
        descripcionI.setSize(150, 40);
        descripcionI.setLocation(150, 350);
        descripcionI.setVisible(false);

        mailL = new JLabel("E-Mail: ");
        mailL.setSize(70, 50);
        mailL.setLocation(50, 400);
        mailL.setVisible(false);

        mailI = new JTextField();
        mailI.setSize(150, 40);
        mailI.setLocation(150, 400);
        mailI.setVisible(false);

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
            java.util.logging.Logger.getLogger(Actividad_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Actividad_4().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_4.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
