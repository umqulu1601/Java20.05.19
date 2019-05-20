package colaborador;

public class Pessoa {
	
	//Atributos
	private String nomeP, enderecoP;
	private int idadeP;
	
	//Construtor
	public Pessoa(String nomeP, String enderecoP, int idadeP) {
		this.nomeP=nomeP;
		this.enderecoP=enderecoP;
		this.idadeP=idadeP;
		
		exibirDadosPessoa();
	}
	
	//Método para exibir dados pessoais
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nomeP);
		System.out.println("Endereço: "+enderecoP);
		System.out.println("Idade: "+idadeP);
		
	}
}