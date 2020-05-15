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
public class EstudianteTest {
    
    public EstudianteTest() {
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
     * Test of toString method, of class Estudiante.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of penalizar method, of class Estudiante.
     */
    @Test
    public void testPenalizar() {
        System.out.println("penalizar");
        Estudiante instance = new Estudiante();
        instance.penalizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaPenalizado method, of class Estudiante.
     */
    @Test
    public void testEstaPenalizado() {
        System.out.println("estaPenalizado");
        Estudiante instance = new Estudiante();
        boolean expResult = false;
        boolean result = instance.estaPenalizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPenalizacion method, of class Estudiante.
     */
    @Test
    public void testGetPenalizacion() {
        System.out.println("getPenalizacion");
        Estudiante instance = new Estudiante();
        Penalizacion expResult = null;
        Penalizacion result = instance.getPenalizacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPenalizacion method, of class Estudiante.
     */
    @Test
    public void testSetPenalizacion() {
        System.out.println("setPenalizacion");
        Penalizacion penalizacion = null;
        Estudiante instance = new Estudiante();
        instance.setPenalizacion(penalizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
