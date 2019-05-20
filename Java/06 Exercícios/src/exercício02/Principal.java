package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 Crie um algoritmo onde o usuário irá informar dez números distintos, 
		 após informados deverão ser exibidos os números informados, só que 
		 na ordem contrária. 
		 
			Exemplo: Números informados -> 1, 7, 3, 9, 5, 6, 11, 8, 19, 3 
			
     		O algoritmo deverá retornar     -> 3, 19, 8, 11, 6, 5, 9, 3, 7, 1  
 		 */
		
		int[] numero=new int[10];
		
		for(int i=0; i<10; i++) {
			
		numero[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º numero"));
		}

		
		String exibirNumeros = "";
		for(int i=9; i>=0; i--) {
			exibirNumeros+="\n"+numero[i];
		}
		JOptionPane.showMessageDialog(null, exibirNumeros);
		
			
		}
	}
		
		
		
	

	


