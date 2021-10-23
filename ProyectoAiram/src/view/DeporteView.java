package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Deporte;
import model.Olimpiada;
import dao.DeporteDAO;

import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class DeporteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAniadir;
	private JTextField txtModificar;
	private JComboBox comboBoxDeportes;
	private JButton btnEliminar, btnAniadir, btnModificar, btnCerrar;
	private DeporteDAO deporteDAO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeporteView frame = new DeporteView();
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
	public DeporteView() {
		
		deporteDAO = new DeporteDAO();
		
		dibujar();
		datosDeportes();
		txtDeporte();
		eventos();
	}

	private void dibujar() {
		setTitle("DEPORTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		comboBoxDeportes = new JComboBox();
		GridBagConstraints gbc_comboBoxDeportes = new GridBagConstraints();
		gbc_comboBoxDeportes.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDeportes.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDeportes.gridx = 1;
		gbc_comboBoxDeportes.gridy = 0;
		contentPane.add(comboBoxDeportes, gbc_comboBoxDeportes);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 0;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		txtAniadir = new JTextField();
		GridBagConstraints gbc_txtAniadir = new GridBagConstraints();
		gbc_txtAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_txtAniadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAniadir.gridx = 1;
		gbc_txtAniadir.gridy = 2;
		contentPane.add(txtAniadir, gbc_txtAniadir);
		txtAniadir.setColumns(10);
		
		btnAniadir = new JButton("Aniadir");
		GridBagConstraints gbc_btnAniadir = new GridBagConstraints();
		gbc_btnAniadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAniadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadir.gridx = 2;
		gbc_btnAniadir.gridy = 2;
		contentPane.add(btnAniadir, gbc_btnAniadir);
		
		txtModificar = new JTextField();
		GridBagConstraints gbc_txtModificar = new GridBagConstraints();
		gbc_txtModificar.insets = new Insets(0, 0, 5, 5);
		gbc_txtModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtModificar.gridx = 1;
		gbc_txtModificar.gridy = 3;
		contentPane.add(txtModificar, gbc_txtModificar);
		txtModificar.setColumns(10);
		
		btnModificar = new JButton("Moificar");
		GridBagConstraints gbc_btnMoificar = new GridBagConstraints();
		gbc_btnMoificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMoificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMoificar.gridx = 2;
		gbc_btnMoificar.gridy = 3;
		contentPane.add(btnModificar, gbc_btnMoificar);
		
		btnCerrar = new JButton("Cerrar");
		GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
		gbc_btnCerrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrar.gridx = 1;
		gbc_btnCerrar.gridy = 4;
		contentPane.add(btnCerrar, gbc_btnCerrar);
	}
	
	private void datosDeportes() {
		DefaultComboBoxModel<Deporte> datosDeporte = new DefaultComboBoxModel<Deporte>();
		datosDeporte.addAll(deporteDAO.getDeportes());
		comboBoxDeportes.setModel(datosDeporte);
		comboBoxDeportes.setSelectedIndex(0);
	}
	
	private void eventos() {
		
		comboBoxDeportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDeporte();
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deporteDAO.borrarDeporte((Deporte)comboBoxDeportes.getSelectedItem());
				datosDeportes();
			}
		});
		
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Deporte nuevoDeporte = new Deporte(0, txtAniadir.getText());
				deporteDAO.nuevoDeporte(nuevoDeporte);
				datosDeportes();
			}
		});
		
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Deporte nuevoDeporte = new Deporte(0, txtModificar.getText());
				nuevoDeporte.setId(comboBoxDeportes.getSelectedIndex());
				deporteDAO.cambiarDeporte(nuevoDeporte);
				datosDeportes();
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deporteDAO.cerrarConexion();
				dispose();
			}
		});
		
	}
	
	private void txtDeporte() {
		txtModificar.setText(comboBoxDeportes.getSelectedItem().toString());
	}

}
