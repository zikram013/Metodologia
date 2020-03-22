package com.company;

import java.util.ArrayList;

public class Entrada {

    private String tituloEntrada;
    private ArrayList<String>comentario=new ArrayList<String>();
    private int valoracionPositiva;
    private int valoracionNegativa;

    public Entrada(String tituloEntrada, ArrayList<String> comentario, int valoracionPositiva, int valoracionNegativa) {
        this.tituloEntrada = tituloEntrada;
        this.comentario = comentario;
        this.valoracionPositiva = valoracionPositiva;
        this.valoracionNegativa = valoracionNegativa;
    }

    public Entrada() {

    }

    public String getTituloEntrada() {
        return tituloEntrada;
    }

    public void setTituloEntrada(String tituloEntrada) {
        this.tituloEntrada = tituloEntrada;
    }

    public ArrayList<String> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<String> comentario) {
        this.comentario = comentario;
    }

    public int getValoracionPositiva() {
        return valoracionPositiva;
    }

    public void setValoracionPositiva(int valoracionPositiva) {
        this.valoracionPositiva = valoracionPositiva;
    }

    public int getValoracionNegativa() {
        return valoracionNegativa;
    }

    public void setValoracionNegativa(int valoracionNegativa) {
        this.valoracionNegativa = valoracionNegativa;
    }
}
