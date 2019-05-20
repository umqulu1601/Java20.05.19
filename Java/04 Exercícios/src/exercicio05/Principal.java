package exercicio05;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/* 
		String produto = JOptionPane.showInputDialog("Informe o nome do seu produto");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto"));
		

		String  finale = "\nSeu produto "+produto;
				finale+= "\n1X "+(valor*0.95)*1;
				finale+= "\n2X "+(valor*0.90)*2;
				finale+= "\n3X "+(valor*0.85)*3;
				finale+= "\n4X "+(valor*0.80)*4;
				finale+= "\n5X "+(valor*0.75)*5;
				finale+= "\n6X "+(valor*0.70)*6;
				finale+= "\n7X "+(valor*0.65)*7;
				finale+= "\n8X "+(valor*0.60)*8;
				finale+= "\n9X "+(valor*0.55)*9;
				finale+= "\n10X "+(valor*0.50)*10;
				
				JOptionPane.showMessageDialog(null, finale);
	*/
	 
		String produto = JOptionPane.showInputDialog("Informe o produto");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Preço do item desejado por vossa magnificencia"));
		double desc = 0.95;
	
		String tabela = "";
		DecimalFormat df = new DecimalFormat("#.00");
		
		for(int i=1; i<11; i++) {
			tabela += "\n"+i+" X "+df.format(valor*desc)+" = "+df.format(valor*desc*i);
			desc-=0.05;
		}
		
		JOptionPane.showMessageDialog(null, tabela);
		
	
		
		
	
	}

}
