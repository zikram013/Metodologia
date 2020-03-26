package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Entrada {

    private static HashSet<Entrada>entr;
    private HashSet<SubForo>subForos;
    private String tituloEntrada;
   // private ArrayList<String>comentario;
    private int valoracionPositiva;
    private int valoracionNegativa;

    public Entrada(String tituloEntrada,String textoEntrada) {
        this.tituloEntrada = tituloEntrada;
        //this.comentario = new ArrayList<>();
        this.valoracionPositiva = 0;
        this.valoracionNegativa = 0;
        entr=new HashSet<>();
        this.subForos=new HashSet<SubForo>();

    }

    public Entrada() {

    }

    public HashSet<Entrada> getEntrada() {
        return entr;
    }

    public void setEntrada(HashSet<Entrada> entrada) {
        Entrada.entr= entrada;
    }

    public String getTituloEntrada() {
        return tituloEntrada;
    }

    public void setTituloEntrada(String tituloEntrada) {
        this.tituloEntrada = tituloEntrada;
    }
/*
    public ArrayList<String> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<String> comentario) {
        this.comentario = comentario;
    }
*/
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


/*
    public boolean crearEntrada(SubForo sb , Entrada ent) {
        for (SubForo foro : subForos) {
            System.out.println("Buscando el foro coincidente");
            if (foro.getTituloSubForo().equals(sb.getTituloSubForo())) {
                System.out.println("Buscando entradas con nombre similar");
                for(Entrada entrada:entr){
                    if (entrada.getTituloEntrada().equals(ent.getTituloEntrada())){
                        System.out.println("crea entrada");
                        entr.add(ent);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void listarEntrada(String subForosi) {
        //No realiza el for de busqueda dentro del elemento
        System.out.println("Entro al metodo");
        for(SubForo foro: subForos){
            System.out.println("entro a mirar el subforo");
            if(foro.getTituloSubForo().equals(subForos)){
                System.out.println("comenzamos el listado de foros");
                for (Entrada entrada : entr) {
                    if (!(entr.isEmpty())){
                        System.out.println("\n" + entrada.toString());
                    }else{
                        System.out.println("No tiene entradas");
                    }

                }
            }
        }
        System.out.println("salgo del metodo");
    }*/
}
