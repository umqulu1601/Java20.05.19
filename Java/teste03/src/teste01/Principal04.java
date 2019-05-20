package teste01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal04 {


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
