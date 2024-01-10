/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class serves to perform a unit test on the database.
 * 
 * @author Usuario
 */
public class Prueba {
    
    private Connection conexion;
    private Statement sta;
    private ResultSet rs;
    
    /**
     * This default builder initializes the JDBC connectors.
     * 
     * @throws SQLException 
     */
    public Prueba() throws SQLException{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/desarrollointerfaces?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "000000");
        sta = conexion.createStatement();
        
    }
    
    /**
     * This method makes a query and through a counter, 
     * the number of rows in the table is obtained.
     * 
     * @return Returns an integer number with the number of rows in the table.
     * 
     * @throws SQLException Launches an exception in case there is a problem when performing the operation with the database.
     */
    public int contarCliente() throws SQLException{
        
        int contador = 0;
        
        rs = sta.executeQuery("Select * from clientes;");
        
        while(rs.next()){
            contador++;
        }
        
        return contador;
        
    }
}
