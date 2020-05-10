/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author d.amora
 */
public class ComentarioTest {
    
    public ComentarioTest() {
    }

    /**
     * Test of getTexto method, of class Comentario.
     */
    @Test
    public void testGetTexto() {
    }

    /**
     * Test of setTexto method, of class Comentario.
     */
    @Test
    public void testSetTexto() {
    }

    /**
     * Test of getPuntuacion method, of class Comentario.
     */
    @Test
    public void testGetPuntuacion() {
    }

    /**
     * Test of votar method, of class Comentario.
     */
    @Test
    public void testVotar() {
        int puntuacion = 1;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Comentario c = new Comentario();
        assertEquals(true, c.votar(puntuacion, ejemplo));
        assertEquals(puntuacion, c.getPuntuacion());
    }
    
    /**
     * Test of votar method, of class EntradaGenerica.
     * Case when a user vote a comment that had already voted.
     * First vote: -1.
     * Second vote: 1.
     * Solution: assertEquals(1,1).
     */
    
    @Test
    public void testVotar2() {
        int puntuacion = -1;
        int puntuacion2 = 1;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Comentario c = new Comentario();
        assertEquals(true, c.votar(puntuacion, ejemplo));
        assertEquals(true, c.votar(puntuacion2, ejemplo));
        assertEquals(puntuacion2, c.getPuntuacion());
    }

    /**
     * Test of getComentarios method, of class Comentario.
     */
    @Test
    public void testGetComentarios() {
    }

    /**
     * Test of setComentarios method, of class Comentario.
     */
    @Test
    public void testSetComentarios() {
    }

    /**
     * Test of comentar method, of class Comentario.
     */
    @Test
    public void testComentar() {
        Comentario c = new Comentario();
        c.comentar("Comentario");
        assertEquals(1, c.getComentarios().size());
    }

    /**
     * Test of toString method, of class Comentario.
     */
    @Test
    public void testToString() {
    }
    
}
