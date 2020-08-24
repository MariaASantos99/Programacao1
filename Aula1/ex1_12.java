/*
 * ex1_12.java
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
public class ex1_12 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double seg, horas, minutos, segundos;
		
		System.out.println("Tempo em segundos: ");
		seg = sc.nextDouble();
		
		horas = seg / 60;
		minutos = (seg % 60) / 3600;
		segundos = (seg % 60) % 3600;
		
		System.out.printf("%.0f:%.0f:%.0f",horas,minutos,segundos);
	}
}

