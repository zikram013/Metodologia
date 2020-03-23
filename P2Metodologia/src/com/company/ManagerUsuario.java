package com.company;

import java.util.HashMap;

public class ManagerUsuario {

    private HashMap<String,Usuario>listaDeUsuarios=new HashMap<String, Usuario>();

    public HashMap<String, Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(HashMap<String, Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public boolean crearUsuario(Usuario usuario){
        if(this.getListaDeUsuarios().containsKey(usuario.getNick()) || (this.getListaDeUsuarios().containsKey(usuario.getCorreo()))){
            return false;
        }else{
            this.getListaDeUsuarios().put(usuario.getNick(),usuario);
            return true;
        }
    }


}
