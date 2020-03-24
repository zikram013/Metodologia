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

    public  boolean encontrado(String correo,String password){
        System.out.println("realizo la busqueda");
        boolean esProfesor=false;
        for(Usuario usuario: listaDeUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(password)) {
                System.out.println("El nombre del usuario es"+usuario.getNombre()+"El rol del usuario es"+usuario.getRol());
                return true;
            }
        }
        return false;
    }
}
