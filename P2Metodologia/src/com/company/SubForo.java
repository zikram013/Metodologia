package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class SubForo {

    private String tituloSubForo;
    private static HashSet<SubForo>foro;
    private HashSet<Texto> entradasTexto;
    private static final SubForo INSTANCIASUBFORO=new SubForo();

    //constructor getters and setters


    public SubForo(String tituloSubForo) {
        this.tituloSubForo = tituloSubForo;
        this.entradasTexto = new HashSet<Texto>();
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

    public HashSet<Texto> getEntradasTexto() {
        return entradasTexto;
    }

    public void setEntradasTexto(HashSet<Texto> entradasTexto) {
        this.entradasTexto = entradasTexto;
    }

    public boolean crearEntrada(Texto texto){
        if(this.getEntradasTexto().contains(texto.getTituloEntrada())) {
            return false;
        }else{
            System.out.println("crea entrada");
            entradasTexto.add(texto);
            return true;
        }
    }

    public void listarEntrada() {
        Iterator<Texto> listaTexto= this.entradasTexto.iterator();
        while(listaTexto.hasNext()){
            System.out.println("\n"+listaTexto.next().toString());

        }
    }
}
