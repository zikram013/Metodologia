package modelo;

public class Profesor extends Usuario {

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, String nick, String email, String contrasenna, String rol) {
        super(nombre, apellidos, nick, email, contrasenna, rol);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "rol='" + rol + "'\n" +
                ", nombre='" + nombre + "'\n" +
                ", apellidos='" + apellidos + "'\n" +
                ", nick='" + nick + "'\n" +
                ", email='" + email + "'\n" +
                ", contrasenna='" + contrasenna + "'\n" +
                '}';
    }
}
