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
public class EstudianteTest {
    
    public EstudianteTest() {
    }

    /**
     * Test of toString method, of class Estudiante.
     */
    @Test
    public void testToString() {
        Estudiante ejemplo = new Estudiante("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","estudiante");
        String cadena = "Estudiante{rol='estudiante'\n"
                + ", nombre='Antonio'\n"
                + ", apellidos='Gonzalez'\n"
                + ", nick='el profe nuevo'\n"
                + ", email='antonio.gpardo@urjc.es'\n"
                + ", contrasenna='1234'\n"
                + "}";
        assertEquals(cadena, ejemplo.toString());
    }

    /**
     * Test of penalizar method, of class Estudiante.
     */
    @Test
    public void testPenalizar() {
        Estudiante ejemplo = new Estudiante("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","estudiante");
        ejemplo.penalizar();
        assertEquals(true, ejemplo.estaPenalizado());
    }

    /**
     * Test of estaPenalizado method, of class Estudiante.
     */
    @Test
    public void testEstaPenalizado() {
        Estudiante ejemplo = new Estudiante("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","estudiante");
        ejemplo.penalizar();
        ejemplo.getPenalizacion().avanzarDias(2);
        assertEquals(false, ejemplo.estaPenalizado());
    }

    /**
     * Test of getPenalizacion method, of class Estudiante.
     */
    @Test
    public void testGetPenalizacion() {
        Estudiante ejemplo = new Estudiante("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","estudiante");
        ejemplo.penalizar();
        assertEquals(2, ejemplo.getPenalizacion().getDiasPenalizacion());
    }

    /**
     * Test of setPenalizacion method, of class Estudiante.
     */
    @Test
    public void testSetPenalizacion() {
        Estudiante ejemplo = new Estudiante("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","estudiante");
        Penalizacion p = new Penalizacion(5);
        ejemplo.setPenalizacion(p);
        assertEquals(5, ejemplo.getPenalizacion().getDiasPenalizacion());
    }
    
}
