/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getNick method, of class Usuario.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
    }

    /**
     * Test of setNick method, of class Usuario.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
    }

    /**
     * Test of getContrasenna method, of class Usuario.
     */
    @Test
    public void testGetContrasenna() {
        System.out.println("getContrasenna");
    }

    /**
     * Test of setContrasenna method, of class Usuario.
     */
    @Test
    public void testSetContrasenna() {
        System.out.println("setContrasenna");
    }

    /**
     * Test of getNotificaciones method, of class Usuario.
     */
    @Test
    public void testGetNotificaciones() {
        System.out.println("getNotificaciones");
    }

    /**
     * Test of setNotificaciones method, of class Usuario.
     */
    @Test
    public void testSetNotificaciones() {
        System.out.println("setNotificaciones");
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of recibirNotificacion method, of class Usuario.
     */
    @Test
    public void testRecibirNotificacion() {
        System.out.println("recibirNotificacion");
        String notificacion = "";
        Usuario instance = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.recibirNotificacion("Nueva clase");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,instance.getNotificaciones().size());
    }

    /**
     * Test of toStringNotificacion method, of class Usuario.
     */
    @Test
    public void testToStringNotificacion() {
        System.out.println("toStringNotificacion");
    }
    
}
