package atividade03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String verbo;
		String verbo2="";
		
		boolean cont=true;
		do {
			
		verbo=JOptionPane.showInputDialog("Informe um verbo");
		
		if(verbo.endsWith("ar")) {
			cont=false;
		}
		}while (cont==true);
		for (int i=0; i<verbo.length()-2; i++) {
			verbo2+=verbo.charAt(i);
		}
		verbo2=verbo2.toUpperCase();
				
		JOptionPane.showMessageDialog(null, "A conjulga��o do verbo "+verbo.toUpperCase()+" �:"
									+"\n EU "+verbo2+"O"
									+"\n TU "+verbo2+"AS"
									+"\n ELE/ELA "+verbo2+"A"
									+"\n N�S "+verbo2+"AMOS"
									+"\n V�S "+verbo2+"AD�IS"
									+"\n ELES/ ELAS "+verbo2+"AM"
									);
		}
	}