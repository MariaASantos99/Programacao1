import java.util.*;
import java.io.*;
public class ex8_1{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Hora inicio;  // tem de definir o novo tipo Hora!
		Hora fim;
    
		inicio = new Hora(9,23,5);
		inicio.h = 9;
		inicio.m = 23;
		inicio.s = 5;
    
		System.out.print("Comecou as ");
		printHora(inicio);  // crie esta função!
		System.out.println(".");
		System.out.println("Quando termina?");
		fim = lerHora();  // crie esta função!
		System.out.print("Inicio: ");
		printHora(inicio);
		System.out.print(" Fim: ");
		printHora(fim);
	}
	static class Hora{
		int h,m,s;
		//~ Construtor
		Hora(int hora,int minuto, int seg){
			this.h = hora;
			this.m = minuto;
			this.s = seg;
		}
	}
	
	static void printHora(Hora ph){
		System.out.printf("%d:%d:%d",ph.h,ph.m,ph.s);
	}
	
	static Hora lerHora(){
		int h,m,s;
		do{
			System.out.println("Hora:");
			h = sc.nextInt();
		}while(h<0 || h>24);
		do{
			System.out.println("Minutos:");
			m = sc.nextInt();
		}while(m<0 || m>60);
		do{
			System.out.println("Segundos:");
			s = sc.nextInt();
		}while(s<0 || s>60);
		
		return new Hora(h,m,s);
	}
}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
