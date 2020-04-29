package controlador;

import modelo.Entrada;
import modelo.Estudiante;
import modelo.SubForo;
import modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controlador {

    HashMap<String, Usuario> usuarios = new HashMap<>();
    HashMap<String, SubForo> subforos = new HashMap<>();
    Usuario sesion = null;
    
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
        	System.err.println("El usuario introducido no es correcto");
    }

    public boolean iniciarSession(Usuario usuario){
    	Estudiante usuarioaux = new Estudiante();
        try{
            if(usuarios.containsKey(usuario.getNick())&&(usuarios.get(usuario.getNick()).getContraseña().equals(usuario.getContraseña()))) {
            	if(usuario.getRol().equals("estudiante")) {
            		usuarioaux = (Estudiante) usuario;
            		if(usuarioaux.getPenalizacion()!=null)
	            		if(usuarioaux.getPenalizacion().isActiva()) {
	            			System.out.println("No puedes iniciar sesion como '" + usuario.getNick() + "'. Actualmente tienes una penalizaciín de " 
	            					+ usuarioaux.getPenalizacion().getDiasPenalizacion() + " días.");
	            			return false;
	            		}
            	}
            	System.out.println("Acabas de iniciar sesión como: " + usuarios.get(usuario.getNick()).getNick());
            	sesion = usuarios.get(usuario.getNick());
            	if(sesion.getNotificaciones().size()>0) {
            		System.out.println(this.mostrarNotificaciones());
            	}
            	this.usuarios.get(usuario.getNick()).setNotificaciones(new ArrayList<String>());
            	return true;
            }
            else if(usuarios.containsKey(usuario.getNick())&&(!usuarios.get(usuario.getNick()).getContraseña().equals(usuario.getContraseña()))) {
            	System.err.println("Contraseña incorrecta");
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
	        	System.out.println("Este usuario ya se encuentra registrado");
	        	return false;
	        }      
	        else{
	        	System.out.println("El email no coincide con los parámetros del registro.");
	            return false;
	        }
    	}
    	System.out.println("No puedes crear un usuario sin cerrar antes la sesión");
    	return false;
    }
    
    public Usuario getUsuarioConectado() {
    	return this.sesion;
    }
    
    public boolean Logout() {
    	System.out.println("Sesión de '" + sesion.getNick() + "' cerrada satisfactoriamente.");
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
	        	System.out.println("El subforo de '" + subforo.getTitulo() + "' ya existe");
	        	return false;
	        }
    	}
    	System.out.println("No tienes los permisos para poder crear un subforo");
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
    		System.out.println("No puedes editar una entrada que no hayas creado tú.");
    	}
    }
    
    public void comentarEntrada(String titulo, String titulo2, String comentario) {
    	if(this.sesion!=null) {
    		if(this.subforos.get(titulo).getEntradas().get(titulo2).getEntradaGenerica().comentar(comentario))
    			System.out.println("Comentario añadido satisfactoriamente");
    	}
    }
    
    public String mostrarNotificaciones() {
    	System.out.println("Tienes las siguientes notificaciones: \n");
    	return this.sesion.toStringNotificacion();
    }
    
    public List<Entrada> entradasMasVotadas() {
    	List<Entrada> masvotadas = new ArrayList<>();
    	for (String subforo: subforos.keySet()){
    		if(subforos.get(subforo).entradaMasVotada().getEntradaGenerica().getPuntuacion()!=0)
    			masvotadas.add(subforos.get(subforo).entradaMasVotada());
    	}
    	return masvotadas;
    }
    
    public void penalizar(String nombre) {
    	if(this.usuarios.containsKey(nombre)) {
	    	Estudiante usuarioaux = new Estudiante();
	    	usuarioaux = (Estudiante) this.getUsuarios().get(nombre);
	    	this.getUsuarios().remove(nombre);
	    	usuarioaux.penalizar();
	    	this.usuarios.put(usuarioaux.getNick(), usuarioaux);
	    	System.out.println("Usuario '" + nombre + "' penalizado durante 2 días.\n'" + nombre +
	    						"' se encuentra penalizado durante " + usuarioaux.getPenalizacion().getDiasPenalizacion()
	    						+ " días.");
    	}
    	else
    		System.out.println("Este usuario no existe.");
    		
    }
    
    public void modificarPenalizacion(String nombre, int dias) {
    	if(this.usuarios.containsKey(nombre)) {
	    	Estudiante usuarioaux = new Estudiante();
	    	usuarioaux = (Estudiante) this.getUsuarios().get(nombre);
	    	this.getUsuarios().remove(nombre);
	    	usuarioaux.getPenalizacion().avanzarDias(dias);
	    	this.usuarios.put(usuarioaux.getNick(), usuarioaux);
	    	System.out.println("Usuario '" + nombre + "' se le ha restado " + dias + " días a su penalización.\n'" + nombre +
	    						"' se encuentra penalizado durante " + usuarioaux.getPenalizacion().getDiasPenalizacion()
	    						+ " días.");
    	}
    	else
    		System.out.println("Este usuario no existe.");
    }
    
}