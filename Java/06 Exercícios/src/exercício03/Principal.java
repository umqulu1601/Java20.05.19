package exercício03;

import javax.swing.JOptionPane;

public class Principal {

	private static Object msg;

	public static void main(String[] args) {
	
		/*
		 Elabore um algoritmo onde deverão ser solicitados cinco números distintos. 
		 Após informados os cinco números deverá ser retornado em qual posição do 
		 vetor se encontra algum número que seja igual a dez, caso não haja nenhum 
		 número dez deverá retornar: Não foi encontrado nenhum número 10. 
			
			Exemplo 01 			 Exemplo 02 
				5 					9 
				6 					8 
				10 					5 
				3 					2 
				7 					2   
				
				Resposta que o algoritmo deverá fornecer 
		O número 10 está na posição 3 do vetor 
		Não foi encontrado nenhum número 10 
		 */
		
		//Verificar se há algum numero 10 informado
		boolean existe10= false;
		
		//Obter os cincos valores
		int[] numeros=new int[5];
		
		for(int i=0; i<5; i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º número"));
				if(numeros[i]==10) {
					existe10=true;
				}
		}
		
		//Condicional
		if(existe10==false) {
			JOptionPane.showMessageDialog(null, "Não há número 10!");
		}else {
			String msg="O número 10 está no(s) índice(s): ";
			for(int i=0; i<5; i++) {
				if(numeros[i]==10) {
					msg+="\n"+(i+1);
				}
			}
		
				
				JOptionPane.showMessageDialog(null, msg);
			}
		}
	}
