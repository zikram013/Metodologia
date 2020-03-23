package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class ManagerSubForos {

    private SubForo subForo=new SubForo();
    private HashSet<String> foro;
    private HashSet<SubForo>listadoDeForos;

    public ManagerSubForos(){
        this.listadoDeForos=new HashSet<SubForo>();
    }

    public HashSet<SubForo> getListadoDeForos() {
        return listadoDeForos;
    }

    public void setListadoDeForos(HashSet<SubForo> listadoDeForos) {
        this.listadoDeForos = listadoDeForos;
    }

    public  void mostrarSubForo() {
        //Crear la mostrar
        Iterator<SubForo> listaSubForos= this.listadoDeForos.iterator();
        while(listaSubForos.hasNext()){
            System.out.println("\n"+subForo.getTituloSubForo());
            listaSubForos.next();
        }
    }

    public boolean crearSubforos(SubForo subforo){
        if(this.getListadoDeForos().contains(subforo.getTituloSubForo())){
            return false;
        }else{
            System.out.println("entro");
            listadoDeForos.add(subforo);
            return true;
        }
    }
}
