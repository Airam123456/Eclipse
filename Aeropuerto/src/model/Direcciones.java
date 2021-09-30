package model;

public class Direcciones {
	
	private int id, numero;
	private String pais, ciudad, calle;
	
	public Direcciones(int id, int numero, String pais, String ciudad, String calle) {

		this.id = id;
		this.numero = numero;
		this.pais = pais;
		this.ciudad = ciudad;
		this.calle = calle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

}
