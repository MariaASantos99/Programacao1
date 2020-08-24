/*
 * ex1_15.java
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
public class ex1_15 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double tp1,tp2,api,ep,notaFinal;
		System.out.println("Nota da TP1: ");
		tp1 = sc.nextDouble();
		System.out.println("Nota da TP2: ");
		tp2 = sc.nextDouble();
		System.out.println("Nota da API: ");
		api = sc.nextDouble();
		System.out.println("Nota da EP: ");
		ep = sc.nextDouble();
		
		notaFinal = (tp1*0.15)+(tp2*0.15)+(api*0.3)+(ep*0.4);
		
		System.out.printf("A nota final do aluno -> %.2f",notaFinal );
		
	}
}

