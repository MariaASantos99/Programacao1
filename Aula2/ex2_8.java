/*
 * ex2_8.java
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
public class ex2_8 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int num1,num2,num3;
		System.out.println("Digite o numero 1:");
		num1 = sc.nextInt();
		System.out.println("Digite o numero 2:");
		num2 = sc.nextInt();
		System.out.println("Digite o numero 3:");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3){
			if(num2>num3){
				System.out.printf("Ordem crescente: %d<%d<%d",num3,num2,num1);
			}else{
				System.out.printf("Ordem crescente: %d<%d<%d",num2,num3,num1);
			}			
		}else if(num2>num1 && num2>num3){
			if(num1>num3){
				System.out.printf("Ordem crescente: %d<%d<%d",num3,num1,num2);
			}else{
				System.out.printf("Ordem crescente: %d<%d<%d",num1,num3,num2);
			}
		}else if(num3>num1 && num3>num2){
			if(num1>num2){
				System.out.printf("Ordem crescente: %d<%d<%d",num2,num1,num3);
			}else{
				System.out.printf("Ordem crescente: %d<%d<%d",num1,num2,num3);
			}
		}else{
			System.out.printf("%d = %d = %d", num1,num2,num3);
		}
	}
}

