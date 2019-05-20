package exercicio08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		long resultado = 0;
		
		
		for(int i = numero; i > 1; i--) {
			
			if(i == numero) {
				resultado = i * (i-1);
				System.out.println(i+" X "+(i-1)+" = "+resultado);
			}else {
				System.out.println(resultado+" X "+(i-1)+" = "+resultado*(i-1));
				resultado = resultado*(i-1);
			}
			
			
		}
		
		
		
	}

}
