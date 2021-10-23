package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import model.Deportista;

public class DeportistaDAO {

	private ConexionDB conex;

	public ArrayList<Deportista> getDeportistas() {
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
		try {
			ps=conex.getConexion().prepareStatement("select *  from Deportista");
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				deportistas.add(new Deportista (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return deportistas;
	}
	
	public Deportista deportistaID (int id) {
		conex = new ConexionDB();
		PreparedStatement ps;
		Deportista deportista = null;
		try {
			ps = conex.getConexion().prepareStatement("select * from Deportista where id_deportista = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				deportista = new Deportista(id, rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deportista;
	}
	
	public void nuevoDeportista (Deportista deportista) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("insert into Deportista (nombre, sexo, peso, altura) values (?, ?, ?, ?)");
			ps.setString(1, deportista.getNombre());
			ps.setString(2, deportista.getSexo());
			ps.setInt(3, deportista.getPeso());
			ps.setInt(4, deportista.getAltura());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cambiarDeportista (Deportista deportista) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("update Deportista set nombre = ?, sexo= ?, peso = ?, altura = ? where id_deportista = ?");
			ps.setString(1, deportista.getNombre());
			ps.setString(2, deportista.getSexo());
			ps.setInt(3, deportista.getPeso());
			ps.setInt(4, deportista.getAltura());
			ps.setInt(5, deportista.getId());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void borrarDeportista (Deportista deportista) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("delete from Deportista where id_deporte = ?");
			ps.setInt(1, deportista.getId());
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
