package com.company;

import java.util.ArrayList;

public class Ejercicios extends Entrada {

    private String tareas;

    public Ejercicios(String tituloEntrada, String textoEntrada, String tareas) {
        super(tituloEntrada, textoEntrada);
        this.tareas = tareas;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
}
