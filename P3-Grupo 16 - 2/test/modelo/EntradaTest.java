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
        Entrada instance = new Entrada();
        EntradaGenerica expResult = null;
        EntradaGenerica result = instance.getEntradaGenerica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntradaGenerica method, of class Entrada.
     */
    @Test
    public void testSetEntradaGenerica() {
        System.out.println("setEntradaGenerica");
        EntradaGenerica entradaGenerica = null;
        Entrada instance = new Entrada();
        instance.setEntradaGenerica(entradaGenerica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Entrada.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Entrada instance = new Entrada();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Entrada.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Entrada instance = new Entrada();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class Entrada.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        String newTitulo = "";
        String newTexto = "";
        Entrada instance = new Entrada();
        instance.editar(newTitulo, newTexto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Entrada.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Entrada instance = new Entrada();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarAutor method, of class Entrada.
     */
    @Test
    public void testComprobarAutor() {
        System.out.println("comprobarAutor");
        String nick = "";
        Entrada instance = new Entrada();
        boolean expResult = false;
        boolean result = instance.comprobarAutor(nick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
