package atividade02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numeromin = 0, numeromax = 100, continuar = 0, indice = -1;
		double diferenca = 0;
		
		//Gerar
		double gerar = Math.random();
		
		int numero = (int) Math.round(numeromin + gerar * numeromax);
		
		boolean a = true;
		do {
			
			indice++;
			
		//Pergunta
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		diferenca = n - numero;
		
		//Diferenças
		if(diferenca == 0) {
			System.out.println("Você acertou!!!");
			a = false;	
		
		}else if(diferenca <= 10 && diferenca >= -10) {
			System.out.println("Você está perto!");
		}else if(diferenca <= 20 && diferenca >= -20) {
			System.out.println("Você está longe!");
		}else {
			System.out.println("Ihhhhh! Muito longe");
		}
		
		if(a == true) {
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if(continuar != 0) {
			a = false;
		}
		}
		}while(a == true);
				
			if(indice == 0) {
				JOptionPane.showMessageDialog(null, "Você acertou na mosca");
			}else if(indice <= 5) {
				JOptionPane.showMessageDialog(null, "Você é bom de adivinhação");
			}else if(indice <= 10) {
				JOptionPane.showMessageDialog(null, "Muito bom. Continue assim!");
			}else if(indice <= 20) {
				JOptionPane.showMessageDialog(null, "Hm... Podia ser melhor. Continue tentando");
			}else {
				JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");
			}
				
		//Exibir
		JOptionPane.showMessageDialog(null, "Quantidade de tentativas: "+indice);
		
	}

}