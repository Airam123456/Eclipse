package model;

public class AeropuertosPrivados {
	
	private int id_aeropuerto, numero_socios;
	
	public AeropuertosPrivados(int id_aeropuerto, int numero_socios) {
		
		this.id_aeropuerto = id_aeropuerto;
		this.numero_socios = numero_socios;
	}

	
	public int getId_aeropuerto() {
		return id_aeropuerto;
	}

	public void setId_aeropuerto(int id_aeropuerto) {
		this.id_aeropuerto = id_aeropuerto;
	}

	public int getNumero_socios() {
		return numero_socios;
	}

	public void setNumero_socios(int numero_socios) {
		this.numero_socios = numero_socios;
	}
}
