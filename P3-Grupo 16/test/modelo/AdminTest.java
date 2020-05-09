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
public class AdminTest {
    
    public AdminTest() {
    }

    /**
     * Test of toString method, of class Admin.
     */
    @Test
    public void testToString() {
        Admin ejemplo = new Admin("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","admin");
        String cadena = "Admin{rol='admin'\n"
                + ", nombre='Antonio'\n"
                + ", apellidos='Gonzalez'\n"
                + ", nick='el profe nuevo'\n"
                + ", email='antonio.gpardo@urjc.es'\n"
                + ", contrasenna='1234'\n"
                + "}";
        assertEquals(cadena, ejemplo.toString());
    }
    
}
