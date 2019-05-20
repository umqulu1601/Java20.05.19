package acao;

import javax.swing.table.DefaultTableModel;

import beans.Informacoes;
import principal.Principal;

public class acao {
	
	public void adicidonar(Informacoes q) {
		Principal.vetorInformacoes.add(q);
		
		DefaultTableModel lista =  new DefaultTableModel();
		lista.addColumn("Arroz");
		lista.addColumn("Feij�o");
		lista.addColumn("Farinha");
		lista.addColumn("A��car");
		lista.addColumn("�leo");
		lista.addColumn("Sal");
		lista.addColumn("Milho");
		lista.addColumn("Ervilha");
		
		for(int i=0; i<Principal.vetorInformacoes.size(); i++) {
			lista.addRow(new Object[] {
					Principal.vetorInformacoes.get(i).getArroz(),
					Principal.vetorInformacoes.get(i).getFeijao(),
					Principal.vetorInformacoes.get(i).getFarinha(),
					Principal.vetorInformacoes.get(i).getAcucar(),
					Principal.vetorInformacoes.get(i).getOleo(),
					Principal.vetorInformacoes.get(i).getSal(),
					Principal.vetorInformacoes.get(i).getMilho(),
					Principal.vetorInformacoes.get(i).getErvilha(),
			});
		}
	}

}
