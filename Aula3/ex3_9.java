/*
 * ex3_9.java
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
public class ex3_9 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int N, soma = 0;
		do{
			N = sc.nextInt();
		}while(N > 1000);
		for (int i = 1; i <= N; i++)
		{
			System.out.println(2*i);
			soma += 2*i; 
		}
		System.out.println(soma);
	}
}

