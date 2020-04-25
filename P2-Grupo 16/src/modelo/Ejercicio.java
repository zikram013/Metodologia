package modelo;

public class Ejercicio extends Entrada{
	
	private String solucion;
	
	public Ejercicio() {
		super();
		this.solucion = "";
	}
	
	public Ejercicio(EntradaGenerica entradaGenerica, String solucion, Usuario usuario) {
		super(entradaGenerica, usuario);
		this.solucion = solucion;
	}

}
