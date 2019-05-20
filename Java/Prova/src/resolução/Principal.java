package resolução;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		
		//Vai ter recuperação??//
		
		
		
		//Validar os dados
		boolean valida = false;
		
		
			
		//Dados das pessoas
		//NOME
		do {
			String nome=JOptionPane.showInputDialog("Nome");
			if(!nome.equals("")) {
				valida = true;
			}
		}while(valida == false);
		
		
		//IDADE
		valida = false;
		do {
			try {
				int idade= Integer.parseInt(JOptionPane.showInputDialog("Idade"));
				valida = true;
			}catch(Exception e) {}
		}while(valida == false);
		
		
		//SEXO - Tenta validar pra garantir os dois pontos ;)
		valida= false;
		do {
			try {
				int sexo=Integer.parseInt(JOptionPane.showInputDialog("1)Masculino 2)Feminino"));
				if ((sexo==2) || (sexo==1)) {
					valida=true;
				}
			}catch(Exception erro) {}
			
		}while(valida == false);
		
		
		//CONTINUA/PARA
		valida=false;
		do {
			try {
				int cp=Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? 1)Continuar 2)Terminar"));
			while(cp != 2);
				
			
			
		
		//DERPARATMENTO,SUBDEPARTAMENTO E PRODUTOS
		
		do {
		
		int departamento=Integer.parseInt(JOptionPane.showInputDialog("\"Departamentos: \n1)Áudio/Vídeo \n2)Informática \n3)Vestuario \n4)Voltar"));
				switch (departamento) {
					case 1:
						int continuar1=Integer.parseInt(JOptionPane.showInputDialog("Subdepartamentos: \n1)Áudio \n2)Vídeo \n3)Voltar"));
						if(continuar1==1) {
							JOptionPane.showInputDialog("\n1) Smart TV Led 49 Samsung - R$ 4.999,99"
														+ "\n2) Smart TV 4k LG 60 - R$7.499,00"
														+ "\n3) Smart TV Full HD 32 Samsung - R$ 1.710,00"
														+ "\n4)Voltar");
						}else if(continuar1==2) {
							JOptionPane.showInputDialog("\n1) Semp Toshiba Áudio Bright - R$ 599,99"
														+ "\n2) Mini System LG - R$ 512,00"
														+ "\n3)Mini System Philco - R$ 499,99 "
														+ "\n4)Voltar");
						}else {
							
						}
					break;
					
					case 2:
						int continuar2=Integer.parseInt(JOptionPane.showInputDialog("Subdepartamentos: \n1)Hardware  \n2)Software \n3)Voltar"));
						if(continuar2==1) {
							JOptionPane.showInputDialog("\n1) Placa Mãe Asus - R$ 2.000,00"
														+ "\n2) Memória Ram Corsair 4GB - R$500,00"
														+ "\n3) Mouse Multilaser - R$59,90"
														+ "\n4)Voltar");
						}else if(continuar2==2) {
							JOptionPane.showInputDialog("\n1) Windows 10  - R$500,00"
														+ "\n2) Office 2019   - R$399,99"
														+ "\n3) AutoCard 3D - R$899,50 "
														+ "\n4)Voltar");
						}else {
						
						}
					break;
					
					case 3:
						int continuar3=Integer.parseInt(JOptionPane.showInputDialog("Subdepartamentos: \n1)Masculino \n2)Feminino \n3)Voltar"));
						if(continuar3==1) {
							JOptionPane.showInputDialog( "\n1) Camisa Social Lacoste - R$ 200,00"
														+ "\n2) Calça Jeans Calvin Klein R$ 230,00"
														+ "\n3) Camisa Social Dudalina - R$ 130,00 "
														+ "\n4)Voltar");
						}else if(continuar3==2) {
							JOptionPane.showInputDialog("\n1) Camisa Social Dudalina - R$170,00"
														+ "\n2) Calça Jeans Miss Masi - R$ 99,90"
														+ "\n3) Bermuda Dijean - R$ 74,40 "
														+ "\n4)Voltar");
						}else {
							
						}
					break;
					
				}
		}while(valida==false)
		
		
		
			
			
			}
		}
	}
}

			
	
	
		
		
		
		
	


