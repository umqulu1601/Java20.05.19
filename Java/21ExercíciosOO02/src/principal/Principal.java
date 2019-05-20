package principal;

import java.awt.EventQueue;
import java.util.ArrayList;

import beans.Funcionario;
import formulariosimples.*;

public class Principal {
	
	//ArrayList
			public static ArrayList<Funcionario> vetorFuncionario=new ArrayList<Funcionario>();
			
			//Iniciar o sistema
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					
					public void run() {
						try {
							ListaDeUsuarios frame = new ListaDeUsuarios();
							frame.setVisible(true);
						}catch (Exception e) {
							e.printStackTrace();
						}
					}
				});			
			}
	}