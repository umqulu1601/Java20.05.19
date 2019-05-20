package acao;

import principal.Principal;

import javax.swing.table.DefaultTableModel;

import beans.Informacoes;

public class acao {
	
	//Cadastrar Colaborador
	public void cadastrar(Informacoes inf) {
		Principal.vetorInformacoes.add(inf);
	}
	
	//Selecionar Cargo
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela=new DefaultTableModel();
		dadosTabela.addColumn("Colaborador");
		dadosTabela.addColumn("Salário Liquído");
	
		return dadosTabela;
		
	}
}