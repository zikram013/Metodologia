package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ManagerUsuario {

    private HashSet<Usuario> listaDeUsuarios;

    public ManagerUsuario(){
        this.listaDeUsuarios=new HashSet<Usuario>();
    }

    public HashSet<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }


    public void setListaDeUsuarios(HashSet<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }



    public boolean crearUsuario(Usuario usuario){
        if(this.getListaDeUsuarios().contains(usuario.getCorreo()) || this.getListaDeUsuarios().contains(usuario.getNick())) {
            return false;
        }else{
            System.out.println("entro");
            listaDeUsuarios.add(usuario);
            return true;
        }
    }


    public void listarUsuarios() {
        Iterator<Usuario> usuarioIterator= this.listaDeUsuarios.iterator();
        while(usuarioIterator.hasNext()){
            System.out.println("\n"+usuarioIterator.next().toString());
        }
    }

    public  boolean encontradoRolProfesor(String correo,String password){
        System.out.println("realizo la busqueda");
        for(Usuario usuario: listaDeUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(password)) {
                System.out.println("El nombre del usuario es"+usuario.getNombre()+"El rol del usuario es"+usuario.getRol());
                return true;
            }
        }
        return false;
    }

    public boolean encontradoRolAlumno(String correo,String password){
        System.out.println("Realizando busqueda");
        for(Usuario usuario:listaDeUsuarios){
            if(usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(password)){
                System.out.println("El nombre del usuario es"+usuario.getNombre()+"El rol del usuario es"+usuario.getRol());
                return true;
            }
        }
        return false;
    }

    public boolean usuarioRegistrado(String correo,String password){
        System.out.println("Comprobando que existe en el sistema");
        for(Usuario usuario :listaDeUsuarios){
            if(usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(password)){
                System.out.println("El usuario exixte");
                return true;
            }
        }
        return false;
    }
}
