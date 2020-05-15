package modelo;

import java.util.HashMap;
import Interfaces.Asignatura;

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
	public void annadirSubscritor(Usuario usuario) {
            if(!this.suscritos.containsKey(usuario.getNick())){
		this.suscritos.put(usuario.getNick(), usuario);
		System.out.println("Te has suscrito al subforo de '" + this.getTitulo() + "' satisfactoriamente.");
            }
            else
                System.out.println("Ya estas suscrito a en este foro");
	}

	@Override
	public void eliminarSubscritor(Usuario usuario) {
            if(this.suscritos.containsKey(usuario.getNick())){
		this.suscritos.remove(usuario.getNick());
		System.out.println("Te has desuscrito del subforo de '" + this.getTitulo() + "' satisfactoriamente.");
	
            }
            else
                System.out.println("No estabas suscrito en este foro.");
        }

	@Override
	public void notificar() {
		for (String nick: suscritos.keySet()){
			this.suscritos.get(nick).recibirNotificacion("Nueva entrada en el foro: '" + this.getTitulo() + "'.\n");
    	}
	}	
	
	public void crearEntrada(Entrada entrada) {
		this.entradas.put(entrada.getEntradaGenerica().getTitulo(), entrada);
		this.notificar();
	}
	
	public void eliminarEntrada(Entrada entrada) {
		this.entradas.remove(entrada.getEntradaGenerica().getTitulo());
	}
	
	public String toStringEntradas() {
		String text = "";
		text += "Lista de entradas del subforo " + this.titulo + ".\n";
		for (String titulo: entradas.keySet()){
			if(entradas.get(titulo).getEntradaGenerica().isVerificada()) {
	    		text += "[Entrada] Titulo: " + titulo.toString() + ". Texto: " + entradas.get(titulo).getEntradaGenerica().getTexto() 
	    				+ ". Puntuacion: " + entradas.get(titulo).getEntradaGenerica().getPuntuacion() + "\n";
	    		text += entradas.get(titulo).getEntradaGenerica().toStringComentarios();
			}
		}
		return text;
	}
	
	public Entrada entradaMasVotada() {
    	EntradaGenerica entradaaux = new EntradaGenerica();
    	Entrada masvotada = new Entrada(entradaaux);
    	for (String entrada: entradas.keySet()){
    		if(masvotada.getEntradaGenerica().getPuntuacion()<=entradas.get(entrada).getEntradaGenerica().getPuntuacion())
    			masvotada = entradas.get(entrada);
    	}
    	return masvotada;
    }
	
}
