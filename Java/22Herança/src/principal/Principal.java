package principal;

import cargos.Analista;
import cargos.Desenvolvedor;
import cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {
	
		//Instanciar objetos
		Desenvolvedor d=new Desenvolvedor("Desenvolvedor Jr.", 2000);
		Analista a=new Analista("Analista Pleno", 4000);
		Estagiario e=new Estagiario("Estagiário", 1000);
		
		//VT
		d.vT();
		a.vT();
		e.vT();
		
		//IRRF
		d.iRRF();
		a.iRRF();
		e.iRRF();
	}
}