/*
 * ex9_1.java
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
public class ex9_1 {
	
	public static void main (String[] args) {
		int M=0, m=0, n=0, v=0, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Analise de uma frase\n");
		System.out.print("Frase de entrada -> ");
		String frase = sc.nextLine();
		for (int i = 0; i < frase.length(); i++){
			char letra = frase.charAt(i);
			if(Character.isLowerCase(letra))m++;
			if(Character.isUpperCase(letra))M++;
			if(Character.isDigit(letra))n++;
			letra = Character.toLowerCase(letra);
			boolean eVogal = isVogal(letra);
			System.out.println(letra+" -> "+eVogal);
			if(eVogal){
				v++;
			}else c++;
		}
		System.out.printf("Numero de carateres minusculos -> %d",m);
		System.out.printf("\nNumero de carateres maiusculas -> %d",M);
		System.out.printf("\nNumero de carateres numericos -> %d",n);
		System.out.printf("\nNumero de vogais -> %d",v);
		System.out.printf("\nNumero de consoantes -> %d",c);
		
	}
	
	static boolean isVogal(char c){
		boolean vogal;
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
			vogal = true;
		}else {
			vogal = false;
		}
		return vogal;
	}
}

