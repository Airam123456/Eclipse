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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;

public class EventoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventoView frame = new EventoView();
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
	public EventoView() {
		setTitle("EVENTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{37, 0, 0, 0, 0, 33, 0};
		gbl_contentPane.rowHeights = new int[]{32, 46, 16, 0, 135, 0, 33, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 0;
		contentPane.add(lblId, gbc_lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 0;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		JLabel lblOlimpiada = new JLabel("Olimpiada");
		GridBagConstraints gbc_lblOlimpiada = new GridBagConstraints();
		gbc_lblOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_lblOlimpiada.gridx = 3;
		gbc_lblOlimpiada.gridy = 0;
		contentPane.add(lblOlimpiada, gbc_lblOlimpiada);
		
		JLabel lblDeporte = new JLabel("Deporte");
		GridBagConstraints gbc_lblDeporte = new GridBagConstraints();
		gbc_lblDeporte.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeporte.gridx = 4;
		gbc_lblDeporte.gridy = 0;
		contentPane.add(lblDeporte, gbc_lblDeporte);
		
		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.insets = new Insets(0, 0, 5, 5);
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 1;
		gbc_txtID.gridy = 1;
		contentPane.add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox cbOlimpiada = new JComboBox();
		GridBagConstraints gbc_cbOlimpiada = new GridBagConstraints();
		gbc_cbOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_cbOlimpiada.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbOlimpiada.gridx = 3;
		gbc_cbOlimpiada.gridy = 1;
		contentPane.add(cbOlimpiada, gbc_cbOlimpiada);
		
		JComboBox cbDeporte = new JComboBox();
		GridBagConstraints gbc_cbDeporte = new GridBagConstraints();
		gbc_cbDeporte.insets = new Insets(0, 0, 5, 5);
		gbc_cbDeporte.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbDeporte.gridx = 4;
		gbc_cbDeporte.gridy = 1;
		contentPane.add(cbDeporte, gbc_cbDeporte);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 3;
		gbc_table.gridheight = 3;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 3;
		contentPane.add(table, gbc_table);
		
		JButton btnConfirmar = new JButton("Confirmar");
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 4;
		gbc_btnConfirmar.gridy = 4;
		contentPane.add(btnConfirmar, gbc_btnConfirmar);
	}

}
