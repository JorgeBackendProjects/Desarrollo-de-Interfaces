/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.di_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class RegistroCOMPONENTE extends JPanel{
    
    private JPanel panel = this;
    private JLabel titulo;
    private DefaultTableModel model =new DefaultTableModel();
    private JTable table;
    public JButton botonAtras;
    
    public RegistroCOMPONENTE() throws SQLException{
    
        this.setLayout(null);
        this.setSize(1000, 600);
        
        titulo = new JLabel("REGISTRO HISTÓRICO DE CLIENTES");
        titulo.setSize(1000, 50);
        titulo.setLocation(450, 30);
        titulo.setFont(new java.awt.Font("SimSun", 1, 24));
        
        botonAtras = new JButton("Atrás");
        botonAtras.setSize(100, 30);
        botonAtras.setLocation(50, 550);
        botonAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Inicio i = new Inicio();
                    i.setVisible(true);

                    panel.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        table = new JTable();
        table.setSize(800, 500);
        table.setLocation(100, 50);
             

        table.setEnabled(false);
                
        this.add(titulo);
        this.add(table);
        this.add(botonAtras);

        
    }
    
    public void setModel(ArrayList<ArrayList<String>> array){
       // model = 

        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("DNI");
        model.addColumn("Edad");
        model.addColumn("Telefono");
        model.addColumn("Habitación");
        model.addColumn("Fecha");
        model.addColumn("NumeroNoches");
        
        //String [] datos ;
        for(int i = 0; i<array.size(); i++){
            System.out.println(array.get(i).get(i));
            String [] datos = new String[8];
            for(int j = 0; j<array.get(i).size(); j++)
            {
                datos[j] = array.get(i).get(j);
            }
            //datos = (String[]) array.get(i).toArray();
            model.addRow(datos);
            
            //model.addRow(array.get(i));
        }
        table.setModel(model);
        table.paint(table.getGraphics());
        
    }
}
