/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.relacion1_tema5;

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
public class Actividad_1 extends javax.swing.JFrame {

    /**
    * Tabla Persona: ID, nombre, DNI, edad, telefono;
    */
    
    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;
    
    private JFrame frame;
    private JLabel titulo, nombreL, apellidoL, telefonoL, dniL, generoL, descripcionL, mailL;
    private JTextField nombreI, apellidoI, telefonoI, dniI, generoI, descripcionI, mailI;
    private JButton insertar;
    
    /**
     * Creates new form Actividad1
     */
    public Actividad_1() throws SQLException {
        initComponents();
        
        frame = this;
        
        conexion();
        
        titulo = new JLabel("Inserta una fila en la tabla Persona");
        titulo.setSize(250, 50);
        titulo.setLocation(50, 0);
        
        nombreL = new JLabel("Nombre: ");
        nombreL.setSize(70, 50);
        nombreL.setLocation(50, 50);
        
        nombreI = new JTextField(); 
        nombreI.setSize(150, 40);
        nombreI.setLocation(150, 50);
        
        dniL = new JLabel("DNI: ");
        dniL.setSize(70, 50);
        dniL.setLocation(50, 100);
        
        dniI = new JTextField(); 
        dniI.setSize(150, 40);
        dniI.setLocation(150, 100);
        
        apellidoL = new JLabel("Apellido: "); 
        apellidoL.setSize(70, 50);
        apellidoL.setLocation(50, 150);
        
        apellidoI = new JTextField(); 
        apellidoI.setSize(150, 40);
        apellidoI.setLocation(150, 150);
        
        telefonoL = new JLabel("Telefono: ");
        telefonoL.setSize(70, 50);
        telefonoL.setLocation(50, 200);
        
        telefonoI = new JTextField();
        telefonoI.setSize(150, 40);
        telefonoI.setLocation(150, 200);
        
        generoL = new JLabel("Genero: ");
        generoL.setSize(70, 50);
        generoL.setLocation(50, 250);
        
        generoI = new JTextField();
        generoI.setSize(150, 40);
        generoI.setLocation(150, 250);
        
        descripcionL = new JLabel("Descripcion: ");
        descripcionL.setSize(70, 50);
        descripcionL.setLocation(50, 300);
        
        descripcionI = new JTextField();
        descripcionI.setSize(150, 40);
        descripcionI.setLocation(150, 300);
        
        mailL = new JLabel("E-Mail: ");
        mailL.setSize(70, 50);
        mailL.setLocation(50, 350);
        
        mailI = new JTextField();
        mailI.setSize(150, 40);
        mailI.setLocation(150, 350);
        
        insertar = new JButton("Insertar datos");
        insertar.setSize(150, 50);
        insertar.setLocation(50, 400);
        
        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dniI.getText().length() == 9 && nombreI.getText().length() <= 18 && apellidoI.getText().length() <= 50 && telefonoI.getText().length() <= 9 && mailI.getText().length() <= 25){
                    if(generoI.getText().equals("m") || generoI.getText().equals("f") || generoI.getText().equals("nb")){
                        
                        String resultado = "insert into persona (nombre, apellido, telefono, dni, genero, descripcion, mail) values ('" + nombreI.getText() + "', '" + apellidoI.getText() + "', '" + telefonoI.getText() + "', '" + dniI.getText() + "', '" + generoI.getText() + "', '" + descripcionI.getText() + "', '" + mailI.getText() + "');";
                        
                        try {
                            
                            insertar(resultado);
                            
                            JTextArea result = new JTextArea(
                                    "Se han insertado con éxito los datos:\n\n" + 
                                    "Nombre: " + nombreI.getText() + "\n" + 
                                    "Apellido: " + apellidoI.getText() + "\n" + 
                                    "Telefono: " + telefonoI.getText() + "\n" +
                                    "DNI: " + dniI.getText() + "\n" +
                                    "Género: " + generoI.getText() + "\n" +
                                    "Descripción: " + descripcionI.getText() + "\n" +
                                    "E-mail: " + mailI.getText() );
                            
                            result.setSize(300, 250);
                            result.setLocation(50, 450);
                            
                            frame.add(result);
                            frame.paint(frame.getGraphics());

                        } catch (SQLException ex) {
                            Logger.getLogger(Actividad_1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }else{
                    System.err.println("REVISA LA LONGITUD DE LOS DATOS...");
                }
            }
        });
        
        this.add(titulo);
        this.add(nombreL);
        this.add(dniL);
        this.add(apellidoL);
        this.add(telefonoL);
        this.add(nombreI);
        this.add(dniI);
        this.add(apellidoI);
        this.add(telefonoI);
        this.add(generoL);
        this.add(generoI);
        this.add(descripcionI);
        this.add(descripcionL);
        this.add(mailI);
        this.add(mailL);
        this.add(insertar);
        
        this.paint(this.getGraphics());
               
    }
    
    public void conexion() throws SQLException{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","000000");
        sta = conexion.createStatement();
    }
    
    public void insertar(String consulta) throws SQLException{
        sta.executeUpdate(consulta);
    }
    
    public void cerrar() throws SQLException{
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
            java.util.logging.Logger.getLogger(Actividad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Actividad_1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Actividad_1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
