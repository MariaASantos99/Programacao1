/*
 * ex2_4.java
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
public class ex2_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int mes,ano;
		System.out.println("Qual o mes:");
		mes = sc.nextInt();
		System.out.println("Qual o ano:");
		ano = sc.nextInt();
		
		switch(mes){
			case 2:
				if(((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)){
					System.out.printf("O mes %d do ano %d tem 29 dias", mes, ano);
				}else{
					System.out.printf("O mes %d do ano %d tem 28 dias", mes, ano);
				}
			break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf("O mes %d do ano %d tem 31 dias", mes, ano);
			break;
			case 4: case 6: case 9: case 11: 
				System.out.printf("O mes %d do ano %d tem 30 dias", mes, ano);
			break;
			default:
				System.out.printf("O mes %d introduzido nao e valido!", mes);
			break;
		}
	}
}

