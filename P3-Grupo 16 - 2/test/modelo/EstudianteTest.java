/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class EstudianteTest {
    
    public EstudianteTest() {
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
     * Test of toString method, of class Estudiante.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudiante instance = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        String cadena = "Estudiante{rol='estudiante'\n"
                + ", nombre='David'\n"
                + ", apellidos='Amor'\n"
                + ", nick='alumno'\n"
                + ", email='david.amor@alumnos.urjc.es'\n"
                + ", contrasenna='user'\n"
                + "}";
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(cadena, instance.toString());
    }

    /**
     * Test of penalizar method, of class Estudiante.
     */
    @Test
    public void testPenalizar() {
        System.out.println("penalizar");
        Estudiante instance = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        instance.penalizar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, instance.estaPenalizado());
    }

    /**
     * Test of estaPenalizado method, of class Estudiante.
     */
    @Test
    public void testEstaPenalizado() {
        System.out.println("estaPenalizado");
        Estudiante instance = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        instance.penalizar();
        instance.getPenalizacion().avanzarDias(2);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(false, instance.estaPenalizado());
    }

    /**
     * Test of getPenalizacion method, of class Estudiante.
     */
    @Test
    public void testGetPenalizacion() {
        System.out.println("getPenalizacion");
        Estudiante instance = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        instance.penalizar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(2, instance.getPenalizacion().getDiasPenalizacion());
    }

    /**
     * Test of setPenalizacion method, of class Estudiante.
     */
    @Test
    public void testSetPenalizacion() {
        System.out.println("setPenalizacion");
    }
    
}
