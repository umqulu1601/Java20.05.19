package formularioadm;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FuncoesAdm extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncoesAdm frame = new FuncoesAdm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FuncoesAdm() {
		setTitle("Usuário Adiministrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 240);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 282, 181);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNovoUsuario = new JButton("Criar Novo Usu\u00E1rio");
		btnNovoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovoUsuario.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnNovoUsuario.setToolTipText("Criar Novo Usu\u00E1rio");
		btnNovoUsuario.setBounds(42, 11, 203, 23);
		panel.add(btnNovoUsuario);
		
		JButton btnEditarUsuario = new JButton("Editar Usu\u00E1rio");
		btnEditarUsuario.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnEditarUsuario.setToolTipText("Editar Usu\u00E1rio");
		btnEditarUsuario.setBounds(42, 45, 203, 23);
		panel.add(btnEditarUsuario);
		
		JButton btnEditarMeusDados = new JButton("Editar Meus Dados");
		btnEditarMeusDados.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnEditarMeusDados.setToolTipText("Editar Meus Dados");
		btnEditarMeusDados.setBounds(42, 79, 203, 23);
		panel.add(btnEditarMeusDados);
		
		JButton btnExcluirUsuario = new JButton("Excluir Usu\u00E1rio");
		btnExcluirUsuario.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnExcluirUsuario.setToolTipText("Excluir Usu\u00E1rio");
		btnExcluirUsuario.setBounds(42, 113, 203, 23);
		panel.add(btnExcluirUsuario);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnSair.setToolTipText("Sair");
		btnSair.setBounds(102, 147, 89, 23);
		panel.add(btnSair);
	}
}