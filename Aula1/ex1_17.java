/*
 * ex1_17.java
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
public class ex1_17 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		double valorProduto, taxa, desconto, totalLiquido;
		System.out.println("Qual o valor do produto?");
		valorProduto = sc.nextDouble();
		System.out.println("Qual a taxa, em percentagem?");
		taxa = sc.nextDouble();
		System.out.println("Qual o desconto do produto, em percentagem?");
		desconto = sc.nextDouble();
				
		totalLiquido = (valorProduto+(valorProduto*(taxa/100)))-(valorProduto*(desconto/100));
		System.out.printf("O total liquido da fatura -> %.2f",totalLiquido);
	}
}

