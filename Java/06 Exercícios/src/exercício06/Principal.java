package exerc�cio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 Desenvolver uma agenda, nessa agenda dever� ter as seguintes a��es: 
		 
		 a. Cadastrar Contato 
		 b. Alterar Contato 
		 c. Excluir Contato 
		 d. Pesquisar 
		 e. Sair 
 
		Especifica��es de cada a��o da agenda: 
		
		a) O cadastro dever� ser pedido: Nome, data de nascimento, estado, cidade, 
		endere�o, telefone, celular e e-mail. Antes de cadastrar valide se o nome 
		informado j� existe na lista de contatos, caso j� cadastrado dever� ser 
		pedido outro nome para cadastrar. sdfg
		 
		b) Pesquisando atrav�s do nome do contato fa�a com que os dados sejam alterados. 
		 
		c) Atrav�s do nome do contato dever� ser exclu�do. 
		 
		d) A pesquisa poder� ser feita atrav�s de nomes, fa�a com que se a pessoa 
		digitar um determinado nome apare�a os dados do contato. 
		 
		e) Sair do sistema.
		 */
		
		
		//Vari�veis
		String nome;
		boolean existe=false;
		int indice=0;
		String[]nomes=new String[10];
		
		//Inicializar o vetor de nomes
		for(int i=0; i<10; i++) {
			nomes[i]="";		
		}
		
		//La�of
		while(indice<10) {
			
			//Iniciar a vari�vel existe
			existe=true;
					
			//Perguntar nome
			nome=JOptionPane.showInputDialog("Informe o "+(indice+1)+"� nome");
					
		
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