package com.company;

public class Administrador extends Usuario {

    private static String rol="Administrador";

    //Constructor,getters and setters

    public Administrador(String nombre, String apellido, String nick, String correo, String contraseña) {
        super(nombre, apellido, nick, correo, contraseña);
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        Administrador.rol = rol;
    }
}
