package modelo;

public class EntradaGenerica{
	
	int puntuacion;
	String titulo;
	String texto;
	boolean verificada;
	Comentario comentario;
	
	public EntradaGenerica() {
		this.puntuacion = 0;
		this.titulo = "";
		this.texto = "";
		this.verificada = false;
		this.comentario = null;
	}
	
	public EntradaGenerica(String titulo, String texto) {
		this.puntuacion = 0;
		this.titulo = titulo;
		this.texto = texto;
		this.verificada = false;
		this.comentario = null;
	}
	
	public EntradaGenerica(int puntuacion, String titulo, String texto, boolean verificada, Comentario comentario) {
		this.puntuacion = puntuacion;
		this.titulo = titulo;
		this.texto = texto;
		this.verificada = verificada;
		this.comentario = comentario;
	}
	
	public EntradaGenerica(EntradaGenerica entradaGenerica) {
		this.puntuacion = entradaGenerica.puntuacion;
		this.titulo = entradaGenerica.titulo;
		this.texto = entradaGenerica.texto;
		this.verificada = entradaGenerica.verificada;
		this.comentario = entradaGenerica.comentario;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public boolean votar(int puntuacion) {
		this.puntuacion = puntuacion;
		return (this.puntuacion != 0) ? true : false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isVerificada() {
		return verificada;
	}

	public void verificar(boolean verificada) {
		this.verificada = verificada;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public boolean comentar(Comentario comentario) {
		this.comentario = comentario;
		return (this.comentario != null) ? true : false;
	}

}
