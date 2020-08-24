/*
 * ex1_14.java
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
public class ex1_14 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double catA,catB,hip,ang;
		System.out.println("Comprimento do catetoA:");
		catA = sc.nextDouble();
		System.out.println("Comprimento do catetoB:");
		catB = sc.nextDouble();
		
		hip = Math.sqrt(Math.pow(catA,2)+Math.pow(catB,2));
		ang = Math.toDegrees(Math.acos(catA/hip));
		
		System.out.printf("O valor da hipotenusa é: %.2f \nO valor do Angulo é: %.2f",hip,ang);
	}
}

