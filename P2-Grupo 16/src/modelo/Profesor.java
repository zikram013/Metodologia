package modelo;

import java.util.Scanner;

public class Profesor extends Usuario {

    private String rol;
    private boolean penalizacion;


    public Profesor(String rol, boolean penalizacion) {
        this.rol = rol;
        this.penalizacion = penalizacion;
    }

    public Profesor(String nombre, String apllidos, String nick, String email, String contraseña, String rol, boolean penalizacion) {
        super(nombre, apllidos, nick, email, contraseña);
        this.rol = rol;
        this.penalizacion = penalizacion;
    }

    public Profesor(String nombre, String apllidos, String nick, String email, String contraseña, String rol) {
        super(nombre, apllidos, nick, email, contraseña);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
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
                ", apllidos='" + apllidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
