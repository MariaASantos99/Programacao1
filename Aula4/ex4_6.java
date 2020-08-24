/*
 * ex4_6.java
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
public class ex4_6 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int num1=36, num2=90, mdc=0;
		mdc=90%36;
		do
		{
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		} while (num1 < 0 || num2 < 0);
		if (num1>num2)
		{
			mdc = num1 % num2;
			System.out.printf("MDC(%d,%d) = %d",num2,num1,mdc);
		}else
		{
			mdc = num2 % num1;
			System.out.printf("MDC(%d,%d) = %d",num1,num2,mdc);
		}
		
	}
}

