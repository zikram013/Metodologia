package modelo;

public class Admin extends Usuario {

    public Admin() {
    }

    public Admin(String nombre, String apllidos, String nick, String email, String contrase�a, String rol) {
        super(nombre, apllidos, nick, email, contrase�a, rol);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apllidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contrase�a='" + contrase�a + '\'' +
                '}';
    }
}
