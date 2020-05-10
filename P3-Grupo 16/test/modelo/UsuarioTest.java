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
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    /**
     * Test of getNick method, of class Usuario.
     */
    @Test
    public void testGetNick() {
    }

    /**
     * Test of setNick method, of class Usuario.
     */
    @Test
    public void testSetNick() {
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
    }

    /**
     * Test of getContrasenna method, of class Usuario.
     */
    @Test
    public void testGetContrasenna() {
    }

    /**
     * Test of setContrasenna method, of class Usuario.
     */
    @Test
    public void testSetContrasenna() {
    }

    /**
     * Test of getNotificaciones method, of class Usuario.
     */
    @Test
    public void testGetNotificaciones() {
    }

    /**
     * Test of setNotificaciones method, of class Usuario.
     */
    @Test
    public void testSetNotificaciones() {
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of recibirNotificacion method, of class Usuario.
     */
    @Test
    public void testRecibirNotificacion() {
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        ejemplo.recibirNotificacion("Notificacion de prueba");
        assertEquals(1, ejemplo.getNotificaciones().size());
    }

    /**
     * Test of toStringNotificacion method, of class Usuario.
     */
    @Test
    public void testToStringNotificacion() {
    }
    
}
