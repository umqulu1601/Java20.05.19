package teste01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal03 {


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
