package modelo;

public class Admin extends Usuario {

    public Admin() {
    }

    public Admin(String nombre, String apllidos, String nick, String email, String contraseña, String rol) {
        super(nombre, apllidos, nick, email, contraseña, rol);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apllidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
