package com.company;

import java.util.ArrayList;

public class Encuesta extends Entrada {

    private String textoEncuesta;
    private ArrayList<String>respuestasEncuesta=new ArrayList<String>();

    public Encuesta(String tituloEntrada, ArrayList<String> comentario, int valoracionPositiva, int valoracionNegativa, String textoEncuesta, ArrayList<String> respuestasEncuesta) {
        super(tituloEntrada, comentario, valoracionPositiva, valoracionNegativa);
        this.textoEncuesta = textoEncuesta;
        this.respuestasEncuesta = respuestasEncuesta;
    }

    public String getTextoEncuesta() {
        return textoEncuesta;
    }

    public void setTextoEncuesta(String textoEncuesta) {
        this.textoEncuesta = textoEncuesta;
    }

    public ArrayList<String> getRespuestasEncuesta() {
        return respuestasEncuesta;
    }

    public void setRespuestasEncuesta(ArrayList<String> respuestasEncuesta) {
        this.respuestasEncuesta = respuestasEncuesta;
    }
}
