package modelo;

public class Entrada{
	
	private EntradaGenerica entradaGenerica;
	private Usuario usuario;
	
	public Entrada() {
		this.entradaGenerica = null;
		this.usuario = null;
	}
	
	public Entrada(String titulo, String texto, Usuario usuario) {
		this.entradaGenerica.setTitulo(titulo);
		this.entradaGenerica.setTitulo(texto);
		this.usuario = usuario;
	}
	
	public Entrada(EntradaGenerica entradaGenerica, Usuario usuario) {
		this.entradaGenerica = entradaGenerica;
		this.usuario = usuario;
	}

	public EntradaGenerica getEntradaGenerica() {
		return entradaGenerica;
	}

	public void setEntradaGenerica(EntradaGenerica entradaGenerica) {
		this.entradaGenerica = entradaGenerica;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void editar(String newTitulo, String newTexto) {
		this.getEntradaGenerica().setTitulo(newTitulo);
		this.getEntradaGenerica().setTexto(newTexto);
	}
	
	public String toString() {
		return "Título: " + this.getEntradaGenerica().getTitulo() + "\nTexto: " + this.getEntradaGenerica().getTexto() + "\n";
	}
	
}
