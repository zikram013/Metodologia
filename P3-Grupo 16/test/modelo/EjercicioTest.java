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
public class EjercicioTest {
    
    public EjercicioTest() {
    }

    /**
     * Test of getSolucion method, of class Ejercicio.
     */
    @Test
    public void testGetSolucion() {
        String resultado = "aprobado";
        Ejercicio ej = new Ejercicio(resultado);
        assertEquals(resultado, ej.getSolucion());
    }

    /**
     * Test of setSolucion method, of class Ejercicio.
     */
    @Test
    public void testSetSolucion() {
        String resultado = "aprobado";
        Ejercicio ej = new Ejercicio();
        ej.setSolucion(resultado);
        assertEquals(resultado, ej.getSolucion());
    }
    
}
