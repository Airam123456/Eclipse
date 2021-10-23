package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import model.Deporte;
import model.Evento;
import model.Olimpiada;

public class EventoDAO {

	private ConexionDB conex;
	
	public ArrayList<Evento> getEvento() {
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		try {
			ps=conex.getConexion().prepareStatement("select *  from Evento");
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				Olimpiada olimpiada = new OlimpiadaDAO().olimpiadaID(rs.getInt("id_olimpiada"));
				Deporte deporte = new DeporteDAO().deporteID(rs.getInt("id_deporte"));
				eventos.add(new Evento(rs.getInt(1), rs.getString(2), olimpiada, deporte));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eventos;
	}
	
	public ArrayList<Evento> olimpiadaEvento (Olimpiada olimpiada){
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		try {
			ps=conex.getConexion().prepareStatement("select * from Evento where id_olimpiada = ?");
			ps.setInt(1, olimpiada.getId());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Deporte deporte = new DeporteDAO().deporteID(rs.getInt("id_deporte"));
				eventos.add(new Evento(rs.getInt(1), rs.getString(2), olimpiada, deporte));
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eventos;
	}

	
	public void nuevoEvento(Evento evento) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps=conex.getConexion().prepareStatement("insert into Evento (nombre, id_olimpiada, id_deporte) values (?,?,?)");
			ps.setString(1, evento.getNombre());
			ps.setInt(2, evento.getOlimpiada().getId());
			ps.setInt(3, evento.getDeporte().getId());
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cambiarEvento(Evento evento) {
		conex = new ConexionDB();
		PreparedStatement ps;
		try {
			ps = conex.getConexion().prepareStatement("update Evento set nombre = ?, id_olimpiada = ?, id_deporte = ? where id_evento = ?");
			ps.setString(1, evento.getNombre());
			ps.setInt(2, evento.getOlimpiada().getId());
			ps.setInt(3, evento.getDeporte().getId());
			ps.setInt(4, evento.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
