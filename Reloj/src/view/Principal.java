package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;;

public class Principal extends TimerTask{

	private JPanel contentPane;
	private JLabel lblHora1, lblHora2, lblMinuto1, lblMinuto2, lblSegundos1, lblSegundos2;
	private JFrame frame;
	private static String [] strNumeros= {"/imagenes/ZERO.png","/imagenes/ONE.png", 
			"/imagenes/TWO.png","/imagenes/THREE.png", "/imagenes/FOUR.png",
			"/imagenes/FIVE.png","/imagenes/SIX.png","/imagenes/SEVEN.png","/imagenes/EIGHT.png","/imagenes/NINE.png" };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Timer timer= new Timer();
		timer.schedule(new Principal(),0, 1000);

	}

	/**
	 * Create the frame.
	 */

	public Principal() 
	{
		dibujar();
		frame.setVisible(true);
		eventos();
	}

	private void dibujar() 
	{
		frame= new JFrame();
		frame.setResizable(false);
		
		frame.setTitle("RELOJ");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/reloj.png")));
		
		frame.setBounds(100, 100, 492, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblHora1 = new JLabel("");
		lblHora1.setBounds(39, 200, 55, 90);
		lblHora1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ZERO.png")));
		contentPane.add(lblHora1);
		
		lblHora2 = new JLabel("");
		lblHora2.setBounds(101, 200, 55, 90);
		lblHora2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ZERO.png")));
		contentPane.add(lblHora2);
		
		JLabel lblPuntos1 = new JLabel(":");
		lblPuntos1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntos1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPuntos1.setFont(new Font("Dialog", Font.BOLD, 65));
		lblPuntos1.setForeground(new Color(255, 69, 0));
		lblPuntos1.setBounds(160, 220, 30, 60);
		contentPane.add(lblPuntos1);
		
		lblMinuto1 = new JLabel("");
		lblMinuto1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ZERO.png")));
		lblMinuto1.setBounds(191, 200, 55, 90);
		contentPane.add(lblMinuto1);
		
		lblMinuto2 = new JLabel("");
		lblMinuto2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ZERO.png")));
		lblMinuto2.setBounds(250, 200, 55, 90);
		contentPane.add(lblMinuto2);
		
		JLabel lblPuntos2 = new JLabel(":");
		lblPuntos2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPuntos2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntos2.setForeground(new Color(255, 69, 0));
		lblPuntos2.setFont(new Font("Dialog", Font.BOLD, 65));
		lblPuntos2.setBounds(308, 220, 30, 60);
		contentPane.add(lblPuntos2);
		
		lblSegundos1 = new JLabel("");
		lblSegundos1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ZERO.png")));
		lblSegundos1.setBounds(338, 200, 55, 90);
		contentPane.add(lblSegundos1);
		
		lblSegundos2 = new JLabel("");
		lblSegundos2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ZERO.png")));
		lblSegundos2.setBounds(400, 200, 55, 90);
		contentPane.add(lblSegundos2);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(5, 5, 487, 412);
		lblFondo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/fondoReloj.png")));
		contentPane.add(lblFondo);
	}

	private void eventos() 
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		
		int hora= LocalDateTime.now().getHour();
		
		lblHora1.setIcon(new ImageIcon(Principal.class.getResource(strNumeros[hora/10])));
		lblHora2.setIcon(new ImageIcon(Principal.class.getResource(strNumeros[hora%10])));
		
		int minutos= LocalDateTime.now().getMinute();
		
		lblMinuto1.setIcon(new ImageIcon(Principal.class.getResource(strNumeros[minutos/10])));
		lblMinuto2.setIcon(new ImageIcon(Principal.class.getResource(strNumeros[minutos%10])));
		
		int segundos=LocalDateTime.now().getSecond();
		
		lblSegundos1.setIcon(new ImageIcon(Principal.class.getResource(strNumeros[segundos/10])));
		lblSegundos2.setIcon(new ImageIcon(Principal.class.getResource(strNumeros[segundos%10])));
		
	}

}
