package com.company;

import java.util.ArrayList;

public class Entrada {

    private String tituloEntrada;
    private ArrayList<String>comentario;
    private int valoracionPositiva;
    private int valoracionNegativa;

    public Entrada(String tituloEntrada) {
        this.tituloEntrada = tituloEntrada;
        this.comentario = new ArrayList<>();
        this.valoracionPositiva = 0;
        this.valoracionNegativa = 0;
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

    @Override
    public String toString() {
        return "Entrada{" +
                "tituloEntrada='" + tituloEntrada + '\'' +
                ", comentario=" + comentario +
                ", valoracionPositiva=" + valoracionPositiva +
                ", valoracionNegativa=" + valoracionNegativa +
                '}';
    }
}
