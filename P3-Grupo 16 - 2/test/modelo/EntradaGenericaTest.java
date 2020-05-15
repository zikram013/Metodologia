/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
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
public class EntradaGenericaTest {
    
    public EntradaGenericaTest() {
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
     * Test of getPuntuacion method, of class EntradaGenerica.
     */
    @Test
    public void testGetPuntuacion() {
        System.out.println("getPuntuacion");
        EntradaGenerica instance = new EntradaGenerica();
        int expResult = 0;
        int result = instance.getPuntuacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of votar method, of class EntradaGenerica.
     */
    @Test
    public void testVotar() {
        System.out.println("votar");
        int puntuacion = 0;
        Usuario usuario = null;
        EntradaGenerica instance = new EntradaGenerica();
        boolean expResult = false;
        boolean result = instance.votar(puntuacion, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class EntradaGenerica.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        EntradaGenerica instance = new EntradaGenerica();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class EntradaGenerica.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        EntradaGenerica instance = new EntradaGenerica();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTexto method, of class EntradaGenerica.
     */
    @Test
    public void testGetTexto() {
        System.out.println("getTexto");
        EntradaGenerica instance = new EntradaGenerica();
        String expResult = "";
        String result = instance.getTexto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTexto method, of class EntradaGenerica.
     */
    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "";
        EntradaGenerica instance = new EntradaGenerica();
        instance.setTexto(texto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVerificada method, of class EntradaGenerica.
     */
    @Test
    public void testIsVerificada() {
        System.out.println("isVerificada");
        EntradaGenerica instance = new EntradaGenerica();
        boolean expResult = false;
        boolean result = instance.isVerificada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificar method, of class EntradaGenerica.
     */
    @Test
    public void testVerificar() {
        System.out.println("verificar");
        boolean verificada = false;
        EntradaGenerica instance = new EntradaGenerica();
        instance.verificar(verificada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentar method, of class EntradaGenerica.
     */
    @Test
    public void testComentar() {
        System.out.println("comentar");
        String comentario = "";
        EntradaGenerica instance = new EntradaGenerica();
        boolean expResult = false;
        boolean result = instance.comentar(comentario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentarios method, of class EntradaGenerica.
     */
    @Test
    public void testGetComentarios() {
        System.out.println("getComentarios");
        EntradaGenerica instance = new EntradaGenerica();
        List<Comentario> expResult = null;
        List<Comentario> result = instance.getComentarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentarios method, of class EntradaGenerica.
     */
    @Test
    public void testSetComentarios() {
        System.out.println("setComentarios");
        List<Comentario> comentarios = null;
        EntradaGenerica instance = new EntradaGenerica();
        instance.setComentarios(comentarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVotantes method, of class EntradaGenerica.
     */
    @Test
    public void testGetVotantes() {
        System.out.println("getVotantes");
        EntradaGenerica instance = new EntradaGenerica();
        HashMap<String, Usuario> expResult = null;
        HashMap<String, Usuario> result = instance.getVotantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVotantes method, of class EntradaGenerica.
     */
    @Test
    public void testSetVotantes() {
        System.out.println("setVotantes");
        HashMap<String, Usuario> votantes = null;
        EntradaGenerica instance = new EntradaGenerica();
        instance.setVotantes(votantes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringComentarios method, of class EntradaGenerica.
     */
    @Test
    public void testToStringComentarios() {
        System.out.println("toStringComentarios");
        EntradaGenerica instance = new EntradaGenerica();
        String expResult = "";
        String result = instance.toStringComentarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
