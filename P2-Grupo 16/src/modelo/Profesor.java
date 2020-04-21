package modelo;

public class Profesor extends Usuario {

    private String rol;

    public Profesor(String rol, boolean penalizacion) {
        this.rol = rol;
    }

    public Profesor(String nombre, String apllidos, String nick, String email, String contrase�a, String rol) {
        super(nombre, apllidos, nick, email, contrase�a, rol);
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contrase�a='" + contrase�a + '\'' +
                '}';
    }
}
