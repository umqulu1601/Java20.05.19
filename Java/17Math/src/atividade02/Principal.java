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
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
		diferenca = n - numero;
		
		//Diferen�as
		if(diferenca == 0) {
			System.out.println("Voc� acertou!!!");
			a = false;	
		
		}else if(diferenca <= 10 && diferenca >= -10) {
			System.out.println("Voc� est� perto!");
		}else if(diferenca <= 20 && diferenca >= -20) {
			System.out.println("Voc� est� longe!");
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
				JOptionPane.showMessageDialog(null, "Voc� acertou na mosca");
			}else if(indice <= 5) {
				JOptionPane.showMessageDialog(null, "Voc� � bom de adivinha��o");
			}else if(indice <= 10) {
				JOptionPane.showMessageDialog(null, "Muito bom. Continue assim!");
			}else if(indice <= 20) {
				JOptionPane.showMessageDialog(null, "Hm... Podia ser melhor. Continue tentando");
			}else {
				JOptionPane.showMessageDialog(null, "Meio lerdo voc�, hein?");
			}
				
		//Exibir
		JOptionPane.showMessageDialog(null, "Quantidade de tentativas: "+indice);
		
	}

}