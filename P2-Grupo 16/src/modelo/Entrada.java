package modelo;

public class Entrada extends EntradaGenerica{
	
	EntradaGenerica entradaGenerica;
	
	public Entrada() {
		this.entradaGenerica = null;
	}
	
	public Entrada(EntradaGenerica entradaGenerica) {
		this.entradaGenerica = entradaGenerica;
	}
	public Entrada(Entrada entrada) {
		super(entrada);
	}

	public EntradaGenerica getEntradaGenerica() {
		return entradaGenerica;
	}

	public void setEntradaGenerica(EntradaGenerica entradaGenerica) {
		this.entradaGenerica = entradaGenerica;
	}
	
	

}
