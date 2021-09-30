package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class AeropuertosPrivadosView extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textPais;
	private JTextField textCiudad;
	private JTextField textCalle;
	private JTextField txtNumero;
	private JTextField textAnio;
	private JTextField textCapacidad;
	private JTextField textNumTra;
	private JTextField textFinanciacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AeropuertosPrivadosView frame = new AeropuertosPrivadosView();
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
	public AeropuertosPrivadosView() {
		setTitle("AVIONES - AEROPUERTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{31, 112, 252, 22, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 24, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTitulo = new JLabel("DATOS DEL AEROPUERTO");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.ipady = 5;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridwidth = 2;
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		contentPane.add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.ipadx = 5;
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 1;
		contentPane.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JLabel lblPais = new JLabel("País:");
		GridBagConstraints gbc_lblPais = new GridBagConstraints();
		gbc_lblPais.ipadx = 5;
		gbc_lblPais.anchor = GridBagConstraints.EAST;
		gbc_lblPais.insets = new Insets(0, 0, 5, 5);
		gbc_lblPais.gridx = 1;
		gbc_lblPais.gridy = 2;
		contentPane.add(lblPais, gbc_lblPais);
		
		textPais = new JTextField();
		GridBagConstraints gbc_textPais = new GridBagConstraints();
		gbc_textPais.insets = new Insets(0, 0, 5, 5);
		gbc_textPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPais.gridx = 2;
		gbc_textPais.gridy = 2;
		contentPane.add(textPais, gbc_textPais);
		textPais.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblCiudad.ipadx = 5;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 3;
		contentPane.add(lblCiudad, gbc_lblCiudad);
		
		textCiudad = new JTextField();
		GridBagConstraints gbc_textCiudad = new GridBagConstraints();
		gbc_textCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCiudad.gridx = 2;
		gbc_textCiudad.gridy = 3;
		contentPane.add(textCiudad, gbc_textCiudad);
		textCiudad.setColumns(10);
		
		JLabel lblCalle = new JLabel("Calle:");
		GridBagConstraints gbc_lblCalle = new GridBagConstraints();
		gbc_lblCalle.anchor = GridBagConstraints.EAST;
		gbc_lblCalle.ipadx = 5;
		gbc_lblCalle.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalle.gridx = 1;
		gbc_lblCalle.gridy = 4;
		contentPane.add(lblCalle, gbc_lblCalle);
		
		textCalle = new JTextField();
		textCalle.setText("");
		GridBagConstraints gbc_textCalle = new GridBagConstraints();
		gbc_textCalle.insets = new Insets(0, 0, 5, 5);
		gbc_textCalle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCalle.gridx = 2;
		gbc_textCalle.gridy = 4;
		contentPane.add(textCalle, gbc_textCalle);
		textCalle.setColumns(10);
		
		JLabel lblNmero = new JLabel("Número:");
		GridBagConstraints gbc_lblNmero = new GridBagConstraints();
		gbc_lblNmero.ipadx = 5;
		gbc_lblNmero.anchor = GridBagConstraints.EAST;
		gbc_lblNmero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmero.gridx = 1;
		gbc_lblNmero.gridy = 5;
		contentPane.add(lblNmero, gbc_lblNmero);
		
		txtNumero = new JTextField();
		GridBagConstraints gbc_txtNumero = new GridBagConstraints();
		gbc_txtNumero.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumero.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumero.gridx = 2;
		gbc_txtNumero.gridy = 5;
		contentPane.add(txtNumero, gbc_txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblAnio = new JLabel("Año de Inaguración:");
		GridBagConstraints gbc_lblAnio = new GridBagConstraints();
		gbc_lblAnio.anchor = GridBagConstraints.EAST;
		gbc_lblAnio.ipadx = 5;
		gbc_lblAnio.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnio.gridx = 1;
		gbc_lblAnio.gridy = 6;
		contentPane.add(lblAnio, gbc_lblAnio);
		
		textAnio = new JTextField();
		textAnio.setText("");
		GridBagConstraints gbc_textAnio = new GridBagConstraints();
		gbc_textAnio.insets = new Insets(0, 0, 5, 5);
		gbc_textAnio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAnio.gridx = 2;
		gbc_textAnio.gridy = 6;
		contentPane.add(textAnio, gbc_textAnio);
		textAnio.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		GridBagConstraints gbc_lblCapacidad = new GridBagConstraints();
		gbc_lblCapacidad.ipadx = 5;
		gbc_lblCapacidad.anchor = GridBagConstraints.EAST;
		gbc_lblCapacidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCapacidad.gridx = 1;
		gbc_lblCapacidad.gridy = 7;
		contentPane.add(lblCapacidad, gbc_lblCapacidad);
		
		textCapacidad = new JTextField();
		textCapacidad.setText("");
		GridBagConstraints gbc_textCapacidad = new GridBagConstraints();
		gbc_textCapacidad.insets = new Insets(0, 0, 5, 5);
		gbc_textCapacidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCapacidad.gridx = 2;
		gbc_textCapacidad.gridy = 7;
		contentPane.add(textCapacidad, gbc_textCapacidad);
		textCapacidad.setColumns(10);
		
		JPanel panelRadioButtons = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelRadioButtons.getLayout();
		flowLayout.setHgap(40);
		GridBagConstraints gbc_panelRadioButtons = new GridBagConstraints();
		gbc_panelRadioButtons.gridwidth = 2;
		gbc_panelRadioButtons.insets = new Insets(0, 0, 5, 5);
		gbc_panelRadioButtons.fill = GridBagConstraints.BOTH;
		gbc_panelRadioButtons.gridx = 1;
		gbc_panelRadioButtons.gridy = 8;
		contentPane.add(panelRadioButtons, gbc_panelRadioButtons);
		
		JRadioButton rdbtnPublico = new JRadioButton("Público");
		panelRadioButtons.add(rdbtnPublico);
		rdbtnPublico.setSelected(true);
		
		JRadioButton rdbtnPrivado = new JRadioButton("Privado");
		panelRadioButtons.add(rdbtnPrivado);
		
		JLabel lblNmeroDeTrabajadores = new JLabel("Número de Trabajadores:");
		GridBagConstraints gbc_lblNmeroDeTrabajadores = new GridBagConstraints();
		gbc_lblNmeroDeTrabajadores.ipadx = 5;
		gbc_lblNmeroDeTrabajadores.anchor = GridBagConstraints.EAST;
		gbc_lblNmeroDeTrabajadores.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDeTrabajadores.gridx = 1;
		gbc_lblNmeroDeTrabajadores.gridy = 9;
		contentPane.add(lblNmeroDeTrabajadores, gbc_lblNmeroDeTrabajadores);
		
		textNumTra = new JTextField();
		GridBagConstraints gbc_textNumTra = new GridBagConstraints();
		gbc_textNumTra.insets = new Insets(0, 0, 5, 5);
		gbc_textNumTra.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNumTra.gridx = 2;
		gbc_textNumTra.gridy = 9;
		contentPane.add(textNumTra, gbc_textNumTra);
		textNumTra.setColumns(10);
		
		JLabel lblFinanciacin = new JLabel("Financiación:");
		GridBagConstraints gbc_lblFinanciacin = new GridBagConstraints();
		gbc_lblFinanciacin.ipadx = 5;
		gbc_lblFinanciacin.anchor = GridBagConstraints.EAST;
		gbc_lblFinanciacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinanciacin.gridx = 1;
		gbc_lblFinanciacin.gridy = 10;
		contentPane.add(lblFinanciacin, gbc_lblFinanciacin);
		
		textFinanciacion = new JTextField();
		GridBagConstraints gbc_textFinanciacion = new GridBagConstraints();
		gbc_textFinanciacion.insets = new Insets(0, 0, 5, 5);
		gbc_textFinanciacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFinanciacion.gridx = 2;
		gbc_textFinanciacion.gridy = 10;
		contentPane.add(textFinanciacion, gbc_textFinanciacion);
		textFinanciacion.setColumns(10);
		
		JPanel panelButtons = new JPanel();
		FlowLayout fl_panelButtons = (FlowLayout) panelButtons.getLayout();
		fl_panelButtons.setHgap(20);
		GridBagConstraints gbc_panelButtons = new GridBagConstraints();
		gbc_panelButtons.gridwidth = 2;
		gbc_panelButtons.insets = new Insets(0, 0, 0, 5);
		gbc_panelButtons.fill = GridBagConstraints.BOTH;
		gbc_panelButtons.gridx = 1;
		gbc_panelButtons.gridy = 11;
		contentPane.add(panelButtons, gbc_panelButtons);
		
		JButton btnGuardar = new JButton("Guardar");
		panelButtons.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		panelButtons.add(btnCancelar);
	}

}
