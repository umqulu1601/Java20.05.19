package exercício08;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 uma matriz 5X6 onde o usuário irá informar números inteiros. 
		 Após informados deverá ser exibido:
		 
		 a. Quantidade de Números Pares. 
		 b. Quantidade de Números Ímpares. 
		 c. Média dos Números Informados. 
		 d. Quantidade de Números Maiores ou Iguais a Média. 
		 e. Exibir a matriz 
		 */
		
		
		//Variável
		int qtdimpar=0, qtdpar=0, soma=0, i=0, media=0, igualmaior=0;
		
		int[][] mtz=new int[5][6];
		Arrays.sort(mtz);
		
		//Pergunta
		for(int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				mtz[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Informe os números para a matriz"));
				
				//a & b
		for ( i=0; i<mtz.length;i++){	
			if (mtz[5][6] % 2 == 0) {
				qtdpar = qtdpar + 1;
			
			}else{
				qtdimpar = qtdimpar + 1;
		}
			
			//c
			for ( i=0; i<mtz.length;i++){			
				soma+= mtz[5][6];
				}	
			media=(soma/30);
			
			//d
			for (i=0; i<mtz.length;i++){
				if(mtz[5][6]>=media);
					igualmaior=igualmaior + 1;
			}
			
			//e
			
			/*
			 System.out.println(cursos[0][0]+" - "+cursos[0][1]);
		System.out.println(cursos[1][0]+" - "+cursos[1][1]);
		System.out.println(cursos[2][0]+" - "+cursos[2][1]);
		System.out.println(cursos[3][0]+" - "+cursos[3][1]);
			 */
			
			
			
			
			JOptionPane.showMessageDialog(null, "a) Números pares: "+qtdpar
												+"\nb) Números ímpares"+qtdimpar
												+"\nc) Média dos números: "+media
												+"\nd) Quantidade de números maiores ou iguais a média: "+igualmaior
												+"\ne) Matriz: "
												);
			
		
			
			
			
		}
			}
		}
		
	}
}

