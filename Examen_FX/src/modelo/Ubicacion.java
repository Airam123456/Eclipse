package modelo;

public class Ubicacion {
	
	private int id;
	private String seccion, ubicacion, imagen;
	
	
	public Ubicacion(int id, String seccion, String ubicacion, String imagen) {
		super();
		this.id = id;
		this.seccion = seccion;
		this.ubicacion = ubicacion;
		this.imagen = imagen;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSeccion() {
		return seccion;
	}


	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	

}
