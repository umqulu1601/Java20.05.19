package formularioadm;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import formulariosimples.ListaDeUsuarios;
import acao.Acao;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExcluirUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textUsuario;
	private JTextField textSenha;
	private JTextField textEmail;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirUsuario frame = new ExcluirUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ExcluirUsuario() {
		setTitle("Excluir Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 321);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Inst�nciar um objeto da classe Acao
				Acao a = new Acao();
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 363, 260);
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
		textUsuario.setEnabled(false);
		textUsuario.setToolTipText("Crie um Usu\u00E1rio");
		textUsuario.setColumns(10);
		textUsuario.setBounds(143, 51, 205, 20);
		panel.add(textUsuario);
		
		textSenha = new JTextField();
		textSenha.setEnabled(false);
		textSenha.setToolTipText("Crie sua Senha");
		textSenha.setColumns(10);
		textSenha.setBounds(143, 95, 205, 20);
		panel.add(textSenha);
		
		JComboBox cbxUsuario = new JComboBox();
		cbxUsuario.setEnabled(false);
		cbxUsuario.addItem("Administrador");
		cbxUsuario.addItem("Simples");
		cbxUsuario.setToolTipText("Tipo de Usu\u00E1rio");
		cbxUsuario.setBounds(143, 141, 205, 22);
		cbxUsuario.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 11));
		panel.add(cbxUsuario);
		
		textEmail = new JTextField();
		textEmail.setEnabled(false);
		textEmail.setToolTipText("Digite seu E-mail");
		textEmail.setColumns(10);
		textEmail.setBounds(143, 191, 205, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter indice
				int indice=Integer.parseInt(lblNome.getText());
				
				//Chamar o metodo de exclus�o
				a.excluir(indice);
				
				//Atualizar tabela
				ta.setModel(a.selecionar());
				
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
		btnExcluir.setEnabled(false);
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.setBounds(198, 222, 109, 23);
		btnExcluir.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		panel.add(btnExcluir);
		
		JButton button = new JButton("Voltar");
		button.setToolTipText("Voltar");
		button.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		button.setBounds(51, 223, 89, 23);
		panel.add(button);
	}
}