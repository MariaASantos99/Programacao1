/*
 * ex1_9.java
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
public class ex1_9 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado, comprimento, p, a;
		System.out.println("Medida do lado: ");
		lado = sc.nextDouble();
		System.out.println("Medida do comprimento: ");
		comprimento = sc.nextDouble();
		
		p = (lado+comprimento)*2;
		a = lado*comprimento;
		
		System.out.printf("Perimetro: %.2f \n",p);
		System.out.printf("Area: %.2f",a);
		
	}
}

