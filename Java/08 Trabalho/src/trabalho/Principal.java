package trabalho;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Sistema para Loja de Inform�tica
		
		//Apresenta��o
		JOptionPane.showMessageDialog(null, "Bem-Vindo a \nOusadia e Alegria!");
		
		//Formul�rio
		JFrame formulario=new JFrame();
		formulario.setTitle("Ousadia e Alegria");
		formulario.setSize(2000, 1000);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);

	
	}

}
