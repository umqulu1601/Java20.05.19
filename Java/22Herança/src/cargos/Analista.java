package cargos;

public class Analista extends Cargos{
	
	//Construtor
		public Analista(String cargo, double salario) {
			this.cargo= cargo;
			this.salario= salario;
		}

	//IRRF
		public void iRRF() {
			System.out.println(cargo+" ter� que pagar R$ "+salario*0.20+" de IRRF");
		}
	}