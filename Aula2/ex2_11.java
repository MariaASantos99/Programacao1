/*
 * ex2_11.java
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
public class ex2_11 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double a,b,c, delta, sol1,sol2;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		delta = Math.pow(b,2)-4*a*c;
		if(delta > 0){
			sol1 = ((-b)+Math.sqrt(delta))/2*a;
			sol2 = ((-b)-Math.sqrt(delta))/2*a;
			System.out.printf("A equacao tem duas solucoes iguais a -> %.2f e %.2f",sol1,sol2);
		}else if(delta == 0){
			sol1 = (-b)/2*a;
			System.out.printf("A equacao tem apenas uma solucao igual a -> %.2f",sol1);
		}else{
			System.out.println("Não tem solucoes reais!");
		}
	}
}

