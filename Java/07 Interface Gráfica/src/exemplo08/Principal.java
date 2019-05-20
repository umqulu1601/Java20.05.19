package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um fomrul�rio
		JFrame formulario=new JFrame();
		formulario.setTitle("Meu oitavo formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Campo
		JTextArea campo=new JTextArea();
		
		//Barra de rolagem
		JScrollPane barraRolagem=new JScrollPane(campo);
		barraRolagem.setBounds(10, 10, 470, 250);
		
		//Adicionar ao formulario
		formulario.add(barraRolagem);
		
	
		//Exibir componentes
		formulario.setVisible(true);
		
		
	}

}
