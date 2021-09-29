package model;

public class Aviones {
	
	int id, numero_asientos, velocidad_maxima, activado, id_aeropuerto;
	String modelo;
	
	public Aviones(int id, int numero_asientos, int velocidad_maxima, int activado, int id_aeropuerto, String modelo) {

		this.id = id;
		this.numero_asientos = numero_asientos;
		this.velocidad_maxima = velocidad_maxima;
		this.activado = activado;
		this.id_aeropuerto = id_aeropuerto;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero_asientos() {
		return numero_asientos;
	}

	public void setNumero_asientos(int numero_asientos) {
		this.numero_asientos = numero_asientos;
	}

	public int getVelocidad_maxima() {
		return velocidad_maxima;
	}

	public void setVelocidad_maxima(int velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}

	public int getActivado() {
		return activado;
	}

	public void setActivado(int activado) {
		this.activado = activado;
	}

	public int getId_aeropuerto() {
		return id_aeropuerto;
	}

	public void setId_aeropuerto(int id_aeropuerto) {
		this.id_aeropuerto = id_aeropuerto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
