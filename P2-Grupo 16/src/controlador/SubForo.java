package controlador;

import java.util.HashMap;
import Interfaces.Asignatura;
import modelo.Entrada;
import modelo.Usuario;

public class SubForo implements Asignatura{
	
	String titulo;
	HashMap<String, Usuario> suscritos = new HashMap<>();
	HashMap<String, Entrada> entradas = new HashMap<>();
	
	public SubForo() {
		this.titulo = "";
    }
	
	public SubForo(String titulo) {
		this.titulo = titulo;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public HashMap<String, Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(HashMap<String, Entrada> entradas) {
		this.entradas = entradas;
	}

	@Override
	public void añadirSubscritor(Usuario usuario) {
		this.suscritos.put(usuario.getNick(), usuario);
	}

	@Override
	public void eliminarSubscritor(Usuario usuario) {
		this.suscritos.remove(usuario.getNick());
	}

	@Override
	public void notificar() {
		for (String nick: suscritos.keySet()){
			this.suscritos.get(nick).getNotificaciones().add("Nueva entrada en el foro: '" + this.getTitulo() + "'.\n");
    	}
	}	
	
	public void crearEntrada(Entrada entrada) {
		this.entradas.put(entrada.getEntradaGenerica().getTitulo(), entrada);
		this.notificar();
	}
	
	public void eliminarEntrada(Entrada entrada) {
		this.entradas.remove(entrada.getEntradaGenerica().getTitulo());
	}
	
}
