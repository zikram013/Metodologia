/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Admin;
import modelo.Entrada;
import modelo.EntradaGenerica;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.SubForo;
import modelo.Usuario;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author d.amora
 */
public class ControladorTest {
    
    public ControladorTest() {
    }

    /**
     * Test of getSubforos method, of class Controlador.
     */
    @Test
    public void testGetSubforos() {
    }

    /**
     * Test of getUsuarios method, of class Controlador.
     */
    @Test
    public void testGetUsuarios() {
    }

    /**
     * Test of guardarUsuario method, of class Controlador.
     */
    @Test
    public void testGuardarUsuario() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.guardarUsuario(ejemplo);
        assertTrue(c.getUsuarios().containsKey(ejemplo.getNick()));
    }

    /**
     * Test of listaUsuarios method, of class Controlador.
     */
    @Test
    public void testListaUsuarios() {
    }

    /**
     * Test of borrarUsario method, of class Controlador.
     */
    @Test
    public void testBorrarUsario() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.guardarUsuario(ejemplo);
        c.borrarUsario(ejemplo);
        assertFalse(c.getUsuarios().containsKey(ejemplo.getNick()));
    }
    
    /**
     * Test of borrarUsario method, of class Controlador.
     * Case when you try to delete an user that is not registered.
     */
    @Test
    public void testBorrarUsario2() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Usuario ejemplo2 = new Profesor("Antonio", "Gonzalez", "el profe nuevo 2", "antonio.gpardo@urjc.es", "1234","profesor");
        c.guardarUsuario(ejemplo);
        c.borrarUsario(ejemplo2);
        assertFalse(c.getUsuarios().containsKey(ejemplo2.getNick()));
    }
    
    /**
     * Test of borrarUsario method, of class Controlador.
     * Case when you try to delete an user that is not initialized.
     */
    @Test
    public void testBorrarUsario3() {
        Controlador c = new Controlador();
        Usuario ejemplo = null;
        c.borrarUsario(ejemplo);
        assertNull(ejemplo);
    }

    /**
     * Test of iniciarSession method, of class Controlador.
     */
    @Test
    public void testIniciarSession() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        assertEquals(ejemplo, c.getUsuarioConectado());
    }
    
    /**
     * Test of iniciarSession method, of class Controlador.
     * Case when you try to log in with badd password.
     */
    @Test
    public void testIniciarSession2() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Usuario ejemplo2 = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "5678","profesor");        
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo2);
        assertNotEquals(ejemplo2, c.getUsuarioConectado());
    }
    
    /**
     * Test of iniciarSession method, of class Controlador.
     * Case when you try to log in with not registered nick.
     */
    @Test
    public void testIniciarSession3() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Usuario ejemplo2 = new Profesor("Antonio", "Gonzalez", "pepito", "antonio.gpardo@urjc.es", "5678","profesor");        
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo2);
        assertNotEquals(ejemplo2, c.getUsuarioConectado());
    }
    
    /**
     * Test of iniciarSession method, of class Controlador.
     * Case when you try to log in with a penalty.
     */
    @Test
    public void testIniciarSession4() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Estudiante("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@alumnos.urjc.es", "1234","estudiante");
        c.registrarUsuario(ejemplo);
        c.penalizar(ejemplo.getNick());
        c.iniciarSession(ejemplo);
        assertNull(c.getUsuarioConectado());
    }

    /**
     * Test of registrarUsuario method, of class Controlador.
     */
    @Test
    public void testRegistrarUsuario() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        assertTrue(c.getUsuarios().containsKey(ejemplo.getNick()));
    }
    
    /**
     * Test of registrarUsuario method, of class Controlador.
     * Case when you try to register an user that is already registered.
     */
    @Test
    public void testRegistrarUsuario2() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.registrarUsuario(ejemplo);
        assertTrue(c.getUsuarios().containsKey(ejemplo.getNick()));
    }
    
    /**
     * Test of registrarUsuario method, of class Controlador.
     * Case when you try to register an user that is already registered.
     */
    @Test
    public void testRegistrarUsuario3() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.registrarUsuario(ejemplo);
        assertNotNull(c.getUsuarioConectado());
    }
    
    /**
     * Test of registrarUsuario method, of class Controlador.
     * Case when you try to register an user that is already registered.
     */
    @Test
    public void testRegistrarUsuario4() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@uni.complutense.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        assertFalse(c.getUsuarios().containsKey(ejemplo.getNick()));
    }

    /**
     * Test of getUsuarioConectado method, of class Controlador.
     */
    @Test
    public void testGetUsuarioConectado() {
    }

    /**
     * Test of Logout method, of class Controlador.
     */
    @Test
    public void testLogout() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.Logout();
        assertNull(c.getUsuarioConectado());
    }
    
    /**
     * Test of Logout method, of class Controlador.
     * Case when you try to log out without login before.
     */
    @Test
    public void testLogout2() {
        Controlador c = new Controlador();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.Logout();
        assertNull(c.getUsuarioConectado());
    }

    /**
     * Test of CrearSubforo method, of class Controlador.
     */
    @Test
    public void testCrearSubforo() {
        Controlador c = new Controlador();
        SubForo s = new SubForo();
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        assertTrue(c.CrearSubforo(s));
    }
    
    /**
     * Test of CrearSubforo method, of class Controlador.
     * Case when you try to create a subforum that already exist.
     */
    @Test
    public void testCrearSubforo2() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        assertTrue(c.CrearSubforo(s));
        assertFalse(c.CrearSubforo(s));
    }
    
    /**
     * Test of CrearSubforo method, of class Controlador.
     * Case when you try to create a subforum without permission.
     */
    @Test
    public void testCrearSubforo3() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        assertFalse(c.CrearSubforo(s));
    }

    /**
     * Test of crearEntrada method, of class Controlador.
     */
    @Test
    public void testCrearEntrada() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.CrearSubforo(s);
        Entrada e = new Entrada(new EntradaGenerica("MP", "mola"));
        c.crearEntrada(s.getTitulo(), e);
        assertTrue(c.getSubforos().get(s.getTitulo()).getEntradas().containsKey(e.getEntradaGenerica().getTitulo()));
    }

    /**
     * Test of editarEntrada method, of class Controlador.
     */
    @Test
    public void testEditarEntrada() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.CrearSubforo(s);
        Entrada e = new Entrada(new EntradaGenerica("MP", "mola"));
        e.setUsuario(c.getUsuarioConectado());
        c.crearEntrada(s.getTitulo(), e);
        c.editarEntrada(s.getTitulo(), e, "SO", "No me gusta tanto");
        assertTrue(c.getSubforos().get("MP").getEntradas().containsKey("SO"));
    }
    
    /**
     * Test of editarEntrada method, of class Controlador.
     * Case when you try to edit an entrie with other user.
     */
    @Test
    public void testEditarEntrada2() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.CrearSubforo(s);
        Entrada e = new Entrada(new EntradaGenerica("MP", "mola"));
        e.setUsuario(c.getUsuarioConectado());
        c.crearEntrada(s.getTitulo(), e);
        c.Logout();
        Usuario ejemplo2 = new Profesor("Antonio", "Gonzalez", "pepito", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.editarEntrada(s.getTitulo(), e, "SO", "No me gusta tanto");
        assertFalse(c.getSubforos().get("MP").getEntradas().containsKey("SO"));
    }

    /**
     * Test of comentarEntrada method, of class Controlador.
     */
    @Test
    public void testComentarEntrada() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.CrearSubforo(s);
        Entrada e = new Entrada(new EntradaGenerica("MP", "mola"));
        e.setUsuario(c.getUsuarioConectado());
        c.crearEntrada(s.getTitulo(), e);
        c.Logout();
        Usuario ejemplo2 = new Admin("Admin", "Gonzalez", "pepito", "antonio.gpardo@admin.urjc.es", "1234","admin");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.getSubforos().get(s.getTitulo()).getEntradas().get("MP").getEntradaGenerica().verificar(true);
        c.Logout();
        Usuario ejemplo3 = new Profesor("Otro usuario", "Gonzalez", "pepito", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo3);
        c.iniciarSession(ejemplo3);
        c.comentarEntrada(s.getTitulo(), e.getEntradaGenerica().getTitulo(), "Tienes toda la razon");
        assertEquals(1,c.getSubforos().get(s.getTitulo()).getEntradas().get(e.getEntradaGenerica().getTitulo()).getEntradaGenerica().getComentarios().size());
    }

    /**
     * Test of mostrarNotificaciones method, of class Controlador.
     */
    @Test
    public void testMostrarNotificaciones() {
    }

    /**
     * Test of entradasMasVotadas method, of class Controlador.
     */
    @Test
    public void testEntradasMasVotadas() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo);
        c.iniciarSession(ejemplo);
        c.CrearSubforo(s);
        Entrada e = new Entrada(new EntradaGenerica("MP", "mola"));
        e.setUsuario(c.getUsuarioConectado());
        c.crearEntrada(s.getTitulo(), e);
        c.Logout();
        Usuario ejemplo2 = new Admin("Admin", "Gonzalez", "pepito", "antonio.gpardo@admin.urjc.es", "1234","admin");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.getSubforos().get(s.getTitulo()).getEntradas().get("MP").getEntradaGenerica().verificar(true);
        Usuario ejemplo3 = new Profesor("Otro usuario", "Gonzalez", "pepito", "antonio.gpardo@urjc.es", "1234","profesor");
        c.registrarUsuario(ejemplo3);
        c.iniciarSession(ejemplo3);
        c.getSubforos().get(s.getTitulo()).getEntradas().get(e.getEntradaGenerica().getTitulo()).getEntradaGenerica().votar(1, ejemplo3);
        assertNotNull(c.entradasMasVotadas());
    }

    /**
     * Test of penalizar method, of class Controlador.
     */
    @Test
    public void testPenalizar() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Estudiante("Antonio", "Gonzalez", "el nuevo estudiante", "antonio.gpardo@alumnos.urjc.es", "1234","estudiante");
        c.registrarUsuario(ejemplo);
        Usuario ejemplo2 = new Admin("Admin", "Gonzalez", "pepito", "antonio.gpardo@admin.urjc.es", "1234","admin");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.penalizar("el nuevo estudiante");
        Estudiante es = (Estudiante) c.getUsuarios().get("el nuevo estudiante");
        assertTrue(es.estaPenalizado());
    }
    
    /**
     * Test of penalizar method, of class Controlador.
     * Case when you try to penalty an user that does not exist.
     */
    @Test
    public void testPenalizar2() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Estudiante("Antonio", "Gonzalez", "el nuevo estudiante", "antonio.gpardo@alumnos.urjc.es", "1234","estudiante");
        c.registrarUsuario(ejemplo);
        Usuario ejemplo2 = new Admin("Admin", "Gonzalez", "pepito", "antonio.gpardo@admin.urjc.es", "1234","admin");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.penalizar("el que no existe");
        Estudiante es = (Estudiante) c.getUsuarios().get("el que no existe");
        assertNull(es);
    }

    /**
     * Test of modificarPenalizacion method, of class Controlador.
     */
    @Test
    public void testModificarPenalizacion() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Estudiante("Antonio", "Gonzalez", "el nuevo estudiante", "antonio.gpardo@alumnos.urjc.es", "1234","estudiante");
        c.registrarUsuario(ejemplo);
        Usuario ejemplo2 = new Admin("Admin", "Gonzalez", "pepito", "antonio.gpardo@admin.urjc.es", "1234","admin");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.penalizar("el nuevo estudiante");
        c.modificarPenalizacion("el nuevo estudiante", 2);
        Estudiante es = (Estudiante) c.getUsuarios().get("el nuevo estudiante");
        assertFalse(es.estaPenalizado());
    }
    
    /**
     * Test of modificarPenalizacion method, of class Controlador.
     * Case when you try to modify the penalty of an user that does not exist.
     */
    @Test
    public void testModificarPenalizacion2() {
        Controlador c = new Controlador();
        SubForo s = new SubForo("MP");
        Usuario ejemplo = new Estudiante("Antonio", "Gonzalez", "el nuevo estudiante", "antonio.gpardo@alumnos.urjc.es", "1234","estudiante");
        c.registrarUsuario(ejemplo);
        Usuario ejemplo2 = new Admin("Admin", "Gonzalez", "pepito", "antonio.gpardo@admin.urjc.es", "1234","admin");
        c.registrarUsuario(ejemplo2);
        c.iniciarSession(ejemplo2);
        c.penalizar("el nuevo estudiante");
        c.modificarPenalizacion("el que no existe", 2);
        Estudiante es = (Estudiante) c.getUsuarios().get("el que no existe");
        assertNull(es);
    }
    
}
