package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor
		
		String[] nomes=new String[3];
		
		//Obter os tr�s nomes
		
		for(int i=0; i<3; i++) {
			nomes[i]=JOptionPane.showInputDialog((i+1)+"� nome");
			
		}
		
		//Foreach - Executa cada posi��o do vetor
		
																									/*Op��es do for
																									 for(int)
																									 for(double)
																									 for(int)
																									 */
		for(String elemento:nomes) {
			System.out.println(elemento);
		}
		
		

	}

}
