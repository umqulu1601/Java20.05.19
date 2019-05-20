package teste01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Seja Bem-Vindo a Ousadia e Alegria!");
		
		// Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setTitle("Ousadia e Alegria");
		formulario.setSize(710, 510);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Botões Principais
		JButton btn01 = new JButton("Cadastros");
		btn01.setBounds(5, 110, 94, 20);

		JButton btn02 = new JButton("Produtos");
		btn02.setBounds(5, 140, 94, 20);

		JButton btn03 = new JButton("Caixa");
		btn03.setBounds(5, 170, 94, 20);

		JButton btn04 = new JButton("Sair");
		btn04.setBounds(5, 435, 94, 20);

		// Botões Secundarios (Cadastros)
		JButton btn05 = new JButton("Funcionarios");
		btn05.setBounds(120, 110, 110, 20);
		btn05.setVisible(false);

		JButton btn06 = new JButton("Clientes");
		btn06.setBounds(235, 110, 94, 20);
		btn06.setVisible(false);

		JButton btn07 = new JButton("Produtos");
		btn07.setBounds(335, 110, 94, 20);
		btn07.setVisible(false);

		JButton btn10 = new JButton("Fornecedor");
		btn10.setBounds(435, 110, 100, 20);
		btn10.setVisible(false);

		// Botões Secundarios (Produtos)
		JButton btn08 = new JButton("Visualizar");
		btn08.setBounds(120, 110, 94, 20);
		btn08.setVisible(false);

		JButton btn09 = new JButton("Editar");
		btn09.setBounds(225, 110, 94, 20);
		btn09.setVisible(false);

		// Painéis
		JPanel caixa01 = new JPanel();
		caixa01.setBounds(0, 0, 100, 100);
		caixa01.setBackground(Color.WHITE);
		caixa01.setVisible(true);

		JPanel caixa02 = new JPanel();
		caixa02.setBounds(104, 0, 600, 100);
		caixa02.setBackground(Color.DARK_GRAY);
		caixa02.setVisible(true);

		JPanel caixa03 = new JPanel();
		caixa03.setBounds(0, 100, 104, 400);
		caixa03.setBackground(Color.DARK_GRAY);
		caixa03.setVisible(true);

		// Ações nos botões
		btn01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn05.setVisible(true);
				btn06.setVisible(true);
				btn10.setVisible(true);
				btn07.setVisible(true);
				btn08.setVisible(false);
				btn09.setVisible(false);
			}
		});
		btn02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn05.setVisible(false);
				btn06.setVisible(false);
				btn07.setVisible(false);
				btn10.setVisible(false);
				btn08.setVisible(true);
				btn09.setVisible(true);
			}
		});
		btn03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn05.setVisible(false);
				btn06.setVisible(false);
				btn07.setVisible(false);
				btn08.setVisible(false);
				btn09.setVisible(false);
				btn10.setVisible(false);
			}
		});
		btn04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn06.setVisible(false);
				btn07.setVisible(false);
				btn10.setVisible(false);

				// Criar um rótulo
				JLabel nome = new JLabel();
				nome.setBounds(120, 135, 150, 20);
				nome.setText("Nome");

				JLabel aniversario = new JLabel();
				aniversario.setBounds(120, 160, 150, 20);
				aniversario.setText("Data de Nascimento");

				JLabel idade = new JLabel();
				idade.setBounds(380, 160, 150, 20);
				idade.setText("Idade");

				JLabel rg = new JLabel();
				rg.setBounds(120, 185, 150, 20);
				rg.setText("RG");

				JLabel cpf = new JLabel();
				cpf.setBounds(380, 185, 150, 20);
				cpf.setText("CPF");

				JLabel telefone = new JLabel();
				telefone.setBounds(120, 210, 150, 20);
				telefone.setText("Telefone");

				JLabel celular = new JLabel();
				celular.setBounds(380, 210, 150, 20);
				celular.setText("Celular");

				JLabel endereco = new JLabel();
				endereco.setBounds(120, 235, 150, 20);
				endereco.setText("Endereço");

				JLabel cidade = new JLabel();
				cidade.setBounds(120, 260, 150, 20);
				cidade.setText("Cidade");

				JLabel bairro = new JLabel();
				bairro.setBounds(380, 260, 150, 20);
				bairro.setText("Bairro");

				JLabel funcao = new JLabel();
				funcao.setBounds(120, 285, 150, 20);
				funcao.setText("Função");

				// Criar um campo de texto
				JTextField camponome = new JTextField();
				camponome.setBounds(160, 135, 400, 20);

				JTextField camponascimento = new JTextField();
				camponascimento.setBounds(240, 160, 130, 20);

				JTextField campoidade = new JTextField();
				campoidade.setBounds(420, 160, 140, 20);

				JTextField camporg = new JTextField();
				camporg.setBounds(150, 185, 130, 20);

				JTextField campocpf = new JTextField();
				campocpf.setBounds(420, 185, 140, 20);

				JTextField campotelefone = new JTextField();
				campotelefone.setBounds(175, 210, 140, 20);

				JTextField campocelular = new JTextField();
				campocelular.setBounds(425, 210, 135, 20);

				JTextField campoendereco = new JTextField();
				campoendereco.setBounds(180, 235, 380, 20);

				JTextField campocidade = new JTextField();
				campocidade.setBounds(170, 260, 130, 20);

				JTextField campobairro = new JTextField();
				campobairro.setBounds(423, 260, 137, 20);

				JComboBox<String> opcoesfuncao = new JComboBox<String>();
				opcoesfuncao.setBounds(170, 285, 150, 20);
				opcoesfuncao.addItem("Gerente");
				opcoesfuncao.addItem("Vendedor");
				opcoesfuncao.addItem("Caixa");
				opcoesfuncao.addItem("Sub Gerente");

				// Criar botão
				JButton botao1 = new JButton();
				botao1.setText("Cadastrar");
				botao1.setBounds(580, 435, 94, 20);

				JButton botao2 = new JButton();
				botao2.setText("Voltar");
				botao2.setBounds(470, 435, 94, 20);

				// Adicionar elementos ao formulário
				formulario.add(nome);
				formulario.add(idade);
				formulario.add(aniversario);
				formulario.add(rg);
				formulario.add(cpf);
				formulario.add(cidade);
				formulario.add(telefone);
				formulario.add(celular);
				formulario.add(endereco);
				formulario.add(bairro);
				formulario.add(funcao);
				formulario.add(camponome);
				formulario.add(campoidade);
				formulario.add(camponascimento);
				formulario.add(camporg);
				formulario.add(campocpf);
				formulario.add(campotelefone);
				formulario.add(campocelular);
				formulario.add(campoendereco);
				formulario.add(campocidade);
				formulario.add(campobairro);
				formulario.add(opcoesfuncao);
				formulario.add(botao1);
				formulario.add(botao2);

				botao1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// Exibir notificação
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

						// Limpar o campo de texto
						camponome.setText("");
						camponascimento.setText("");
						campoidade.setText("");
						camporg.setText("");
						campocpf.setText("");
						campotelefone.setText("");
						campocelular.setText("");
						campoendereco.setText("");
						campocidade.setText("");
						campobairro.setText("");
						opcoesfuncao.getToolTipText();

						// Deixar o cursos selecionado no campo
						camponome.requestFocus();
					}
				});
			}
		});
		btn06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn05.setVisible(false);
				btn07.setVisible(false);
				btn10.setVisible(false);

				// Criar um rótulo
				JLabel nome = new JLabel();
				nome.setBounds(120, 135, 150, 20);
				nome.setText("Nome");

				JLabel aniversario = new JLabel();
				aniversario.setBounds(120, 160, 150, 20);
				aniversario.setText("Data de Nascimento");

				JLabel idade = new JLabel();
				idade.setBounds(380, 160, 150, 20);
				idade.setText("Idade");

				JLabel rg = new JLabel();
				rg.setBounds(120, 185, 150, 20);
				rg.setText("RG");

				JLabel cpf = new JLabel();
				cpf.setBounds(380, 185, 150, 20);
				cpf.setText("CPF");

				JLabel telefone = new JLabel();
				telefone.setBounds(120, 210, 150, 20);
				telefone.setText("Telefone");

				JLabel celular = new JLabel();
				celular.setBounds(380, 210, 150, 20);
				celular.setText("Celular");

				JLabel endereco = new JLabel();
				endereco.setBounds(120, 235, 150, 20);
				endereco.setText("Endereço");

				JLabel cidade = new JLabel();
				cidade.setBounds(120, 260, 150, 20);
				cidade.setText("Cidade");

				JLabel bairro = new JLabel();
				bairro.setBounds(380, 260, 150, 20);
				bairro.setText("Bairro");

				// Criar um campo de texto
				JTextField camponome = new JTextField();
				camponome.setBounds(160, 135, 400, 20);

				JTextField camponascimento = new JTextField();
				camponascimento.setBounds(240, 160, 130, 20);

				JTextField campoidade = new JTextField();
				campoidade.setBounds(420, 160, 140, 20);

				JTextField camporg = new JTextField();
				camporg.setBounds(150, 185, 130, 20);

				JTextField campocpf = new JTextField();
				campocpf.setBounds(420, 185, 140, 20);

				JTextField campotelefone = new JTextField();
				campotelefone.setBounds(175, 210, 140, 20);

				JTextField campocelular = new JTextField();
				campocelular.setBounds(425, 210, 135, 20);

				JTextField campoendereco = new JTextField();
				campoendereco.setBounds(180, 235, 380, 20);

				JTextField campocidade = new JTextField();
				campocidade.setBounds(170, 260, 130, 20);

				JTextField campobairro = new JTextField();
				campobairro.setBounds(423, 260, 137, 20);

				// Criar botão
				JButton botao1 = new JButton();
				botao1.setText("Cadastrar");
				botao1.setBounds(580, 435, 94, 20);

				JButton botao2 = new JButton();
				botao2.setText("Voltar");
				botao2.setBounds(470, 435, 94, 20);

				// Adicionar elementos ao formulário
				formulario.add(nome);
				formulario.add(idade);
				formulario.add(aniversario);
				formulario.add(rg);
				formulario.add(cpf);
				formulario.add(cidade);
				formulario.add(telefone);
				formulario.add(celular);
				formulario.add(endereco);
				formulario.add(bairro);
				formulario.add(camponome);
				formulario.add(campoidade);
				formulario.add(camponascimento);
				formulario.add(camporg);
				formulario.add(campocpf);
				formulario.add(campotelefone);
				formulario.add(campocelular);
				formulario.add(campoendereco);
				formulario.add(campocidade);
				formulario.add(campobairro);
				formulario.add(botao1);
				formulario.add(botao2);

				botao1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// Exibir notificação
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

						// Limpar o campo de texto
						camponome.setText("");
						camponascimento.setText("");
						campoidade.setText("");
						camporg.setText("");
						campocpf.setText("");
						campocelular.setText("");
						campotelefone.setText("");
						campoendereco.setText("");
						campocidade.setText("");
						campobairro.setText("");

						// Deixar o cursos selecionado no campo
						camponome.requestFocus();
					}
				});
			}
		});
		btn07.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn05.setVisible(false);
				btn06.setVisible(false);
				btn10.setVisible(false);

				// Criar um rótulo
				JLabel codigo = new JLabel();
				codigo.setBounds(120, 135, 150, 20);
				codigo.setText("Código");

				JLabel nome = new JLabel();
				nome.setBounds(280, 135, 150, 20);
				nome.setText("Nome");

				JLabel categoria = new JLabel();
				categoria.setBounds(120, 185, 150, 20);
				categoria.setText("Categoria");

				JLabel quantidade = new JLabel();
				quantidade.setBounds(380, 185, 150, 20);
				quantidade.setText("Quantidade");

				JLabel fornecedor = new JLabel();
				fornecedor.setBounds(120, 235, 150, 20);
				fornecedor.setText("Fornecedor");

				// Criar um campo de texto
				JTextField campocodigo = new JTextField();
				campocodigo.setBounds(165, 135, 100, 20);

				JTextField camponome = new JTextField();
				camponome.setBounds(318, 135, 276, 20);

				JComboBox<String> opcoescategoria = new JComboBox<String>();
				opcoescategoria.setBounds(180, 185, 140, 20);
				opcoescategoria.addItem("");

				JComboBox<String> opcoesquantidade = new JComboBox<String>();
				opcoesquantidade.setBounds(450, 185, 140, 20);
				opcoesquantidade.addItem("");

				JComboBox<String> opcoesfornecedor = new JComboBox<String>();
				opcoesfornecedor.setBounds(190, 235, 400, 20);
				opcoesfornecedor.addItem("");

				// Criar botão
				JButton botao1 = new JButton();
				botao1.setText("Cadastrar");
				botao1.setBounds(580, 435, 94, 20);

				JButton botao2 = new JButton();
				botao2.setText("Voltar");
				botao2.setBounds(470, 435, 94, 20);

				// Adicionar elementos ao formulário
				formulario.add(codigo);
				formulario.add(nome);
				formulario.add(categoria);
				formulario.add(quantidade);
				formulario.add(fornecedor);
				formulario.add(campocodigo);
				formulario.add(camponome);
				formulario.add(opcoescategoria);
				formulario.add(opcoesquantidade);
				formulario.add(opcoesfornecedor);
				formulario.add(botao1);
				formulario.add(botao2);

				botao1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// Exibir notificação
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

						// Limpar o campo de texto
						camponome.setText("");

						// Deixar o cursos selecionado no campo
						camponome.requestFocus();
					}
				});
			}
		});
		btn10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn05.setVisible(false);
				btn06.setVisible(false);
				btn07.setVisible(false);

				// Criar um rótulo
				JLabel codigo = new JLabel();
				codigo.setBounds(120, 135, 150, 20);
				codigo.setText("Código");

				JLabel nome = new JLabel();
				nome.setBounds(280, 135, 150, 20);
				nome.setText("Nome");

				JLabel celular = new JLabel();
				celular.setBounds(120, 160, 150, 20);
				celular.setText("Celular");

				JLabel telefone = new JLabel();
				telefone.setBounds(310, 160, 150, 20);
				telefone.setText("Telefone");

				JLabel cnpj = new JLabel();
				cnpj.setBounds(120, 185, 380, 20);
				cnpj.setText("CNPJ");

				JLabel endereco = new JLabel();
				endereco.setBounds(310, 185, 150, 20);
				endereco.setText("Endereço");

				JLabel cidade = new JLabel();
				cidade.setBounds(120, 210, 150, 20);
				cidade.setText("Cidade");
				
				JLabel bairro= new JLabel();
				bairro.setBounds(340, 210, 150, 20);
				bairro.setText("Bairro");


				// Criar um campo de texto
				JTextField campocodigo = new JTextField();
				campocodigo.setBounds(165, 135, 100, 20);

				JTextField camponome = new JTextField();
				camponome.setBounds(318, 135, 350, 20);
				
				JTextField campocelular = new JTextField();
				campocelular.setBounds(165, 160, 135, 20);
				
				JTextField campotelefone = new JTextField();
				campotelefone.setBounds(365, 160, 135, 20);
				
				JTextField campocnpj = new JTextField();
				campocnpj.setBounds(165, 185, 135, 20);
				
				JTextField campoendereco = new JTextField();
				campoendereco.setBounds(370, 185, 296, 20);
				
				JTextField campocidade = new JTextField();
				campocidade.setBounds(165, 210, 160, 20);
				
				JTextField campobairro = new JTextField();
				campobairro.setBounds(380, 210, 160, 20);

				// Criar botão
				JButton botao1 = new JButton();
				botao1.setText("Cadastrar");
				botao1.setBounds(580, 435, 94, 20);

				JButton botao2 = new JButton();
				botao2.setText("Voltar");
				botao2.setBounds(470, 435, 94, 20);

				// Adicionar elementos ao formulário
				formulario.add(codigo);
				formulario.add(nome);
				formulario.add(celular);
				formulario.add(telefone);
				formulario.add(cnpj);
				formulario.add(endereco);
				formulario.add(cidade);
				formulario.add(bairro);
				formulario.add(campocodigo);
				formulario.add(camponome);
				formulario.add(campocelular);
				formulario.add(campotelefone);
				formulario.add(campocnpj);
				formulario.add(campoendereco);
				formulario.add(campocidade);
				formulario.add(campobairro);
				formulario.add(botao1);
				formulario.add(botao2);

				botao1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// Exibir notificação
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

						// Limpar o campo de texto
						campocodigo.setText("");
						camponome.setText("");
						campocnpj.setText("");
						campotelefone.setText("");
						campocelular.setText("");
						campoendereco.setText("");
						campocidade.setText("");
						campobairro.setText("");

						// Deixar o cursos selecionado no campo
						camponome.requestFocus();
					}
				});
			}
		});
		
		
		// Adicionar elementos ao formulário
		formulario.add(btn01);
		formulario.add(btn02);
		formulario.add(btn03);
		formulario.add(btn04);
		formulario.add(btn05);
		formulario.add(btn06);
		formulario.add(btn07);
		formulario.add(btn08);
		formulario.add(btn09);
		formulario.add(btn10);
		formulario.add(caixa01);
		formulario.add(caixa02);
		formulario.add(caixa03);

		// Exibir componentes
		formulario.setVisible(true);
	}
}