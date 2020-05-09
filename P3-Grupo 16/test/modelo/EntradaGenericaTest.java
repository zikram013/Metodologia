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
public class EntradaGenericaTest {
    
    public EntradaGenericaTest() {
    }

    /**
     * Test of getPuntuacion method, of class EntradaGenerica.
     */
    @Test
    public void testGetPuntuacion() {
        EntradaGenerica e = new EntradaGenerica();
        assertEquals(0, e.getPuntuacion());
    }

    /**
     * Test of votar method, of class EntradaGenerica.
     */
    @Test
    public void testVotar() {
        int puntuacion = 6;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        EntradaGenerica e = new EntradaGenerica();
        e.verificar(true);
        e.votar(puntuacion, ejemplo);
        assertEquals(puntuacion, e.getPuntuacion());
    }
    
    /**
     * Test of votar method, of class EntradaGenerica.
     * Case when an entrie is not verified. Solution: assertEquals(false,false).
     */
    @Test
    public void testVotar2() {
        int puntuacion = 6;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        EntradaGenerica e = new EntradaGenerica();
        assertEquals(false, e.votar(puntuacion, ejemplo));
    }
    
    /**
     * Test of votar method, of class EntradaGenerica.
     * Case when a user vote an entrie that had alrrady voted.
     * Solution: assertEquals(6+1,7).
     */
    
    @Test
    public void testVotar3() {
        int puntuacion = 6;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        EntradaGenerica e = new EntradaGenerica();
        e.verificar(true);
        e.votar(puntuacion, ejemplo);
        e.votar(puntuacion+1, ejemplo);
        assertEquals(puntuacion+1, e.getPuntuacion());
    }

    /**
     * Test of getTitulo method, of class EntradaGenerica.
     */
    @Test
    public void testGetTitulo() {
    }

    /**
     * Test of setTitulo method, of class EntradaGenerica.
     */
    @Test
    public void testSetTitulo() {
    }

    /**
     * Test of getTexto method, of class EntradaGenerica.
     */
    @Test
    public void testGetTexto() {
    }

    /**
     * Test of setTexto method, of class EntradaGenerica.
     */
    @Test
    public void testSetTexto() {
    }

    /**
     * Test of isVerificada method, of class EntradaGenerica.
     */
    @Test
    public void testIsVerificada() {
    }

    /**
     * Test of verificar method, of class EntradaGenerica.
     */
    @Test
    public void testVerificar() {
    }

    /**
     * Test of comentar method, of class EntradaGenerica.
     */
    @Test
    public void testComentar() {
    }

    /**
     * Test of getComentarios method, of class EntradaGenerica.
     */
    @Test
    public void testGetComentarios() {
    }

    /**
     * Test of setComentarios method, of class EntradaGenerica.
     */
    @Test
    public void testSetComentarios() {
    }

    /**
     * Test of getVotantes method, of class EntradaGenerica.
     */
    @Test
    public void testGetVotantes() {
    }

    /**
     * Test of setVotantes method, of class EntradaGenerica.
     */
    @Test
    public void testSetVotantes() {
    }

    /**
     * Test of toStringComentarios method, of class EntradaGenerica.
     */
    @Test
    public void testToStringComentarios() {
    }
    
}
