package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//Num�ros inteiros
		byte numero1 = 1;   //-128 at� 127
		short numero2 = 30; //-32.768 at� 32.767
		int numero3 = 20;   //-2.147.483.648 at� 2.147.483.647
		long numero4 = 50;  //-9.223.372.036.854.775.808 at� 9.223.372.036.854.808 
		
		//N�meros reais
		float numero5 = 5.8f;  // At� 7 casas decimais
		double numero6 = 7.98; // At� 15 casas decimais
		
		//L�gico
		boolean acao = true; //Pode armazenar TRUE ou FALSE
		
		//Textos
		char letra = 'a'; //Armazenar apenas uma letra
		char ascii = 65;  //Trabalhar com o c�digo da tecla
		String texto = "Aprendendo Java na Proway!";
		
		//Concatenando dados
		System.out.println("A vari�vel do tipo byte � "+numero1);
		System.out.println("A vari�vel do tipo short � "+numero2);
		System.out.println("A vari�vel do tipo int � "+numero3);
		System.out.println("A vari�vel do tipo long � "+numero4);
		System.out.println("A vari�vel do tipo float � "+numero5);
		System.out.println("A vari�vel do tipo double � "+numero6);
		System.out.println("A vari�vel do tipo boolean � "+acao);
		System.out.println("A vari�vel do tipo char � "+letra);
		System.out.println("A vari�vel do tipo char � "+ascii);
		System.out.println("A vari�vel do tipo String � "+texto);
		
		
	}
	
}




