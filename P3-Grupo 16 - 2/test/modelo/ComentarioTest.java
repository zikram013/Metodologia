/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.List;
import static jdk.nashorn.internal.runtime.JSType.toBoolean;
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
public class ComentarioTest {
    
    public ComentarioTest() {
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
     * Test of getTexto method, of class Comentario.
     */
    @Test
    public void testGetTexto() {
        System.out.println("getTexto");

    }

    /**
     * Test of setTexto method, of class Comentario.
     */
    @Test
    public void testSetTexto() {
        System.out.println("setTexto");

    }

    /**
     * Test of getPuntuacion method, of class Comentario.
     */
    @Test
    public void testGetPuntuacion() {
        System.out.println("getPuntuacion");
        Comentario instance = new Comentario();
        int expResult = 0;
        int result = instance.getPuntuacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of votar method, of class Comentario.
     */
    @Test
    public void testVotar() {
        System.out.println("votar");
        int puntuacion = 1;
        Usuario usuario = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        Comentario c = new Comentario();
        assertEquals(true, c.votar(puntuacion, usuario));
        assertEquals(puntuacion, c.getPuntuacion());
    }

    /**
     * Test of getComentarios method, of class Comentario.
     */
    @Test
    public void testGetComentarios() {
        System.out.println("getComentarios");

    }

    /**
     * Test of setComentarios method, of class Comentario.
     */
    @Test
    public void testSetComentarios() {
        System.out.println("setComentarios");
        List<Comentario> comentarios = null;
        Comentario instance = new Comentario();
        instance.setComentarios(comentarios);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(comentarios,instance.getComentarios());
    }

    /**
     * Test of getVotantes method, of class Comentario.
     */
    @Test
    public void testGetVotantes() {
        System.out.println("getVotantes");

    }

    /**
     * Test of setVotantes method, of class Comentario.
     */
    @Test
    public void testSetVotantes() {
        System.out.println("setVotantes");

    }

    /**
     * Test of getVotos method, of class Comentario.
     */
    @Test
    public void testGetVotos() {
        System.out.println("getVotos");
        Comentario instance = new Comentario();
        HashMap<String, Integer> expResult = instance.getVotos();
        HashMap<String, Integer> result = instance.getVotos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setVotos method, of class Comentario.
     */
    @Test
    public void testSetVotos() {
        System.out.println("setVotos");

    }

    /**
     * Test of comentar method, of class Comentario.
     */
    @Test
    public void testComentar() {
        System.out.println("comentar");
        String texto = "Hola como estas";
        Comentario instance = new Comentario();
        instance.comentar(texto);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, instance.getComentarios().size());
    }

    /**
     * Test of toString method, of class Comentario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Comentario instance = new Comentario();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);

    }
    
}
