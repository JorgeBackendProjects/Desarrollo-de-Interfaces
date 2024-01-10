/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Actividad5;

import com.mycompany.relacion1_tema5.Actividad_3;
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
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Insertar extends javax.swing.JPanel {

    private Connection conexion = null;
    private Statement sta;
    private ResultSet rs;

    private JPanel panel;
    private JFrame frame;
    private JLabel nombreL, tipoL, otroL, edadL, descripcionL, razaL;
    private JTextField nombreI, tipoI, otroI, edadI, descripcionI, razaI;
    private JButton insertar;
    
    /**
     * Creates new form Insertar
     */
    public Insertar() throws SQLException {
        initComponents();
        
        panel = this;
        
        frame = new JFrame("Dialogo");
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        
        conexion();
        
        inicializar();
        
        insertar = new JButton("Insertar");
        insertar.setSize(200, 30);
        insertar.setLocation(50, 450);
        insertar.setVisible(true);

        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nombreI.getText().length() <= 18 && otroI.getText().length() <= 30 && razaI.getText().length() <= 30){
                    if(tipoI.getText().equals("perro") || tipoI.getText().equals("gato") || tipoI.getText().equals("canario") || tipoI.getText().equals("hamster") || tipoI.getText().equals("conejo") || tipoI.getText().equals("otro")){
                        try {
                            if(otroI.getText().isEmpty()){
                                manipularTablas("Insert into mascota (nombre, tipo, edad, descripcion, raza) values ('" + nombreI.getText() + "', '" + tipoI.getText() + "', '" + edadI.getText() + "', '" + descripcionI.getText() + "', '" + razaI.getText() + "');");
                            
                                JLabel mensaje = new JLabel("Se han introducido correctamente los datos...");
                                mensaje.setSize(500, 75);
                                mensaje.setLocation(200, 450);
                                mensaje.setVisible(true);
                            }else{
                                manipularTablas("Insert into mascota (nombre, otro_opcion, edad, descripcion, raza) values ('" + nombreI.getText() + "', '" + otroI.getText() + "', '" + edadI.getText() + "', '" + descripcionI.getText() + "', '" + razaI.getText() + "');");
                            
                                JLabel mensaje = new JLabel("Se han introducido correctamente los datos...");
                                mensaje.setSize(500, 75);
                                mensaje.setLocation(200, 450);
                                mensaje.setVisible(true);
                            }

                            panel.paint(getGraphics());

                        } catch (SQLException ex) {
                            Logger.getLogger(Actividad_3.class.getName()).log(Level.SEVERE, null, ex);
                            
                            JLabel mensaje = new JLabel("Datos incorrectos");
                            mensaje.setSize(500, 75);
                            mensaje.setLocation(200, 450);
                            mensaje.setForeground(Color.red);
                            mensaje.setVisible(true);

                            panel.add(mensaje);
                        }
                    }
                }
                
                JDialog dialogo = new JDialog(frame);
                dialogo.setModal(true);
                dialogo.setTitle("Se han insertado los datos");
                dialogo.setSize(500, 150);
                dialogo.setLocationRelativeTo(panel);
                dialogo.setResizable(true);
                dialogo.setVisible(true);
                
                
                nombreI.setText("");
                tipoI.setText("");
                otroI.setText("");
                edadI.setText("");
                descripcionI.setText("");
                razaI.setText("");
            }
        });
        
        this.add(insertar);
        
    }

    public void inicializar() {

        nombreL = new JLabel("*Nombre: ");
        nombreL.setSize(70, 50);
        nombreL.setLocation(50, 100);
        nombreL.setVisible(true);

        nombreI = new JTextField();
        nombreI.setSize(150, 40);
        nombreI.setLocation(150, 100);
        nombreI.setVisible(true);

        tipoL = new JLabel("*Tipo: ");
        tipoL.setSize(70, 50);
        tipoL.setLocation(50, 150);
        tipoL.setVisible(true);

        tipoI = new JTextField();
        tipoI.setSize(150, 40);
        tipoI.setLocation(150, 150);
        tipoI.setVisible(true);

        otroL = new JLabel("?Otro_Tipo: ");
        otroL.setSize(70, 50);
        otroL.setLocation(50, 200);
        otroL.setVisible(true);

        otroI = new JTextField();
        otroI.setSize(150, 40);
        otroI.setLocation(150, 200);
        otroI.setVisible(true);

        edadL = new JLabel("*Edad: ");
        edadL.setSize(70, 50);
        edadL.setLocation(50, 250);
        edadL.setVisible(true);

        edadI = new JTextField();
        edadI.setSize(150, 40);
        edadI.setLocation(150, 250);
        edadI.setVisible(true);

        descripcionL = new JLabel("*Descripcion: ");
        descripcionL.setSize(100, 50);
        descripcionL.setLocation(50, 300);
        descripcionL.setVisible(true);

        descripcionI = new JTextField();
        descripcionI.setSize(150, 40);
        descripcionI.setLocation(150, 300);
        descripcionI.setVisible(true);

        razaL = new JLabel("*Raza: ");
        razaL.setSize(70, 50);
        razaL.setLocation(50, 400);
        razaL.setVisible(true);

        razaI = new JTextField();
        razaI.setSize(150, 40);
        razaI.setLocation(150, 400);
        razaI.setVisible(true);
        
        this.add(nombreL);
        this.add(nombreI);
        this.add(tipoL);
        this.add(tipoI);
        this.add(otroL);
        this.add(otroI);
        this.add(edadL);
        this.add(edadI);
        this.add(descripcionL);
        this.add(descripcionI);
        this.add(razaL);
        this.add(razaI);
    }

    public void conexion() throws SQLException {
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
        sta = conexion.createStatement();
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
