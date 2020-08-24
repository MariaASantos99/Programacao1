/*
 * ex9_2.java
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
public class ex9_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.println("Digite a frase!");
		String frase = sc.nextLine();
		int tamanho=0;
		for (int i = 0; i < frase.length(); i++){
			char letra = frase.charAt(i);
			boolean M =Character.isUpperCase(letra);
			if(M){
				tamanho++;
			}
		}
		char[] acronimo = new char[tamanho];
		int j=0;
		for (int i = 0; i < frase.length(); i++){
			char letra = frase.charAt(i);
			boolean M =Character.isUpperCase(letra);
			if(M){
				
				acronimo[j++]=letra;
			}
		}
		for (int i = 0; i < acronimo.length; i++)
		{
			System.out.print(acronimo[i]);
		}
		
	}
	
}

