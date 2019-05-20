package exercicio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		//Variaveis
		Object [] sexos = {"Masculino", "Feminino"};
		String nome;
		int msc=0, fmn=0, bom=0, ot=0, parb=0, satis=0, rec=0, rep=0,nomes=0;
		
		//Laço
		do {
			
			nome = JOptionPane.showInputDialog("Insira seu nome");
			
			if (!nome.equals("sair")) {
				nomes++;
			
					
			
			int sexo = JOptionPane.showOptionDialog(null, "Informe seu sexo", "Sex", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua primeira nota"));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua segunda nota"));
			double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua teceira nota"));
			double n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua quarta nota"));
			
			
			//Calculo media
			double media = (n1+n2+n3+n4)/4;
			
			
			//Contabilizar sexo
			switch (sexo) {
			case 0:
				msc++;
				break;
			case 1:
				fmn++;
				break;
			}
			
			//Contabilizar medias
			
			if (media == 10) {
				parb++;
			}else if (media >= 9.0 && media <= 9.9) {
				ot++;
			}else if (media >= 8.0 && media <= 8.9) {
				bom++;
			}else if (media >= 7  && media <= 7.9) {
				satis++;
			}else if (media >= 5 && media <= 6.9) {
				rec++;
			}else if (media < 5) {
				rep++;
			}
			
			//Mostrar media
			JOptionPane.showMessageDialog(null, media);
			}	
		//Final do laço	
		}while (!nome.equals("sair"));

		
		
		//Respostas
		String resultado = "% de homens: "+((100/(fmn+msc))*msc)+" %";
			   resultado+= "\n% de mulheres: "+((100/(fmn+msc))*fmn)+" %";
			   resultado+= "\n";
			   resultado+= "\nAlunos com media 10, Parabens! "+parb+"     "+((100/(parb+ot+bom+satis+rec+rep))*parb)+"%";
			   resultado+= "\nAlunos com media entre 9 e 9.9, Otimo! "+ot+"     "+((100/(parb+ot+bom+satis+rec+rep))*ot)+"%";
			   resultado+= "\nAlunos com media entre 8 e 8.9, Bom! "+bom+"     "+((100/(parb+ot+bom+satis+rec+rep))*bom)+"%";
			   resultado+= "\nAlunos com media entre 7 e 7.9, Satisfátorio! "+satis+"     "+((100/(parb+ot+bom+satis+rec+rep))*satis)+"%";
			   resultado+= "\nAluno com media entre 5 e 6.9, Recuperação!"+rec+"     "+((100/(parb+ot+bom+satis+rec+rep))*rec)+"%";
			   resultado+= "\nAlunos com media menor que 5, Reprovado!"+rep+"    "+((100/(parb+ot+bom+satis+rec+rep))*rep)+"%";
	
			   
			   JOptionPane.showMessageDialog(null, resultado);
			   
	}

}
