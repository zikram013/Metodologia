package controlador;

import modelo.Estudiante;
import modelo.Profesor;
import modelo.Usuario;
import controlador.SubForo;

import java.util.HashMap;
import java.util.Scanner;

public class Controlador {

    HashMap<String, Usuario> usuarios = new HashMap<>();
    HashMap<String, SubForo> subforos = new HashMap<>();
    Usuario sesion = new Usuario();
    
    public HashMap<String, SubForo> getSubforos() {
    	return this.subforos;
    }
    
    public HashMap<String, Usuario> getUsuarios() {
    	return this.usuarios;
    }

    public void guardarUsuario(Usuario u){
    	if(!usuarios.containsKey(u.getNick())) {
	        usuarios.put(u.getNick(), u);
	        System.out.println("El usuario: "+u.getNick() + " ha sido registrado con éxito");
    	}

    }

    public void listaUsuarios(){
    	System.out.println("Usuarios del sistema: ");
    	for (String nick: usuarios.keySet()){
    		System.out.print("Nick: " + nick.toString() + ". Contraseña: " + usuarios.get(nick).getContraseña() + ". Rol: " + usuarios.get(nick).getRol() + "\n");
    	}
    }


    public void borrarUsario(Usuario u){
        if(u != null){
        	usuarios.remove(u.getNick());
            System.out.println("Usuario eliminadoo");
        }
        else
        	System.out.println("El usuario introducido no es correcto");
    }

    public boolean iniciarSession(Usuario usuario){
        try{
            if(usuarios.containsKey(usuario.getNick())&&(usuarios.get(usuario.getNick()).getContraseña().equals(usuario.getContraseña()))) {
            	System.out.println("Acabas de iniciar sesión como: " + usuarios.get(usuario.getNick()).getNick());
            	sesion = usuarios.get(usuario.getNick());
            	return true;
            }
            else if(usuarios.containsKey(usuario.getNick())&&(!usuarios.get(usuario.getNick()).getContraseña().equals(usuario.getContraseña()))) {
            	System.out.println("Contraseña incorrecta");
            	return false;
            }
            else {
                System.out.println("El usuario no se encuentra registrado");
            	return false;
            }
        }catch (Exception e){
            System.out.println("Error en el servidor "+ e.getLocalizedMessage());
            return false;
        }

    }

    public boolean registrarUsuario(Usuario usuario){
        String[] parts = usuario.getEmail().split("@");
        String part2 = parts[1];
        if(part2.equals("urjc.es")){
            usuarios.put(usuario.getNick(), usuario);
            return true;
        }else if(part2.equals("alumnos.urjc.es")){
            usuarios.put(usuario.getNick(), usuario);
            return true;
        }else{
            return false;
        }
    }
    
    public Usuario getUsuarioConectado() {
    	return this.sesion;
    }
    
    public boolean Logout() {
    	sesion = null;
    	return false;
    }
    
    public boolean CrearSubforo(SubForo subforo) {
        boolean creado = false;
        if(!subforos.containsKey(subforo.getTitulo())) {
	    	subforos.put(subforo.getTitulo(), subforo);
	    	creado = true;
	    	return creado;
        }
    	return creado;
    }
    
}