package modelo;

public class Admin extends Usuario {

    public Admin() {
    }

    public Admin(String nombre, String apllidos, String nick, String email, String contrasenna, String rol) {
        super(nombre, apllidos, nick, email, contrasenna, rol);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "rol='" + rol + "'\n" +
                ", nombre='" + nombre + "'\n" +
                ", apellidos='" + apellidos + "'\n" +
                ", nick='" + nick + "'\n" +
                ", email='" + email + "'\n" +
                ", contrasenna='" + contrasenna + "'\n" +
                '}';
    }
}
