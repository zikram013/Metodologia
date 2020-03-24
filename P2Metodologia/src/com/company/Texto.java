package com.company;

import java.util.ArrayList;

public class Texto extends Entrada {

    private String cuerpoTexto;

    public Texto(String tituloEntrada, String cuerpoTexto) {
        super(tituloEntrada);
        this.cuerpoTexto = cuerpoTexto;
    }

    public String getCuerpoTexto() {
        return cuerpoTexto;
    }

    public void setCuerpoTexto(String cuerpoTexto) {
        this.cuerpoTexto = cuerpoTexto;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "cuerpoTexto='" + cuerpoTexto + '\'' +
                '}';
    }
}
