package exemplo01;

//Classe= Molde

public class Pessoa {
	
		//Atributos= Caracter�sticas
		String nome;
		double altura, peso;
		
		//M�todos= A��es
		void mensagem() {
			System.out.println("Ol�, meu nome � "+nome);
		}
	
		double imc() {
			return peso/(altura*altura);
			
		}
}
