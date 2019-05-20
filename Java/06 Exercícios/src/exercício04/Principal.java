package exerc�cio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		/*
		 Criar um algoritmo para cria��o de provas. De imediato ser� pedido o gabarito da 
		 prova que ser� composta por dez quest�es, as respostas de cada quest�o poder�o ser 
		 A, B, C e D, se por ventura for digitado algum termo diferente dessas quatro letras 
		 dever� ser pedido novamente a quest�o. 
 
		Assim que o gabarito estiver dispon�vel informe o nome de um aluno, enquanto o nome 
		desse aluno for diferente de SAIR dever� ser pedido o nome e as dez quest�es respondidas 
		pelo aluno (valide as quest�es caso n�o sejam informados A, B, C, D). Assim que obter 
		as dez respostas do aluno informe quantas ele acertou e quantas errou (apenas quantidade). 
		 
		Quando digitado SAIR dever� informar o nome e a quantidade de acertos de cada aluno, 
		fa�a com que a ordem seja da maior quantidade de acertos at� a menor. 
		 */

		
		//Vetor
		
		String[]gabarito= {"A", "A", "A", "A", "A", "A", "A", "A", "A", "A"};
				
		//Alunos
		String nome;
		String[] nomes=new String[10];
		String[] respostas=new String[10];
		int[]acertos=new int[10];
		int[]erros=new int[10];
		int indice=0;
					
		//La�o
		nome=JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
		
		while(!nome.equals("sair")) {
			
			//Atribuir o nome do aluno no vetor
			
			nomes[indice]=nome;
			
			//Respostas do aluno
			
			for(int i=0; i<10; i++) {
				respostas[indice]=JOptionPane.showInputDialog((i+1)+"� resposta");
			}
			
			//Contagem
			
			for(int i=0; i<10; i++) {
				if(gabarito[i].equals(respostas[i])) {
					acertos[indice]++;
				}else {
					erros[indice]++;
				}
			}
			
			//Incrementar o indice
			
			indice++;
			
			//Nome
			
			nome=JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
		}
		
		//Exibir dados
		
		for(int i=0; i<10; i++) {
			if(nomes[i]!=null) {
			System.out.println(nomes[i]+" "+acertos[i]+" "+erros[i]);
		
				}
			}
		}
		
	}


