package modelo;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Suscriptor;

public class Usuario implements Suscriptor{

    protected String nombre;
    protected String apellidos;
    protected String nick;
    protected String email;
    protected String contraseña;
    protected List<String> notificaciones;
    protected String rol;

    public Usuario() {

    }

    public Usuario(String nombre, String apellidos, String nick, String email, String contraseña, String rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nick = nick;
        this.email = email;
        this.contraseña = contraseña;
        this.notificaciones = new ArrayList<String>();
        this.rol = rol;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<String> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<String> notificaciones) {
		this.notificaciones = notificaciones;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
    public String toString() {
        return "usarios.Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apllidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' + 
                ", rol='" + rol + '\'' +
                '}';
    }

	@Override
	public void recibirNotificacion(String notificacion) {		
		this.notificaciones.add(notificacion);		
	}
	
	public String toStringNotificacion() {
		String notificaciones = "Comentarios: \n";
		for(int i = 0; i < this.notificaciones.size(); i++)
			notificaciones+= this.notificaciones.get(i) + "\n";
		return notificaciones;
	}
}
