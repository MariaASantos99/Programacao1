/*
 * ex1_10.java
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
public class ex1_10 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double tempC, tempF;
		System.out.println("Temperatura em Celsius: ");
		tempC = sc.nextDouble();
		tempF = (1.8*tempC)+32;
		
		System.out.printf("%.2f ºCelsius é equivalente a %.2f ºFahrenheit",tempC, tempF);
	}
}

