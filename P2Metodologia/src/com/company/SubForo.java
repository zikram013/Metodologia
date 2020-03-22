package com.company;

public class SubForo {

    private String titulo;
    private Usuario usuario;
    public Entrada entrada;

    //constructor getters and setters

    public SubForo (String titulo) {
        this.usuario=new Usuario();
        this.entrada=new Entrada();
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
