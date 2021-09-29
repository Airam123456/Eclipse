package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Principal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		getContentPane().setBackground(new Color(0, 0, 0));
		setTitle("MINI COOPER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 669);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -4, SpringLayout.EAST, getContentPane());
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/coches/miniBlazingRed.png")));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 26, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 135, SpringLayout.WEST, getContentPane());
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/images/cooperLogo.png")));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONFIGURA TU MINI COOPER");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -96, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 45, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -42, SpringLayout.EAST, getContentPane());
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 405, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -528, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 47, SpringLayout.WEST, getContentPane());
		lblNewLabel_3.setIcon(new ImageIcon(Principal.class.getResource("/images/lucesOn.png")));
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblSeleccionaTuColor = new JLabel("SELECCIONA TU COLOR FAVORITO");
		springLayout.putConstraint(SpringLayout.NORTH, lblSeleccionaTuColor, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblSeleccionaTuColor, 248, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblSeleccionaTuColor, -89, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblSeleccionaTuColor, -174, SpringLayout.EAST, getContentPane());
		lblSeleccionaTuColor.setForeground(new Color(255, 255, 255));
		getContentPane().add(lblSeleccionaTuColor);
		
		JLabel lblNewLabel_4 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -35, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_4, -561, SpringLayout.EAST, getContentPane());
		lblNewLabel_4.setIcon(new ImageIcon(Principal.class.getResource("/colores/colorBlazingRed.jpg")));
		getContentPane().add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, lblNewLabel_4);
		label.setIcon(new ImageIcon(Principal.class.getResource("/colores/colorElectricBlue.jpg")));
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, label_1, 199, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, label, -29, SpringLayout.WEST, label_1);
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, lblNewLabel_4);
		label_1.setIcon(new ImageIcon(Principal.class.getResource("/colores/colorLapisluxuryBlue.jpg")));
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Principal.class.getResource("/colores/colorMidnightBlack.jpg")));
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 6, SpringLayout.SOUTH, lblSeleccionaTuColor);
		springLayout.putConstraint(SpringLayout.WEST, label_2, 39, SpringLayout.EAST, label_1);
		getContentPane().add(label_2);
	}
}
