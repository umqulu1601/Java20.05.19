package exemplo06;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		//Array
		
		int[][] numeros=new int[3][3];
		
		//Random
		
		Random gerar=new Random();
		
		//Adicionando dados em cada posi��o
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				numeros[linha][coluna]=gerar.nextInt(10);
		}
	}
		//Exibir estrutura da matriz
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.print(numeros[linha][coluna]+" ");
			}
			System.out.println();
		}

	}

}
