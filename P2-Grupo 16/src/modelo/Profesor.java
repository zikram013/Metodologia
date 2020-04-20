package modelo;

import java.util.Scanner;

public class Profesor extends Usuario {

    private String rol;
    private boolean penalizacion;


    public Profesor(String rol, boolean penalizacion) {
        this.rol = rol;
        this.penalizacion = penalizacion;
    }

    public Profesor(String nombre, String apllidos, String nick, String email, String contrase�a, String rol, boolean penalizacion) {
        super(nombre, apllidos, nick, email, contrase�a, rol);
        this.rol = rol;
        this.penalizacion = penalizacion;
    }

    public Profesor(String nombre, String apllidos, String nick, String email, String contrase�a, String rol) {
        super(nombre, apllidos, nick, email, contrase�a, rol);
        this.rol = rol;
    }

    public boolean isPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(boolean penalizacion) {
        this.penalizacion = penalizacion;
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
