package exemplo01;

public class Produto {

	//Atributo
			static private int contador=0;
	
	//Construtos
			public Produto() {
		contador ++;
		System.out.println(contador);
	}
}
