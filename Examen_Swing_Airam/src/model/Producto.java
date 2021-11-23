package model;

public class Producto {
	
	private String codigo , nombre;
	private double precio;
	private int disponible;
	
	public Producto(String codigo, String nombre, double precio, int disponible) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
	}
	
	public static String[] campos() {
		String[] c = {"codigo", "nombre", "precio", "disponible"};
		return c;
	}
	
	public String[] getAll() {
		String[] all = {codigo, nombre, precio+"", disponible+""};
		return all;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDisponible() {
		return disponible;
	}
	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
}
