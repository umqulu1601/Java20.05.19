package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Array
		
		String[][] produtos= {
								{"Caderno","5"},
								{"L�pis","1.50"},
								{"Mochila","89.90"},
								{"Caneta","2.45"},
								{"Apontador","0.50"},
							};
		
		//Menu
		
		String menu="Escolha uma op��o:\n";
		
		int i=0;
		
		for(i=0; i<produtos.length; i++) {
			menu+="\n"+(i+1)+") "+produtos[i][0];
		}
		menu+="\n"+(i+1)+") Sair";
		
		//Vari�veis
		
		int op�ao=0;
		int quantidade=0;
		double total=0;
		
		//La�o
		
		do {
			op�ao=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op�ao !=6) {
			quantidade=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
			}
			
			switch(op�ao) {
				case 1:
					total+=quantidade*Double.parseDouble(produtos[0][1]);
				break;
				
				case 2:
					total+=quantidade*Double.parseDouble(produtos[1][1]);
				break;

				case 3:
					total+=quantidade*Double.parseDouble(produtos[2][1]);
				break;

				case 4:
					total+=quantidade*Double.parseDouble(produtos[3][1]);
				break;
				
				case 5:
					total+=quantidade*Double.parseDouble(produtos[4][1]);
				break;
			}
			
		}while(op�ao !=6);
		
		//Exibir o total da compra
		
		JOptionPane.showMessageDialog(null, "Total a pagar R$"+total);
		
		

	}

}
