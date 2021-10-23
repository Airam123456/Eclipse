package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import model.Equipo;

public class EquipoDAO {

	private ConexionDB conex;

	public ArrayList<Equipo> getEquipo() {
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		try {
			ps = conex.getConexion().prepareStatement("select * from Equipo");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				equipos.add(new Equipo(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return equipos;
	}
	
	public Equipo equipoID (int id) {
		conex = new ConexionDB();
		PreparedStatement ps;
		Equipo equipo = null;
		try {
			ps = conex.getConexion().prepareStatement("select * from Equipo where id_equipo = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				equipo = new Equipo(id, rs.getString(2), rs.getString(3));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return equipo;
	}
	
	public void nuevoEquipo (Equipo equipo) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("insert into Equipo (nombre, iniciales) values (?, ?)");
			ps.setString(1, equipo.getNombre());
			ps.setString(2, equipo.getIniciales());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void cambiarEquipo (Equipo equipo) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("update Equipo set nombre = ?, iniciaes = ? where id_equipo = ?");
			ps.setString(1, equipo.getNombre());
			ps.setString(2, equipo.getIniciales());
			ps.setInt(3, equipo.getId());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void borrarEquipo (Equipo equipo) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("delete from Equipo where id_equipo = ?");
			ps.setInt(1, equipo.getId());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}
	public void cerrarConexion () {
		conex.cerrarConexion();
	}
}
