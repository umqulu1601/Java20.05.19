package exercicio02;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
	
		//Variáveis
		String nome;
		int idade, jogador=0;
		double peso, altura, alturas=0, pesos=0, mh=0, mp=0, mv=0;
		String nmaior = null, nmaiorp = null, nmaiorv = null;
		
		//Laço
		do {
				
				//Perguntas
				nome = JOptionPane.showInputDialog("Informe o nome");
				
			if (!nome.equals("sair")) {
				jogador++;
				
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
			
			
			
			if ( altura > mh) {
		    	mh = altura;
		    	nmaior = nome;
			}
		    
			if (peso > mp) {
		    	mp = peso;
		    	nmaiorp = nome;
		    }
			
		    if (idade > mv ) {
				mv = idade;
				nmaiorv = nome;
			}
				
			
			}
		}while (!nome.equals("sair"));
		
		String resultado = "Quantidade de jogadores: "+jogador;
			   resultado+= "\nNome e altura do maior jogador: "+mh+", "+nmaior;
			   resultado+= "\nNome e idade do jogador mais velho: "+mv+", "+nmaiorv;
			   resultado+= "\nNome e peso do jogador mais pesado: "+mp+", "+nmaiorp;
			   resultado+= "\nMedia de altura: "+mh/jogador;
	
	JOptionPane.showMessageDialog(null, resultado);
	
	}

	}

