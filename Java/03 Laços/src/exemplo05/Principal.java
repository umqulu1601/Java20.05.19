package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vari�vel de valida��o
		boolean valida = false;
		
		//Obter a idade
		do {
			
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade"));
				valida = true;
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Favor informar um n�mero inteiro");
			}
				
		}while(valida == false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}










