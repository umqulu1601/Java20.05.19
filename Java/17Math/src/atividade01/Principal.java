package atividade01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField visor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setTitle("Calculadora");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int v=0;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton n0 = new JButton("0");
		n0.setToolTipText("0");
		n0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n0.getText());
			}
		});
		n0.setBounds(76, 328, 60, 60);
		contentPane.add(n0);
		
		JButton n1 = new JButton("1");
		n1.setToolTipText("1");
		n1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n1.getText());
			}
		});
		n1.setBounds(6, 263, 60, 60);
		contentPane.add(n1);
		
		JButton n2 = new JButton("2");
		n2.setToolTipText("2");
		n2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n2.getText());
			}
		});
		n2.setBounds(76, 263, 60, 60);
		contentPane.add(n2);
		
		JButton n3 = new JButton("3");
		n3.setToolTipText("3");
		n3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n3.getText());
			}
		});
		n3.setBounds(146, 263, 60, 60);
		contentPane.add(n3);
		
		JButton n4 = new JButton("4");
		n4.setToolTipText("4");
		n4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			visor.setText(visor.getText()+n4.getText());
		}
	});
		n4.setBounds(6, 198, 60, 60);
		contentPane.add(n4);
		
		JButton n5 = new JButton("5");
		n5.setToolTipText("5");
		n5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n5.getText());
			}
		});
		n5.setBounds(76, 198, 60, 60);
		contentPane.add(n5);
		
		JButton n6 = new JButton("6");
		n6.setToolTipText("6");
		n6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n6.getText());
			}
		});
		n6.setBounds(146, 198, 60, 60);
		contentPane.add(n6);
		
		JButton n7 = new JButton("7");
		n7.setToolTipText("7");
		n7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n7.getText());
			}
		});
		n7.setBounds(6, 133, 60, 60);
		contentPane.add(n7);
		
		JButton n8 = new JButton("8");
		n8.setToolTipText("8");
		n8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n8.getText());
			}
		});
		n8.setBounds(76, 133, 60, 60);
		contentPane.add(n8);
		
		JButton n9 = new JButton("9");
		n9.setToolTipText("9");
		n9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		n9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText()+n9.getText());
			}
		});
		n9.setBounds(146, 133, 60, 60);
		contentPane.add(n9);
		
		visor = new JTextField();
		visor.setToolTipText("Visor");
		visor.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		visor.setBounds(10, 11, 335, 48);
		contentPane.add(visor);
		visor.setColumns(10);
		
		JButton mais = new JButton("+");
		mais.setToolTipText("Mais");
		mais.setFont(new Font("Times New Roman", Font.BOLD, 20));
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v==0) {
				visor.setText(visor.getText()+mais.getText());
				v++;
			}}
		});
		mais.setBounds(216, 263, 60, 60);
		contentPane.add(mais);
		
		JButton menos = new JButton("-");
		menos.setToolTipText("Menos");
		menos.setFont(new Font("Times New Roman", Font.BOLD, 24));
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v==0) {
				visor.setText(visor.getText()+menos.getText());
				v++;
			}}
		});
		menos.setBounds(216, 196, 60, 60);
		contentPane.add(menos);
		
		JButton vezes = new JButton("X");
		vezes.setToolTipText("Vezes");
		vezes.setFont(new Font("Times New Roman", Font.BOLD, 20));
		vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v==0) {
				visor.setText(visor.getText()+vezes.getText());
				v++;
			}}
		});
		vezes.setBounds(216, 133, 60, 60);
		contentPane.add(vezes);
		
		JButton dividi = new JButton("\u00F7");
		dividi.setToolTipText("Dividido");
		dividi.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dividi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v==0) {
				visor.setText(visor.getText()+dividi.getText());
				v++;
			}}
		});
		dividi.setBounds(286, 198, 60, 60);
		contentPane.add(dividi);
		
		JButton igual = new JButton("=");
		igual.setToolTipText("Igual");
		igual.setFont(new Font("Times New Roman", Font.BOLD, 20));
		igual.setBounds(216, 328, 60, 60);
		contentPane.add(igual);
		
		JButton sin = new JButton("sin");
		sin.setToolTipText("Seno");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		sin.setBounds(6, 70, 60, 60);
		contentPane.add(sin);
		
		JButton log = new JButton("log");
		log.setToolTipText("Logaritmo");
		log.setFont(new Font("Times New Roman", Font.BOLD, 18));
		log.setBounds(216, 70, 60, 60);
		contentPane.add(log);
		
		JButton cos = new JButton("cos");
		cos.setToolTipText("Cosseno");
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cos.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cos.setBounds(76, 70, 60, 60);
		contentPane.add(cos);
		
		JButton raizcub = new JButton("^3\u221A");
		raizcub.setToolTipText("Raiz C\u00FAbica");
		raizcub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		raizcub.setFont(new Font("Times New Roman", Font.BOLD, 16));
		raizcub.setBounds(286, 263, 60, 60);
		contentPane.add(raizcub);
		
		JButton raizqua = new JButton("\u221A");
		raizqua.setToolTipText("Raiz Quadrada");
		raizqua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		raizqua.setFont(new Font("Times New Roman", Font.BOLD, 20));
		raizqua.setBounds(286, 328, 60, 60);
		contentPane.add(raizqua);
		
		JButton tan = new JButton("tan");
		tan.setToolTipText("Tangente");
		tan.setFont(new Font("Times New Roman", Font.BOLD, 18));
		tan.setBounds(146, 70, 60, 60);
		contentPane.add(tan);
		
		JButton maismenos = new JButton("+/-");
		maismenos.setToolTipText("+/-");
		maismenos.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		maismenos.setBounds(6, 328, 60, 60);
		contentPane.add(maismenos);
		
		JButton virgula = new JButton(",");
		virgula.setToolTipText(",");
		virgula.setFont(new Font("Times New Roman", Font.BOLD, 20));
		virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v==0) {
				visor.setText(visor.getText()+virgula.getText());
				v++;
			}}
		});
		virgula.setBounds(146, 328, 60, 60);
		contentPane.add(virgula);
		
		JButton apagartudo = new JButton("C");
		apagartudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText("");
			} 
		});
		apagartudo.setToolTipText("Apaguar Tudo");
		apagartudo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		apagartudo.setBounds(285, 70, 60, 60);
		contentPane.add(apagartudo);
		
		JButton parents = new JButton("( )");
		parents.setToolTipText("Parenteses");
		parents.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		parents.setBounds(285, 133, 60, 60);
		contentPane.add(parents);
	}
}