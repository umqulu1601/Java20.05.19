package pagamento;

public class Debito extends Credito{
	
	//M�todo de tributos
	public void tributos(double valor) {
		System.out.println(valor*0.02);
	}
	
	//M�todo Mensagem
	public void msg() {
		System.out.println("Classe d�bito ativa!");
	}

}
