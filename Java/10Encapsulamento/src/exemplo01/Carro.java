package exemplo01;

public class Carro {
	
	//ENCAPSULAMENTO= Visibilidade de atributos e m�todos
		//DEFAULT, atributos e m�todos vis�veis em todo o pacote
		//PUBLIC, atributos e m�todos vis�veis em todo o projeto
		//PRIVATE, atributos e m�todos apenas no classe onde s�o criados
		//PROTECTED, atributos e m�todos vis�veis apenas nos pacotes que
	//s�o criados ou em classe que s�o herdadas
	
	//DEFAULT
		String modelo1;
		
	//PUBLIC
		public String modelo2;
		
	//PRIVATE
		private String modelo3;
		
	//PROTECTED
		protected String modelo4;
		
	//Atributos
		private String modelo, fabricante;
		private int ano;
		
		//Set & Get
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		

}
