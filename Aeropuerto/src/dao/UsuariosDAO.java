package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.ConexionDB;
import model.Usuarios;;

public class UsuariosDAO {
	
	private ConexionDB conex;

	public UsuariosDAO(ConexionDB conex) {
		super();
		this.conex = conex;
	}
	
	public boolean validLogin(Usuarios user) 
	{
		String sql = ""
				+ "Select * "
				+ "from usuarios "
				+ "where usuario = '"+user.getUsuario()+"' "
				+ "and password = '"+user.getPassword()+"'";
		try {
			conex = new ConexionDB();
			ResultSet rs = conex.ejecutarConsulta(sql);
			rs.last();   
			int size = rs.getRow();
			if(size>0) {
				conex.cerrarConexion();
				return true;
			}
			return false;
		} catch (SQLException e) {
			return false;
	
		}
	}
}
