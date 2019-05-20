package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object [] codigos = {"1", "2", "3", "4", "5", "6", "7"};		
		int continuar=0, quantidade1=0, quantidade2=0, quantidade3=0, quantidade4=0, quantidade5=0, quantidade6=0, quantidade7=0, continua=0;
		int quantidade;
		
		
		
		do {
		
		int codigo = JOptionPane.showOptionDialog(null, "Insira o codigo do produto", "Padaria carrinho irado hot wilson 2003", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, codigos, 0);
		int quantidades = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do produto"));

		switch  (codigo) {
		case 0:
			quantidade1++;
			break;
		
		case 1:
			quantidade2++;
			break;
		
		case 2:
			quantidade3++;
			break;
			
		
		case 3:
			quantidade4++;
			break;
			
		case 4:
			quantidade5++;
			break;
			
		case 5:
			quantidade6++;
			break;
		
		case 6:
			quantidade7++;
			break;
		}
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar");
		}while (continuar == 0);

	
		double resultado = ((quantidade1*5)+(+quantidade2*4.50)+(+quantidade3*8)+(+quantidade4*12)+(+quantidade5*16.50)+(+quantidade6*1)+(+quantidade7*2.50));
			
		JOptionPane.showMessageDialog(null, resultado);
		
		double dinheiro =0;
		
		do {
			
		dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Insira o pagamento"));
		
		}while (dinheiro < resultado); 
	
		JOptionPane.showMessageDialog(null, "Seu troco será de: "+(dinheiro-resultado));
		
		
		}
		
	}
		
		

		
		
	
	
	
	
	
	


