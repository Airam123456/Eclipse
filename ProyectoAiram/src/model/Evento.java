package model;

public class Evento {

	private int id;
	private String nombre;
	private Olimpiada olimpiada;
	private Deporte deporte;
	
	public Evento(int id, String nombre, Olimpiada olimpiada, Deporte deporte) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.olimpiada = olimpiada;
		this.deporte = deporte;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Olimpiada getOlimpiada() {
		return olimpiada;
	}

	public Deporte getDeporte() {
		return deporte;
	}


}
