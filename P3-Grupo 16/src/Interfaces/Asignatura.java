package Interfaces;

import modelo.Usuario;

public interface Asignatura {
	
	public void annadirSubscritor(Usuario usuario);
	public void eliminarSubscritor(Usuario usuario);
	public void notificar();

}
