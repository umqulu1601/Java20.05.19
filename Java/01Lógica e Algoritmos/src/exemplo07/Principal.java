package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*
			REGRAS DE SINAIS
			1� Dividir
			2� Multiplicar
			3� Subtrair
			4� Somar
		*/
		
		//Condicional Composta
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double media = (nota1+nota2)/2;
		
		if(media == 10) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� obteve m�dia 10!");
		}else if(media >= 9) {
			JOptionPane.showMessageDialog(null, "�timo com m�dia "+media);
		}else if(media >= 8) {
			JOptionPane.showMessageDialog(null, "Bom com m�dia "+media);
		}else if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Na m�dia com "+media);
		}else if(media >= 5) {
			JOptionPane.showMessageDialog(null, "Em exame com m�dia "+media);
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
	}

}





