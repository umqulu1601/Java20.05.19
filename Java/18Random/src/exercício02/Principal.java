package exercício02;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		//Gerar os números
		Random gerar=new Random();
		int g=gerar.nextInt(9);
					
		//Local dos simbolos
		String[][] simbolo= {
				{"*"},
				{"*"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","*"}};
		
		//Resultado
		System.out.println(simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]
				+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]
				+"\n"+simbolo[1][0]+simbolo[1][1]+simbolo[1][2]+simbolo[1][3]+simbolo[1][4]+simbolo[1][5]+simbolo[1][6]+simbolo[1][7]+simbolo[1][8]+simbolo[1][9]+simbolo[1][10]+simbolo[1][11]+simbolo[1][12]+simbolo[1][13]+simbolo[1][14]+simbolo[1][15]
				+simbolo[1][16]+simbolo[1][17]+simbolo[1][18]+simbolo[1][19]+simbolo[1][20]+simbolo[1][21]+simbolo[1][22]+simbolo[1][23]+simbolo[1][24]+simbolo[1][25]+simbolo[1][26]+simbolo[1][27]+simbolo[1][28]+simbolo[1][29]
				+"\n"+simbolo[1][0]+simbolo[1][1]+simbolo[1][2]+simbolo[1][3]+simbolo[1][4]+simbolo[1][5]+simbolo[1][6]+simbolo[1][7]+simbolo[1][8]+simbolo[1][9]+simbolo[1][10]+simbolo[1][11]+simbolo[1][12]+simbolo[1][13]+g+simbolo[1][15]
				+simbolo[1][16]+simbolo[1][17]+simbolo[1][18]+simbolo[1][19]+simbolo[1][20]+simbolo[1][21]+simbolo[1][22]+simbolo[1][23]+simbolo[1][24]+simbolo[1][25]+simbolo[1][26]+simbolo[1][27]+simbolo[1][28]+simbolo[1][29]
				+"\n"+simbolo[1][0]+simbolo[1][1]+simbolo[1][2]+simbolo[1][3]+simbolo[1][4]+simbolo[1][5]+simbolo[1][6]+simbolo[1][7]+simbolo[1][8]+simbolo[1][9]+simbolo[1][10]+simbolo[1][11]+simbolo[1][12]+simbolo[1][13]+simbolo[1][14]+simbolo[1][15]
				+simbolo[1][16]+simbolo[1][17]+simbolo[1][18]+simbolo[1][19]+simbolo[1][20]+simbolo[1][21]+simbolo[1][22]+simbolo[1][23]+simbolo[1][24]+simbolo[1][25]+simbolo[1][26]+simbolo[1][27]+simbolo[1][28]+simbolo[1][29]
				+"\n"+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]
				+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]+simbolo[0][0]);
	}
}