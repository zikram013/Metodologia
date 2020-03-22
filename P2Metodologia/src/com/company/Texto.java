package com.company;

import java.util.ArrayList;

public class Texto extends Entrada {

    private String cuerpoTexto;

    public Texto(String tituloEntrada, ArrayList<String> comentario, int valoracionPositiva, int valoracionNegativa, String cuerpoTexto) {
        super(tituloEntrada, comentario, valoracionPositiva, valoracionNegativa);
        this.cuerpoTexto = cuerpoTexto;
    }

    public String getCuerpoTexto() {
        return cuerpoTexto;
    }

    public void setCuerpoTexto(String cuerpoTexto) {
        this.cuerpoTexto = cuerpoTexto;
    }
}
