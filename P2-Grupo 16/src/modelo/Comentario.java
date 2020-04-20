package modelo;

import java.util.ArrayList;
import java.util.List;

public class Comentario {
	
	String texto;
	int puntuacion;
	List<Comentario> comentarios;
	
	public Comentario() {
		this.texto = "";
		this.puntuacion = 0;
		this.comentarios = new ArrayList<Comentario>();
	}
	
	public Comentario(String texto, int puntuacion) {
		this.texto = texto;
		this.puntuacion = puntuacion;
		this.comentarios = new ArrayList<Comentario>();
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
		this.puntuacion = puntuacion;
		return (this.puntuacion != 0) ? true : false;
	}
	
	public void comentar(Comentario texto) {
		this.comentarios.add(texto);
	}
	
}
