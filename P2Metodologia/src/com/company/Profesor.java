package com.company;

public class Profesor extends Usuario {

    private static String rol="Profesor";
    private boolean penalizacion;

    //constructor,getters and setters

    public Profesor(String nombre, String apellido, String nick, String correo, String contraseña, boolean penalizacion) {
        super(nombre, apellido, nick, correo, contraseña);
        this.penalizacion = penalizacion;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        Profesor.rol = rol;
    }

    public boolean isPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(boolean penalizacion) {
        this.penalizacion = penalizacion;
    }
}
