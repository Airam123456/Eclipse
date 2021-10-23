package model;

public class Olimpiada {

	private int id;
	private String nombre;
	private int anio;
	private String temporada;
	private String ciudad;
	
	public Olimpiada(int id, String nombre, int anio, String temporada, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
		this.temporada = temporada;
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnio() {
		return anio;
	}

	public String getTemporada() {
		return temporada;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
