package exerc�cio03;

import javax.swing.JOptionPane;

public class Principal {

	private static Object msg;

	public static void main(String[] args) {
	
		/*
		 Elabore um algoritmo onde dever�o ser solicitados cinco n�meros distintos. 
		 Ap�s informados os cinco n�meros dever� ser retornado em qual posi��o do 
		 vetor se encontra algum n�mero que seja igual a dez, caso n�o haja nenhum 
		 n�mero dez dever� retornar: N�o foi encontrado nenhum n�mero 10. 
			
			Exemplo 01 			 Exemplo 02 
				5 					9 
				6 					8 
				10 					5 
				3 					2 
				7 					2   
				
				Resposta que o algoritmo dever� fornecer 
		O n�mero 10 est� na posi��o 3 do vetor 
		N�o foi encontrado nenhum n�mero 10 
		 */
		
		//Verificar se h� algum numero 10 informado
		boolean existe10= false;
		
		//Obter os cincos valores
		int[] numeros=new int[5];
		
		for(int i=0; i<5; i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"� n�mero"));
				if(numeros[i]==10) {
					existe10=true;
				}
		}
		
		//Condicional
		if(existe10==false) {
			JOptionPane.showMessageDialog(null, "N�o h� n�mero 10!");
		}else {
			String msg="O n�mero 10 est� no(s) �ndice(s): ";
			for(int i=0; i<5; i++) {
				if(numeros[i]==10) {
					msg+="\n"+(i+1);
				}
			}
		
				
				JOptionPane.showMessageDialog(null, msg);
			}
		}
	}
