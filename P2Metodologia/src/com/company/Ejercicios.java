package com.company;

import java.util.ArrayList;

public class Ejercicios extends Entrada {

    private ArrayList<String>tareas;

    public Ejercicios(String tituloEntrada, ArrayList<String> comentario) {
        super(tituloEntrada);
        this.tareas=new ArrayList<String>();
    }

    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }
}
