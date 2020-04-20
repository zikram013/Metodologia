package controlador;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Asignatura;
import modelo.Usuario;

public class SubForo implements Asignatura{
	
	String titulo;
	List<Usuario> suscritos;
	
	public SubForo() {
		this.titulo = "";
		this.suscritos = new ArrayList<Usuario>();
    }
	
	public SubForo(String titulo) {
		this.titulo = titulo;
		this.suscritos = new ArrayList<Usuario>();
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void añadirSubscritor(Usuario usuario) {
		this.suscritos.add(usuario);
	}

	@Override
	public void eliminarSubscritor(Usuario usuario) {
		this.suscritos.remove(usuario);
	}

	@Override
	public void notificar() {
		for(int i = 0; i < this.suscritos.size(); i++) {
			this.suscritos.get(i).getNotificaciones().add("");
		}
	}
	
	
	
}
