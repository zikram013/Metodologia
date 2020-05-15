/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
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
public class EncuestaTest {
    
    public EncuestaTest() {
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
     * Test of getRespuestas method, of class Encuesta.
     */
    @Test
    public void testGetRespuestas() {
        System.out.println("getRespuestas");
        Encuesta instance = new Encuesta();
        List<String> expResult = null;
        List<String> result = instance.getRespuestas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRespuestas method, of class Encuesta.
     */
    @Test
    public void testSetRespuestas() {
        System.out.println("setRespuestas");
        List<String> respuestas = null;
        Encuesta instance = new Encuesta();
        instance.setRespuestas(respuestas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
