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
public class PenalizacionTest {
    
    public PenalizacionTest() {
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
     * Test of estaActiva method, of class Penalizacion.
     */
    @Test
    public void testEstaActiva() {
        System.out.println("estaActiva");
        Penalizacion instance = null;
        boolean expResult = false;
        boolean result = instance.estaActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avanzarDias method, of class Penalizacion.
     */
    @Test
    public void testAvanzarDias() {
        System.out.println("avanzarDias");
        int dias = 0;
        Penalizacion instance = null;
        instance.avanzarDias(dias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extenderPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testExtenderPenalizacion() {
        System.out.println("extenderPenalizacion");
        Penalizacion instance = null;
        instance.extenderPenalizacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActiva method, of class Penalizacion.
     */
    @Test
    public void testIsActiva() {
        System.out.println("isActiva");
        Penalizacion instance = null;
        boolean expResult = false;
        boolean result = instance.isActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiva method, of class Penalizacion.
     */
    @Test
    public void testSetActiva() {
        System.out.println("setActiva");
        boolean activa = false;
        Penalizacion instance = null;
        instance.setActiva(activa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiasPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testGetDiasPenalizacion() {
        System.out.println("getDiasPenalizacion");
        Penalizacion instance = null;
        int expResult = 0;
        int result = instance.getDiasPenalizacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiasPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testSetDiasPenalizacion() {
        System.out.println("setDiasPenalizacion");
        int diasPenalizacion = 0;
        Penalizacion instance = null;
        instance.setDiasPenalizacion(diasPenalizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
