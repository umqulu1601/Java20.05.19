package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor
		
		String[] nomes=new String[3];
		
		//Obter os três nomes
		
		for(int i=0; i<3; i++) {
			nomes[i]=JOptionPane.showInputDialog((i+1)+"º nome");
			
		}
		
		//Foreach - Executa cada posição do vetor
		
																									/*Opções do for
																									 for(int)
																									 for(double)
																									 for(int)
																									 */
		for(String elemento:nomes) {
			System.out.println(elemento);
		}
		
		

	}

}
