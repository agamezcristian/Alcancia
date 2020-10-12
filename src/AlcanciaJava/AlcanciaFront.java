package AlcanciaJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlcanciaFront extends JFrame {

	private Alcancia alcancia;
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlcanciaFront frame = new AlcanciaFront();
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
	public AlcanciaFront() {
		setResizable(false);
		alcancia = new Alcancia( );
		
		setBackground(Color.LIGHT_GRAY);
		setTitle("Alcanc\u00EDa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 553);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Moneda");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(30, 30, 80, 20);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 50, 360, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/100a.jpg")));
		lblNewLabel_1.setBounds(30, 119, 56, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/50a.png")));
		lblNewLabel_2.setBounds(30, 50, 56, 66);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/200a.png")));
		lblNewLabel_3.setBounds(30, 188, 57, 57);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/500a.png")));
		lblNewLabel_4.setBounds(30, 250, 57, 57);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/1000a.png")));
		lblNewLabel_5.setBounds(29, 315, 57, 57);
		contentPane.add(lblNewLabel_5);
		
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidad.setBounds(211, 30, 80, 20);
		contentPane.add(lblCantidad);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(326, 30, 80, 20);
		contentPane.add(lblTotal);
		
		JLabel cantidad50 = new JLabel("0");
		cantidad50.setBounds(211, 70, 46, 14);
		contentPane.add(cantidad50);
		
		JLabel cantidad100 = new JLabel("0");
		cantidad100.setBounds(211, 135, 46, 14);
		contentPane.add(cantidad100);
		
		JLabel cantidad200 = new JLabel("0");
		cantidad200.setBounds(211, 200, 46, 14);
		contentPane.add(cantidad200);
		
		JLabel cantidad500 = new JLabel("0");
		cantidad500.setBounds(211, 265, 46, 14);
		contentPane.add(cantidad500);
		
		JLabel cantidad1000 = new JLabel("0");
		cantidad1000.setBounds(211, 330, 46, 14);
		contentPane.add(cantidad1000);
		
		JLabel total50 = new JLabel("0 Pesos");
		total50.setFont(new Font("Tahoma", Font.BOLD, 11));
		total50.setBounds(326, 70, 100, 14);
		contentPane.add(total50);
		
		JLabel total100 = new JLabel("0 Pesos");
		total100.setFont(new Font("Tahoma", Font.BOLD, 11));
		total100.setBounds(326, 135, 100, 14);
		contentPane.add(total100);
		
		JLabel total200 = new JLabel("0 Pesos");
		total200.setFont(new Font("Tahoma", Font.BOLD, 11));
		total200.setBounds(326, 200, 100, 14);
		contentPane.add(total200);
		
		JLabel total500 = new JLabel("0 Pesos");
		total500.setFont(new Font("Tahoma", Font.BOLD, 11));
		total500.setBounds(326, 265, 100, 14);
		contentPane.add(total500);
		
		JLabel total1000 = new JLabel("0 Pesos");
		total1000.setFont(new Font("Tahoma", Font.BOLD, 11));
		total1000.setBounds(326, 330, 100, 14);
		contentPane.add(total1000);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 115, 360, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(30, 180, 360, 2);
		contentPane.add(separator_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(30, 245, 360, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(30, 310, 360, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(30, 375, 360, 2);
		contentPane.add(separator_3_1);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal_1.setBounds(30, 380, 80, 20);
		contentPane.add(lblTotal_1);
		
		JLabel totalCantidad = new JLabel("0");
		totalCantidad.setBounds(211, 380, 46, 14);
		contentPane.add(totalCantidad);
		
		JLabel granTotal = new JLabel("0 Pesos");
		granTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		granTotal.setBounds(326, 380, 100, 14);
		contentPane.add(granTotal);
		
		JButton Ahorrar50 = new JButton("Ahorrar");
		Ahorrar50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alcancia.agregarMoneda50();
				cantidad50.setText(String.valueOf(alcancia.numeroMonedas50()));
				total50.setText(String.valueOf(Integer.parseInt(cantidad50.getText())*50)+" Pesos");
				totalCantidad.setText(String.valueOf(alcancia.calcularTotalCantidad()));
				granTotal.setText(String.valueOf(alcancia.calcularTotalDinero())+" Pesos");				
			}
		});
		Ahorrar50.setToolTipText("Ahorrar50");
		Ahorrar50.setForeground(new Color(30, 144, 255));
		Ahorrar50.setBackground(new Color(135, 206, 235));
		Ahorrar50.setBounds(87, 65, 89, 23);
		contentPane.add(Ahorrar50);
		
		JButton Ahorrar100 = new JButton("Ahorrar");
		Ahorrar100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alcancia.agregarMoneda100();
				cantidad100.setText(String.valueOf(alcancia.numeroMonedas100()));
				total100.setText(String.valueOf(Integer.parseInt(cantidad100.getText())*100)+" Pesos");
				totalCantidad.setText(String.valueOf(alcancia.calcularTotalCantidad()));
				granTotal.setText(String.valueOf(alcancia.calcularTotalDinero())+" Pesos");
			}
		});
		Ahorrar100.setToolTipText("Ahorrar100");
		Ahorrar100.setForeground(new Color(30, 144, 255));
		Ahorrar100.setBackground(new Color(135, 206, 235));
		Ahorrar100.setBounds(87, 130, 89, 23);
		contentPane.add(Ahorrar100);
		
		JButton Ahorrar500 = new JButton("Ahorrar");
		Ahorrar500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alcancia.agregarMoneda500();
				cantidad500.setText(String.valueOf(alcancia.numeroMonedas500()));
				total500.setText(String.valueOf(Integer.parseInt(cantidad500.getText())*500)+" Pesos");
				totalCantidad.setText(String.valueOf(alcancia.calcularTotalCantidad()));
				granTotal.setText(String.valueOf(alcancia.calcularTotalDinero())+" Pesos");
			}
		});
		Ahorrar500.setToolTipText("Ahorrar500");
		Ahorrar500.setForeground(new Color(30, 144, 255));
		Ahorrar500.setBackground(new Color(135, 206, 235));
		Ahorrar500.setBounds(87, 260, 89, 23);
		contentPane.add(Ahorrar500);
		
		JButton Ahorrar200 = new JButton("Ahorrar");
		Ahorrar200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alcancia.agregarMoneda200();
				cantidad200.setText(String.valueOf(alcancia.numeroMonedas200()));
				total200.setText(String.valueOf(Integer.parseInt(cantidad200.getText())*200)+" Pesos");
				totalCantidad.setText(String.valueOf(alcancia.calcularTotalCantidad()));
				granTotal.setText(String.valueOf(alcancia.calcularTotalDinero())+" Pesos");
			}
		});
		Ahorrar200.setToolTipText("Ahorrar200");
		Ahorrar200.setForeground(new Color(30, 144, 255));
		Ahorrar200.setBackground(new Color(135, 206, 235));
		Ahorrar200.setBounds(87, 195, 89, 23);
		contentPane.add(Ahorrar200);
		
		JButton Ahorrar1000 = new JButton("Ahorrar");
		Ahorrar1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alcancia.agregarMoneda1000();
				cantidad1000.setText(String.valueOf(alcancia.numeroMonedas1000()));
				total1000.setText(String.valueOf(Integer.parseInt(cantidad1000.getText())*1000)+" Pesos");
				totalCantidad.setText(String.valueOf(alcancia.calcularTotalCantidad()));
				granTotal.setText(String.valueOf(alcancia.calcularTotalDinero())+" Pesos");
			}
		});
		Ahorrar1000.setToolTipText("Ahorrar1000");
		Ahorrar1000.setForeground(new Color(30, 144, 255));
		Ahorrar1000.setBackground(new Color(135, 206, 235));
		Ahorrar1000.setBounds(87, 325, 89, 23);
		contentPane.add(Ahorrar1000);
		
		JButton btnConsulta = new JButton("");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, alcancia.darEstadoAlcancia()); 
			}
		});
		btnConsulta.setToolTipText("Cuanto llevamos ahorrado");
		btnConsulta.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/piga.png")));
		btnConsulta.setBounds(105, 411, 57, 57);
		contentPane.add(btnConsulta);
		
		JButton btnLimpiar = new JButton("");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere Romper la alcancía e iniciar una nueva?", "Alcancía!", JOptionPane.YES_NO_OPTION);
				if (resp==0) {
					if(totalCantidad.getText()=="0") {
						JOptionPane.showMessageDialog(null,"Todavía no hemos ahorrado nada, no se puede romper la alcancía","Alcancía", JOptionPane.WARNING_MESSAGE);						
					}else {
					JOptionPane.showMessageDialog(null, alcancia.darEstadoAlcancia()); 
					alcancia.ReiniciarAlcancia();
					cantidad50.setText("0");
					cantidad100.setText("0");
					cantidad200.setText("0");
					cantidad500.setText("0");
					cantidad1000.setText("0");
					total50.setText("0 Pesos");
					total100.setText("0 Pesos");
					total200.setText("0 Pesos");
					total500.setText("0 Pesos");
					total1000.setText("0 Pesos");
					totalCantidad.setText("0");
					granTotal.setText("0 Pesos");
					}
				}
			}
		});
		btnLimpiar.setToolTipText("Romper alcanc\u00EDa e iniciar una nueva");
		btnLimpiar.setIcon(new ImageIcon(AlcanciaFront.class.getResource("/Imagenes/hammera.png")));
		btnLimpiar.setBounds(253, 411, 57, 57);
		contentPane.add(btnLimpiar);
	}
}
