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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;

public class PrincipalView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

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
		setTitle("PRINCIPAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{22, 141, 106, 94, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{48, 47, 0, 37, 170, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		setResizable(false);
		
		JButton btnOlimpiadas = new JButton("Olimpiadas");
		GridBagConstraints gbc_btnOlimpiadas = new GridBagConstraints();
		gbc_btnOlimpiadas.insets = new Insets(0, 0, 5, 5);
		gbc_btnOlimpiadas.gridx = 1;
		gbc_btnOlimpiadas.gridy = 0;
		contentPane.add(btnOlimpiadas, gbc_btnOlimpiadas);
		
		JButton btnAtletas = new JButton("Atletas");
		GridBagConstraints gbc_btnAtletas = new GridBagConstraints();
		gbc_btnAtletas.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtletas.gridx = 2;
		gbc_btnAtletas.gridy = 0;
		contentPane.add(btnAtletas, gbc_btnAtletas);
		
		JButton btnNewButton = new JButton("Deporte");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Participacion");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 4;
		gbc_btnNewButton_2.gridy = 0;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Evento");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 5;
		gbc_btnNewButton_1.gridy = 0;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JComboBox cBoxOlimpiadas = new JComboBox();
		GridBagConstraints gbc_cBoxOlimpiadas = new GridBagConstraints();
		gbc_cBoxOlimpiadas.gridwidth = 5;
		gbc_cBoxOlimpiadas.insets = new Insets(0, 8, 5, 8);
		gbc_cBoxOlimpiadas.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxOlimpiadas.gridx = 1;
		gbc_cBoxOlimpiadas.gridy = 1;
		contentPane.add(cBoxOlimpiadas, gbc_cBoxOlimpiadas);
		
		JButton btnAniadirOlimpiada = new JButton("Añadir");
		GridBagConstraints gbc_btnAniadirOlimpiada = new GridBagConstraints();
		gbc_btnAniadirOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadirOlimpiada.gridx = 1;
		gbc_btnAniadirOlimpiada.gridy = 2;
		contentPane.add(btnAniadirOlimpiada, gbc_btnAniadirOlimpiada);
		
		JButton btnModificarOlimpiada = new JButton("Modificar");
		GridBagConstraints gbc_btnModificarOlimpiada = new GridBagConstraints();
		gbc_btnModificarOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarOlimpiada.gridx = 3;
		gbc_btnModificarOlimpiada.gridy = 2;
		contentPane.add(btnModificarOlimpiada, gbc_btnModificarOlimpiada);
		
		JButton btnBorrarOlimpiada = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrarOlimpiada = new GridBagConstraints();
		gbc_btnBorrarOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarOlimpiada.gridx = 5;
		gbc_btnBorrarOlimpiada.gridy = 2;
		contentPane.add(btnBorrarOlimpiada, gbc_btnBorrarOlimpiada);
		
		JLabel lblEvento = new JLabel("Evento");
		GridBagConstraints gbc_lblEvento = new GridBagConstraints();
		gbc_lblEvento.gridwidth = 2;
		gbc_lblEvento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEvento.gridx = 1;
		gbc_lblEvento.gridy = 3;
		contentPane.add(lblEvento, gbc_lblEvento);
		
		JLabel lblParticipacin = new JLabel("Participación");
		GridBagConstraints gbc_lblParticipacin = new GridBagConstraints();
		gbc_lblParticipacin.gridwidth = 2;
		gbc_lblParticipacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticipacin.gridx = 4;
		gbc_lblParticipacin.gridy = 3;
		contentPane.add(lblParticipacin, gbc_lblParticipacin);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 2;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 4;
		contentPane.add(table, gbc_table);
		
		table_1 = new JTable();
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.gridwidth = 2;
		gbc_table_1.insets = new Insets(0, 0, 5, 5);
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 4;
		gbc_table_1.gridy = 4;
		contentPane.add(table_1, gbc_table_1);
	}

}
