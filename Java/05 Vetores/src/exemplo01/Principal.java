package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor ou Array=Vari�vel que engloba v�rios dados
		
		String[] nomes=new String[3];
		
		//Obter os tr�s nomes
		
		nomes[0]=JOptionPane.showInputDialog("1� nome");
		nomes[1]=JOptionPane.showInputDialog("2� nome");
		nomes[2]=JOptionPane.showInputDialog("3� nome");

		//Exibir os tr�s nomes
		JOptionPane.showMessageDialog(null, nomes[0]);
		JOptionPane.showMessageDialog(null, nomes[1]);
		JOptionPane.showMessageDialog(null, nomes[2]);
	}

}
