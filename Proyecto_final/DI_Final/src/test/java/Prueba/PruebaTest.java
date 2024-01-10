/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Prueba;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class PruebaTest {
    
    public PruebaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of contarCliente method, of class Prueba.
     */
    @org.junit.jupiter.api.Test
    public void testContarCliente() throws Exception {
        System.out.println("contarCliente");
        Prueba instance = new Prueba();
        int expResult = 8;
        int result = instance.contarCliente();
        assertEquals(expResult, result);
    }
    
}
