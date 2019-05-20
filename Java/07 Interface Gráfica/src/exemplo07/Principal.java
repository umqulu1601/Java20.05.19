package exemplo07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		//Criar um fomrul�rio
		JFrame formulario=new JFrame();
		formulario.setTitle("Meu s�timo formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JRadio Button
		JRadioButton rbt01=new JRadioButton("Op��o 01");
		rbt01.setBounds(10, 10, 100, 20);
		rbt01.setActionCommand("Op��o 01 ativada");
		
		JRadioButton rbt02=new JRadioButton("Op��o 01");
		rbt02.setBounds(10, 40, 100, 20);
		rbt02.setActionCommand("Op��o 01 ativada");
		
		JRadioButton rbt03=new JRadioButton("Op��o 01");
		rbt03.setBounds(10, 70, 100, 20);
		rbt03.setActionCommand("Op��o 01 ativada");
		
		//Agrupar JRadio Button
		ButtonGroup bg=new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		//Bot�o
		JButton botao=new JButton("Verificar");
		botao.setBounds(10, 110, 150, 20);
				
		//A��o no bot�o
		botao.addActionListener(new ActionListener() {
					
				@Override
				public void actionPerformed(ActionEvent e) {

					//Obter o comando
					String valor=bg.getSelection().getActionCommand();
		
					//Exibir o valor
					JOptionPane.showMessageDialog(null, valor);
					}
				});
		
		//Adicionar elementos ao formul�rio
		formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);
		formulario.add(botao);
		
		//Exibir componentes
		formulario.setVisible(true);

	}

}
