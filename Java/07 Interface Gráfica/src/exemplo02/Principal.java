package exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formul�rio
		
				JFrame formulario=new JFrame();
				formulario.setTitle("Meu segundo formul�rio");
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setVisible(true);
				
		//Bot�o
				
				JButton botao=new JButton();
				botao.setText("Enviar");
				//botao.setSize(100, 30);
				botao.setBounds(180, 200, 100, 30);
				
				//A��o do bot�o
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Ol�!");
						
					}
				});
				
		//Adcionar botao no formul�rio
				formulario.add(botao);
				

	}

}
