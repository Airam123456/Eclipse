package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.DeporteDAO;
import dao.EquipoDAO;
import model.Deporte;
import model.Equipo;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class EquipoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtSiglas;
	private JComboBox comboBoxEquipos;
	private JButton btnEliminar, btnAniadir, btnModificar, btnCerrar;
	private EquipoDAO equipoDAO;
	private JLabel lblNombre;
	private JLabel lblSiglas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquipoView frame = new EquipoView();
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
	public EquipoView() {
		
		equipoDAO = new EquipoDAO();
		
		dibujar();
		datosEquipos();
		eventos();
	}
	
	private void dibujar() {
		setTitle("EQUIPOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		comboBoxEquipos = new JComboBox();
		GridBagConstraints gbc_comboBoxDeportes = new GridBagConstraints();
		gbc_comboBoxDeportes.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDeportes.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDeportes.gridx = 1;
		gbc_comboBoxDeportes.gridy = 0;
		contentPane.add(comboBoxEquipos, gbc_comboBoxDeportes);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 0;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtAniadir = new GridBagConstraints();
		gbc_txtAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_txtAniadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAniadir.gridx = 1;
		gbc_txtAniadir.gridy = 2;
		contentPane.add(txtNombre, gbc_txtAniadir);
		txtNombre.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		txtSiglas = new JTextField();
		GridBagConstraints gbc_txtModificar = new GridBagConstraints();
		gbc_txtModificar.insets = new Insets(0, 0, 5, 5);
		gbc_txtModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtModificar.gridx = 1;
		gbc_txtModificar.gridy = 3;
		contentPane.add(txtSiglas, gbc_txtModificar);
		txtSiglas.setColumns(10);
		
		lblSiglas = new JLabel("Siglas");
		GridBagConstraints gbc_lblSiglas = new GridBagConstraints();
		gbc_lblSiglas.anchor = GridBagConstraints.WEST;
		gbc_lblSiglas.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiglas.gridx = 2;
		gbc_lblSiglas.gridy = 3;
		contentPane.add(lblSiglas, gbc_lblSiglas);
		
		btnAniadir = new JButton("Aniadir");
		GridBagConstraints gbc_btnAniadir = new GridBagConstraints();
		gbc_btnAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadir.gridx = 1;
		gbc_btnAniadir.gridy = 4;
		contentPane.add(btnAniadir, gbc_btnAniadir);
		
		btnModificar = new JButton("Moificar");
		GridBagConstraints gbc_btnMoificar = new GridBagConstraints();
		gbc_btnMoificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMoificar.gridx = 2;
		gbc_btnMoificar.gridy = 4;
		contentPane.add(btnModificar, gbc_btnMoificar);
		
		btnCerrar = new JButton("Cerrar");
		GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
		gbc_btnCerrar.gridwidth = 2;
		gbc_btnCerrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrar.gridx = 1;
		gbc_btnCerrar.gridy = 5;
		contentPane.add(btnCerrar, gbc_btnCerrar);
	}
	
	private void datosEquipos() {
		DefaultComboBoxModel<Equipo> datosEquipo = new DefaultComboBoxModel<Equipo>();
		datosEquipo.addAll(equipoDAO.getEquipo());
		comboBoxEquipos.setModel(datosEquipo);
		comboBoxEquipos.setSelectedIndex(0);
	}
	
	private void eventos() {
		
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				equipoDAO.borrarEquipo((Equipo)comboBoxEquipos.getSelectedItem());
				datosEquipos();
			}
		});
		
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Equipo nuevoEquipo = new Equipo(0, txtNombre.getText(), txtSiglas.getText());
				equipoDAO.nuevoEquipo(nuevoEquipo);
				datosEquipos();
			}
		});
		
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Equipo nuevoEquipo = new Equipo(0, txtNombre.getText(), txtSiglas.getText());
				nuevoEquipo.setId(comboBoxEquipos.getSelectedIndex());
				equipoDAO.nuevoEquipo(nuevoEquipo);
				datosEquipos();
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				equipoDAO.cerrarConexion();
				dispose();
			}
		});
		
	}
}


