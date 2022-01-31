package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import modelo.Alumno;

public class AlumnoDAO {
	private ConexionDB cn;
	
	public AlumnoDAO() {
		cn = new ConexionDB();
	}
	
	public ArrayList<Alumno>selectAlumnos(){
		PreparedStatement ps;
		
		ArrayList<Alumno>lstAlumno = new ArrayList<Alumno>();
		try {
			ps = cn.getConexion().prepareStatement("select dni, nombre, apellido1, apellido2 from Alumno");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				lstAlumno.add(new Alumno(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return lstAlumno;
	}
	
	public Alumno selectAlumnoPorDni(String dni){
		PreparedStatement ps;
		
		Alumno alum = null;
		try {
			ps= cn.getConexion().prepareStatement("select dni, nombre, apellido1, apellido2 from Alumno where dni = ?");
			ps.setString(1, dni);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				alum =new Alumno(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alum;
	}
	
	public void insertAlumno(Alumno alumno){
		PreparedStatement ps;
		
		try {
			ps = cn.getConexion().prepareStatement("insert into Alumno (dni, nombre, apellido1, apellido2) values (?,?,?,?)");
			ps.setString(1, alumno.getDni());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellido1());
			ps.setString(4, alumno.getApellido2());
			ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateAlumno(Alumno alumno, String dni) {
		PreparedStatement ps;
		
		try {
			ps=cn.getConexion().prepareStatement("update Alumno set dni = ?, nombre = ?, apellido1 = ?, apellido2 = ? where dni = ?");
			ps.setString(1, alumno.getDni());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellido1());
			ps.setString(4, alumno.getApellido2());
			ps.setString(5, dni);
			ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAlumno(Alumno alumno) {
		PreparedStatement ps;
		
		try {
			ps = cn.getConexion().prepareStatement("delete from Alumno where dni = ?");
			ps.setString(1, alumno.getDni());
			ps.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion () {
		cn.cerrarConexion();
	}
	

}
