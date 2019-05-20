package principal;

import java.util.ArrayList;

import beans.Informacoes;
import formularios.FormularioPrincipal;

public class Principal {
	
	//ArrayList
	public static ArrayList<Informacoes> vetorInformacoes=new ArrayList<Informacoes>();
	
	public static void main(String[] args) {
		FormularioPrincipal frame=new FormularioPrincipal();
		frame.setVisible(true);
	}

}
