package modelo;

import controlador.Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Estudiante extends Usuario {

    private String rol;
    private boolean penalizacion;
    private List<String> subcricione;
    private List<String> subcriciones;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apllidos, String nick, String email, String contraseña) {
        super(nombre, apllidos, nick, email, contraseña);
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

}
