package modelo;

public class Estudiante extends Usuario {

    private Penalizacion penalizacion = null;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String nick, String email, String contrasenna, String rol) {
        super(nombre, apellidos, nick, email, contrasenna, rol);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "rol='" + rol + "'\n" +
                ", nombre='" + nombre + "'\n" +
                ", apellidos='" + apellidos + "'\n" +
                ", nick='" + nick + "'\n" +
                ", email='" + email + "'\n" +
                ", contrasenna='" + contrasenna + "'\n" +
                '}';
    }
    
    public void penalizar() {
    	if(this.penalizacion!=null)
    		this.penalizacion.extenderPenalizacion();
    	else
    		this.penalizacion = new Penalizacion(2);
    }
    
    public boolean estaPenalizado() {
    	return this.penalizacion.estaActiva();
    }

	public Penalizacion getPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(Penalizacion penalizacion) {
		this.penalizacion = penalizacion;
	}
    
}
