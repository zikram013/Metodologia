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
    }

    /**
     * Test of setTitulo method, of class SubForo.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
    }

    /**
     * Test of getEntradas method, of class SubForo.
     */
    @Test
    public void testGetEntradas() {
        System.out.println("getEntradas");
    }

    /**
     * Test of setEntradas method, of class SubForo.
     */
    @Test
    public void testSetEntradas() {
        System.out.println("setEntradas");
    }

    /**
     * Test of annadirSubscritor method, of class SubForo.
     */
    @Test
    public void testAnnadirSubscritor() {
        System.out.println("annadirSubscritor");
        Usuario usuario = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        SubForo instance = new SubForo("DAW");
        instance.annadirSubscritor(usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.suscritos.containsKey(usuario.getNick()));
    }

    /**
     * Test of eliminarSubscritor method, of class SubForo.
     */
    @Test
    public void testEliminarSubscritor() {
        System.out.println("eliminarSubscritor");
        Usuario usuario = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        SubForo instance = new SubForo("DAW");
        instance.annadirSubscritor(usuario);
        instance.eliminarSubscritor(usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(false, instance.suscritos.containsKey(usuario.getNick()));
    }

    /**
     * Test of notificar method, of class SubForo.
     */
    @Test
    public void testNotificar() {
        System.out.println("notificar");
    }

    /**
     * Test of crearEntrada method, of class SubForo.
     */
    @Test
    public void testCrearEntrada() {
        System.out.println("crearEntrada");
        SubForo instance = new SubForo("DAW");  
        Entrada entrada = new Entrada(new EntradaGenerica("DAW","clase de angular"));
        instance.crearEntrada(entrada);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.entradas.containsKey(entrada.getEntradaGenerica().getTitulo()));
    }

    /**
     * Test of eliminarEntrada method, of class SubForo.
     */
    @Test
    public void testEliminarEntrada() {
        System.out.println("eliminarEntrada");
        SubForo instance = new SubForo("DAW");  
        Entrada entrada = new Entrada(new EntradaGenerica("DAW","clase de angular"));
        instance.crearEntrada(entrada);
        instance.eliminarEntrada(entrada);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(false, instance.entradas.containsKey(entrada.getEntradaGenerica().getTitulo()));
    }

    /**
     * Test of toStringEntradas method, of class SubForo.
     */
    @Test
    public void testToStringEntradas() {
        System.out.println("toStringEntradas");
    }

    /**
     * Test of entradaMasVotada method, of class SubForo.
     */
    @Test
    public void testEntradaMasVotada() {
        System.out.println("entradaMasVotada");
    }
    
}
