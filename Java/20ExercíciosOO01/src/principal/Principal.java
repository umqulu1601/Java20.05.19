package principal;

import java.awt.EventQueue;
import java.util.ArrayList;

import beans.Jogo;
import formulario.FormularioPrincipal;

public class Principal {

	//ArrayList
	public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
	
	public static void main(String[] args) {
	FormularioPrincipal frame = new FormularioPrincipal();
	frame.setVisible(true);
			
	}
}