package exerc�cio05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 Implemente um algoritmo onde o usu�rio ir� informar quinze n�meros inteiros. Ap�s informados os
		quinze n�meros informe os seguintes dados:
		
		a. Soma dos n�meros
		
		b. M�dia dos n�meros
		
		c. Quantidade de n�meros maiores ou iguais a m�dia
		
		d. Quantidade de n�meros negativos, neutros e positivos
		
		e. Maior n�mero
		
		f. Menor n�mero
		
		g. N�meros pares
		
		h. N�meros �mpares
		 */
		
		int soma=0, qtdpar = 0, qtdimpar = 0, negativo=0, positivo=0, neutro=0, igualmaior=0;
		
		int[] numero=new int[15];
		Arrays.sort(numero);
		
		for(int i=0; i<15; i++) {
			numero[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"� n�mero"));
		}
		
		//a
			for (int i=0; i<numero.length;i++){			
				soma+= numero[i];
				}	
			
		//b
			int media=(soma/15);
			
		//c
			for (int i1=0; i1<numero.length;i1++){
				if(numero[i1]>=media);
					igualmaior=igualmaior + 1;
			}
		
		//d
			for (int i2=0; i2<numero.length;i2++){	
				if (numero[i2]>0) {
					positivo=positivo + 1;
				
				}else if (numero[i2]==0) {
					neutro = neutro + 1;
				
				}else {
					negativo = negativo +1;
			}}
				
		//e & f
			int maior = numero[0];
			int menor = numero[0];
		
			for(int i=1; i<15; i++) {
				if(numero[i] > maior) {
					maior = numero[i];
			}
				if(numero[i] < menor) {
					menor = numero[i];
			}}		
		
		//g & h
			for (int i4=0; i4<numero.length;i4++){	
				if (numero[i4] % 2 == 0) {
					qtdpar = qtdpar + 1;
				
				}else{
					qtdimpar = qtdimpar + 1;
				}}

					JOptionPane.showMessageDialog(null, "a) Soma dos n�meros: "+soma
														+"\nb) M�dia dos n�meros: "+media
														+"\nc) Quantidade de n�meros maiores ou iguais a m�dia: "+igualmaior
														+"\nd.1) Quantidade de n�meros negativos: "+negativo
														+"\nd.2)Quantidade de n�meros neutros: "+neutro
														+"\nd.3)Quantidade de n�meros positivos: "+positivo
														+"\ne) Maior n�mero: "+maior
														+"\nf) Menor n�mero: "+menor
														+"\ng) N�meros pares: "+qtdpar
														+"\nh) N�meros �mpares"+qtdimpar
														);
}}