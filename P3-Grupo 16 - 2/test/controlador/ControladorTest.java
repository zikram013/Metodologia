/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modelo.Admin;
import modelo.Entrada;
import modelo.EntradaGenerica;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.SubForo;
import modelo.Usuario;
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
public class ControladorTest {
    
    public ControladorTest() {
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
     * Test of getSubforos method, of class Controlador.
     */
    @Test
    public void testGetSubforos() {
        System.out.println("getSubforos");
        Controlador instance = new Controlador();
        SubForo subforo = new SubForo("DAW");
        HashMap<String, SubForo> expResult = new HashMap<>();
        instance.CrearSubforo(subforo);
        assertEquals(expResult, instance.getSubforos());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUsuarios method, of class Controlador.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        Controlador instance = new Controlador();
        HashMap<String, Usuario> expResult = new HashMap<>();
        HashMap<String, Usuario> result = instance.getUsuarios();
        assertEquals(expResult.isEmpty(), result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of guardarUsuario method, of class Controlador.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("guardarUsuario");
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        Controlador instance = new Controlador();
        instance.guardarUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getUsuarios().containsKey(u.getNick()));
    }

        /**
     * Test of guardarUsuario method, of class Controlador.
     */
    @Test
    public void testGuardarUsuarioInc() {
        System.out.println("guardarUsuarioIncorrecto");
        Usuario u = new Estudiante("David","Amor","alumno","david.amor@gmail.com","user","estudiante");
        Controlador instance = new Controlador();
        instance.guardarUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(instance.getUsuarios().containsKey(u.getEmail()));
    }
    
    /**
     * Test of listaUsuarios method, of class Controlador.
     */
    @Test
    public void testListaUsuarios() {
        System.out.println("listaUsuarios");
        Controlador instance = new Controlador();
        instance.listaUsuarios();
        // TODO review the generated test code and remove the default call to fail.
    }

        /**
     * Test of borrarUsarioNull method, of class Controlador.
     */
    @Test
    public void testBorrarUsarioNull() {
        System.out.println("borrarUsario");
        Usuario u = null;
        Controlador instance = new Controlador();
        instance.borrarUsario(u);
        // TODO review the generated test code and remove the default call to fail.
        assertNull(u);
    }

    
    /**
     * Test of borrarUsario method, of class Controlador.
     */
    @Test
    public void testBorrarUsario() {
        System.out.println("borrarUsario");
        Usuario u = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        Controlador instance = new Controlador();
        instance.guardarUsuario(u);
        instance.borrarUsario(u);
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(instance.getUsuarios().containsKey(u.getNick()));
    }

        /**
     * Test of borrarUsarioNoGuard method, of class Controlador.
     */
    @Test
    public void testBorrarUsarioNoGuard() {
        System.out.println("borrarUsarioNoGuardado");
        Usuario u = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        Controlador instance = new Controlador();
        instance.borrarUsario(u);
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(instance.getUsuarios().containsKey(u.getNick()));
    }
    
    /**
     * Test of iniciarSession method, of class Controlador.
     */
    @Test
    public void testIniciarSession() {
        System.out.println("iniciarSession");
        Controlador instance = new Controlador();
        Usuario u = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(u, instance.getUsuarioConectado());

    }

        @Test
    public void testIniciarSessionPenalizado() {
        System.out.println("iniciarSessionPenalizado");
        Controlador instance = new Controlador();
        Usuario u = new Estudiante("David","Amor","alumno","david.amor@alumnos.urjc.es","user","estudiante");
        instance.registrarUsuario(u);
        instance.penalizar(u.getNick());
        instance.iniciarSession(u);
        // TODO review the generated test code and remove the default call to fail.
        assertNull(instance.getUsuarioConectado());

    }
    
    /**
     * Test of registrarUsuario method, of class Controlador.
     */
    @Test
    public void testRegistrarUsuario() {
        System.out.println("registrarUsuario");
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        Controlador instance = new Controlador();
        instance.registrarUsuario(u);
        boolean expResult = false;
        boolean result = instance.registrarUsuario(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUsuarioConectado method, of class Controlador.
     */
    @Test
    public void testGetUsuarioConectado() {
        System.out.println("getUsuarioConectado");
        Controlador instance = new Controlador();
        Usuario expResult = null;
        Usuario result = instance.getUsuarioConectado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Logout method, of class Controlador.
     */
    @Test
    public void testLogout() {
        System.out.println("Logout");
        Controlador instance = new Controlador();
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        instance.Logout();
        // TODO review the generated test code and remove the default call to fail.
        assertNull(instance.getUsuarioConectado());
    }

    /**
     * Test of CrearSubforo method, of class Controlador.
     */
    @Test
    public void testCrearSubforo() {
        System.out.println("CrearSubforo");
        SubForo subforo = new SubForo();
        Controlador instance = new Controlador();
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.CrearSubforo(subforo));
    }
    
        public void testCrearSubforo2() {
        System.out.println("CrearSubforo2");
        SubForo subforo = new SubForo();
        Controlador instance = new Controlador();
        Usuario u = new Estudiante("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","user","alumno");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(instance.CrearSubforo(subforo));
    }

    /**
     * Test of crearEntrada method, of class Controlador.
     */
    @Test
    public void testCrearEntrada() {
        System.out.println("crearEntrada");
        SubForo subforo = new SubForo("DAW");
        Controlador instance = new Controlador();
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        instance.CrearSubforo(subforo);
        Entrada entrada = new Entrada(new EntradaGenerica("DAW", "Spring"));

        instance.crearEntrada(subforo.getTitulo(), entrada);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getSubforos().get(subforo.getTitulo()).getEntradas().containsKey(entrada.getEntradaGenerica().getTitulo()));
    }

    /**
     * Test of editarEntrada method, of class Controlador.
     */
    @Test
    public void testEditarEntrada() {
        System.out.println("editarEntrada");
        Controlador instance = new Controlador();
        SubForo subforo = new SubForo("DAW");
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        instance.CrearSubforo(subforo);
        Entrada entrada = new Entrada(new EntradaGenerica("DAW", "Spring"));
        entrada.setUsuario(instance.getUsuarioConectado());
        instance.crearEntrada(subforo.getTitulo(), entrada);
        instance.editarEntrada(subforo.getTitulo(), entrada, "EAS", "Principios SOLID");
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getSubforos().get("DAW").getEntradas().containsKey("EAS"));
    }

    /**
     * Test of comentarEntrada method, of class Controlador.
     */
    @Test
    public void testComentarEntrada() {
        System.out.println("comentarEntrada");
        Controlador instance = new Controlador();
        SubForo subforo = new SubForo("DAW");
        Usuario u = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(u);
        instance.iniciarSession(u);
        instance.CrearSubforo(subforo);
        Entrada entrada = new Entrada(new EntradaGenerica("MP", "mola"));
        entrada.setUsuario(instance.getUsuarioConectado());
        instance.crearEntrada(subforo.getTitulo(), entrada);
        instance.Logout();
        Usuario u2 = new Admin("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","admin");
        instance.registrarUsuario(u2);
        instance.iniciarSession(u2);
        instance.getSubforos().get(subforo.getTitulo()).getEntradas().get("MP").getEntradaGenerica().verificar(true);
        instance.Logout();
        Usuario u3 = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(u3);
        instance.iniciarSession(u3);
        instance.comentarEntrada(subforo.getTitulo(), entrada.getEntradaGenerica().getTitulo(), "Tienes toda la razon");
        assertEquals(1,instance.getSubforos().get(subforo.getTitulo()).getEntradas().get(entrada.getEntradaGenerica().getTitulo()).getEntradaGenerica().getComentarios().size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarNotificaciones method, of class Controlador.
     */
    @Test
    public void testMostrarNotificaciones() {
        System.out.println("mostrarNotificaciones");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of entradasMasVotadas method, of class Controlador.
     */
    @Test
    public void testEntradasMasVotadas() {
        System.out.println("entradasMasVotadas");
        Controlador instance = new Controlador();
        List<Entrada> expResult = new ArrayList<>();
        List<Entrada> result = instance.entradasMasVotadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of penalizar method, of class Controlador.
     */
    @Test
    public void testPenalizar() {
        System.out.println("penalizar");
        Controlador instance = new Controlador();
        Usuario u = new Estudiante("David","Amor","chico problematico","david.amor@alumnos.urjc.es","user","alumno");
        instance.registrarUsuario(u);
        Usuario ad = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(ad);
        instance.iniciarSession(ad);
        instance.penalizar("chico problematico");
        Estudiante estudiante = (Estudiante) instance.getUsuarios().get("chico problematico");
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(estudiante.estaPenalizado());
    }

    /**
     * Test of modificarPenalizacion method, of class Controlador.
     */
    @Test
    public void testModificarPenalizacion() {
        System.out.println("modificarPenalizacion");
        Controlador instance = new Controlador();
        Usuario u = new Estudiante("David","Amor","chico problematico","david.amor@alumnos.urjc.es","user","estudiante");
        instance.registrarUsuario(u);
        Usuario ad = new Profesor("Micael","Gallego","profesor de DAW","micael.gallego@urjc.es","teacher","profesor");
        instance.registrarUsuario(ad);
        instance.iniciarSession(ad);
        instance.penalizar("chico problematico");
        instance.modificarPenalizacion("chico problematico", 2);
        Estudiante estudiante = (Estudiante) instance.getUsuarios().get("chico problematico");
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(estudiante.estaPenalizado());
    }
    
}
