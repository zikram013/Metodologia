package modelo;

import java.util.ArrayList;
import java.util.List;

public class Comentario {
	
	String texto;
	int puntuacion;
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Comentario() {
		this.texto = "";
		this.puntuacion = 0;
	}
	
	public Comentario(String texto) {
		this.texto = texto;
		this.puntuacion = 0;
	}
	
	public Comentario(String texto, int puntuacion) {
		this.texto = texto;
		this.puntuacion = puntuacion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public boolean votar(int puntuacion) {
		this.puntuacion += puntuacion;
		return (puntuacion != 0) ? true : false;
	}
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public void comentar(String texto) {
		Comentario auxcomentario = new Comentario(texto);
		this.comentarios.add(auxcomentario);
		System.out.println("Replica añadida.");
	}
	
	public String toString() {
		return "Texto: " + this.texto + ". Puntuacion: " + this.puntuacion;	
	}
	
}
