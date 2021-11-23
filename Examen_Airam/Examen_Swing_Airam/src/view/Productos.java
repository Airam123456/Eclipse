package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import dao.ProductosDAO;
import model.Producto;

public class Productos extends JFrame {

	private JPanel panelPrincipal;
	private JTable tablaProductos;
	private JTextField txtBuscar;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private DefaultTableModel modelo;
	private JButton btnCrear;
	private JButton btnActualizar;
	private JButton btnLimpiar;
	private JButton btnBuscar;
	private JCheckBox chckbxDisponible;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Productos() {
		setTitle("GESTIONAR PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 535);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		GridBagLayout gbl_panelPrincipal = new GridBagLayout();
		gbl_panelPrincipal.columnWidths = new int[]{0, 122, 383, 0, 0, 0};
		gbl_panelPrincipal.rowHeights = new int[]{0, 0, 0, 39, 0, 0, 0};
		gbl_panelPrincipal.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelPrincipal.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelPrincipal.setLayout(gbl_panelPrincipal);
		
		dibujar();
		
		rellenarTabla();
		
		gestionarEventos();
	}

	private void dibujar() {
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(null, "Detalles del Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelDatos = new GridBagConstraints();
		gbc_panelDatos.gridwidth = 3;
		gbc_panelDatos.insets = new Insets(0, 0, 5, 5);
		gbc_panelDatos.fill = GridBagConstraints.BOTH;
		gbc_panelDatos.gridx = 1;
		gbc_panelDatos.gridy = 1;
		panelPrincipal.add(panelDatos, gbc_panelDatos);
		GridBagLayout gbl_panelDatos = new GridBagLayout();
		gbl_panelDatos.columnWidths = new int[]{68, 0, 117, 149, 0, 0};
		gbl_panelDatos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDatos.setLayout(gbl_panelDatos);
		
		JLabel lblCodigo = new JLabel("Código: ");
		GridBagConstraints gbc_lblCodigo = new GridBagConstraints();
		gbc_lblCodigo.anchor = GridBagConstraints.EAST;
		gbc_lblCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigo.gridx = 1;
		gbc_lblCodigo.gridy = 1;
		panelDatos.add(lblCodigo, gbc_lblCodigo);
		
		txtCodigo = new JTextField();
		GridBagConstraints gbc_txtCodigo = new GridBagConstraints();
		gbc_txtCodigo.gridwidth = 2;
		gbc_txtCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodigo.gridx = 2;
		gbc_txtCodigo.gridy = 1;
		panelDatos.add(txtCodigo, gbc_txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		panelDatos.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 3;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		panelDatos.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		panelDatos.add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.gridwidth = 2;
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 3;
		panelDatos.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);
		
		chckbxDisponible = new JCheckBox("Disponible");
		GridBagConstraints gbc_chckbxDisponible = new GridBagConstraints();
		gbc_chckbxDisponible.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDisponible.gridx = 2;
		gbc_chckbxDisponible.gridy = 4;
		panelDatos.add(chckbxDisponible, gbc_chckbxDisponible);
		
		btnCrear = new JButton("Crear");
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.anchor = GridBagConstraints.EAST;
		gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrear.gridx = 2;
		gbc_btnCrear.gridy = 5;
		panelDatos.add(btnCrear, gbc_btnCrear);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setEnabled(false);
		GridBagConstraints gbc_btnActualizar = new GridBagConstraints();
		gbc_btnActualizar.insets = new Insets(0, 0, 5, 5);
		gbc_btnActualizar.gridx = 3;
		gbc_btnActualizar.gridy = 5;
		panelDatos.add(btnActualizar, gbc_btnActualizar);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.anchor = GridBagConstraints.WEST;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 0);
		gbc_btnLimpiar.gridx = 4;
		gbc_btnLimpiar.gridy = 5;
		panelDatos.add(btnLimpiar, gbc_btnLimpiar);
		
		JLabel lblFiltro = new JLabel("Filtro: ");
		GridBagConstraints gbc_lblFiltro = new GridBagConstraints();
		gbc_lblFiltro.anchor = GridBagConstraints.EAST;
		gbc_lblFiltro.insets = new Insets(0, 0, 5, 5);
		gbc_lblFiltro.gridx = 1;
		gbc_lblFiltro.gridy = 3;
		panelPrincipal.add(lblFiltro, gbc_lblFiltro);
		
		txtBuscar = new JTextField();
		GridBagConstraints gbc_txtBuscar = new GridBagConstraints();
		gbc_txtBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_txtBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBuscar.gridx = 2;
		gbc_txtBuscar.gridy = 3;
		panelPrincipal.add(txtBuscar, gbc_txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 3;
		gbc_btnBuscar.gridy = 3;
		panelPrincipal.add(btnBuscar, gbc_btnBuscar);
		
		tablaProductos = new JTable();
		GridBagConstraints gbc_tablaProductos = new GridBagConstraints();
		gbc_tablaProductos.insets = new Insets(0, 0, 5, 5);
		gbc_tablaProductos.gridwidth = 3;
		gbc_tablaProductos.fill = GridBagConstraints.BOTH;
		gbc_tablaProductos.gridx = 1;
		gbc_tablaProductos.gridy = 4;
		panelPrincipal.add(tablaProductos, gbc_tablaProductos);
	}
		
	private void rellenarTabla() {
		
		modelo = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tablaProductos.setModel(modelo);
		String[] headers = new String[0];
		String tabla = "Productos";

		headers = Producto.campos();
		modelo.setColumnIdentifiers(headers);
		modelo.addRow(headers);
		ArrayList<Producto> productos = new ProductosDAO().selectProducto();
		for (Producto producto : productos) {
			String[] row = producto.getAll();
			modelo.addRow(row);
		}
	
	}
	
	private void gestionarEventos() {
		
		btnLimpiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtNombre.setText("");
				txtCodigo.setText("");
				txtPrecio.setText("");
			}
		});
		
	}
}
