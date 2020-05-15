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
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class Usuario.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String nick = "";
        Usuario instance = new Usuario();
        instance.setNick(nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrasenna method, of class Usuario.
     */
    @Test
    public void testGetContrasenna() {
        System.out.println("getContrasenna");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getContrasenna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasenna method, of class Usuario.
     */
    @Test
    public void testSetContrasenna() {
        System.out.println("setContrasenna");
        String contrasenna = "";
        Usuario instance = new Usuario();
        instance.setContrasenna(contrasenna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotificaciones method, of class Usuario.
     */
    @Test
    public void testGetNotificaciones() {
        System.out.println("getNotificaciones");
        Usuario instance = new Usuario();
        List<String> expResult = null;
        List<String> result = instance.getNotificaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotificaciones method, of class Usuario.
     */
    @Test
    public void testSetNotificaciones() {
        System.out.println("setNotificaciones");
        List<String> notificaciones = null;
        Usuario instance = new Usuario();
        instance.setNotificaciones(notificaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        Usuario instance = new Usuario();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recibirNotificacion method, of class Usuario.
     */
    @Test
    public void testRecibirNotificacion() {
        System.out.println("recibirNotificacion");
        String notificacion = "";
        Usuario instance = new Usuario();
        instance.recibirNotificacion(notificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringNotificacion method, of class Usuario.
     */
    @Test
    public void testToStringNotificacion() {
        System.out.println("toStringNotificacion");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toStringNotificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
