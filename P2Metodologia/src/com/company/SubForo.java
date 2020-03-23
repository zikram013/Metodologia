package com.company;

import java.util.HashSet;

public class SubForo {

    private String tituloSubForo;
    private static HashSet<SubForo>foro;
    private HashSet<Entrada> entradas;
    private static final SubForo INSTANCIASUBFORO=new SubForo();

    //constructor getters and setters


    public SubForo(String tituloSubForo) {
        this.tituloSubForo = tituloSubForo;
        this.entradas = new HashSet<Entrada>();
        this.foro=new HashSet<SubForo>();
    }

    public SubForo() {

    }

    public static SubForo getInstanciaSubForo() {
        return INSTANCIASUBFORO;
    }


    public String getTituloSubForo() {
        return tituloSubForo;
    }

    public void setTituloSubForo(String tituloSubForo) {
        this.tituloSubForo = tituloSubForo;
    }


    public static HashSet<SubForo> getForo() {
        return foro;
    }

    public static void setForo(HashSet<SubForo> foro) {
        SubForo.foro = foro;
    }

    public HashSet<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(HashSet<Entrada> entradas) {
        this.entradas = entradas;
    }
}
