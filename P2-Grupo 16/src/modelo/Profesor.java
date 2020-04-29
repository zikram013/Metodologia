package modelo;

public class Profesor extends Usuario {

    public Profesor() {
    }

    public Profesor(String nombre, String apllidos, String nick, String email, String contraseña, String rol) {
        super(nombre, apllidos, nick, email, contraseña, rol);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
