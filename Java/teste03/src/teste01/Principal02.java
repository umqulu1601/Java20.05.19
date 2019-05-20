package teste01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal02 {


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
