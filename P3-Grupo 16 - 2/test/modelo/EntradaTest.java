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
public class EntradaTest {
    
    public EntradaTest() {
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
     * Test of getEntradaGenerica method, of class Entrada.
     */
    @Test
    public void testGetEntradaGenerica() {
        System.out.println("getEntradaGenerica");
    }

    /**
     * Test of setEntradaGenerica method, of class Entrada.
     */
    @Test
    public void testSetEntradaGenerica() {
        System.out.println("setEntradaGenerica");
    }

    /**
     * Test of getUsuario method, of class Entrada.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
    }

    /**
     * Test of setUsuario method, of class Entrada.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");

    }

    /**
     * Test of editar method, of class Entrada.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        String newTitulo = "DAW";
        String newTexto = "Clase de docker";
        Entrada instance = new Entrada();
        instance.editar(newTitulo, newTexto);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("Clase de docker", instance.getEntradaGenerica().getTexto());
    }

    /**
     * Test of toString method, of class Entrada.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
    }

    /**
     * Test of comprobarAutor method, of class Entrada.
     */
    @Test
    public void testComprobarAutor() {
        System.out.println("comprobarAutor");
    }
    
}
