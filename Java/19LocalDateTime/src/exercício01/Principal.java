package exercício01;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
	
		LocalDateTime t=LocalDateTime.now();
		
		int segundo=t.getSecond();
		String segundotex="";
		int minuto=t.getMinute();
		String minutotex="";
		int hora=t.getHour();
		String horatex="";
		int dia=t.getDayOfMonth();
		String diatex="";
		int mes=t.getMonthValue();
		String mestex="";
		int ano=t.getYear();
		String anotex="";
		
		if(dia==1) {
			 diatex+= "um";
		}else if(dia==2) {
			diatex+= "dois";
		}else if(dia==3) {
			diatex+= "três";
		}else if(dia==4) {
			diatex+= "quatro";
		}else if(dia==5) {
			diatex+= "cinco";
		}else if(dia==6) {
			diatex+= "seis";
		}else if(dia==7) {
			diatex+= "sete";
		}else if(dia==8) { 
			diatex+= "oito";
		}else if(dia==9) {
			diatex+= "nove";
		}else if(dia==10) {
			diatex+= "dez";
		}else if(dia==11) {
			diatex+= "onze";
		}else if(dia==12) {
			diatex+= "doze";
		}else if(dia==13) {
			diatex+= "treze";
		}else if(dia==14) {
			diatex+= "quatorze";
		}else if(dia==15) {
			diatex+= "quinze";
		}else if(dia==16) {
			diatex+= "dezesseis";
		}else if(dia==17) {
			diatex+= "dezessete";
		}else if(dia==18) {
			diatex+= "dezoito";
		}else if(dia==19) {
			diatex+="dezenove";
		}else if(dia==20) {
			diatex+= "vinte";
		}else if(dia==21) {
			diatex+= "vinte e um";
		}else if(dia==22) {
			diatex+= "vinte e dois";
		}else if(dia==23) {
			diatex+= "vinte e três";
		}else if(dia==24) {
			diatex+= "vinte e quatro";
		}else if(dia==25) {
			diatex+= "vinte e cinco";
		}else if(dia==26) {
			diatex+= "vinte e seis";
		}else if(dia==27) {
			diatex+= "vinte e sete";
		}else if(dia==28) {
			diatex+= "vinte e oito";
		}else if(dia==29) {
			diatex+= "vinte e nove";
		}else if(dia==30) {
			diatex+= "trinta";
		}else if(dia==31) {
			diatex+= "trinta e um";
		}
		if(mes==1) {
			 mestex+= "janeiro";
		}else if(mes==2) {
			mestex+= "fevereiro";
		}else if(mes==3) {
			mestex+= "março";
		}else if(mes==4) {
			mestex+= "abril";
		}else if(mes==5) {
			mestex+= "maio";
		}else if(mes==6) {
			mestex+= "junho";
		}else if(mes==7) {
			mestex+= "julho";
		}else if(mes==8) {
			mestex+= "agosto";
		}else if(mes==9) {
			mestex+= "setembro";
		}else if(mes==10) {
			mestex+= "outubro";
		}else if(mes==11) {
			mestex+= "novembro";
		}else if(mes==12) {
			mestex+= "dezembro";
		}
		if(ano==2019) {
			 anotex+= "dois mil e dezenove";
		}else if(ano==2020) {
			anotex+= "dois mil e vinte";
		}else if(ano==2021) {
			anotex+= "dois mil e vinte e um";
		}else if(ano==2022) {
			anotex+= "dois mil e vinte e dois";
		}else if(ano==2023) {
			anotex+= "dois mil e vinte e três";
		}
		if(hora==1) {
			 horatex+= "uma hora";
		}else if(hora==2) {
			horatex+= "duas horas";
		}else if(hora==3) {
			horatex+= "três horas";
		}else if(hora==4) {
			horatex+= "quatro horas";
		}else if(hora==5) {
			horatex+= "cinco horas";
		}else if(hora==6) {
			horatex+= "seis horas";
		}else if(hora==7) {
			horatex+= "sete horas";
		}else if(hora==8) {
			horatex+= "oito horas";
		}else if(hora==9) {
			horatex+= "nove horas";
		}else if(hora==10) {
			horatex+= "dez horas";
		}else if(hora==11) {
			horatex+= "onze horas";
		}else if(hora==12) {
			horatex+= "doze horas";
		}else if(hora==13) {
			horatex+= "treze horas";
		}else if(hora==14) {
			horatex+= "quatorze horas";
		}else if(hora==15) {
			horatex+= "quinze horas";
		}else if(hora==16) {
			horatex+= "dezesseis horas";
		}else if(hora==17) {
			horatex+= "dezessete horas";
		}else if(hora==18) {
			horatex+= "dezoito horas";
		}else if(hora==19) {
			horatex+= "dezenove horas";
		}else if(hora==20) {
			horatex+= "vinte horas";
		}else if(hora==21) {
			horatex+= "vinte e um horas";
		}else if(hora==22) {
			horatex+= "vinte e dois horas";
		}else if(hora==23) {
			horatex+= "vinte e três horas";
		}else if(hora==24) {
			horatex+= "vinte e quatro horas";
		}
		if(minuto==1) {
			minutotex+= "um minuto";
		}else if(minuto==2) {
			minutotex+= "dois minutos";
		}else if(minuto==3) {
			minutotex+= "três minutos";
		}else if(minuto==4) {
			minutotex+= "quatro minutos";
		}else if(minuto==5) {
			minutotex+= "cinco minutos";
		}else if(minuto==6) {
			minutotex+= "seis minutos";
		}else if(minuto==7) {
			minutotex+= "sete minutos";
		}else if(minuto==8) {
			minutotex+= "oito minutos";
		}else if(minuto==9) {
			minutotex+= "nove minutos";
		}else if(minuto==10) {
			minutotex+= "dez minutos";
		}else if(minuto==11) {
			minutotex+= "onze minutos";
		}else if(minuto==12) {
			minutotex+= "doze minutos";
		}else if(minuto==13) {
			minutotex+= "treze minutos";
		}else if(minuto==14) {
			minutotex+= "quartoze minutos";
		}else if(minuto==15) {
			minutotex+= "quinze minutos";
		}else if(minuto==16) {
			minutotex+= "dezesseis minutos";
		}else if(minuto==17) {
			minutotex+= "dezessete minutos";
		}else if(minuto==18) {
			minutotex+= "dezoito minutos";
		}else if(minuto==19) {
			minutotex+= "dezenove minutos";
		}else if(minuto==20) {
			minutotex+= "vinte minutos";
		}else if(minuto==21) {
			minutotex+= "vinte e um minutos";
		}else if(minuto==22) {
			minutotex+= "vinte e dois minutos";
		}else if(minuto==23) {
			minutotex+= "vinte e três minutos";
		}else if(minuto==24) {
			minutotex+= "vinte e quatro minutos";
		}else if(minuto==25) {
			minutotex+= "vinte e cinco minutos";
		}else if(minuto==26) {
			minutotex+= "vinte e seis minutos";
		}else if(minuto==27) {
			minutotex+= "vinte e sete minutos";
		}else if(minuto==28) {
			minutotex+= "vinte e oito minutos";
		}else if(minuto==29) {
			minutotex+= "vinte e nove minutos";
		}else if(minuto==30) {
			minutotex+= "trinta minutos";
		}else if(minuto==31) {
			minutotex+= "trinta e um minutos";
		}else if(minuto==32) {
			minutotex+= "trinta e dois minutos";
		}else if(minuto==33) {
			minutotex+= "trinta e três minutos";
		}else if(minuto==34) {
			minutotex+= "trinta e quatro minutos";
		}else if(minuto==35) {
			minutotex+= "trinta e cinco minutos";
		}else if(minuto==36) {
			minutotex+= "trinta e seis minutos";
		}else if(minuto==37) {
			minutotex+= "trinta e sete minutos";
		}else if(minuto==38) {
			minutotex+= "trinta e oito minutos";
		}else if(minuto==39) {
			minutotex+= "trinta e nove minutos";
		}else if(minuto==40) {
			minutotex+= "quarenta minutos";
		}else if(minuto==41) {
			minutotex+= "quarenta e um minutos";
		}else if(minuto==42) {
			minutotex+= "quarenta e dois minutos";
		}else if(minuto==43) {
			minutotex+= "quarenta e três minutos";
		}else if(minuto==44) {
			minutotex+= "quarenta e quatro minutos";
		}else if(minuto==45) {
			minutotex+= "quarenta e cinco minutos";
		}else if(minuto==46) {
			minutotex+= "quarenta e seis minutos";
		}else if(minuto==47) {
			minutotex+= "quarenta e sete minutos";
		}else if(minuto==48) {
			minutotex+= "quarenta e oito minutos";
		}else if(minuto==49) {
			minutotex+= "quarenta e nove minutos";
		}else if(minuto==50) {
			minutotex+= "cinquenta minutos";
		}else if(minuto==51) {
			minutotex+= "cinquenta e um minutos";
		}else if(minuto==52) {
			minutotex+= "cinquenta e dois minutos";
		}else if(minuto==53) {
			minutotex+= "cinquenta e três minutos";
		}else if(minuto==54) {
			minutotex+= "cinquenta e quatro minutos";
		}else if(minuto==55) {
			minutotex+= "cinquenta e cinco minutos";
		}else if(minuto==56) {
			minutotex+= "cinquenta e seis minutos";
		}else if(minuto==57) {
			minutotex+= "cinquenta e sete minutos";
		}else if(minuto==58) {
			minutotex+= "cinquenta e oito minutos";
		}else if(minuto==59) {
			minutotex+= "cinquenta e nove minutos";
		}		
		if(segundo==1) {
			segundotex+= "um segundo";
		}else if(segundo==2) {
			segundotex+= "dois segundos";
		}else if(segundo==3) {
			segundotex+= "três segundos";
		}else if(segundo==4) {
			segundotex+= "quatro segundos";
		}else if(segundo==5) {
			segundotex+= "cinco segundos";
		}else if(segundo==6) {
			segundotex+= "seis segundos";
		}else if(segundo==7) {
			segundotex+= "sete segundos";
		}else if(segundo==8) {
			segundotex+= "oito segundos";
		}else if(segundo==9) {
			segundotex+= "nove segundos";
		}else if(segundo==10) {
			segundotex+= "dez segundos";
		}else if(segundo==11) {
			segundotex+= "onze segundos";
		}else if(segundo==12) {
			segundotex+= "doze segundos";
		}else if(segundo==13) {
			segundotex+= "treze segundos";
		}else if(segundo==14) {
			segundotex+= "quatorze segundos";
		}else if(segundo==15) {
			segundotex+= "quinze segundos";
		}else if(segundo==16) {
			segundotex+= "dezesseis segundos";
		}else if(segundo==17) {
			segundotex+= "dezessete segundos";
		}else if(segundo==18) {
			segundotex+= "dezoito segundos";
		}else if(segundo==19) {
			segundotex+= "dezenove segundos";
		}else if(segundo==20) {
			segundotex+= "vinte segundos";
		}else if(segundo==21) {
			segundotex+= "vinte e um segundos";
		}else if(segundo==22) {
			segundotex+= "vinte e dois segundos";
		}else if(segundo==23) {
			segundotex+= "vinte e três segundos";
		}else if(segundo==24) {
			segundotex+= "vinte e quatro segundos";
		}else if(segundo==25) {
			segundotex+= "vinte e cinco segundos";
		}else if(segundo==26) {
			segundotex+= "vinte e seis segundos";
		}else if(segundo==27) {
			segundotex+= "vinte e sete segundos";
		}else if(segundo==28) {
			segundotex+= "vinte e oito segundos";
		}else if(segundo==29) {
			segundotex+= "vinte e nove segundos";
		}else if(segundo==30) {
			segundotex+= "trinta segundos";
		}else if(segundo==31) {
			segundotex+= "trinta e um segundos";
		}else if(segundo==32) {
			segundotex+= "trinta e dois segundos";
		}else if(segundo==33) {
			segundotex+= "trinta e três segundos";
		}else if(segundo==34) {
			segundotex+= "trinta e quatro segundos";
		}else if(segundo==35) {
			segundotex+= "trinta e cinco segundos";
		}else if(segundo==36) {
			segundotex+= "trinta e seis segundos";
		}else if(segundo==37) {
			segundotex+= "trinta e sete segundos";
		}else if(segundo==38) {
			segundotex+= "trinta e oito segundos";
		}else if(segundo==39) {
			segundotex+= "trinta e nove segundos";
		}else if(segundo==40) {
			segundotex+= "quarenta segundos";
		}else if(segundo==41) {
			segundotex+= "quarenta e um segundos";
		}else if(segundo==42) {
			segundotex+= "quarenta e dois segundos";
		}else if(segundo==43) {
			segundotex+= "quarenta e três segundos";
		}else if(segundo==44) {
			segundotex+= "quarenta e quatro segundos";
		}else if(segundo==45) {
			segundotex+= "quarenta e cinco segundos";
		}else if(segundo==46) {
			segundotex+= "quarenta e seis segundos";
		}else if(segundo==47) {
			segundotex+= "quarenta e sete segundos";
		}else if(segundo==48) {
			segundotex+= "quarenta e oito segundos";
		}else if(segundo==49) {
			segundotex+= "quarenta e novo segundos";
		}else if(segundo==50) {
			segundotex+= "cinquenta segundos";
		}else if(segundo==51) {
			segundotex+= "cinquenta e um segundos";
		}else if(segundo==52) {
			segundotex+= "cinquenta e dois segundos";
		}else if(segundo==53) {
			segundotex+= "cinquenta e três segundos";
		}else if(segundo==54) {
			segundotex+= "cinquenta e quatro segundos";
		}else if(segundo==55) {
			segundotex+= "cinquenta e cinco segundos";
		}else if(segundo==56) {
			segundotex+= "cinquenta e seis segundos";
		}else if(segundo==57) {
			segundotex+= "cinquenta e sete segundos";
		}else if(segundo==58) {
			segundotex+= "cinquenta e oito segundos";
		}else if(segundo==59) {
			segundotex+= "cinquenta e nove segundos";
		}
		JOptionPane.showMessageDialog(null, +hora+":"+minuto+":"+segundo
							+"\n"+dia+"/"+mes+"/"+ano
							+"\nHoje é dia "+diatex+" de "+mestex+" de "+anotex+"."
							+"\nA hora atual é "+horatex+" e "+minutotex+" e "+segundotex+".");
	}
}