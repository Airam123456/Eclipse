package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import model.Deporte;

public class DeporteDAO {
	
	private ConexionDB conex;

	public ArrayList<Deporte> getDeportes() {
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Deporte> deportes = new ArrayList<Deporte>();
		try {
			ps=conex.getConexion().prepareStatement("select *  from Deporte");
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				deportes.add(new Deporte (rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return deportes;
	}
	
	public Deporte deporteID (int id) {
		conex = new ConexionDB();
		PreparedStatement ps;
		Deporte deporte = null;
		try {
			ps = conex.getConexion().prepareStatement("select * from Deporte where id_deporte = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				deporte = new Deporte(id, rs.getString(2));
				
			}
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deporte;
	}
	
	public void nuevoDeporte(Deporte deporte) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("insert into Deporte (nombre) values (?)");
			ps.setString(1, deporte.getNombre());
			ps.executeUpdate();
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void cambiarDeporte(Deporte deporte) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("update Deporte set nombre = ? where id_deporte = ?");
			ps.setString(1, deporte.getNombre());
			ps.setInt(2, deporte.getId());
			ps.executeUpdate();
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void borrarDeporte (Deporte deporte) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("delete from Deporte where id_deporte = ?");
			ps.setInt(1, deporte.getId());
			ps.executeUpdate();
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public void cerrarConexion () {
		conex.cerrarConexion();
	}
	
}
