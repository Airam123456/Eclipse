package model;

public class AeropuertosPublicos {
	
	int id_aeropuerto, num_trabajadores;
	double financiacion;
	
	public AeropuertosPublicos(int id_aeropuerto, int num_trabajadores, double financiacion) {
		
		this.id_aeropuerto = id_aeropuerto;
		this.num_trabajadores = num_trabajadores;
		this.financiacion = financiacion;
		
	}

	
	public int getId_aeropuerto() {
		return id_aeropuerto;
	}

	public void setId_aeropuerto(int id_aeropuerto) {
		this.id_aeropuerto = id_aeropuerto;
	}

	public int getNum_trabajadores() {
		return num_trabajadores;
	}

	public void setNum_trabajadores(int num_trabajadores) {
		this.num_trabajadores = num_trabajadores;
	}

	public double getFinanciacion() {
		return financiacion;
	}

	public void setFinanciacion(double financiacion) {
		this.financiacion = financiacion;
	}

}
