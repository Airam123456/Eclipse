package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.OlimpiadaDAO;
import model.Olimpiada;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JLabel;

public class OlimpiadaNuevaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnio;
	private JTextField txtCiudad;
	private JRadioButton rdbtnSummer;
	private JRadioButton rdbtnWinter;
	private ButtonGroup bg;
	private JButton btnConfirmar;
	private JLabel lblAnio;
	private JLabel lblCiudad;
	private JButton btnCancelar;
	private Olimpiada olimpiada;
	private OlimpiadaDAO olimpDAO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlimpiadaNuevaView frame = new OlimpiadaNuevaView();
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
	public OlimpiadaNuevaView() {
		this.olimpiada = null;
		this.olimpDAO = new OlimpiadaDAO();
		dibujar();
		eventos();
	}
	
	public OlimpiadaNuevaView(Olimpiada olimpiada) {
		this.olimpiada = null;
		this.olimpDAO = new OlimpiadaDAO();
		dibujar();
		datos();
		eventos();
	}

	private void dibujar() {
		
		setTitle("Nueva Olimpiada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 89, 97, 0, 94, 31, 0};
		gbl_contentPane.rowHeights = new int[]{31, 37, 0, 32, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblAnio = new JLabel("Año");
		GridBagConstraints gbc_lblAo = new GridBagConstraints();
		gbc_lblAo.gridwidth = 2;
		gbc_lblAo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAo.gridx = 1;
		gbc_lblAo.gridy = 0;
		contentPane.add(lblAnio, gbc_lblAo);
		
		lblCiudad = new JLabel("Ciudad");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.gridwidth = 2;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 3;
		gbc_lblCiudad.gridy = 0;
		contentPane.add(lblCiudad, gbc_lblCiudad);
		
		txtAnio = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		contentPane.add(txtAnio, gbc_textField_2);
		txtAnio.setColumns(10);
		
		txtCiudad = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 1;
		contentPane.add(txtCiudad, gbc_textField_3);
		txtCiudad.setColumns(10);
		
		bg = new ButtonGroup();
		
		rdbtnSummer = new JRadioButton("Summer");
		GridBagConstraints gbc_rdbtnSummer = new GridBagConstraints();
		gbc_rdbtnSummer.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSummer.gridx = 1;
		gbc_rdbtnSummer.gridy = 2;
		contentPane.add(rdbtnSummer, gbc_rdbtnSummer);
		bg.add(rdbtnSummer);
		rdbtnSummer.setSelected(true);
		
		rdbtnWinter = new JRadioButton("Winter");
		GridBagConstraints gbc_rdbtnWinter = new GridBagConstraints();
		gbc_rdbtnWinter.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnWinter.gridx = 2;
		gbc_rdbtnWinter.gridy = 2;
		contentPane.add(rdbtnWinter, gbc_rdbtnWinter);
		bg.add(rdbtnWinter);
		
		btnConfirmar = new JButton("Confirmar");
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 3;
		gbc_btnConfirmar.gridy = 2;
		contentPane.add(btnConfirmar, gbc_btnConfirmar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 2;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				dispose();
			}
		});
	}
	
	private void eventos() {
		
	
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Olimpiada olimpia = new Olimpiada(0, "", Integer.parseInt(txtAnio.getText()), "", txtCiudad.getText());
				if(rdbtnSummer.isSelected()) {
					olimpia.setTemporada(rdbtnSummer.getText());
				}
				else {
					olimpiada.setTemporada(rdbtnWinter.getText());
				}
				olimpiada.setNombre(txtAnio.getText() + " " + olimpiada.getTemporada());
				cerrarVentana();
			}
			
		});
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				cerrarVentana();
				dispose();
			}
		});
		
		
	}
	private void datos() {
		txtAnio.setText(String.valueOf(olimpiada.getAnio()));
		txtCiudad.setText(String.valueOf(olimpiada.getCiudad()));
		if(olimpiada.getTemporada().equals("Summer")) {
			rdbtnWinter.setSelected(false);
			rdbtnSummer.setSelected(true);
		}
		else {
			rdbtnSummer.setSelected(false);
			rdbtnWinter.setSelected(true);
		}
	}
	
	
	private void cerrarVentana() {
		olimpDAO.cerrarConexion();
		setVisible(false);
	}

}
