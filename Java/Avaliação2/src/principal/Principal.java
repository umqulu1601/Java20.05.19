package principal;

import java.util.ArrayList;
import beans.Informacoes;
import formulario.FormularioPrincipal;

public class Principal {
	
	public static ArrayList<Informacoes> vetorInformacoes=new ArrayList<Informacoes>();
	
	public static void main(String[] args) {
		FormularioPrincipal frame=new FormularioPrincipal();
		frame.setVisible(true);
	}

}
