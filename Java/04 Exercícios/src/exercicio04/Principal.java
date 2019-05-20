package exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object [] notas = {"Excelente", "Ótimo", "Bom", "Regular", "Ruim"};
		int continuar=0, ex=0, ot=0, bom=0, re=0, rui=0, crianca=0, ado=0, adulto=0, continua = 0;
		int votos = (ex + ot + bom + re + rui);
		
		
		do {
			int nota = JOptionPane.showOptionDialog(null, "Insira a nota", "Cineminha 2045 futurista 8D com aguinha de brinde na compra de uma pipocona mil grau", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, notas, 0);
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Diga sua idade: "));
			
			switch (nota ) {
			case 0:
				ex++;
			break;
			
			case 1:
				ot++;
				break;
			
			case 2:
				bom++;
				break;
			
			case 3:
				re++;
				break;
			
			case 4:
				rui++;
				break;
			}
			
			
			if (idade >= 0 && idade <= 9) {
					crianca++;
				}else {
					if (idade >= 10 && idade <= 17) {
						ado++;
					}else {
						if (idade > 17) {
							adulto++;
						}
							
						
					}
					
				
				}
			
			do {
				if (idade < 0 || idade > 100)
				JOptionPane.showMessageDialog(null, "O PAI É NÃO É BOBO");
				
				continua = JOptionPane.showConfirmDialog(null, "Loading ......");
			}while (continua != 0);
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		}while (continuar == 0);
		
		String total = "Excelente: "+(100/(ex+ot+bom+re+rui))*ex+"%";
			   total+= "\nÓtimo: "+(100/(ex+ot+bom+re+rui))*ot+"%";
			   total+= "\nBom: "+(100/(ex+ot+bom+re+rui))*bom+"%";
			   total+= "\nRegular: "+(100/(ex+ot+bom+re+rui))*re+"%";
			   total+= "\nRuim: "+(100/(ex+ot+bom+re+rui))*rui+"%";
			   total+= "\n";
			   total+= "\nTotal de crianças: "+crianca;
			   total+= "\nTotal de adolescentes: "+ado;
			   total+= "\nTotal de adultos: "+adulto;
			
		JOptionPane.showMessageDialog(null, total);
		
	}

}
