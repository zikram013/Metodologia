package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EntradaGenerica{
	
	private int puntuacion;
	private String titulo;
	private String texto;
	private boolean verificada;
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	private HashMap<String, Usuario> votantes = new HashMap<>();
	private HashMap<String, Integer> votos = new HashMap<>();
	
	public EntradaGenerica() {
		this.puntuacion = 0;
		this.titulo = "";
		this.texto = "";
		this.verificada = false;
	}
	
	public EntradaGenerica(String titulo, String texto) {
		this.puntuacion = 0;
		this.titulo = titulo;
		this.texto = texto;
		this.verificada = false;
	}
	
	public EntradaGenerica(int puntuacion, String titulo, String texto, boolean verificada) {
		this.puntuacion = puntuacion;
		this.titulo = titulo;
		this.texto = texto;
		this.verificada = verificada;
	}
	
	public EntradaGenerica(EntradaGenerica entradaGenerica) {
		this.puntuacion = entradaGenerica.puntuacion;
		this.titulo = entradaGenerica.titulo;
		this.texto = entradaGenerica.texto;
		this.verificada = entradaGenerica.verificada;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public boolean votar(int puntuacion, Usuario usuario) {
		if(this.verificada && !this.getVotantes().containsKey(usuario.getNick())) {
			this.puntuacion += puntuacion;
			this.votantes.put(usuario.getNick(), usuario);
			this.votos.put(usuario.getNick(), puntuacion);
			return true;
		}
		else if(this.verificada && votos.get(usuario.getNick())!=puntuacion && votos.get(usuario.getNick())!=0) {
			this.puntuacion = puntuacion;
			return true;
		}
		return false;
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
		if(!this.verificada)
			this.verificada = verificada;
	}

	public boolean comentar(String comentario) {
		if(this.verificada) {
			Comentario comentarioaux = new Comentario(comentario);
			this.comentarios.add(comentarioaux);
			return true;
		}
		return false;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	public HashMap<String, Usuario> getVotantes() {
		return votantes;
	}

	public void setVotantes(HashMap<String, Usuario> votantes) {
		this.votantes = votantes;
	}
	
	public String toStringComentarios() {
		String text = "";
		for(int i = 0; i < this.getComentarios().size(); i++) {
			text += "[Comentario " + (i+1) + "]: " + this.getComentarios().get(i).getTexto()
							 + ". Puntuacion: " + this.getComentarios().get(i).getPuntuacion();
			for(int j = 0; j < this.getComentarios().get(i).getComentarios().size(); j ++) {
				text += "\n[Replica " + (j+1) + "]: " + this.getComentarios().get(i).getComentarios().get(j).toString();
			}
		}
		return text;
	}

}
