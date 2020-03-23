package com.company;

import java.util.ArrayList;

public class Usuario {

    //Declaracion de variables
    private String nombre;
    private String apellido;
    private String nick;
    private String correo;
    private String contraseña;
    private String rol;
    private ArrayList<Usuario>users;
    private static final Usuario INSTANCIAUSUARIO=new Usuario();

    //Constructor,getters and setters

    public Usuario(String nombre, String apellido, String nick, String correo, String contraseña,String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol=rol;
        this.users=new ArrayList<>();
    }

    public Usuario() {

    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public static Usuario getInstanciausuario(){
        return INSTANCIAUSUARIO;
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
}
