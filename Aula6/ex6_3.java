/*
 * ex6_3.java
 * 
 * Copyright 2019 maria <maria@LAPTOP-QRF7J4PR>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;
public class ex6_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int opc;
		do
		{
			System.out.println("1 - Ler uma sequencia de numeros inteiros\n"+
								"2 - Escrever a sequencia\n"+
								"3 - Calcular o maximo da sequencia\n"+
								"4 - Calcular o minimo da sequencia\n"+
								"5 - Calcular a media da sequencia\n"+
								"6 - Detetar se e uma sequencia so constituida por numeros pares\n"+
								"10 - Terminar o programa\n");
			opc = sc.nextInt();
			System.out.printf("OPCAO->%d\n",opc);
			switch (opc)
			{
				case 1:
					double[] seq = new double[10];
					int max = 100, min = 0;
					int dim = lerNum(seq);
					for (int i = 0; i < dim; i++)
					{
						System.out.print(seq[i]+" \n");
					}
					
					break;
				case 2:
					double[] a = new double[10];
					a = gerarNum(0,100);
					for (int i = 0; i < a.length; i++)
					{
						System.out.printf("%.1f\n",a[i]);
					}
				break;
				case 3:
				break;
				case 4:
				break;
				case 5: break;
				case 6: break;
				case 10:
					System.out.println("A sair...");
					break;
				default:
					System.out.println("Opcao invalida");
			}
			
		} while (opc != 10);
	}
	
	static int lerNum(double[] a){
		
		int i=0;
		double n =-1;
		do
		{
			System.out.printf("Numero: ");
			n=sc.nextDouble();
			a[i++]=n;
		} while (n !=0 && i<a.length);
		return i;
	}
	
	static double[] gerarNum(int min, int max){
		double[] a = new double[10];
		int range = (max-min)+1, i=0;
		double num;
		do{
			num = (Math.random()*range)+1;
			a[i++]=num;
		} while (num !=0 && i <a.length);
		return a;
			
	}
}

