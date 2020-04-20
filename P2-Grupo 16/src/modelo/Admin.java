package modelo;

import java.util.Scanner;

public class Admin extends Usuario {

    public String rol;

    public Admin() {
    }

    public Admin(String nombre, String apllidos, String nick, String email, String contraseña, String rol) {
        super(nombre, apllidos, nick, email, contraseña);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apllidos='" + apllidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
