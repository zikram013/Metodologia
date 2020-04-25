package modelo;

public class TextoPlano extends Entrada{
	
	public TextoPlano() {
		super();
	}
	
	public TextoPlano(EntradaGenerica entradaGenerica) {
		super(entradaGenerica, null);
	}
	
	public TextoPlano(EntradaGenerica entradaGenerica, Usuario usuario) {
		super(entradaGenerica, usuario);
	}

}
