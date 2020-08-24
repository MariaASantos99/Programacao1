/*
 * ex2_5.java
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
public class ex2_5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int x1, x2, x3, x4, y1, y2, y3, y4;
		double lado1, lado2, lado3, lado4, diag1, diag2;
		System.out.println("Coordenadas do ponto 1(x1,y1): ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Coordenadas do ponto 2(x2,y2): ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		System.out.println("Coordenadas do ponto 3(x3,y3): ");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		System.out.println("Coordenadas do ponto 4(x4,y4): ");
		x4 = sc.nextInt();
		y4 = sc.nextInt();
		
		lado1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		lado2 = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
		lado3 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
		lado4 = Math.sqrt(Math.pow(x1-x4,2)+Math.pow(y1-y4,2));
		
		diag1 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
		diag2 = Math.sqrt(Math.pow(x4-x2,2)+Math.pow(y4-y2,2));
		
		if(lado1 == lado2 && lado2==lado3 && lado3==lado4 && diag1==diag2){
			System.out.println("Trata-se de uma figura geometrica com a forma de um quadrado");
		}else{
			System.out.println("Nao se trata de uma figura geometrica com a forma de umm quadrado");
		}
	}
}

