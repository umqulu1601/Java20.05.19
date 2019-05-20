package exemplo01;

public class Carro {
	
	//ENCAPSULAMENTO= Visibilidade de atributos e métodos
		//DEFAULT, atributos e métodos visíveis em todo o pacote
		//PUBLIC, atributos e métodos visíveis em todo o projeto
		//PRIVATE, atributos e métodos apenas no classe onde são criados
		//PROTECTED, atributos e métodos visíveis apenas nos pacotes que
	//são criados ou em classe que são herdadas
	
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
