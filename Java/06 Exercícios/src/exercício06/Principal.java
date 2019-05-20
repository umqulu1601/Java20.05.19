package exercício06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 Desenvolver uma agenda, nessa agenda deverá ter as seguintes ações: 
		 
		 a. Cadastrar Contato 
		 b. Alterar Contato 
		 c. Excluir Contato 
		 d. Pesquisar 
		 e. Sair 
 
		Especificações de cada ação da agenda: 
		
		a) O cadastro deverá ser pedido: Nome, data de nascimento, estado, cidade, 
		endereço, telefone, celular e e-mail. Antes de cadastrar valide se o nome 
		informado já existe na lista de contatos, caso já cadastrado deverá ser 
		pedido outro nome para cadastrar. sdfg
		 
		b) Pesquisando através do nome do contato faça com que os dados sejam alterados. 
		 
		c) Através do nome do contato deverá ser excluído. 
		 
		d) A pesquisa poderá ser feita através de nomes, faça com que se a pessoa 
		digitar um determinado nome apareça os dados do contato. 
		 
		e) Sair do sistema.
		 */
		
		
		//Variáveis
		String nome;
		boolean existe=false;
		int indice=0;
		String[]nomes=new String[10];
		
		//Inicializar o vetor de nomes
		for(int i=0; i<10; i++) {
			nomes[i]="";		
		}
		
		//Laçof
		while(indice<10) {
			
			//Iniciar a variável existe
			existe=true;
					
			//Perguntar nome
			nome=JOptionPane.showInputDialog("Informe o "+(indice+1)+"º nome");
					
		
			//Verificar se o nome existe no vetor
			for(int i=0; i<10; i++) {
				if(nomes[i].equals(nome)) {
					existe=true;
				}
				
			//Condicional
				if(existe==false) {
					nomes[indice]=nome;
					indice++;
					
				}
			}
		}
	}
}