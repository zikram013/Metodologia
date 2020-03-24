package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ManagerSubForos {

    private SubForo subForo=new SubForo();
    private Usuario usuario=new Usuario();
    private HashSet<String> foro;
    private HashSet<SubForo>listadoDeForos;
    private static ArrayList<Usuario>usuarios;

    public ManagerSubForos(){
        this.listadoDeForos=new HashSet<SubForo>();
        this.usuarios=new ArrayList<Usuario>();
    }

    public HashSet<SubForo> getListadoDeForos() {
        return listadoDeForos;
    }

    public void setListadoDeForos(HashSet<SubForo> listadoDeForos) {
        this.listadoDeForos = listadoDeForos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public  void mostrarSubForo() {
        //Crear la mostrar
        Iterator<SubForo> listaSubForos= this.listadoDeForos.iterator();
        while(listaSubForos.hasNext()){
            System.out.println("\n"+listaSubForos.next().getTituloSubForo());
        }
    }

    public boolean crearSubforos(SubForo subforo){
        if(this.getListadoDeForos().contains(subforo.getTituloSubForo())) {
            return false;
        }else{
            System.out.println("entro");
            listadoDeForos.add(subforo);
            return true;
        }
    }


}
