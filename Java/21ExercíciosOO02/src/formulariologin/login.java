package formulariologin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JTextField txtsenha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 218);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 264, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		lblUsuario.setBounds(10, 30, 82, 14);
		panel.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		lblSenha.setBounds(10, 74, 68, 14);
		panel.add(lblSenha);
		
		txtusuario = new JTextField();
		txtusuario.setToolTipText("Usuario");
		txtusuario.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
		txtusuario.setBounds(83, 28, 162, 20);
		panel.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtsenha = new JTextField();
		txtsenha.setToolTipText("Senha");
		txtsenha.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
		txtsenha.setBounds(83, 72, 162, 20);
		panel.add(txtsenha);
		txtsenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setToolTipText("Entrar");
		btnEntrar.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnEntrar.setBounds(83, 114, 89, 23);
		panel.add(btnEntrar);
	
	}}