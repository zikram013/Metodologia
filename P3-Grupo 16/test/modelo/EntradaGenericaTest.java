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
        int puntuacion = 1;
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
        int puntuacion = 1;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        EntradaGenerica e = new EntradaGenerica();
        assertEquals(false, e.votar(puntuacion, ejemplo));
    }
    
    /**
     * Test of votar method, of class EntradaGenerica.
     * Case when a user vote an entrie that had alrrady voted.
     * First vote: -1.
     * Second vote: 1.
     * Solution: assertEquals(1,1).
     */
    
    @Test
    public void testVotar3() {
        int puntuacion = -1;
        int puntuacion2 = 1;
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        EntradaGenerica e = new EntradaGenerica();
        e.verificar(true);
        e.votar(puntuacion, ejemplo);
        e.votar(puntuacion2, ejemplo);
        assertEquals(puntuacion2, e.getPuntuacion());
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
        EntradaGenerica e = new EntradaGenerica();
        e.verificar(true);
        assertEquals(true, e.isVerificada());
    }

    /**
     * Test of comentar method, of class EntradaGenerica.
     */
    @Test
    public void testComentar() {
        EntradaGenerica e = new EntradaGenerica();
        e.verificar(true);
        String c = "Funciona";
        e.comentar(c);
        assertEquals(true, e.comentar(c));
    }
    
    /**
     * Test of comentar method, of class EntradaGenerica.
     * Case when an entrie is not ferified. Solution: assertEquals(false,flase).
     */
    @Test
    public void testComentar2() {
        EntradaGenerica e = new EntradaGenerica();
        String c = "Funciona";
        assertEquals(false, e.comentar(c));
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
