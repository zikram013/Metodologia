package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SubForo {

    private String tituloSubForo;
    private static HashSet<SubForo>foro;
    private HashSet<Entrada> entradas;
    private static final SubForo INSTANCIASUBFORO=new SubForo();


    //constructor getters and setters


    public SubForo(String tituloSubForo) {
        this.tituloSubForo = tituloSubForo;
        this.entradas = new HashSet<Entrada>();
        foro=new HashSet<SubForo>();
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

    public boolean crearEntrada(String nombreForo ,Texto texto) {
        for (SubForo subForo : foro) {
            if (subForo.getTituloSubForo().equals(nombreForo)) {
                    System.out.println("crea entrada");
                    entradas.add(texto);
                    return true;
                }
            }
        return false;
    }
    
    public void listarEntrada(String subForos) {
        for(SubForo subForo: foro){
            if(subForo.getTituloSubForo().equals(subForos)){
                for (Entrada entrada : this.entradas) {
                    System.out.println("\n" + entrada.toString());
                }
            }
        }
    }
}
