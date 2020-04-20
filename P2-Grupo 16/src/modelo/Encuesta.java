package modelo;

import java.util.ArrayList;
import java.util.List;

public class Encuesta extends EntradaGenerica{
	
	List<String> respuestas;
	
	public Encuesta() {
		super();
		this.respuestas = new ArrayList<String>();
	}
	
	public Encuesta(EntradaGenerica entradaGenerica, List<String> respuestas) {
		super(entradaGenerica);
		this.respuestas = new ArrayList<String>(respuestas);
	}

}
