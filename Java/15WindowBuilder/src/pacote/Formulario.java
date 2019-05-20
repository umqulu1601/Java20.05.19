package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;

public class Formulario extends JFrame {
	private JTextField txtNome;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Digite seu Nome");
		txtNome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtNome.setBounds(56, 37, 354, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel nome = new JLabel("Nome:");
		nome.setToolTipText("Nome");
		nome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		nome.setBounds(10, 39, 57, 14);
		getContentPane().add(nome);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(56, 72, 57, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblIdade.setBounds(10, 75, 48, 14);
		getContentPane().add(lblIdade);
		
		JLabel lblAniversrio = new JLabel("Anivers\u00E1rio:");
		lblAniversrio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAniversrio.setBounds(152, 75, 85, 14);
		getContentPane().add(lblAniversrio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(232, 73, 168, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

	}
}
