package modelo;

public class Estudiante extends Usuario {

    private Penalizacion penalizacion = null;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String nick, String email, String contrase�a, String rol) {
        super(nombre, apellidos, nick, email, contrase�a, rol);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contrase�a='" + contrase�a + '\'' +
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
