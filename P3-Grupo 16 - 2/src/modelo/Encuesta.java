package modelo;

import java.util.ArrayList;
import java.util.List;

public class Encuesta extends Entrada{
	
	private List<String> respuestas;
	
	public Encuesta() {
		super();
		this.respuestas = new ArrayList<String>();
	}
        
        public Encuesta(List<String> respuestas) {
		super();
		this.respuestas = new ArrayList<String>(respuestas);
	}
	
	public Encuesta(EntradaGenerica entradaGenerica, List<String> respuestas, Usuario usuario) {
		super(entradaGenerica, usuario);
		this.respuestas = new ArrayList<String>(respuestas);
	}

	public List<String> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<String> respuestas) {
		this.respuestas = new ArrayList<String>(respuestas);
	}

}
