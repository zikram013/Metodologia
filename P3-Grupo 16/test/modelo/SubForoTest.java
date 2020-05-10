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
public class SubForoTest {
    
    public SubForoTest() {
    }

    /**
     * Test of getTitulo method, of class SubForo.
     */
    @Test
    public void testGetTitulo() {
    }

    /**
     * Test of setTitulo method, of class SubForo.
     */
    @Test
    public void testSetTitulo() {
    }

    /**
     * Test of getEntradas method, of class SubForo.
     */
    @Test
    public void testGetEntradas() {
    }

    /**
     * Test of setEntradas method, of class SubForo.
     */
    @Test
    public void testSetEntradas() {
    }

    /**
     * Test of annadirSubscritor method, of class SubForo.
     */
    @Test
    public void testAnnadirSubscritor() {
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        s.annadirSubscritor(ejemplo);
        assertEquals(true, s.suscritos.containsKey(ejemplo.getNick()));
    }

    /**
     * Test of eliminarSubscritor method, of class SubForo.
     */
    @Test
    public void testEliminarSubscritor() {
        SubForo s = new SubForo("DAW");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        s.annadirSubscritor(ejemplo);
        s.eliminarSubscritor(ejemplo);
        assertEquals(false, s.suscritos.containsKey(ejemplo.getNick()));
    }

    /**
     * Test of notificar method, of class SubForo.
     */
    @Test
    public void testNotificar() {
        SubForo s = new SubForo("PARADIGMAS");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        s.annadirSubscritor(ejemplo);
        s.notificar();
        assertEquals(1, ejemplo.getNotificaciones().size());
    }

    /**
     * Test of crearEntrada method, of class SubForo.
     */
    @Test
    public void testCrearEntrada() {
        SubForo s = new SubForo("MP");  
        Entrada e = new Entrada(new EntradaGenerica("Mp","mola"));
        s.crearEntrada(e);
        assertEquals(true, s.entradas.containsKey(e.getEntradaGenerica().getTitulo()));
    }

    /**
     * Test of eliminarEntrada method, of class SubForo.
     */
    @Test
    public void testEliminarEntrada() {
        SubForo s = new SubForo("MP");  
        Entrada e = new Entrada(new EntradaGenerica("Mp","mola"));
        s.crearEntrada(e);
        s.eliminarEntrada(e);
        assertEquals(false, s.entradas.containsKey(e.getEntradaGenerica().getTitulo()));
    }

    /**
     * Test of toStringEntradas method, of class SubForo.
     */
    @Test
    public void testToStringEntradas() {
    }

    /**
     * Test of entradaMasVotada method, of class SubForo.
     */
    @Test
    public void testEntradaMasVotada() {
        SubForo s = new SubForo("MP");  
        Entrada e = new Entrada(new EntradaGenerica("Mp","mola"));
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        s.crearEntrada(e);
        s.getEntradas().get(e.getEntradaGenerica().getTitulo()).getEntradaGenerica().verificar(true);
        s.getEntradas().get(e.getEntradaGenerica().getTitulo()).getEntradaGenerica().votar(1, ejemplo);
        assertEquals(1, s.getEntradas().get(e.getEntradaGenerica().getTitulo()).getEntradaGenerica().getPuntuacion());
    }
    
}
