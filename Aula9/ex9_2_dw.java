/*
 * ex9_2_dw.java
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
public class ex9_2_dw {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		String frase = criaFrase();
		boolean existe = exitFrase(frase);
		int dim=0;
		char[] acr;
		while(existe!= false){
			dim=line(frase);
			acr = acronimo(frase,dim);
			imprimir(acr);
			frase = criaFrase();
			existe = exitFrase(frase);
		} 
	}

	static int line(String frase){
		int tamanho=0;
		boolean M;
		for(int i=0; i<frase.length(); i++){
			char letra = frase.charAt(i);
			M = Character.isUpperCase(letra);
			if (M)tamanho++;
		}
		return tamanho;
	}
	
	static String criaFrase(){
		System.out.println("Digite a frase");
		String frase = sc.nextLine();
		return frase;
	}
	
	static boolean exitFrase(String frase){
		boolean exit;
		if(frase.equals(""))exit=false;
		else exit=true;
		return exit;
	}

	static char[] acronimo(String frase, int tamanho){
		char[] acr = new char[tamanho];
		boolean M;
		int j=0;
		for(int i=0; i<frase.length(); i++){
			char letra = frase.charAt(i);
			M = Character.isUpperCase(letra);
			if(M)acr[j++]=letra;
		}
		return acr;
	}

	static void imprimir(char[] acr){
		for (int i = 0; i < acr.length; i++)System.out.print(acr[i]);
		System.out.println();
	}
}

