package exemplo04;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor de números
		
		int[] numeros= {};
		
		//Bubble Sort-Método da bolha
		
		/*
		 Arrays.sort(numeros);
		 */
		
		int maiorNumero;
		for(int i1=0; i1<4; i1++) {
			
			for(int i2=i1+1; i2<5; i2++) {
				/*
				 if(numeros[i2]>numeros[i2]{ - forma decrescente
				 */
				if(numeros[i2]<numeros[i1]) {
					maiorNumero=numeros[i1];
					numeros[i1]=numeros[i2];
					numeros[i2]=maiorNumero;
					
				}
			}
		}
		
		//Ebir valores
		
		for(int n:numeros) {
			System.out.println(n);
			
			
			
			
		}
		

	}

}
