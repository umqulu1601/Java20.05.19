package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object [] sexo = {"Masculino", "Feminino"};
		Object [] cargo = {"Gerente", "Atendente", "Açogueiro","Secretário","Almoxarife", "Padeiro", "Estagiario"};
		int ima = 0;
		int ime = 0;
		int continuar = 0;
		int masculino=0, feminino=0;
		int gerente=0, atendente=0, açogueiro=0, secretario=0, almoxarife=0, padeiro=0, estagiario=0;
		
		
		do {
			
			String nome = JOptionPane.showInputDialog("Insira o nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));
			int sexos = JOptionPane.showOptionDialog(null, "Qual seu sexo", "Vai butijão", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE,null, sexo, 0);
			int cargos = JOptionPane.showOptionDialog(null, "Qual teu trabson parceiro", "Profissão", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargo, 0);
			
			
			
		switch (sexos) {
			case 0:
			masculino++;
			break;
		
			case 1:
			feminino++;
			break;
		}
		switch (cargos) {
			case 0:
				gerente++;
				break;
			case 1:
				atendente++;
				break;
			case 2:
				açogueiro++;
				break;
			case 3:
				secretario++;
				break;
			case 4:
				almoxarife++;
				break;
			case 5:
				padeiro++;
				break;
			case 6:
				estagiario++;
				break;
				
				
		}
		
		if (idade >= 18) {
			ima++;
		}else {
			ime++;
		}
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while (continuar == 0);
		
		String resultados = "\nPessoas do sexo masculino: "+masculino;
			   resultados+= "\nPessoas do sexo feminino: "+feminino;
			   
		String profissao = "\nGerentes: "+gerente;
			   profissao+= "\nAtendentes: "+atendente;
			   profissao+= "\nAçogueiros: "+açogueiro;
			   profissao+= "\nSecretários: "+secretario;
			   profissao+= "\nAlmoxarifes: "+almoxarife;
			   profissao+= "\nPadeiros: "+padeiro;
			   profissao+= "\nEstagiários: "+estagiario;
			   
		String idades = "\nMaior de idade: "+ima;
			   idades+= "\nMenor de idade: "+ime;
			   
		JOptionPane.showMessageDialog(null, resultados);
		JOptionPane.showMessageDialog(null, profissao);
		JOptionPane.showMessageDialog(null, idades);
		
		
	}

}
