/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
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
public class SubForoTest {
    
    public SubForoTest() {
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
     * Test of getTitulo method, of class SubForo.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        SubForo instance = new SubForo();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class SubForo.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        SubForo instance = new SubForo();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntradas method, of class SubForo.
     */
    @Test
    public void testGetEntradas() {
        System.out.println("getEntradas");
        SubForo instance = new SubForo();
        HashMap<String, Entrada> expResult = null;
        HashMap<String, Entrada> result = instance.getEntradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntradas method, of class SubForo.
     */
    @Test
    public void testSetEntradas() {
        System.out.println("setEntradas");
        HashMap<String, Entrada> entradas = null;
        SubForo instance = new SubForo();
        instance.setEntradas(entradas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of annadirSubscritor method, of class SubForo.
     */
    @Test
    public void testAnnadirSubscritor() {
        System.out.println("annadirSubscritor");
        Usuario usuario = null;
        SubForo instance = new SubForo();
        instance.annadirSubscritor(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSubscritor method, of class SubForo.
     */
    @Test
    public void testEliminarSubscritor() {
        System.out.println("eliminarSubscritor");
        Usuario usuario = null;
        SubForo instance = new SubForo();
        instance.eliminarSubscritor(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificar method, of class SubForo.
     */
    @Test
    public void testNotificar() {
        System.out.println("notificar");
        SubForo instance = new SubForo();
        instance.notificar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearEntrada method, of class SubForo.
     */
    @Test
    public void testCrearEntrada() {
        System.out.println("crearEntrada");
        Entrada entrada = null;
        SubForo instance = new SubForo();
        instance.crearEntrada(entrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEntrada method, of class SubForo.
     */
    @Test
    public void testEliminarEntrada() {
        System.out.println("eliminarEntrada");
        Entrada entrada = null;
        SubForo instance = new SubForo();
        instance.eliminarEntrada(entrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringEntradas method, of class SubForo.
     */
    @Test
    public void testToStringEntradas() {
        System.out.println("toStringEntradas");
        SubForo instance = new SubForo();
        String expResult = "";
        String result = instance.toStringEntradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entradaMasVotada method, of class SubForo.
     */
    @Test
    public void testEntradaMasVotada() {
        System.out.println("entradaMasVotada");
        SubForo instance = new SubForo();
        Entrada expResult = null;
        Entrada result = instance.entradaMasVotada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
