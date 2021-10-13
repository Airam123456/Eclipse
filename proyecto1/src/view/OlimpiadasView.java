package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JLabel;

public class OlimpiadasView extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtAnio;
	private JTextField txtCiudad;
	private JRadioButton rdbtnSummer;
	private JRadioButton rdbtnWinter;
	private ButtonGroup bg;
	private JButton btnConfirmar;
	private JTable tableConfirmacion;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblAnio;
	private JLabel lblCiudad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlimpiadasView frame = new OlimpiadasView();
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
	public OlimpiadasView() {
		setTitle("OLIMPIADAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 89, 97, 0, 94, 31, 0};
		gbl_contentPane.rowHeights = new int[]{31, 37, 0, 32, 0, 35, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		dibujar();
	}

	private void dibujar() {
		lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 0;
		contentPane.add(lblId, gbc_lblId);
		
		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 0;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		lblAnio = new JLabel("Año");
		GridBagConstraints gbc_lblAo = new GridBagConstraints();
		gbc_lblAo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAo.gridx = 3;
		gbc_lblAo.gridy = 0;
		contentPane.add(lblAnio, gbc_lblAo);
		
		lblCiudad = new JLabel("Ciudad");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 4;
		gbc_lblCiudad.gridy = 0;
		contentPane.add(lblCiudad, gbc_lblCiudad);
		
		txtID = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(txtID, gbc_textField);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		contentPane.add(txtNombre, gbc_textField_1);
		txtNombre.setColumns(10);
		
		txtAnio = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 1;
		contentPane.add(txtAnio, gbc_textField_2);
		txtAnio.setColumns(10);
		
		txtCiudad = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 4;
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
		gbc_btnConfirmar.gridx = 4;
		gbc_btnConfirmar.gridy = 2;
		contentPane.add(btnConfirmar, gbc_btnConfirmar);
		
		tableConfirmacion = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 4;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 4;
		contentPane.add(tableConfirmacion, gbc_table);
	}
	

}
