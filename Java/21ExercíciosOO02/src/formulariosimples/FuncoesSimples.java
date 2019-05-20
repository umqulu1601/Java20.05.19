package formulariosimples;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FuncoesSimples extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncoesSimples frame = new FuncoesSimples();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FuncoesSimples() {
		setTitle("Usuário Simples");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 174);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 250, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEditarMeusDados = new JButton("Editar Meus Dados");
		btnEditarMeusDados.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnEditarMeusDados.setToolTipText("Editar Meus Dados");
		btnEditarMeusDados.setBounds(26, 11, 203, 23);
		panel.add(btnEditarMeusDados);
		
		JButton btnTabela = new JButton("Tabela de Usu\u00E1rios");
		btnTabela.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnTabela.setToolTipText("Tabela de Usu\u00E1rios");
		btnTabela.setBounds(26, 45, 203, 23);
		panel.add(btnTabela);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Lucida Calligraphy", Font.BOLD, 12));
		btnSair.setToolTipText("Sair");
		btnSair.setBounds(85, 79, 89, 23);
		panel.add(btnSair);
	}
}