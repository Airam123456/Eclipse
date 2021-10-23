package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import model.Olimpiada;

public class OlimpiadaDAO {

	private ConexionDB conex;

	public ArrayList<Olimpiada> getOlimpiada() {
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Olimpiada> olimpiadas = new ArrayList<Olimpiada>();
		try {
			ps=conex.getConexion().prepareStatement("select *  from Olimpiada");
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				olimpiadas.add(new Olimpiada (rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return olimpiadas;
	}
	
	public Olimpiada olimpiadaID (int id) {
		conex = new ConexionDB();
		PreparedStatement ps;
		Olimpiada olimpiada = null;
		try {
			ps = conex.getConexion().prepareStatement("select * from Olimpiada where id_olimpiada = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				olimpiada = new Olimpiada(id, rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return olimpiada;
	}
	
	public void nuevaOlimpiada(Olimpiada olimpiada) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("insert into Olimpiada (nombre, anio, temporada, ciudad) values (?, ?, ?, ?)");
			ps.setString(1, olimpiada.getNombre());
			ps.setInt(2, olimpiada.getAnio());
			ps.setString(3, olimpiada.getTemporada());
			ps.setString(4, olimpiada.getCiudad());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void cambiarOlimpiada(Olimpiada olimpiada) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("update Olimpiada set nombre = ?, anio = ?, temporada = ?, ciudad = ? where id_olimpiada = ?");
			ps.setString(1, olimpiada.getNombre());
			ps.setInt(2, olimpiada.getAnio());
			ps.setString(3, olimpiada.getTemporada());
			ps.setString(4, olimpiada.getCiudad());
			ps.setInt(5, olimpiada.getId());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void borrarOlimpiada(Olimpiada olimpiada) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("delete from Olimpiada where id_olimpiada = ?");
			ps.setInt(1, olimpiada.getId());
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
