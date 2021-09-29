package model;

public class Aeropuertos {
	
	int id, anio_inauguracion, capacidad, id_direccion;
	String varchar;
	
	public Aeropuertos(int id, int anio_inauguracion, int capacidad, int id_direccion, String varchar) {

		this.id = id;
		this.anio_inauguracion = anio_inauguracion;
		this.capacidad = capacidad;
		this.id_direccion = id_direccion;
		this.varchar = varchar;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnio_inauguracion() {
		return anio_inauguracion;
	}

	public void setAnio_inauguracion(int anio_inauguracion) {
		this.anio_inauguracion = anio_inauguracion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getVarchar() {
		return varchar;
	}

	public void setVarchar(String varchar) {
		this.varchar = varchar;
	}
}
