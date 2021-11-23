package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConexionDB;
import modelo.Ubicacion;

public class UbicacionesDAO {
	private ConexionDB cn;
	
	public UbicacionesDAO() {
		this.cn = new ConexionDB();	
	}
	
	public ArrayList<Ubicacion> selectUbicacion (){
		PreparedStatement ps;
		ArrayList<Ubicacion> lstUbicaciones = new ArrayList<Ubicacion>();
		
		try {
			ps= cn.getConexion().prepareStatement("select * from ubicacion");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				lstUbicaciones.add(new Ubicacion(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstUbicaciones;
	}
}
