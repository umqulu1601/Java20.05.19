package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Vetor

		String[] nomes = new String[20];
		int[] idades = new int[20];

		// Continuar

		int continuar = 0;

		// Indice

		int indice = 0;

		// Laço

		do {

			// Perguntar nome e idade

			nomes[indice] = JOptionPane.showInputDialog("Informe se nome");
			idades[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));

			// Incrementar o indice

			indice++;

			// Verificar se quer continuar

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while (continuar == 0);

		// Estrutua de exibição

		String exibir = "Usuário cadastrados";

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] != null) {
				exibir += "\nNome: " + nomes[i];
				exibir += "\nIdade: " + idades[i];
				exibir += "\n";
			}
		}
			JOptionPane.showMessageDialog(null, exibir);
	}
}
