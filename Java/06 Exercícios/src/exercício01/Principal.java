package exerc�cio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 Aqui fica as listas de exerc�cios, qualquer coisa � s� acessar: \\svprwy001\alunos\ralf 
		 
		 Desenvolva um algoritmo que ter� dois vetores, no primeiro vetor ser�o pedidos dez n�meros, 
		 em seguida ser�o pedidos mais dez n�meros e armazenados no segundo vetor. Ap�s armazenados 
		 os vetores dever� ser pedido para o usu�rio informar um c�lculo a ser executado, as op��es 
		 de c�lculo ser�o: 
		 
		 a) Somar 
		 b) Subtrair 
		 c) Multiplicar 
		 d) Dividir 
		 
		Ap�s informado o tipo de c�lculo dever� ser realizado o mesmo com a posi��o de cada vetor.
		Exemplo: 
		
		Vetor1  Vetor 2 	Tipo de C�lculo 	Resultado 
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
		

		String menu="Escolha uma opera��o:\n1)Somar \n2)Subtrair \n3)Multiplicar \n4)Dividir";		
		

		int opcao=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		String calculo = "O resultado �:\n";
		
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


				


