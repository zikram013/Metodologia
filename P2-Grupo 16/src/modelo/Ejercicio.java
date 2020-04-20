package modelo;

public class Ejercicio extends EntradaGenerica{
	
	String solucion;
	
	public Ejercicio() {
		super();
		this.solucion = "";
	}
	
	public Ejercicio(EntradaGenerica entradaGenerica, String solucion) {
		super(entradaGenerica);
		this.solucion = solucion;
	}

}
