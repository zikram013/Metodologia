package com.company;

import org.w3c.dom.Text;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SubForo {

    private ManagerSubForos managerSubForos;
    private String tituloSubForo;
    private static HashSet<SubForo>foro;
    private HashSet<Texto> textito;
    private HashSet<Entrada>entry;
    private Entrada entradita;
    private Texto text;
    private static final SubForo INSTANCIASUBFORO=new SubForo();


    //constructor getters and setters
    public SubForo(String tituloSubForo) {
        this.tituloSubForo = tituloSubForo;
        this.textito = new HashSet<Texto>();
        foro=new HashSet<SubForo>();
        this.entradita=new Entrada();
        this.managerSubForos=new ManagerSubForos();
        this.entry=new HashSet<Entrada>();
    }

    public SubForo(String tituloSubForo, Entrada entradita) {
        this.tituloSubForo = tituloSubForo;
        this.entradita = entradita;
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
/*
    public HashSet<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(HashSet<Entrada> entradas) {
        this.entradas = entradas;
    }
*/

    public HashSet<Texto> getTextito() {
        return textito;
    }

    public void setTextito(HashSet<Texto> textito) {
        this.textito = textito;
    }

    public boolean crearEntrada(SubForo sb , Entrada ent) {
        for (SubForo subForo : foro) {
            System.out.println("Buscando el foro coincidente");
            if (subForo.getTituloSubForo().equals(sb.getTituloSubForo())) {
                System.out.println("Buscando entradas con nombre similar");
                for(Entrada entrada:entry){
                    if (entradita.getTituloEntrada().equals(ent.getTituloEntrada())){
                        System.out.println("crea entrada");
                       entry.add(ent);
                       return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void listarEntrada(String subForos) {
        //No realiza el for de busqueda dentro del elemento
        System.out.println("Entro al metodo");
        for(SubForo subForo: foro){
            System.out.println("entro a mirar el subforo");
            if(subForo.getTituloSubForo().equals(subForos)){
                System.out.println("comenzamos el listado de foros");
                for (Entrada entrada : entry) {
                    if (!(entry.isEmpty())){
                        System.out.println("\n" + entrada.toString());
                    }else{
                        System.out.println("No tiene entradas");
                    }

                }
            }
        }
        System.out.println("salgo del metodo");
    }

}
