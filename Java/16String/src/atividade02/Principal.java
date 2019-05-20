package atividade02;

import javax.swing.JOptionPane;

public class Principal {

		public static void main(String[] args) {
			
			String frase;
			String frase2="";
			int letra = 0;
			
			frase = JOptionPane.showInputDialog("Informe uma frase");

			for(int i=0 ;i < frase.length(); i++) {
				frase2+=String.valueOf(frase.charAt(i)).toLowerCase();
				if(frase2.charAt(i) == 'a' || frase2.charAt(i) == 'e' || frase2.charAt(i) == 'i' || frase2.charAt(i) == 'o' || frase2.charAt(i) == 'u') {
					letra++;
				}			
			}
			JOptionPane.showMessageDialog(null, "Total de vogais: "+letra);
		}
}
