package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("AVIONES - LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{135, 307, 0, 0};
		gbl_contentPane.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 59, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblEncabezado = new JLabel("INTRODUCE TUS CRREDENCIALES");
		GridBagConstraints gbc_lblEncabezado = new GridBagConstraints();
		gbc_lblEncabezado.gridwidth = 2;
		gbc_lblEncabezado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncabezado.gridx = 0;
		gbc_lblEncabezado.gridy = 2;
		contentPane.add(lblEncabezado, gbc_lblEncabezado);
		
		JLabel lblUser = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.EAST;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 0;
		gbc_lblUser.gridy = 4;
		contentPane.add(lblUser, gbc_lblUser);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Password:");
		GridBagConstraints gbc_lblPass = new GridBagConstraints();
		gbc_lblPass.anchor = GridBagConstraints.EAST;
		gbc_lblPass.insets = new Insets(0, 0, 5, 5);
		gbc_lblPass.gridx = 0;
		gbc_lblPass.gridy = 6;
		contentPane.add(lblPass, gbc_lblPass);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 6;
		contentPane.add(passwordField, gbc_passwordField);
		
		JSplitPane splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.gridwidth = 2;
		gbc_splitPane.insets = new Insets(0, 0, 5, 5);
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 7;
		contentPane.add(splitPane, gbc_splitPane);
		
		JButton btnSalir = new JButton("Salir");
		splitPane.setLeftComponent(btnSalir);
		
		JButton btnLogin = new JButton("Login");
		splitPane.setRightComponent(btnLogin);
	}

}
