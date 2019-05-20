package cargos;

public class Cargos {
	
	//Atributos
	protected String cargo;
	protected double salario;

	//Vale trnsporte
	public void vT() {
		System.out.println("Cargo: "+cargo+", terá um desconto de Vale Transporte no valor de R$ "+salario*0.06);
		
	}
}