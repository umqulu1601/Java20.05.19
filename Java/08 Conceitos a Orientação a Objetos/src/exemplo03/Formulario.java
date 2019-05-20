package exemplo03;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {

	//Método para exibir um JFrame
			void formulario () {
		JFrame f= new JFrame();
		f.setSize(500, 300);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(painel1());
		f.setVisible(true);
	}
	
	//Método para JPanel
			JPanel painel1() {
		JPanel p=new JPanel();
		p.setBounds(10, 60, 464, 180);
		p.setBackground(Color.DARK_GRAY);
		
		int indice=0;
		JButton btn= new JButton();
		for(int i=0; i<3; i++) {
			btn =new JButton();
			btn.setBounds(i*80,  10, 50, 20);
			btn.setText("Botão"+(i+1));
			p.add(btn);
			
		}
		return p;
			
			}
			
}
