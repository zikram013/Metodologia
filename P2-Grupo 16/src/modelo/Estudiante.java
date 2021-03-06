package modelo;

public class Estudiante extends Usuario {

    private Penalizacion penalizacion = null;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String nick, String email, String contraseņa, String rol) {
        super(nombre, apellidos, nick, email, contraseņa, rol);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseņa='" + contraseņa + '\'' +
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
