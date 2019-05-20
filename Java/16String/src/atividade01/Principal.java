package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String palavra;
		
		palavra=JOptionPane.showInputDialog("Informe uma palavra ou frase");
		
		String palavran= " ";
		
		for(int i=0; i<palavra.length(); i++) {
			if(i%2==0) {
				
				palavran+=String.valueOf(palavra.charAt(i)).toUpperCase();
			}else {
				palavran+=String.valueOf(palavra.charAt(i)).toLowerCase();
			}
		}
		JOptionPane.showMessageDialog(null, palavran);
	}
}
