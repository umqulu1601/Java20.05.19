package exercicio07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		
		boolean continuar = true;
		
		char ch = 'e';
		char che = 's';
		
		
		
		
		do {
			
			String letra = JOptionPane.showInputDialog("Insira uma letra");
			
			if (ch ==  69 || che == 83) {
				JOptionPane.showMessageDialog(null, "Acertou una letrita");
			}
			
			
			}while(continuar == true);
		

	}

}
