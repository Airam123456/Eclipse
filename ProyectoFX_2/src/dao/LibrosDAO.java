package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import config.ConexionDB;
import modelo.Libro;

public class LibrosDAO {
	
	private ConexionDB cn;
	
	public LibrosDAO() {
		this.cn = new ConexionDB();
	}
	
	public ArrayList<Libro> selectLibro(){
		PreparedStatement ps;
		ArrayList<Libro> lstLibro = new ArrayList<Libro>();
		
		try {
			ps = cn.getConexion().prepareStatement("select codigo, Titulo, Autor, Editorial, Estado, Baja from Libro where Baja = 0");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				lstLibro.add(new Libro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Fallo al obtener los datos");
		}
		return lstLibro;
	}
	
	public void insertLibro (Libro libro) {
		PreparedStatement ps;
		
		try {
			ps = cn.getConexion().prepareStatement("insert into Libro (codigo, Titulo, Autor, Editorial, Estado, Baja) values (?,?,?,?,?,?)");
			ps.setInt(1, libro.getCodigo());
			ps.setString(2, libro.getTitulo());
			ps.setString(3, libro.getAutor());
			ps.setString(4, libro.getEditorial());
			ps.setString(5, libro.getEstado());
			ps.setInt(6, libro.getBaja());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al insertar datos");
		}
	} 
	

}
