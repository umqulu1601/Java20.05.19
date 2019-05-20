package paraprova;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		//Variaveis
		Object[] Objectos = {"Objecto1", "Objetcto2"};
		int Objecto = JOptionPane.showOptionDialog(null, "Mensagem", "Titulo", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, Objectos, 0);
		boolean continuar = true;
		double mpeso=0;
		String mnomep=null;
		double peso,idade,altura;
		String nome;
		
		//int continuar = 0;		
		
		//Do while
		
		
		do {
			
			//PERGUNTAS
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira seu numero"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));
			idade = Double.parseDouble(JOptionPane.showInputDialog("Insira sua idade"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso"));
			nome = JOptionPane.showInputDialog("Insira seu nome");
			
			
		


			if (numero == 0) {
				continuar = false;
			}
				
		//WHILE (continuar = 0); //TERMINAR O BOOLEAN
			}while (continuar = true);
		
		//SE NOME = SAIR ==     if (!nome.equals("sair")); 	     depois de do
		//CONTABILIZAR     jogadores++;	
		
		//while (!nome.equals("sair"))); no while
		
		
		//CONTABILIZAR JOGADORES
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
				//jogador++;
		
		//PEGAR MAIOR ALTURA/ALTURA/PESO/SALARIO/MAIOR NOME
		if (peso > mpeso) {
			mpeso = peso;
			mnomep = nome;		
		}
		
		//MEDIA ALTURA
		//mediaaltura+=altura
		
		//SWITCH
		 
		switch (Objecto) {
		case 0:
		JOptionPane.showMessageDialog(null, "Escolheu objecto1");
		break;
		}
		
		//OBJETO DENTRO DE OBJETO
		Object [] estados = {"SC", "PR"};
		Object [] cidades1 = {"BNU", "GASPAR"};
		Object [] cidades2 = {"C1","C2"};
	
		int estado = JOptionPane.showOptionDialog(null, "Insira seu estado", "Estado", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		int cidade;
		
		switch (estado) {
		case 0:
		cidade = JOptionPane.showOptionDialog(null, "Insira seu estado", "Estado", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidades1, 0);
				
		switch(cidade) {
		case 0:
			JOptionPane.showMessageDialog(null, "População de Blumenau: 334 002 habitantes com IDH de 0,806 e sua principal festa é a Oktoberfest.");
		break;
		}
		
		switch(cidade) {
		case 1:
			JOptionPane.showMessageDialog(null, "População de Gaspar: 334 002 habitantes com IDH de 0,806 e sua principal festa é a Oktoberfest.");
		break;	
		}
		
		switch (estado) {
		case 1:
		cidade = JOptionPane.showOptionDialog(null, "Informe o estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidades2, 0);
			
			switch (cidade) {
			case 0:
			JOptionPane.showMessageDialog(null, "C1");
			break;
			}
				
			switch (cidade) {
			case 1:
			JOptionPane.showMessageDialog(null, "C2");
			break;
			}
		
		}
		}
	

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		long resultado = 0;
		
		//FOR
			for(int i = numero; i > 1; i--) {
			
			if(i == numero) {
				resultado = i * (i-1);
				System.out.println(i+" X "+(i-1)+" = "+resultado);
			}else {
				System.out.println(resultado+" X "+(i-1)+" = "+resultado*(i-1));
				resultado = resultado*(i-1);
			}
			// int i = 0 começo / i <= 9 parada / decrementa ou incrementa
			
			
			}
			
	}
}

	


