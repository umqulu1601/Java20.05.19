package exercício01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 Aqui fica as listas de exercícios, qualquer coisa é só acessar: \\svprwy001\alunos\ralf 
		 
		 Desenvolva um algoritmo que terá dois vetores, no primeiro vetor serão pedidos dez números, 
		 em seguida serão pedidos mais dez números e armazenados no segundo vetor. Após armazenados 
		 os vetores deverá ser pedido para o usuário informar um cálculo a ser executado, as opções 
		 de cálculo serão: 
		 
		 a) Somar 
		 b) Subtrair 
		 c) Multiplicar 
		 d) Dividir 
		 
		Após informado o tipo de cálculo deverá ser realizado o mesmo com a posição de cada vetor.
		Exemplo: 
		
		Vetor1  Vetor 2 	Tipo de Cálculo 	Resultado 
		10 		1 				Soma 				11 
		20 		2 									22 
		30 		3 									33 
		40 		4 									44 
		50		5 									55 
		60 		6 									66 
		70 		7 									77 
		80 		8 									88 
		90 		9 									99 
		100 	10 									110 
		 */
		
		int[][] numero=new int[10][2];
		for(int i=0;i<10; i++) {
			numero[i][0]=Integer.parseInt(JOptionPane.showInputDialog(i+" "+0));
			numero[i][1]=Integer.parseInt(JOptionPane.showInputDialog(i+" "+1));
		}
		

		String menu="Escolha uma operação:\n1)Somar \n2)Subtrair \n3)Multiplicar \n4)Dividir";		
		

		int opcao=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		String calculo = "O resultado é:\n";
		
		switch(opcao) {
		
			case 1:
				for(int i=0; i<10; i++) {
					calculo+="\n"+numero[i][0]+" + "+numero[i][1]+" = "+(numero[i][0]+numero[i][1]);
				}
			break;
			case 2:
				for(int i=0; i<10; i++) {
					calculo+="\n"+numero[i][0]+" - "+numero[i][1]+" = "+(numero[i][0]-numero[i][1]);
				}
			break;
			case 3:
				for(int i=0; i<10; i++) {
					calculo+="\n"+numero[i][0]+" x "+numero[i][1]+" = "+(numero[i][0]*numero[i][1]);
				}
			break;
			case 4:
				for(int i=0; i<10; i++) {
					calculo+="\n"+numero[i][0]+" / "+numero[i][1]+" = "+(numero[i][0]/numero[i][1]);
				}
			break;
			
			}
		
		JOptionPane.showMessageDialog(null, calculo);
	
	}
		
	}


				


