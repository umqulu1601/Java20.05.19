package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 283, 365);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(166, 49, 106, 14);
		panel.add(label);
		label.setVisible(false);
		
		
		JLabel lblArroz = new JLabel("Arroz");
		lblArroz.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblArroz.setBounds(47, 15, 41, 14);
		panel.add(lblArroz);
		
		JButton btnarrMenor = new JButton("-");
		btnarrMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnarrMenor.setEnabled(false);
		btnarrMenor.setToolTipText("-");
		btnarrMenor.setBounds(63, 40, 48, 23);
		panel.add(btnarrMenor);
		

		JButton btnarrMaior = new JButton("+");
		btnarrMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnarrMenor.setEnabled(true);
				label.setText(label.getText()+btnarrMaior.getText());
			}
		});
		btnarrMaior.setToolTipText("+");
		btnarrMaior.setBounds(10, 40, 48, 23);
		panel.add(btnarrMaior);
		
		
		JLabel lblFeijo = new JLabel("Feij\u00E3o");
		lblFeijo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFeijo.setBounds(47, 74, 48, 14);
		panel.add(lblFeijo);
		
		JButton btnfeiMenor = new JButton("-");
		btnfeiMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnfeiMenor.setEnabled(false);
		btnfeiMenor.setToolTipText("-");
		btnfeiMenor.setBounds(63, 99, 48, 23);
		panel.add(btnfeiMenor);

		JButton btnfeiMaior = new JButton("+");
		btnfeiMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfeiMenor.setEnabled(true);
				label.setText(label.getText()+btnfeiMaior.getText());
			}
		});
		btnfeiMaior.setToolTipText("+");
		btnfeiMaior.setBounds(10, 99, 48, 23);
		panel.add(btnfeiMaior);
		
		JLabel lblFarinha = new JLabel("Farinha");
		lblFarinha.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFarinha.setBounds(40, 133, 48, 14);
		panel.add(lblFarinha);
		
		JButton btnfarMenor = new JButton("-");
		btnfarMenor.setEnabled(false);
		btnfarMenor.setToolTipText("-");
		btnfarMenor.setBounds(63, 158, 48, 23);
		panel.add(btnfarMenor);

		JButton btnfarMaior = new JButton("+");
		btnfarMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnfarMenor.setEnabled(true);
				label.setText(label.getText()+btnfarMaior.getText());
			}
		});
		btnfarMaior.setToolTipText("+");
		btnfarMaior.setBounds(10, 158, 48, 23);
		panel.add(btnfarMaior);
		
		JLabel lblAcucar = new JLabel("A\u00E7\u00FAcar");
		lblAcucar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAcucar.setBounds(40, 192, 48, 14);
		panel.add(lblAcucar);
		
		JButton btnacuMenor = new JButton("-");
		btnacuMenor.setEnabled(false);
		btnacuMenor.setToolTipText("-");
		btnacuMenor.setBounds(63, 217, 48, 23);
		panel.add(btnacuMenor);

		JButton btnacuMaior = new JButton("+");
		btnacuMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnacuMenor.setEnabled(true);
				label.setText(label.getText()+btnacuMaior.getText());
			}
		});
		btnacuMaior.setToolTipText("+");
		btnacuMaior.setBounds(10, 217, 48, 23);
		panel.add(btnacuMaior);
		
		JLabel lblOleo = new JLabel("\u00D3leo");
		lblOleo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblOleo.setBounds(47, 250, 34, 14);
		panel.add(lblOleo);
		
		JButton btnoleMenor = new JButton("-");
		btnoleMenor.setEnabled(false);
		btnoleMenor.setToolTipText("-");
		btnoleMenor.setBounds(63, 276, 48, 23);
		panel.add(btnoleMenor);
		
		JButton btnoleMaior = new JButton("+");
		btnoleMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnoleMenor.setEnabled(true);
				label.setText(label.getText()+btnoleMaior.getText());
			}
		});
		btnoleMaior.setToolTipText("+");
		btnoleMaior.setBounds(10, 275, 48, 23);
		panel.add(btnoleMaior);
		
		JLabel lblSal = new JLabel("Sal");
		lblSal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSal.setBounds(54, 309, 34, 14);
		panel.add(lblSal);
		
		JButton btnsalMenor = new JButton("-");
		btnsalMenor.setEnabled(false);
		btnsalMenor.setToolTipText("-");
		btnsalMenor.setBounds(63, 334, 48, 23);
		panel.add(btnsalMenor);

		JButton btnsalMaior = new JButton("+");
		btnsalMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnsalMenor.setEnabled(true);
				label.setText(label.getText()+btnsalMaior.getText());
			}
		});
		btnsalMaior.setToolTipText("+");
		btnsalMaior.setBounds(10, 334, 48, 23);
		panel.add(btnsalMaior);
		
		JLabel lblMilho = new JLabel("Milho");
		lblMilho.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMilho.setBounds(201, 133, 41, 14);
		panel.add(lblMilho);
		
		JButton btnmilMenor = new JButton("-");
		btnmilMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmilMenor.setEnabled(false);
		btnmilMenor.setToolTipText("-");
		btnmilMenor.setBounds(224, 158, 48, 23);
		panel.add(btnmilMenor);

		JButton btnmilMaior = new JButton("+");
		btnmilMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnmilMenor.setEnabled(true);
				label.setText(label.getText()+btnmilMaior.getText());
			}
		});
		btnmilMaior.setToolTipText("+");
		btnmilMaior.setBounds(166, 158, 48, 23);
		panel.add(btnmilMaior);
		
		JLabel lblErvilha = new JLabel("Ervilha");
		lblErvilha.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblErvilha.setBounds(201, 192, 48, 14);
		panel.add(lblErvilha);
		
		JButton btnervMenor = new JButton("-");
		btnervMenor.setEnabled(false);
		btnervMenor.setToolTipText("-");
		btnervMenor.setBounds(224, 217, 48, 23);
		panel.add(btnervMenor);

		JButton btnervMaior = new JButton("+");
		btnervMaior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnervMenor.setEnabled(true);
				label.setText(label.getText()+btnervMaior.getText());
			}
		});
		btnervMaior.setToolTipText("+");
		btnervMaior.setBounds(166, 217, 48, 23);
		panel.add(btnervMaior);
		
		JButton button = new JButton("Quantidade");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button.setBounds(166, 11, 110, 23);
		panel.add(button);
		
		
	}
}
