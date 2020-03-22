package com.company;

public class Usuario {

    //Declaracion de variables
    private String nombre;
    private String apellido;
    private String nick;
    private String correo;
    private String contraseña;

    //Constructor,getters and setters

    public Usuario(String nombre, String apellido, String nick, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //Generacion de metodos
}
