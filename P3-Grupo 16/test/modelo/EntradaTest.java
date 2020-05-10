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
public class EntradaTest {
    
    public EntradaTest() {
    }

    /**
     * Test of getEntradaGenerica method, of class Entrada.
     */
    @Test
    public void testGetEntradaGenerica() {
    }

    /**
     * Test of setEntradaGenerica method, of class Entrada.
     */
    @Test
    public void testSetEntradaGenerica() {
    }

    /**
     * Test of getUsuario method, of class Entrada.
     */
    @Test
    public void testGetUsuario() {
    }

    /**
     * Test of setUsuario method, of class Entrada.
     */
    @Test
    public void testSetUsuario() {
    }

    /**
     * Test of editar method, of class Entrada.
     */
    @Test
    public void testEditar() {
        Entrada e = new Entrada();
        e.editar("MP", "2020");
        assertEquals("MP", e.getEntradaGenerica().getTitulo());
        assertEquals("2020", e.getEntradaGenerica().getTexto());
    }

    /**
     * Test of toString method, of class Entrada.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of comprobarAutor method, of class Entrada.
     */
    @Test
    public void testComprobarAutor() {
        Entrada e = new Entrada();
        Profesor ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        e.setUsuario(ejemplo);
        assertEquals(true, e.comprobarAutor(e.getUsuario().getNick()));
    }
    
}
