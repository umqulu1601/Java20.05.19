package principal;

import java.util.ArrayList;
import java.util.LinkedList;
//import com.sun.tools.javac.util.List;
import pagamento.Credito;
import pagamento.Debito;

public class Principal {

	public static void main(String[] args) {
		
		//Poli > V�rias/Muitas
		//Morphus > Formas
		
		//Objeto
		Debito d=new Debito();
		d.tributos(1000);
		d.msg();
		
		Credito c=new Credito();
		c.tributos(1000);
		c.msg();
		
		/*Exemplo de Polimorfismo da classe Java.util
		List<String> nomes= new ArrayList<String>();
		List<String> cidade=new LinkedList<String>();*/
	}
}