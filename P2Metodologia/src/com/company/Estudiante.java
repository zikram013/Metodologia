package com.company;

import java.util.ArrayList;

public class Estudiante extends Usuario {

    private static String rol="Estudiante";
    private boolean penalizado;
    private ArrayList<SubForo>suscripcion=new ArrayList<SubForo>();

    //Constructor,getters and setters

    public Estudiante(String nombre, String apellido, String nick, String correo, String contraseña, boolean penalizado, ArrayList<SubForo> suscripcion) {
        super(nombre, apellido, nick, correo, contraseña);
        this.penalizado = penalizado;
        this.suscripcion = suscripcion;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        rol = rol;
    }

    public boolean isPenalizado() {
        return penalizado;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }

    public ArrayList<SubForo> getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(ArrayList<SubForo> suscripcion) {
        this.suscripcion = suscripcion;
    }
}
