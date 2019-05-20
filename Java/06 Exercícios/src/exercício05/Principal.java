package exercício05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 Implemente um algoritmo onde o usuário irá informar quinze números inteiros. Após informados os
		quinze números informe os seguintes dados:
		
		a. Soma dos números
		
		b. Média dos números
		
		c. Quantidade de números maiores ou iguais a média
		
		d. Quantidade de números negativos, neutros e positivos
		
		e. Maior número
		
		f. Menor número
		
		g. Números pares
		
		h. Números ímpares
		 */
		
		int soma=0, qtdpar = 0, qtdimpar = 0, negativo=0, positivo=0, neutro=0, igualmaior=0;
		
		int[] numero=new int[15];
		Arrays.sort(numero);
		
		for(int i=0; i<15; i++) {
			numero[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º número"));
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

					JOptionPane.showMessageDialog(null, "a) Soma dos números: "+soma
														+"\nb) Média dos números: "+media
														+"\nc) Quantidade de números maiores ou iguais a média: "+igualmaior
														+"\nd.1) Quantidade de números negativos: "+negativo
														+"\nd.2)Quantidade de números neutros: "+neutro
														+"\nd.3)Quantidade de números positivos: "+positivo
														+"\ne) Maior número: "+maior
														+"\nf) Menor número: "+menor
														+"\ng) Números pares: "+qtdpar
														+"\nh) Números ímpares"+qtdimpar
														);
}}