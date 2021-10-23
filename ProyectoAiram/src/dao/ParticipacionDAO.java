package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import model.Deporte;
import model.Deportista;
import model.Equipo;
import model.Evento;
import model.Olimpiada;
import model.Participacion;

public class ParticipacionDAO {

	private ConexionDB conex;

	public ArrayList<Participacion> getParticipacion() {
		conex = new ConexionDB();
		PreparedStatement ps;
		ArrayList<Participacion> participaciones = new ArrayList<Participacion>();
		try {
			ps=conex.getConexion().prepareStatement("select *  from Participacion");
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				Deportista deportista = new DeportistaDAO().deportistaID(rs.getInt("id_deportista"));
				Evento evento = new EventoDAO().olimpiadaEvento(rs.getInt("id_evento"));
				Equipo equipo = new EquipoDAO().equipoID(rs.getInt("id_equipo"));
				participaciones.add(new Participacion(deportista, evento, equipo, rs.getInt(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return participaciones;
	}
}
