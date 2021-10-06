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
	private JTable tableEvento;
	private JTable table;

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
		gbl_contentPane.columnWidths = new int[]{103, 78, 94, 43, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{32, 0, 0, 37, 170, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblOlimpiadas = new JLabel("Olimpiadas");
		GridBagConstraints gbc_lblOlimpiadas = new GridBagConstraints();
		gbc_lblOlimpiadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblOlimpiadas.gridx = 1;
		gbc_lblOlimpiadas.gridy = 0;
		contentPane.add(lblOlimpiadas, gbc_lblOlimpiadas);
		
		JComboBox cBoxOlimpiadas = new JComboBox();
		GridBagConstraints gbc_cBoxOlimpiadas = new GridBagConstraints();
		gbc_cBoxOlimpiadas.gridwidth = 3;
		gbc_cBoxOlimpiadas.insets = new Insets(0, 8, 5, 8);
		gbc_cBoxOlimpiadas.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxOlimpiadas.gridx = 0;
		gbc_cBoxOlimpiadas.gridy = 1;
		contentPane.add(cBoxOlimpiadas, gbc_cBoxOlimpiadas);
		
		JButton btnAniadirOlimpiada = new JButton("Añadir");
		GridBagConstraints gbc_btnAniadirOlimpiada = new GridBagConstraints();
		gbc_btnAniadirOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_btnAniadirOlimpiada.gridx = 0;
		gbc_btnAniadirOlimpiada.gridy = 2;
		contentPane.add(btnAniadirOlimpiada, gbc_btnAniadirOlimpiada);
		
		JButton btnModificarOlimpiada = new JButton("Modificar");
		GridBagConstraints gbc_btnModificarOlimpiada = new GridBagConstraints();
		gbc_btnModificarOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarOlimpiada.gridx = 1;
		gbc_btnModificarOlimpiada.gridy = 2;
		contentPane.add(btnModificarOlimpiada, gbc_btnModificarOlimpiada);
		
		JButton btnBorrarOlimpiada = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrarOlimpiada = new GridBagConstraints();
		gbc_btnBorrarOlimpiada.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarOlimpiada.gridx = 2;
		gbc_btnBorrarOlimpiada.gridy = 2;
		contentPane.add(btnBorrarOlimpiada, gbc_btnBorrarOlimpiada);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 5;
		gbc_btnNewButton_1.gridy = 2;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 15);
		gbc_btnNewButton_2.gridx = 6;
		gbc_btnNewButton_2.gridy = 2;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JLabel lblEvento = new JLabel("Evento");
		GridBagConstraints gbc_lblEvento = new GridBagConstraints();
		gbc_lblEvento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEvento.gridx = 1;
		gbc_lblEvento.gridy = 3;
		contentPane.add(lblEvento, gbc_lblEvento);
		
		JLabel lblParticipacin = new JLabel("Participación");
		GridBagConstraints gbc_lblParticipacin = new GridBagConstraints();
		gbc_lblParticipacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticipacin.gridx = 5;
		gbc_lblParticipacin.gridy = 3;
		contentPane.add(lblParticipacin, gbc_lblParticipacin);
		
		tableEvento = new JTable();
		GridBagConstraints gbc_tableEvento = new GridBagConstraints();
		gbc_tableEvento.gridwidth = 3;
		gbc_tableEvento.insets = new Insets(0, 15, 5, 5);
		gbc_tableEvento.fill = GridBagConstraints.BOTH;
		gbc_tableEvento.gridx = 0;
		gbc_tableEvento.gridy = 4;
		contentPane.add(tableEvento, gbc_tableEvento);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 3;
		gbc_table.insets = new Insets(0, 0, 5, 15);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 4;
		gbc_table.gridy = 4;
		contentPane.add(table, gbc_table);
	}

}
