package acao;


import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import principal.Principal;

public class acao {

	//Cadastrar jogo
	public void cadastrar(Jogo j) {
		Principal.vetorJogos.add(j);
	}
	
		//Selecionar jogos
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela =  new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("G�nero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classifica��o");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {
				Principal.vetorJogos.get(i).getNome(),
				Principal.vetorJogos.get(i).getGenero(),
				Principal.vetorJogos.get(i).getPlataforma(),
				Principal.vetorJogos.get(i).getClassificacao(),
				Principal.vetorJogos.get(i).getValor(),	
			});
		}
		return dadosTabela;
	}
		
	//Excluir o Jogo
	public void excluir(int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar jogo
	public void alterar(int indice,Jogo j) {
		
		Principal.vetorJogos.set(indice, j);
	}
	
	public void verificar(Jogo j) {
		
		for(int i=0; i<10; i++) {
		}
	}
}