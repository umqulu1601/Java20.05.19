package exemplo10;

public class Principal {

	public static void main(String[] args) {
		
		/*
			Operadores L�gicos
			&& = E
			|| = OU
			!  = N�O
		*/
		
		double valor = 500;
		String segmento = "eletr�nico";
		
		if((valor >= 500) && (segmento.equals("eletr�nico"))) {
			System.out.println("Desconto de 20%, total a pagar R$"+(valor*0.8));
		}else {
			System.out.println("Sem desconto, total a pagar R$"+valor);
		}
		

	}

}







