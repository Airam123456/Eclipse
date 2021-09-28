package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class Ejer1_1 extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1_1 frame = new Ejer1_1();
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
	public Ejer1_1() {
		setTitle("ENCUESTA");
		gestionar_eventos();
		setBounds(100, 100, 521, 534);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {40, 112, 104, 122, 154, 30, 0};
		gridBagLayout.rowHeights = new int[]{46, 47, 47, 77, 0, 58, 0, 0, 93, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		dibujar();
	}

	private void gestionar_eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void dibujar() {
		JLabel lblProfesin = new JLabel("Profesión:");
		lblProfesin.setToolTipText("Estudiante, desempleado y jubilado tambien cuentan");
		GridBagConstraints gbc_lblProfesin = new GridBagConstraints();
		gbc_lblProfesin.anchor = GridBagConstraints.EAST;
		gbc_lblProfesin.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfesin.gridx = 1;
		gbc_lblProfesin.gridy = 0;
		getContentPane().add(lblProfesin, gbc_lblProfesin);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNhermanos = new JLabel("NºHermanos:");
		GridBagConstraints gbc_lblNhermanos = new GridBagConstraints();
		gbc_lblNhermanos.insets = new Insets(0, 0, 5, 5);
		gbc_lblNhermanos.gridx = 1;
		gbc_lblNhermanos.gridy = 1;
		getContentPane().add(lblNhermanos, gbc_lblNhermanos);
		
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 2;
		gbc_spinner.gridy = 1;
		getContentPane().add(spinner, gbc_spinner);
		
		JLabel lblEdad = new JLabel("Edad:");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.EAST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 3;
		gbc_lblEdad.gridy = 1;
		getContentPane().add(lblEdad, gbc_lblEdad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"• Menores de 18", "• Entre 18 y 30", "• Entre 31 y 50", "• Entre 51 y 70", "• Mayores de 70"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 1;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		getContentPane().add(panel, gbc_panel);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		bg.add(rdbtnHombre);
		panel.add(rdbtnHombre);
		rdbtnHombre.setSelected(true);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		bg.add(rdbtnMujer);
		panel.add(rdbtnMujer);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("¿Práctica algún deporte?");
		chckbxNewCheckBox.setToolTipText("Para saber si practicas deportes");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.gridwidth = 2;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 3;
		getContentPane().add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u00BFCu\u00E1l?", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 3;
		getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"• Tenis", "• Fútbol", "• Baloncesto", "• Natación", "• Ciclismo", "• Otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setVisibleRowCount(2);
		list.setToolTipText("");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblMarqueDel = new JLabel("Marque del 1 al 10 su grado de afición a:");
		GridBagConstraints gbc_lblMarqueDel = new GridBagConstraints();
		gbc_lblMarqueDel.gridwidth = 4;
		gbc_lblMarqueDel.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarqueDel.gridx = 1;
		gbc_lblMarqueDel.gridy = 4;
		getContentPane().add(lblMarqueDel, gbc_lblMarqueDel);
		
		JLabel lblCompras = new JLabel("Compras: ");
		lblCompras.setToolTipText("Tambien cuentan las compras online");
		GridBagConstraints gbc_lblCompras = new GridBagConstraints();
		gbc_lblCompras.insets = new Insets(0, 0, 5, 5);
		gbc_lblCompras.gridx = 1;
		gbc_lblCompras.gridy = 5;
		getContentPane().add(lblCompras, gbc_lblCompras);
		
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setMinimum(1);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(1);
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider.gridwidth = 3;
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridx = 2;
		gbc_slider.gridy = 5;
		getContentPane().add(slider, gbc_slider);
		
		JLabel lblVerLaTv = new JLabel("Ver la TV: ");
		lblVerLaTv.setToolTipText("Aqui incluimos tambien el tiempo en YT y Netflix\n");
		GridBagConstraints gbc_lblVerLaTv = new GridBagConstraints();
		gbc_lblVerLaTv.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerLaTv.gridx = 1;
		gbc_lblVerLaTv.gridy = 6;
		getContentPane().add(lblVerLaTv, gbc_lblVerLaTv);
		
		JSlider slider_1 = new JSlider();
		slider_1.setValue(5);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMinorTickSpacing(1);
		slider_1.setMinimum(1);
		slider_1.setMaximum(10);
		slider_1.setMajorTickSpacing(1);
		GridBagConstraints gbc_slider_1 = new GridBagConstraints();
		gbc_slider_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider_1.gridwidth = 3;
		gbc_slider_1.insets = new Insets(0, 0, 5, 5);
		gbc_slider_1.gridx = 2;
		gbc_slider_1.gridy = 6;
		getContentPane().add(slider_1, gbc_slider_1);
		
		JLabel lblIrAlCine = new JLabel("Ir al cine:");
		lblIrAlCine.setToolTipText("Incluido Streaming\n");
		GridBagConstraints gbc_lblIrAlCine = new GridBagConstraints();
		gbc_lblIrAlCine.insets = new Insets(0, 0, 5, 5);
		gbc_lblIrAlCine.gridx = 1;
		gbc_lblIrAlCine.gridy = 7;
		getContentPane().add(lblIrAlCine, gbc_lblIrAlCine);
		
		JSlider slider_2 = new JSlider();
		slider_2.setValue(5);
		slider_2.setPaintTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setMinorTickSpacing(1);
		slider_2.setMinimum(1);
		slider_2.setMaximum(10);
		slider_2.setMajorTickSpacing(1);
		GridBagConstraints gbc_slider_2 = new GridBagConstraints();
		gbc_slider_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_slider_2.gridwidth = 3;
		gbc_slider_2.insets = new Insets(0, 0, 5, 5);
		gbc_slider_2.gridx = 2;
		gbc_slider_2.gridy = 7;
		getContentPane().add(slider_2, gbc_slider_2);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setHgap(55);
		flowLayout.setVgap(50);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 6;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 8;
		getContentPane().add(panel_2, gbc_panel_2);
		
		JButton btnNewButton = new JButton("Aceptar\n");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		panel_2.add(btnNewButton_1);
	}

}
