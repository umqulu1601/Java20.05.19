package exemplo06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Criar um fomrul�rio
				JFrame formulario=new JFrame();
				formulario.setTitle("Meu sexto formul�rio");
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//JChecbox
				JCheckBox ckb01=new JCheckBox("Op��o 01");
				ckb01.setBounds(10, 10, 100, 20);
				
				JCheckBox ckb02=new JCheckBox("Op��o 02");
				ckb02.setBounds(10, 40, 100, 20);
				
				JCheckBox ckb03=new JCheckBox("Op��o 03");
				ckb03.setBounds(10, 70, 100, 20);
				
				//Bot�o
				JButton botao=new JButton("Verificar op��o ativas");
				botao.setBounds(10, 110, 200, 30);
				
				//A��o no bot�o
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						if(ckb01.isSelected()) {
							JOptionPane.showMessageDialog(null, "Primeira op��o selecionada");
						}
						if(ckb02.isSelected()) {
							JOptionPane.showMessageDialog(null, "Segunda op��o selecionada");
						}
						if(ckb03.isSelected()) {
							JOptionPane.showMessageDialog(null, "Terceira op��o selecionada");
						}
					}
				});
				
				//Adicionar componentes ao formul�rio
				formulario.add(ckb01);
				formulario.add(ckb02);
				formulario.add(ckb03);
				formulario.add(botao);
				
				//Exibir componentes
				formulario.setVisible(true);

	}

}
