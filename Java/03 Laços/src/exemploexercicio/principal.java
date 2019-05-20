package exemploexercicio;

import java.text.DecimalFormat;

public class principal {

	public static void main(String[] args) {

		//dados
		double valor=10000;
		double juros, valorComJuros=0;
		int meses=6;
		
		//formatar casas decimais
		DecimalFormat df=new DecimalFormat("#.00");
		
		//laço
		for(int indice=1; indice<=meses; indice++) {
			
			if(indice==1) {
				juros=valor*0.0037;
				valorComJuros=valor+juros;
			}else {
				juros=valorComJuros*0.0037;
				valorComJuros+=juros;
			}
			System.out.println(df.format(valorComJuros));
			
		}

	}

}
