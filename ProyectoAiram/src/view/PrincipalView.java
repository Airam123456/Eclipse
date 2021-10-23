package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.OlimpiadaDAO;
import model.Olimpiada;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class PrincipalView extends JFrame {

	private JPanel contentPane;
	private OlimpiadaDAO olimpDAO;
	private JButton btnDeportes, btnAtletas, btnEquipos, btnAniadir, btnModificar, btnBorrar;
	private JComboBox<Olimpiada> comboBoxOlimpiadas;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalView frame = new PrincipalView();
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
	public PrincipalView() {
		
		olimpDAO = new OlimpiadaDAO();
		
		dibujar();
		datosOlimpiadas();
		eventos();
	}

	private void dibujar() {
		setTitle("PRINCIPAL");
		
		setBounds(100, 100, 388, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{46, 372, 0};
		gbl_contentPane.rowHeights = new int[]{258, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel_olimpiadas = new JPanel();
		GridBagConstraints gbc_panel_olimpiadas = new GridBagConstraints();
		gbc_panel_olimpiadas.fill = GridBagConstraints.BOTH;
		gbc_panel_olimpiadas.gridx = 1;
		gbc_panel_olimpiadas.gridy = 0;
		contentPane.add(panel_olimpiadas, gbc_panel_olimpiadas);
		GridBagLayout gbl_panel_olimpiadas = new GridBagLayout();
		gbl_panel_olimpiadas.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_olimpiadas.rowHeights = new int[]{0, 41, 45, 49, 0};
		gbl_panel_olimpiadas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_olimpiadas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_olimpiadas.setLayout(gbl_panel_olimpiadas);
		
		btnDeportes = new JButton("Deportes");
		GridBagConstraints gbc_btnDeportes = new GridBagConstraints();
		gbc_btnDeportes.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeportes.gridx = 0;
		gbc_btnDeportes.gridy = 0;
		panel_olimpiadas.add(btnDeportes, gbc_btnDeportes);
		
		btnAtletas = new JButton("Atletas");
		GridBagConstraints gbc_btnAtletas = new GridBagConstraints();
		gbc_btnAtletas.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtletas.gridx = 2;
		gbc_btnAtletas.gridy = 0;
		panel_olimpiadas.add(btnAtletas, gbc_btnAtletas);
		
		btnEquipos = new JButton("Equipos");
		GridBagConstraints gbc_btnEquipos = new GridBagConstraints();
		gbc_btnEquipos.insets = new Insets(0, 0, 5, 0);
		gbc_btnEquipos.gridx = 4;
		gbc_btnEquipos.gridy = 0;
		panel_olimpiadas.add(btnEquipos, gbc_btnEquipos);
		
		JLabel lblOlimpiadas = new JLabel("OLIMPIADAS");
		GridBagConstraints gbc_lblOlimpiadas = new GridBagConstraints();
		gbc_lblOlimpiadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblOlimpiadas.gridx = 2;
		gbc_lblOlimpiadas.gridy = 1;
		panel_olimpiadas.add(lblOlimpiadas, gbc_lblOlimpiadas);
		
		comboBoxOlimpiadas = new JComboBox();
		GridBagConstraints gbc_comboBoxOlimpiadas = new GridBagConstraints();
		gbc_comboBoxOlimpiadas.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxOlimpiadas.gridwidth = 5;
		gbc_comboBoxOlimpiadas.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOlimpiadas.gridx = 0;
		gbc_comboBoxOlimpiadas.gridy = 2;
		panel_olimpiadas.add(comboBoxOlimpiadas, gbc_comboBoxOlimpiadas);
		
		btnAniadir = new JButton("Aniadir");
		GridBagConstraints gbc_btnAniadir = new GridBagConstraints();
		gbc_btnAniadir.insets = new Insets(0, 0, 0, 5);
		gbc_btnAniadir.gridx = 0;
		gbc_btnAniadir.gridy = 3;
		panel_olimpiadas.add(btnAniadir, gbc_btnAniadir);
		
		btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 0, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 3;
		panel_olimpiadas.add(btnModificar, gbc_btnModificar);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.gridx = 4;
		gbc_btnBorrar.gridy = 3;
		panel_olimpiadas.add(btnBorrar, gbc_btnBorrar);
		setResizable(false);
	}
	
	private void datosOlimpiadas() {
		DefaultComboBoxModel<Olimpiada> datosOlimp = new DefaultComboBoxModel<Olimpiada>();
		datosOlimp.addAll(olimpDAO.getOlimpiada());
		comboBoxOlimpiadas.setModel(datosOlimp);
		comboBoxOlimpiadas.setSelectedIndex(0);
	}
	
	private void eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				olimpDAO.cerrarConexion();
			}
		});
		
		comboBoxOlimpiadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				datosOlimpiadas();
			}
		});
		
		btnAniadir.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				OlimpiadaNuevaView nuevaOlimpiada = new OlimpiadaNuevaView();
				nuevaOlimpiada.setVisible(true);
				datosOlimpiadas();
			}
		});
		
		btnModificar.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				OlimpiadaNuevaView modificarOlimpiada = new OlimpiadaNuevaView((Olimpiada) comboBoxOlimpiadas.getSelectedItem());
				modificarOlimpiada.setVisible(true);
			}
		});
		
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				olimpDAO.borrarOlimpiada((Olimpiada)comboBoxOlimpiadas.getSelectedItem());
			}
		});
		
		btnDeportes.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				DeporteView nuevoDeporte = new DeporteView();
				nuevoDeporte.setVisible(true);
			}
		});
		
		btnEquipos.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
				EquipoView nuevoEquipo = new EquipoView();
				nuevoEquipo.setVisible(true);
			}
		});
		
	}
	

}
