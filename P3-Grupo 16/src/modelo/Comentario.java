package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Comentario {
	
	String texto;
	int puntuacion;
	private List<Comentario> comentarios = new ArrayList<Comentario>();
        private HashMap<String, Usuario> votantes = new HashMap<>();
	private HashMap<String, Integer> votos = new HashMap<>();
	
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

	public boolean votar(int puntuacion, Usuario usuario) {
		if(!this.getVotantes().containsKey(usuario.getNick())) {
			this.puntuacion += puntuacion;
			this.votantes.put(usuario.getNick(), usuario);
			this.votos.put(usuario.getNick(), puntuacion);
			return true;
		}
		else if(this.getVotos().get(usuario.getNick())!=puntuacion && this.getVotos().get(usuario.getNick())!=0) {
			this.puntuacion = puntuacion;
                        this.votos.remove(usuario.getNick());
                        this.votos.put(usuario.getNick(), puntuacion);
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

        public HashMap<String, Integer> getVotos() {
            return votos;
        }

        public void setVotos(HashMap<String, Integer> votos) {
            this.votos = votos;
        }   

	public void comentar(String texto) {
		Comentario auxcomentario = new Comentario(texto);
		this.comentarios.add(auxcomentario);
		System.out.println("Replica annadida.");
	}
	
	public String toString() {
		return "Texto: " + this.texto + ". Puntuacion: " + this.puntuacion;	
	}
	
}
