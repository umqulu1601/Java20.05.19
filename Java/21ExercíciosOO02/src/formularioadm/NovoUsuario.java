package formularioadm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class NovoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textUsuario;
	private JTextField textSenha;
	private JTextField textEmail;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovoUsuario frame = new NovoUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public NovoUsuario() {
		setTitle("Novo Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 555);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 363, 494);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 48, 14);
		lblNome.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(lblNome);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setBounds(10, 53, 73, 14);
		lblUsuario.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 97, 48, 14);
		lblSenha.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(lblSenha);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usu\u00E1rio:");
		lblTipoDeUsuario.setBounds(10, 144, 130, 14);
		lblTipoDeUsuario.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(lblTipoDeUsuario);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 193, 73, 14);
		lblEmail.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(lblEmail);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
		textNome.setBounds(143, 9, 205, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setToolTipText("Crie um Usu\u00E1rio");
		textUsuario.setColumns(10);
		textUsuario.setBounds(143, 51, 205, 20);
		panel.add(textUsuario);
		
		textSenha = new JTextField();
		textSenha.setToolTipText("Crie sua Senha");
		textSenha.setColumns(10);
		textSenha.setBounds(143, 95, 205, 20);
		panel.add(textSenha);
		
		JComboBox cbxUsuario = new JComboBox();
		cbxUsuario.setToolTipText("Tipo de Usu\u00E1rio");
		cbxUsuario.addItem("Administrador");
		cbxUsuario.addItem("Simples");
		cbxUsuario.setBounds(143, 141, 205, 22);
		cbxUsuario.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
		panel.add(cbxUsuario);
		
		textEmail = new JTextField();
		textEmail.setToolTipText("Digite seu E-mail");
		textEmail.setColumns(10);
		textEmail.setBounds(143, 191, 205, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadatrar");
		btnCadastrar.setToolTipText("Cadastrar");
		btnCadastrar.setBounds(193, 222, 109, 23);
		btnCadastrar.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//Limpar os campos
				textNome.setText("");
				textUsuario.setText("");
				textSenha.setText("");
				cbxUsuario.setSelectedIndex(0);
				textEmail.setText("");
				//Cursor no campo nome
				textNome.requestFocus();
				
			}
		});		
		JButton button = new JButton("Voltar");
		button.setToolTipText("Voltar");
		button.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		button.setBounds(48, 223, 89, 23);
		panel.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 259, 343, 224);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				
			}
		}); 
		
	}
}