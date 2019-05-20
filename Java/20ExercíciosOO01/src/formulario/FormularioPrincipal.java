package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import acao.acao;
import beans.Jogo;
import principal.Principal;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField Nome;
	private JTextField txtCassificacao;
	private JTextField txtValor;
	private JTable table;

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar um objeto da classe acao
		acao a = new acao();
		
		Nome = new JTextField();
		Nome.setBounds(127, 17, 297, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblGenero = new JLabel("G\u00EAnero");
		lblGenero.setBounds(20, 60, 48, 14);
		contentPane.add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(20, 104, 63, 14);
		contentPane.add(lblPlataforma);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setBounds(20, 155, 97, 14);
		contentPane.add(lblClassificao);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(20, 199, 48, 14);
		contentPane.add(lblValor);
		
		txtCassificacao = new JTextField();
		txtCassificacao.setBounds(127, 152, 297, 20);
		contentPane.add(txtCassificacao);
		txtCassificacao.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(127, 196, 297, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblNomeDoJogo = new JLabel("Nome Do Jogo");
		lblNomeDoJogo.setBounds(20, 20, 85, 14);
		contentPane.add(lblNomeDoJogo);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.addItem("Ação");
		cbxGenero.addItem("Aventura");
		cbxGenero.addItem("Suspense");
		cbxGenero.setBounds(127, 60, 297, 22);
		contentPane.add(cbxGenero);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("Playstation 4");
		cbxPlataforma.addItem("PC");
		cbxPlataforma.setBounds(127, 100, 297, 22);
		contentPane.add(cbxPlataforma);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 279, 400, 199);
		contentPane.add(scrollPane);
	
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Criar um objeto da classe Jogo
				try {
				Jogo j = new Jogo();
				j.setNome(Nome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtCassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				//Realizar o cadastro
				a.cadastrar(j);
				
				//Atualizar a tabela
				table.setModel(a.selecionar());
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				
				}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
				
				}
				//Limpar os campos
				Nome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtCassificacao.setText("");
				txtValor.setText("");
				
				//Cursor no campo nome jogo
				Nome.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(117, 227, 109, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(10, 0, 48, 14);
		lblIndice.setVisible(true);
		contentPane.add(lblIndice);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Obter o indice
				int indice = Integer.parseInt(lblIndice.getText());
				
			//Chamar o método de exclusão
				a.excluir(indice);
			
			//Atualizar tabela
				
			table.setModel(a.selecionar());
			
			//Limpar os campos 
			Nome.setText("");
			cbxGenero.setSelectedIndex(0);
			cbxPlataforma.setSelectedIndex(0);
			txtCassificacao.setText("");
			txtValor.setText("");
			lblIndice.setText("");
			
			//Cursor do campo nome
			lblNomeDoJogo.requestFocus();
			
			//Mensagem
			JOptionPane.showMessageDialog(null, "Jogo excluído com sucesso!");
				
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(335, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Obter o índice a ser alterado
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Instanciar um objeto da classe jogo
				Jogo j = new Jogo();
				j.setNome(Nome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtCassificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				//Realizar alteração
				a.alterar(indice, j);
				
				//Atualizar tabela
				table.setModel(a.selecionar());
			
				//Limpar os campos 
				Nome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtCassificacao.setText("");
				txtValor.setText("");
				lblIndice.setText("");
				
				//Ativar botão cadastrar e desabilitar os demais
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				
				//Cursor do campo nome
				lblNomeDoJogo.requestFocus();
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Jogo alterado com sucesso!");
			}
		});
		btnAlterar.setBounds(236, 227, 89, 23);
		contentPane.add(btnAlterar);
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
			
			//Obter a linha selecionada
				int indice = table.getSelectedRow();
				
			//Obtendo os dados de cada coluna
			String nome = table.getValueAt(indice, 0).toString();
			String genero = table.getValueAt(indice, 1).toString();
			String platafomra = table.getValueAt(indice, 2).toString();
			int classificacao = Integer.parseInt(table.getValueAt(indice, 3).toString());
			double valor = Double.parseDouble(table.getValueAt(indice, 4).toString());

			//Enviando dados ao Formulário
			lblIndice.setText(String.valueOf(indice));
			Nome.setText(nome);
			txtCassificacao.setText(String.valueOf(classificacao));
			txtValor.setText(String.valueOf(valor));
			
			switch(genero) {
			case "Ação":
				cbxGenero.setSelectedItem(0);
			break;
			
			case "Aventura":
				cbxGenero.setSelectedItem(1);
			break;
			
			case "Suspense":
				cbxGenero.setSelectedItem(2);
			break;
			}
			
			switch(platafomra) {
			case "Xbox One":
				cbxPlataforma.setSelectedItem(0);
			break;
			
			case "Playstation 4":
				cbxPlataforma.setSelectedItem(1);
			break;
			
			case "PC":
				cbxPlataforma.setSelectedItem(2);
			break;
			}
			
			//Ativar botões de alterar e excluir e desativar o botão cadastrar
			btnCadastrar.setEnabled(false);
			btnAlterar.setEnabled(true);
			btnExcluir.setEnabled(true);
			}
		});
	}
}