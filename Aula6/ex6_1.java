/*
 * ex6_1.java
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
public class ex6_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int N = lerNumero("Quantos numeros a introduzir");
		int[]num = new int[N];
		for (int i = 0; i < num.length; i++)
		{
			int n = lerNumero("Numero: ");
			System.out.println(i);
			num[i] = n;
		}
		
		for (int i = num.length-1; i >=0; i--)
		{
			System.out.print(num[i]+" ");
		}
		
		
	}
	
	static int lerNumero(String mensagem){
		System.out.println(mensagem);
		int n = sc.nextInt();
		return n;
	}
}

