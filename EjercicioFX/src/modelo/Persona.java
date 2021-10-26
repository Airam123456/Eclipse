package modelo;

public class Persona {
	
	private String nombre, apellidos;
	private int edad;
	
	public Persona(String nombre, String apeliidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apeliidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApeliidos() {
		return apellidos;
	}

	public void setApeliidos(String apeliidos) {
		this.apellidos = apeliidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
