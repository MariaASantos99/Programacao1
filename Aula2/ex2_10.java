/*
 * ex2_10.java
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
public class ex2_10 { 
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int dia, mes, ano, dA, dS, mesS, mesA,anoA, anoS;
		dia = sc.nextInt();
		mes = sc.nextInt();
		ano = sc.nextInt();
		dA = 0; dS = 0; mesS =0; anoS =0; anoA = 0; 
		switch(mes){
			case 1: 
				if(dia < 31 && dia !=1){
					dA = dia-1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mes,ano); 
				}else if (dia == 31){
					dA = dia-1;
					dS = 1;
					mesS = mes+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,ano,dA,mes,ano);
				}else if(dia==1){
					dA = 31;
					mesA = 12;
					anoA = ano-1;
					dS = 1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,anoA);
				}else{
					System.out.printf("O dia %d introduzido nao e valido!",dia);
				}
			break;
			case 2:
				if(dia == 1){
					dA = 31;
					mesA = 1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,ano);
					break;
				}
				if( dia < 29 && dia < 28 && dia != 1){
					dA = dia-1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mes,ano); 
				}else if(((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)){
					if(dia == 29){
						dA = dia-1;
						dS = 1;
						mesS = mes+1;
						System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,ano,dA,mes,ano);
					}else{
						System.out.printf("O dia %d introduzido nao e valido!",dia);
					}
				}else{
					if(dia == 28){
						dA = dia-1;
						dS = 1;
						mesS = mes+1;
						System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,ano,dA,mes,ano);
					}else{
						System.out.printf("O dia %d introduzido nao e valido!",dia);
					}
				}
			break;
			case 3: 
				if(dia < 31 && dia!= 1){
					dA = dia-1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mes,ano); 
				}else if (dia == 31){
					dA = dia-1;
					dS = 1;
					mesS = mes+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,ano,dA,mes,ano);
				}else if(dia == 1){
					if(((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)){
						dA = 29;
						mesA = mes-1;
						dS = 1;
						System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,ano);
					}else{
						dA = 28;
						mesA = mes-1;
						dS = 1;
						System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,ano);
					}
				}else{
					System.out.printf("O dia %d introduzido nao e valido!",dia);
				}
			break;
			case 5: case 7: case 8: case 10:
				if(dia < 31 && dia != 1){
					dA = dia-1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mes,ano); 
				}else if (dia == 31){
					dA = dia-1;
					dS = 1;
					mesS = mes+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,ano,dA,mes,ano);
				}else if(dia == 1){
					dA = 30;
					mesA = mes-1;
					dS = 1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,ano);
				}else{
					System.out.printf("O dia %d introduzido nao e valido!",dia);
				}
			break;
			case 4: case 6: case 9: case 11: 
				if(dia < 30 && dia != 1){
					dA = dia-1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mes,ano); 
				}else if( dia == 30){
					dA = dia-1;
					dS = 1;
					mesS = mes+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,ano,dA,mes,ano);
				}else if(dia == 1){
					dA = 31;
					mesA = mes-1;
					dS = 1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,ano);
				}else{
					System.out.printf("O dia %d introduzido nao e valido!",dia);
				}
			break;
			case 12:
				if(dia < 31 && dia != 1){
					dA = dia-1;
					dS = dia+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mes,ano); 
				}else if(dia == 31){
					dA = dia-1;
					dS = 1;
					mesS = 1;
					anoS = ano+1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mesS,anoS,dA,mes,ano);
				}else if(dia == 1){
					dA = 30;
					mesA = 11;
					dS = 1;
					System.out.printf("O  dia seguinte e %d-%d-%d \n O dia anterior e %d-%d-%d",dS,mes,ano,dA,mesA,ano);
				}else{
					System.out.printf("O dia %d introduzido nao e valido!",dia);
				}
			break;
			default:
				System.out.printf("O mes %d introduzido nao e valido!", mes);
			break;
			
		}
	}
}

