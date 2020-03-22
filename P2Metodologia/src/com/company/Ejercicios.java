package com.company;

import java.util.ArrayList;

public class Ejercicios extends Entrada {

    private ArrayList<String>tareas=new ArrayList<String>();

    public Ejercicios(String tituloEntrada, ArrayList<String> comentario, int valoracionPositiva, int valoracionNegativa, ArrayList<String> tareas) {
        super(tituloEntrada, comentario, valoracionPositiva, valoracionNegativa);
        this.tareas = tareas;
    }

    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }
}
