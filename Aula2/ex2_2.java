/*
 * ex2_2.java
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
public class ex2_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double num1, num2;
		System.out.println("Qual o 1 numero? ");
		num1 = sc.nextDouble();
		System.out.println("Qual o 2 numero? ");
		num2 = sc.nextDouble();
		
		if(num1 > num2){
			System.out.printf("O %.2f e o maior numero", num1);
		}else if(num1 < num2){
			System.out.printf("O %.2f e o maior numero", num2);
		}else{
			System.out.println("O num1 e o num2 sao iguais!");
		}
	}
}

