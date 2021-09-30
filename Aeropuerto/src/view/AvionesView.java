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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class AvionesView extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textAsientos;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvionesView frame = new AvionesView();
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
	public AvionesView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 154, 238, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTitulo = new JLabel("DATOS DEL AVIÓN");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 2;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
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
		
		JLabel lblAsientos = new JLabel("Asientos:");
		GridBagConstraints gbc_lblAsientos = new GridBagConstraints();
		gbc_lblAsientos.ipadx = 5;
		gbc_lblAsientos.anchor = GridBagConstraints.EAST;
		gbc_lblAsientos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsientos.gridx = 1;
		gbc_lblAsientos.gridy = 2;
		contentPane.add(lblAsientos, gbc_lblAsientos);
		
		textAsientos = new JTextField();
		textAsientos.setText("");
		GridBagConstraints gbc_textAsientos = new GridBagConstraints();
		gbc_textAsientos.insets = new Insets(0, 0, 5, 5);
		gbc_textAsientos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAsientos.gridx = 2;
		gbc_textAsientos.gridy = 2;
		contentPane.add(textAsientos, gbc_textAsientos);
		textAsientos.setColumns(10);
		
		JLabel lblVelMax = new JLabel("Velocidad Máxima:");
		GridBagConstraints gbc_lblVelMax = new GridBagConstraints();
		gbc_lblVelMax.anchor = GridBagConstraints.EAST;
		gbc_lblVelMax.ipadx = 5;
		gbc_lblVelMax.insets = new Insets(0, 0, 5, 5);
		gbc_lblVelMax.gridx = 1;
		gbc_lblVelMax.gridy = 3;
		contentPane.add(lblVelMax, gbc_lblVelMax);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton_1);
	}

}
