package cargos;

public class Estagiario extends Cargos{
	
	//Construtor
		public Estagiario(String cargo, double salario) {
			this.cargo= cargo;
			this.salario= salario;
		}
	
	//IRRF
		public void iRRF() {
			System.out.println("N�o h� imposto de renda para estagi�rio");	
		}
	}