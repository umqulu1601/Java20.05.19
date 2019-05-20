package exercicio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Variaveis
		
		Object [] cargos = {"Desenvolvedor Java Júnior ", "Desenvolvedor Java Pleno", "Desenvolvedor Jana Sênior ", "Administrador de Banco de Dados ", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
		Object [] sexos = {"Masculino", "Feminino"};
		Object [] clubes = {"SIM", "NÃO"};
		int salario = 450, djj=0, djp=0, djs=0, abd=0,aj=0,  ap=0, as=0 ,arq=0, gp=0, masculino=0, feminino=0, nov=0, mnov=0, mveio=0, mtveio=0, clb=0;
		double msalario=0;
		int continuar=0;
		String nmaior = null;
		
		
		
		//Laço perguntas
		
		do {
			
			String nome = JOptionPane.showInputDialog("Digite seu nome");
			int cargo = JOptionPane.showOptionDialog(null, "Escolha seu cargo", "Cargo", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cargos, 0);
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas normais"));
			int he = Integer.parseInt(JOptionPane.showInputDialog("Total de horas extras trabalhadas durante a semana"));
		    int hef = Integer.parseInt(JOptionPane.showInputDialog("Total de horas extras trabalhdas no final de semana"));
		    int sexo = JOptionPane.showOptionDialog(null, "Qual seu sexo", "Sexo", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexos, 0);
		    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
		    int faltas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de faltas"));
		    int filhos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de filhos"));
		    int clube = JOptionPane.showOptionDialog(null, "É sócio(a) do clube de fidelidade?", "Clube", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, clubes, 0);
		    
		    //Salario liquido com descontos
		    
		    
		    if(salario >= 0 && salario <= 2000 && faltas == 0) {
		    	JOptionPane.showMessageDialog(null, "Salário liquido: "+((salario + (he*15) + (hef*20) - salario*0.89)+(filhos*50)+200));
		    }else if(salario >= 2001 && salario <= 3500 && faltas == 0) {
		    		JOptionPane.showMessageDialog(null, "Salário liquido: "+((salario + (he*15) + (hef*20) - salario*0.87)+(filhos*50)+200));
		    }else if(salario >= 3501 && salario <= 5600 && faltas == 0) {
		    		JOptionPane.showMessageDialog(null, "Salário liquido: "+((salario + (he*15) + (hef*20) - salario*0.86)+(filhos*50)+200));
		    }else if(salario > 5600 && faltas == 0) {
		    		JOptionPane.showMessageDialog(null, "Salário liquido: "+((salario + (he*15) + (hef*20) - salario*0.84)+(filhos*50)+200));
			}else if(salario >= 0 && salario <= 2000 && faltas != 0) {
					JOptionPane.showMessageDialog(null, "Salário liquido: "+(((salario + (he*15) + (hef*20)) - salario*0.84)+filhos*50));		
			}else if(salario >= 2001 && salario <= 3500 && faltas != 0) {
					JOptionPane.showMessageDialog(null, "Salário liquido: "+(((salario + (he*15) + (hef*20)) - salario*0.84)+filhos*50));	
			}else if(salario >= 3500 && salario <= 5600 && faltas != 0) {
					JOptionPane.showMessageDialog(null, "Salário liquido: "+(((salario + (he*15) + (hef*20)) - salario*0.84)+filhos*50));
			}else if(salario > 5600 && faltas != 0) {
			JOptionPane.showMessageDialog(null, "Salário liquido: "+(((salario + (he*15) + (hef*20)) - salario*0.84)+filhos*50));		
			
			}		
		    // Contabilizar cargos		
		   
		    switch (cargo ) {
		    case 0:
		    	djj++;
		    	break;
		    
		    case 1:
		    	djp++;
		    	break;
		    
		    case 2:
		    	djs++;
		    	break;
		    
		    case 3:
		    	abd++;
		    	break;
		    
		    case 4:
		    	aj++;
		    	break;	
		    	
		    case 5:
		    	ap++;
		    	break;	
		    	
		    case 6:
		    	as++;
		    	break;	
		    	
		    case 7:
		    	arq++;
		    	break;	
		    	
		    case 8:
		    	gp++;
		    	break;
		    
		    }
		    // Contabilizar sexos
		    switch (sexo) {
		    case 0:
		    	masculino++;
		    	break;
		    
		    case 1:
		    	feminino++;
		    	break;
		    
		    }
		    
		    
		    //Contabilizar idades
		    
		    if (idade >= 18 && idade <= 26) {
		    	nov++;
		    }else {
		    	if (idade >=27 && idade <= 40) {
		    		mnov++;
		    	}else {
		    		if (idade >= 41 && idade <= 50) {
		    			mveio++;
		    		}else {
		    			if (idade > 51) {
		    				mtveio++;
		    			}
		    		}
		    	}
		    }
		    //Maior salario
		    if (salario > msalario) {
		    	msalario = salario;
		    	nmaior = nome;
		    	
		    }
		    
		    //Se faz parte do clube
		    if (clube==0) {
		    	clb++;
		    }
		   
		    
		//Final do laço   
		    continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar");
		}while (continuar == 0);
		
		//Respostas
		String relatorio = "Numero total de funcionários: "+(djj+djp+djs+abd+aj+ap+as+arq+gp);
			   relatorio+= "\nHomens: "+((masculino * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%" +" ,Mulheres: "+((feminino * 100)/(djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\n";
			   relatorio+= "\nPessoas com idade entre 18 e 26 anos: "+nov;
			   relatorio+= "\nPessoas com idade entre 27 e 40 anos: "+mnov;
			   relatorio+= "\nPessoas com idade entre 41 e 50 anos: "+mveio;
			   relatorio+= "\nPessoas com idade maior que 51 anos: "+mtveio;
			   relatorio+= "\n";
			   relatorio+= "\nDesenvolvedor de java junior: "+djj +", "+((djj * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nDesenvolvedor de java Pleno: "+djp +", "+((djp * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nDesenvolvedor de java Senior: "+djs +", "+((djs * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nAdministrador de Banco de Dados: "+abd +", "+((abd * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nAnalista Junior: "+aj +", "+((aj * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nAnalista Senior: "+ap +", "+((ap * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nAnalista Pleno: "+as +", "+((as * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nArquiteto de software: "+arq +", "+((arq * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\nGerente de projeto: "+gp +", "+((gp * 100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
			   relatorio+= "\n"; 
			   relatorio+= "\nFuncionario com maior salario liquido R$ "+msalario+", "+nmaior; 
			   relatorio+= "\n";
			   relatorio+= "\nNumero de funcionario que aderem ao clube de fidelidade: "+clb+", "+((clb*100) / (djj+djp+djs+abd+aj+ap+as+arq+gp))+"%";
	
			   //Exibir respostas
			   JOptionPane.showMessageDialog(null, relatorio);
			   
			   
	}
			   
			   
	}


