package exemplo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um fomrul�rio
		JFrame formulario=new JFrame();
		formulario.setTitle("Meu quarto formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criar uma caixa de combina��o
		JComboBox<String>opcoes=new JComboBox<String>();
		opcoes.setBounds(10, 10, 260, 30);
		opcoes.addItem("Op��o 01");
		opcoes.addItem("Op��o 02");
		opcoes.addItem("Op��o 03");
		
		//Bot�o
		JButton botao=new JButton();
		botao.setText("Enviar");
		botao.setBounds(330, 10, 140, 30);
		
		//A��o do bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter a op��o selecionada
				String opcao=opcoes.getSelectedItem().toString();
				
				//Exibir a op��o selecionada
				JOptionPane.showMessageDialog(null, opcao);
				
			}
		});
		
		//Adicionar elementos ao formul�rio
		formulario.add(opcoes);
		formulario.add(botao);
		
		
		//Exibir componentes
		formulario.setVisible(true);
	}

}
