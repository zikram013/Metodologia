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
public class ProfesorTest {
    
    public ProfesorTest() {
    }

    /**
     * Test of toString method, of class Profesor.
     */
    @Test
    public void testToString() {
        Profesor ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        String cadena = "Profesor{rol='profesor'\n"
                + ", nombre='Antonio'\n"
                + ", apellidos='Gonzalez'\n"
                + ", nick='el profe nuevo'\n"
                + ", email='antonio.gpardo@urjc.es'\n"
                + ", contrasenna='1234'\n"
                + "}";
        assertEquals(cadena, ejemplo.toString());
    }
    
}
