/*
 * ex1_13.java
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
public class ex1_13 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1,x2,y1,y2, dist, distKm,escala;
		escala = 100;
		
		System.out.println("Primeira coordenada da localidade A");
		x1 = sc.nextDouble();
		System.out.println("Segunda coordenada da localidade A");
		y1 = sc.nextDouble();

		System.out.println("Primeira coordenada da localidade B");
		x2 = sc.nextDouble();
		System.out.println("Segunda coordenada da localidade B");
		y2 = sc.nextDouble();

		dist = Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
		distKm = dist*100;
		System.out.printf("Distancia entre a localidade A e localidade B em Km é: %.2f",distKm);
	}
}

