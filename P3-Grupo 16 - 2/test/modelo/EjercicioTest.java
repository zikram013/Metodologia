/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramón Barrabés Parra
 */
public class EjercicioTest {
    
    public EjercicioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSolucion method, of class Ejercicio.
     */
    @Test
    public void testGetSolucion() {
        System.out.println("getSolucion");
        Ejercicio instance = new Ejercicio();
        String expResult = "";
        String result = instance.getSolucion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolucion method, of class Ejercicio.
     */
    @Test
    public void testSetSolucion() {
        System.out.println("setSolucion");
        String solucion = "";
        Ejercicio instance = new Ejercicio();
        instance.setSolucion(solucion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
