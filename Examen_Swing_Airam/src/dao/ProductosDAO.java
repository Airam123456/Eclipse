package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ConexionDB;
import model.Producto;

public class ProductosDAO {
	
	private ConexionDB cn;
	
	public ProductosDAO() {
		cn = new ConexionDB();
	}
	
	public ArrayList<Producto> selectProducto(){
		PreparedStatement ps;
		
		ArrayList<Producto> lstProductos = new ArrayList<Producto>();
		try {
			ps = cn.getConexion().prepareStatement("select * from productos");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				lstProductos.add(new Producto(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstProductos;
	}
	
	public Producto getProducto (String codigo) {
		PreparedStatement ps;
		Producto producto = null;
		try {
			ps = cn.getConexion().prepareStatement("select * from productos where codigo = ?");
			ps.setString(1, codigo);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				producto = new Producto (codigo, rs.getString(2), rs.getDouble(3), rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return producto;
	}
	
	public void insertProducto (Producto producto) {
		PreparedStatement ps;
		Connection conexion = cn.getConexion();
		
		try {
			ps= cn.getConexion().prepareStatement("insert into productos (codigo, nombre, precio, disponible) values (?,?,?,?)");
			ps.setString(1, producto.getCodigo());
			ps.setString(2, producto.getNombre());
			ps.setDouble(3, producto.getPrecio());
			ps.setInt(4, producto.getDisponible());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateProducto(Producto producto) {
		PreparedStatement ps;
		Connection conexion = cn.getConexion();
		
		try {
			ps= cn.getConexion().prepareStatement("update productos set nombre = ?, precio = ?, disponible = ? where codigo = ?");
			ps.setString(1, producto.getNombre());
			ps.setDouble(2, producto.getPrecio());
			ps.setInt(3, producto.getDisponible());
			ps.setString(4, producto.getCodigo());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
