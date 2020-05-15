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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of toString method, of class Admin.
     */
    @Test
    public void testToString() {
        Admin ejemplo = new Admin("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","admin");
        String cadena = "Admin{rol='admin'\n"
                + ", nombre='Micael'\n"
                + ", apellidos='Gallego'\n"
                + ", nick='profesor de DAW'\n"
                + ", email='micael.gallego@urjc.es'\n"
                + ", contrasenna='teacher'\n"
                + "}";
        assertEquals(cadena, ejemplo.toString());
    }  
    
}
