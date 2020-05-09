/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author d.amora
 */
public class PenalizacionTest {
    
    public PenalizacionTest() {
    }

    /**
     * Test of estaActiva method, of class Penalizacion.
     */
    @Test
    public void testEstaActiva() {
        int dias = 5;
        Penalizacion p = new Penalizacion(dias);
        assertEquals(true, p.isActiva());
    }

    /**
     * Test of avanzarDias method, of class Penalizacion.
     */
    @Test
    public void testAvanzarDias() {
        int dias = 5;
        Penalizacion penalizacion = new Penalizacion(dias);
        penalizacion.avanzarDias(2);
        assertEquals(dias-2, penalizacion.getDiasPenalizacion());
    }

    /**
     * Test of extenderPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testExtenderPenalizacion() {
        int dias = 5;
        Penalizacion p = new Penalizacion(dias);
        p.extenderPenalizacion();
        assertEquals(7, p.getDiasPenalizacion());
    }

    /**
     * Test of isActiva method, of class Penalizacion.
     * Same as estaActiva.
     */
    @Test
    public void testIsActiva() {
        int dias = 5;
        Penalizacion p = new Penalizacion(dias);
        assertEquals(true, p.isActiva());
    }

    /**
     * Test of setActiva method, of class Penalizacion.
     */
    @Test
    public void testSetActiva() {
        int dias = 4;
        Penalizacion p = new Penalizacion(dias);
        p.avanzarDias(4);
        assertEquals(false, p.isActiva());
    }

    /**
     * Test of getDiasPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testGetDiasPenalizacion() {
        int dias = 5;
        Penalizacion p = new Penalizacion(dias);
        assertEquals(dias, p.getDiasPenalizacion());
    }

    /**
     * Test of setDiasPenalizacion method, of class Penalizacion.
     */
    @Test
    public void testSetDiasPenalizacion() {
        int dias = 5;
        Penalizacion p = new Penalizacion(dias);
        p.setDiasPenalizacion(3);
        assertEquals(3, p.getDiasPenalizacion());
    }
    
}
