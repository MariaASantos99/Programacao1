/*
 * ex7_7.java
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
import java.io.*;
public class ex7_7{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		System.out.print("Ficheiro a ler: ");
		String filename = sc.nextLine();
		File file = new File(filename);
		if(file.isFile() && file.canRead()){
			Scanner scf = new Scanner(file);
			int linhas =0;
			while(scf.hasNextLine()){
				String linha = scf.nextLine();
				String div[] = linha.split("[.]");	
				if(div.length>linhas)linhas=div.length;
				else linhas++;
			}
			scf.close();
			String[] newfile = new String[linhas];
			scf = new Scanner(file);
			int lines=0;
			while(scf.hasNextLine()){
				String linha = scf.nextLine();
				String div[] = linha.split("[.]");
				for (int i = 0; i < div.length; i++){
						newfile[i]=div[i];
				}
			}
			
			for (int i = 0; i < newfile.length; i++){
				System.out.println(newfile[i]);
			}
			String filename2 = sc.nextLine();
			File file2 = new File(filename2);
			if(!(file2.createNewFile())) System.out.println("Ficheiro ja existe!");
			else{
				System.out.println("Ficheiro criado com sucesso!");
				FileWriter wr = new FileWriter(filename2);
				for (int i = 0; i < newfile.length; i++){
					wr.write(newfile[i]+"\n");
					
				}
				wr.close();
			}
		}else System.out.println("Ficheiro invalido!");
	
	}
}

