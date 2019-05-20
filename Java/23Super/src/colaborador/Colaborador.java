package colaborador;

public class Colaborador extends Pessoa{
	
	//Atributos
	private String cargoC;
	private double salarioC;
	
	//Construtor
	public Colaborador (String nomeP, String enderecoP, int idadeP, String cargoC, double salarioC) {
		super(nomeP, enderecoP, idadeP);
		
		this.cargoC= cargoC;
		this.salarioC= salarioC;
		
		exibirDadosColaborador();
	}
	
	//Método para exibir dados do colaborador
	public void exibirDadosColaborador() {
		System.out.println("Cargo "+cargoC);
		System.out.println("Salário "+salarioC);
	}

}
