package modelo;

public class Penalizacion {

	private boolean activa;
	private int diasPenalizacion;
	
	public Penalizacion(int dias) {
		diasPenalizacion = dias;
		activa = true;
	}
	
	public boolean estaActiva() {
		return activa;
	}
	
	public void avanzarDias(int dias) {
		diasPenalizacion -= dias;
		if(diasPenalizacion <= 0) {
			diasPenalizacion = 0;
			activa = false;
		}
	}
	
	public void extenderPenalizacion() {
		this.diasPenalizacion += 2;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public int getDiasPenalizacion() {
		return diasPenalizacion;
	}

	public void setDiasPenalizacion(int diasPenalizacion) {
		this.diasPenalizacion = diasPenalizacion;
	}

}
