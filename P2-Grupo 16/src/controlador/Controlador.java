package controlador;

import modelo.Comentario;
import modelo.Entrada;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.Usuario;
import controlador.SubForo;

import java.util.HashMap;
import java.util.Scanner;

public class Controlador {

    HashMap<String, Usuario> usuarios = new HashMap<>();
    HashMap<String, SubForo> subforos = new HashMap<>();
    Usuario sesion = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public HashMap<String, SubForo> getSubforos() {
    	return this.subforos;
    }
    
    public HashMap<String, Usuario> getUsuarios() {
    	return this.usuarios;
    }

    public void guardarUsuario(Usuario u){
    	if(!usuarios.containsKey(u.getNick())) {
	        usuarios.put(u.getNick(), u);
	        System.out.println("El usuario: "+u.getNick() + " ha sido registrado con �xito");
    	}
    }

    public void listaUsuarios(){
    	System.out.println("Usuarios del sistema: ");
    	for (String nick: usuarios.keySet()){
    		System.out.print("Nick: " + nick.toString() + ". Contrase�a: " + usuarios.get(nick).getContrase�a() + ". Rol: " + usuarios.get(nick).getRol() + "\n");
    	}
    }

    public void borrarUsario(Usuario u){
        if(u != null){
        	usuarios.remove(u.getNick());
            System.out.println("Usuario eliminadoo");
        }
        else
        	System.err.println("El usuario introducido no es correcto");
    }

    public boolean iniciarSession(Usuario usuario){
        try{
            if(usuarios.containsKey(usuario.getNick())&&(usuarios.get(usuario.getNick()).getContrase�a().equals(usuario.getContrase�a()))) {
            	System.out.println("Acabas de iniciar sesi�n como: " + usuarios.get(usuario.getNick()).getNick());
            	sesion = usuarios.get(usuario.getNick());
            	if(sesion.getNotificaciones().size()>0)
            		this.mostrarNotificaciones();
            	return true;
            }
            else if(usuarios.containsKey(usuario.getNick())&&(!usuarios.get(usuario.getNick()).getContrase�a().equals(usuario.getContrase�a()))) {
            	System.err.println("Contrase�a incorrecta");
            	return false;
            }
            else {
                System.err.println("El usuario no se encuentra registrado");
            	return false;
            }
        }catch (Exception e){
            System.err.println("Error en el servidor "+ e.getLocalizedMessage());
            return false;
        }

    }

    public boolean registrarUsuario(Usuario usuario){
    	if(this.getUsuarioConectado()==null) {
	        String[] parts = usuario.getEmail().split("@");
	        String part2 = parts[1];
	        if(part2.equals("urjc.es")){
	            usuarios.put(usuario.getNick(), usuario);
	            System.out.println("Usuario '" + usuario.getNick() + "' registrado correctamente");
	            return true;
	        }else if(part2.equals("alumnos.urjc.es")){
	            usuarios.put(usuario.getNick(), usuario);
	            System.out.println("Usuario '" + usuario.getNick() + "' registrado correctamente");
	            return true;
	        }
	        else if(this.getUsuarios().containsKey(usuario.getNick())){
	        	System.err.println("Este usuario ya se encuentra registrado");
	        	return false;
	        }      
	        else{
	        	System.err.println("El email no coincide con los par�metros del registro.");
	            return false;
	        }
    	}
    	System.err.println("No puedes crear un usuario sin cerrar antes la sesi�n");
    	return false;
    }
    
    public Usuario getUsuarioConectado() {
    	return this.sesion;
    }
    
    public boolean Logout() {
    	System.out.println("Sesi�n de '" + sesion.getNick() + "' cerrada satisfactoriamente.");
    	sesion = null;
    	return false;
    }
    
    public boolean CrearSubforo(SubForo subforo) {
    	if(this.getUsuarioConectado()!=null && this.getUsuarioConectado().getRol().equals("profesor")) {
	        if(!subforos.containsKey(subforo.getTitulo())) {
		    	subforos.put(subforo.getTitulo(), subforo);
		    	System.out.println("Subforo de '" + subforo.getTitulo() + "' creado con exito");
		    	return true;
	        }
	        else {
	        	System.err.println("El subforo de '" + subforo.getTitulo() + "' ya existe");
	        	return false;
	        }
    	}
    	System.err.println("No tienes los permisos para poder crear un subforo");
    	return false;
    }
    
    public void crearEntrada(String titulo, Entrada entrada) {
    	if(this.getUsuarioConectado()!=null) {
    		this.subforos.get(titulo).crearEntrada(entrada);
    		System.out.println("Entrada creada satisfactoriamente: ");
    		System.out.println(entrada.toString());
    	}
    }
    
    public void editarEntrada(String titulo, Entrada entrada, String newTitulo, String newTexto) {
    	if(this.getUsuarioConectado().getNick()==entrada.getUsuario().getNick() && this.getUsuarioConectado()!=null) {
    		Entrada aux = entrada;
    		this.subforos.get(titulo).getEntradas().remove(entrada.getEntradaGenerica().getTitulo());
    		aux.editar(newTitulo, newTexto);
    		this.subforos.get(titulo).getEntradas().put(aux.getEntradaGenerica().getTitulo(), aux);
    		System.out.println("Entrada editada satisfactoriamente: ");
    		System.out.println(aux.toString());
    	}
    	else {
    		System.err.println("No puedes editar una entrada que no hayas creado t�.");
    	}
    }
    
    public void comentarEntrada(String titulo, String titulo2, Comentario comentario) {
    	if(this.sesion!=null) {
    		if(this.subforos.get(titulo).getEntradas().get(titulo2).getEntradaGenerica().comentar(comentario))
    			System.out.println("Comentario a�adido satisfactoriamente");
    	}
    }
    
    public String mostrarNotificaciones() {
    	System.out.println("Tienes las siguientes notificaciones: \n");
    	return this.sesion.toStringNotificacion();
    }
    
}