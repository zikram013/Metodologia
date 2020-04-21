import java.util.Scanner;

import controlador.Controlador;
import controlador.SubForo;
import modelo.Admin;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.Usuario;

public class Main {

    public static  Controlador controlador = new Controlador();
    public static void main (String[] arg){

        Usuario usuario = new Estudiante("Angel", "Chino", "el chino", "angel@urjc.es", "chino","estudiante");
        Usuario usuario1 = new Estudiante("Ramon", "Barrabes", "ramon1", "ramon@urjc.es", "1234","profesor");
        Usuario usuario2 = new Admin("David", "Amor", "almendra", "almendra@urjc.es", "nose","admin");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Usuario ejemplo2 = new Profesor("Gustavo", "Cebrian", "altoke", "gustavo.cebrian@urjc.es", "1234","profesor");
        SubForo sub = new SubForo("MP");
        SubForo newsub = new SubForo("DAW");
        boolean sesion = false;
        boolean registro = false;
        Usuario uConectado = new Usuario();

        if(registro = controlador.registrarUsuario(usuario))
    		System.out.println("Usuario '" + usuario.getNick() + "' registrado correctamente");
        if(registro = controlador.registrarUsuario(usuario1))
    		System.out.println("Usuario '" + usuario1.getNick() + "' registrado correctamente");
        if(registro = controlador.registrarUsuario(usuario2))
    		System.out.println("Usuario '" + usuario2.getNick() + "' registrado correctamente");
        System.out.println();
        controlador.getSubforos().put(sub.getTitulo(), sub);

        controlador.listaUsuarios();
        
        System.out.println();

        sesion = controlador.iniciarSession(usuario);
        
        if(sesion)
        	uConectado = controlador.getUsuarioConectado();
        
        if(!sesion)
        	if(registro = controlador.registrarUsuario(ejemplo))
        		System.out.println("Usuario registrado correctamente");
        	else
        		System.out.println("Este usuario ya se encuentra registrado");
        else
        	System.out.println("No puedes crear un usuario sin cerrar antes la sesión");
        
        if(sesion && uConectado.getRol().equals("profesor"))
        	if(controlador.CrearSubforo(sub))
        		System.out.println("Subforo de '" + sub.getTitulo() + "' creado con exito");
        	else
        		System.out.println("El subforo de '" + sub.getTitulo() + "' ya existe");
        else
        	System.out.println("No tienes los permisos para poder crear un subforo");
        
        if(sesion) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(uConectado.getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").añadirSubscritor(uConectado);
	        	System.out.println("Te has suscrito satisfactoriamente al subforo de: '" + controlador.getSubforos().get("MP").getTitulo() + "'");
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesión de tipo 'estudiante'");
        }
        
        if(!controlador.Logout()) {
        	System.out.println("Sesión de '" + uConectado.getNick() + "' cerrada satisfactoriamente.");
        	sesion = controlador.Logout();
        }
        
        System.out.println();
        
        sesion = controlador.iniciarSession(usuario1);
        
        if(sesion)
        	uConectado = controlador.getUsuarioConectado();
        
        if(!sesion)
        	if(registro = controlador.registrarUsuario(ejemplo))
        		System.out.println("Usuario registrado correctamente");
        	else
        		System.out.println("Este usuario ya se encuentra registrado");
        else
        	System.out.println("No puedes crear un usuario sin cerrar antes la sesión");
        
        if(sesion && uConectado.getRol().equals("profesor"))
        	if(controlador.CrearSubforo(newsub))
        		System.out.println("Subforo de '" + newsub.getTitulo() + "' creado con exito");
        	else
        		System.out.println("El subforo de '" + newsub.getTitulo() + "' ya existe");
        else
        	System.out.println("No tienes los permisos para poder crear un subforo");
        
        if(sesion) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(uConectado.getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").añadirSubscritor(uConectado);
	        	System.out.println("Te has suscrito satisfactoriamente al subforo de: '" + controlador.getSubforos().get("MP").getTitulo() + "'");
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesión de tipo 'estudiante'");
        }
        
        if(!controlador.Logout()) {
        	System.out.println("Sesión de '" + uConectado.getNick() + "' cerrada satisfactoriamente.");
        	sesion = controlador.Logout();
        }
        
        System.out.println();
        
        if(sesion)
        	uConectado = controlador.getUsuarioConectado();
        
        if(!sesion)
        	if(registro = controlador.registrarUsuario(ejemplo))
        		System.out.println("Usuario '" + ejemplo.getNick() + "' registrado correctamente");
        	else
        		System.out.println("Este usuario ya se encuentra registrado");
        else
        	System.out.println("No puedes crear un usuario sin cerrar antes la sesión");
        
        sesion = controlador.iniciarSession(ejemplo);
        
        if(sesion && uConectado.getRol().equals("profesor"))
        	if(controlador.CrearSubforo(newsub))
        		System.out.println("Subforo de '" + newsub.getTitulo() + "' creado con exito");
        	else
        		System.out.println("El subforo de '" + newsub.getTitulo() + "' ya existe");
        else
        	System.out.println("No tienes los permisos para poder crear un subforo");
        
        if(sesion) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(uConectado.getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").añadirSubscritor(uConectado);
	        	System.out.println("Te has suscrito satisfactoriamente al subforo de: '" + controlador.getSubforos().get("MP").getTitulo() + "'");
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesión de tipo 'estudiante'");
        }
        
        if(controlador.Logout()) {
        	System.out.println("Sesión de '" + uConectado.getNick() + "' cerrada satisfactoriamente.");
        	sesion = controlador.Logout();
        }
        	

    }
}
