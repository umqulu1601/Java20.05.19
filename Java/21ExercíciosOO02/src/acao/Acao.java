package acao;

import javax.swing.table.DefaultTableModel;
import beans.Funcionario;
import principal.Principal;

public class Acao {
	
	//Cadastrar usuario
		public void cadastrar(Funcionario f) {
			Principal.vetorFuncionario.add(f);		
		}
		//Selecionar Jogos
		public DefaultTableModel selecionar () {
			DefaultTableModel dadosTabela=new DefaultTableModel();
			dadosTabela.addColumn("Nome");
			dadosTabela.addColumn("Usu�rio");
			dadosTabela.addColumn("Senha");
			dadosTabela.addColumn("Tipo de Usu�rio");
			dadosTabela.addColumn("Email");
			
			for(int i=0; i<Principal.vetorFuncionario.size();i++) {
				dadosTabela.addRow(new Object[] {
						Principal.vetorFuncionario.get(i).getNome(),
						Principal.vetorFuncionario.get(i).getUsuario(),
						Principal.vetorFuncionario.get(i).getSenha(),
						Principal.vetorFuncionario.get(i).getTipodeusuario(),
						Principal.vetorFuncionario.get(i).getEmail(),
				});	
			}
			return dadosTabela;
		}
		
		//Excluir Usu�rio
		public void excluir(int indice) {
			Principal.vetorFuncionario.remove(indice);
		}
		
		//Alterar Usu�rio
		public void alterar(int indice, Funcionario f) {
			Principal.vetorFuncionario.set(indice, f);
		}
	}