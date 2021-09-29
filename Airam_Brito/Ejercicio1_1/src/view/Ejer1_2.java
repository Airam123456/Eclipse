package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ejer1_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1_2 frame = new Ejer1_2();
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
	public Ejer1_2() {
		setTitle("REGISTRO DE ANIMALES");
		eventos();
		setBounds(100, 100, 1209, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(51, 51, 51));
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 5));
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE ANIMALES");
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_izq = new JPanel();
		panel_izq.setBackground(new Color(220, 20, 60));
		contentPane.add(panel_izq, BorderLayout.WEST);
		GridBagLayout gbl_panel_izq = new GridBagLayout();
		gbl_panel_izq.columnWidths = new int[]{0, 0, 82, 132, 39, 0, 0};
		gbl_panel_izq.rowHeights = new int[]{0, 40, 30, 0, 0, 0, 0, 0, 0, 134, 0, 17, 0};
		gbl_panel_izq.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_izq.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_izq.setLayout(gbl_panel_izq);
		
		JLabel lblNDeRegistro = new JLabel("Código del animal:");
		GridBagConstraints gbc_lblNDeRegistro = new GridBagConstraints();
		gbc_lblNDeRegistro.gridwidth = 2;
		gbc_lblNDeRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblNDeRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblNDeRegistro.gridx = 1;
		gbc_lblNDeRegistro.gridy = 1;
		panel_izq.add(lblNDeRegistro, gbc_lblNDeRegistro);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		panel_izq.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 2;
		panel_izq.add(panel_1, gbc_panel_1);
		
		JLabel lblDatosDelAnimal = new JLabel("Datos del animal");
		panel_1.add(lblDatosDelAnimal);
		lblDatosDelAnimal.setLabelFor(this);
		lblDatosDelAnimal.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatosDelAnimal.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel label = new JLabel("");
		panel_1.add(label);
		
		JLabel lblNombreDelAnimal = new JLabel("Nombre del animal:");
		GridBagConstraints gbc_lblNombreDelAnimal = new GridBagConstraints();
		gbc_lblNombreDelAnimal.anchor = GridBagConstraints.EAST;
		gbc_lblNombreDelAnimal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDelAnimal.gridx = 1;
		gbc_lblNombreDelAnimal.gridy = 3;
		panel_izq.add(lblNombreDelAnimal, gbc_lblNombreDelAnimal);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel_izq.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEspecie = new JLabel("Especie:");
		GridBagConstraints gbc_lblEspecie = new GridBagConstraints();
		gbc_lblEspecie.anchor = GridBagConstraints.EAST;
		gbc_lblEspecie.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecie.gridx = 1;
		gbc_lblEspecie.gridy = 4;
		panel_izq.add(lblEspecie, gbc_lblEspecie);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 4;
		panel_izq.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRaza = new JLabel("Raza:");
		GridBagConstraints gbc_lblRaza = new GridBagConstraints();
		gbc_lblRaza.anchor = GridBagConstraints.EAST;
		gbc_lblRaza.insets = new Insets(0, 0, 5, 5);
		gbc_lblRaza.gridx = 1;
		gbc_lblRaza.gridy = 5;
		panel_izq.add(lblRaza, gbc_lblRaza);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		panel_izq.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 1;
		gbc_lblSexo.gridy = 6;
		panel_izq.add(lblSexo, gbc_lblSexo);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"Hembra", "Macho"}));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.anchor = GridBagConstraints.WEST;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 2;
		gbc_spinner.gridy = 6;
		panel_izq.add(spinner, gbc_spinner);
		
		JLabel lblEdadaprox = new JLabel("Edad (aprox.):");
		GridBagConstraints gbc_lblEdadaprox = new GridBagConstraints();
		gbc_lblEdadaprox.anchor = GridBagConstraints.EAST;
		gbc_lblEdadaprox.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdadaprox.gridx = 1;
		gbc_lblEdadaprox.gridy = 7;
		panel_izq.add(lblEdadaprox, gbc_lblEdadaprox);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 7;
		panel_izq.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso:");
		GridBagConstraints gbc_lblPeso = new GridBagConstraints();
		gbc_lblPeso.anchor = GridBagConstraints.EAST;
		gbc_lblPeso.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeso.gridx = 1;
		gbc_lblPeso.gridy = 8;
		panel_izq.add(lblPeso, gbc_lblPeso);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 8;
		panel_izq.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		GridBagConstraints gbc_lblObservaciones = new GridBagConstraints();
		gbc_lblObservaciones.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblObservaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblObservaciones.gridx = 1;
		gbc_lblObservaciones.gridy = 9;
		panel_izq.add(lblObservaciones, gbc_lblObservaciones);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setRows(10);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 9;
		panel_izq.add(textArea, gbc_textArea);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de ingreso:");
		GridBagConstraints gbc_lblFechaDeIngreso = new GridBagConstraints();
		gbc_lblFechaDeIngreso.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeIngreso.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeIngreso.gridx = 1;
		gbc_lblFechaDeIngreso.gridy = 10;
		panel_izq.add(lblFechaDeIngreso, gbc_lblFechaDeIngreso);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 2;
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 10;
		panel_izq.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_calendar_today_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 10;
		panel_izq.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_der = new JPanel();
		panel_der.setBackground(new Color(250, 250, 210));
		contentPane.add(panel_der, BorderLayout.CENTER);
		GridBagLayout gbl_panel_der = new GridBagLayout();
		gbl_panel_der.columnWidths = new int[]{0, 208, 265, 160, 0};
		gbl_panel_der.rowHeights = new int[]{54, 99, 39, 0, 0, 0, 0};
		gbl_panel_der.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_der.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_der.setLayout(gbl_panel_der);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.gridheight = 2;
		gbc_textArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridx = 2;
		gbc_textArea_1.gridy = 0;
		panel_der.add(textArea_1, gbc_textArea_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(50, 205, 50));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		panel_der.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{129, 0};
		gbl_panel_3.rowHeights = new int[]{39, 31, 33, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnNewButton_2 = new JButton("Nuevo");
		btnNewButton_2.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_pets_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 0;
		panel_3.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_save_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_3.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_close_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 2;
		panel_3.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(50, 205, 50));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.anchor = GridBagConstraints.SOUTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 3;
		gbc_panel_4.gridy = 1;
		panel_der.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {177};
		gbl_panel_4.rowHeights = new int[] {40, 34, 0};
		gbl_panel_4.columnWeights = new double[]{0.0};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JButton btnNewButton_4 = new JButton("Seleccionar Imagen");
		btnNewButton_4.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_image_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 0;
		panel_4.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Guardar");
		btnNewButton_5.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_save_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 1;
		panel_4.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 3;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 2;
		panel_der.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 180, 138, 0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{38, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.BELOW_BASELINE_TRAILING;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_5.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 0, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 0;
		panel_5.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Buscar");
		btnNewButton_8.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_search_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_8.gridx = 2;
		gbc_btnNewButton_8.gridy = 0;
		panel_5.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("Eliminar");
		btnNewButton_6.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_delete_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_6.gridx = 3;
		gbc_btnNewButton_6.gridy = 0;
		panel_5.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Salir");
		btnNewButton_7.setIcon(new ImageIcon(Ejer1_2.class.getResource("/images/outline_logout_black_18dp.png")));
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.gridx = 4;
		gbc_btnNewButton_7.gridy = 0;
		panel_5.add(btnNewButton_7, gbc_btnNewButton_7);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOMBRE", "ESPECIE", "RAZA", "SEXO", "EDAD", "PESO", "OBSERVACIONES", "FECHA"},
				{"Sua", "Perro", null, "Macho", "8", "50", "Operacion", "30/07/2020"},
			},
			new String[] {
				"NOMBRE", "ESPECIE", "RAZA", "SEXO", "EDAD", "PESO", "OBSERVACIONES", "FECHA"
			}
		));
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 3;
		gbc_table.gridwidth = 3;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 3;
		panel_der.add(table, gbc_table);
	}

	private void eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
