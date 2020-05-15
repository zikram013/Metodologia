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
        int dias = 6;
        Penalizacion instance = new Penalizacion(dias);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.isActiva());
    }

    /**
     * Test of avanzarDias method, of class Penalizacion.
     */
    @Test
    public void testAvanzarDias() {
        System.out.println("avanzarDias");
        int dias = 6;
        Penalizacion instance = new Penalizacion(dias);
        instance.avanzarDias(4);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(dias-4, instance.getDiasPenalizacion());
    }

    /**
     * Test of extenderPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testExtenderPenalizacion() {
        System.out.println("extenderPenalizacion");
        int dias = 6;
        Penalizacion instance = new Penalizacion(dias);
        instance.extenderPenalizacion();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(8, instance.getDiasPenalizacion());
    }

    /**
     * Test of isActiva method, of class Penalizacion.
     */
    @Test
    public void testIsActiva() {
        System.out.println("isActiva");
        int dias = 6;
        Penalizacion instance = new Penalizacion(dias);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.isActiva());
    }

    /**
     * Test of setActiva method, of class Penalizacion.
     */
    @Test
    public void testSetActiva() {
        System.out.println("setActiva");

    }

    /**
     * Test of getDiasPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testGetDiasPenalizacion() {
        System.out.println("getDiasPenalizacion");
        int dias = 6;
        Penalizacion instance = new Penalizacion(dias);

        // TODO review the generated test code and remove the default call to fail.
        assertEquals(dias, instance.getDiasPenalizacion());
    }

    /**
     * Test of setDiasPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testSetDiasPenalizacion() {
        System.out.println("setDiasPenalizacion");
        int diasPenalizacion = 7;
        Penalizacion instance = new Penalizacion(diasPenalizacion);
        instance.setDiasPenalizacion(diasPenalizacion);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(7, instance.getDiasPenalizacion());
    }
    
}
