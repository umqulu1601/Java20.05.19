package exerc�cio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 Crie um algoritmo onde o usu�rio ir� informar dez n�meros distintos, 
		 ap�s informados dever�o ser exibidos os n�meros informados, s� que 
		 na ordem contr�ria. 
		 
			Exemplo: N�meros informados -> 1, 7, 3, 9, 5, 6, 11, 8, 19, 3 
			
     		O algoritmo dever� retornar     -> 3, 19, 8, 11, 6, 5, 9, 3, 7, 1  
 		 */
		
		int[] numero=new int[10];
		
		for(int i=0; i<10; i++) {
			
		numero[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"� numero"));
		}

		
		String exibirNumeros = "";
		for(int i=9; i>=0; i--) {
			exibirNumeros+="\n"+numero[i];
		}
		JOptionPane.showMessageDialog(null, exibirNumeros);
		
			
		}
	}
		
		
		
	

	


