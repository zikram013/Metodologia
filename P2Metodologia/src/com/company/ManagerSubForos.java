package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class ManagerSubForos {

    private SubForo subForo=new SubForo();
    private HashSet<String> foro;

    public  void mostrarSubForo() {
        //Crear la mostrar
        Iterator<SubForo> listaSubForos= (Iterator<SubForo>) foro;
        while(listaSubForos.hasNext()){
            System.out.println("\n"+subForo.getTituloSubForo());
        }
    }

    public  boolean crearSubforos(SubForo subforo){
        if(subforo.getTituloSubForo().contains(subforo.getTituloSubForo())){
            return false;
        }else{
            foro.add(subForo.getTituloSubForo());
            return true;
        }
    }
}
