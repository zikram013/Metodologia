package modelo;

import controlador.Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Estudiante extends Usuario {

    private boolean penalizacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String nick, String email, String contraseña, String rol) {
        super(nombre, apellidos, nick, email, contraseña, rol);
    }

    public boolean estaPenalizado() {
        return penalizacion;
    }

    public void penalizar(boolean penalizacion) {
        this.penalizacion = penalizacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "rol='" + rol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
