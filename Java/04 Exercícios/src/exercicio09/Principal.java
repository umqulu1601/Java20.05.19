package exercicio09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
			int resultado = 0;
		
		
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1� numero"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2� numero"));
	
			for (int i=n1; i<=n2;) {
			
				if (i==n1) {
					resultado = i;
					JOptionPane.showMessageDialog(null, resultado);
				}
			}
			
			
			
			
			
	}

}
