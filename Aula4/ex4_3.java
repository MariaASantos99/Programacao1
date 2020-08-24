/*
 * ex4_3.java
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
public class ex4_3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double media, numi,min, num, max=0.0, soma = 0.0;
		int  count=0;
		numi = sc.nextDouble();
		min = numi;
		do{
			count++;
			
			num = sc.nextDouble();
			if (num > max){
				max = num;
			}
			if (num < min ){
				min = num;
			}
			System.out.printf("%.2f\n ",num);
			soma +=num;
		}while(num != numi);
		media = soma/count;
		System.out.printf("Maximo: %.2f\nMinimo: %.2f\nMedia: %.2f\nNumeros introduzidos: %d",max,min,media,count);
		
	}
}

