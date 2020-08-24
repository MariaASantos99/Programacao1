/*
 * ex7_6.java
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

import java.io.*;
import java.util.*;
public class ex7_6 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		System.out.print("Ficheiro a ler: ");
		String name1 = sc.nextLine();
		System.out.print("\nFicheiro para copia: ");
		String name2 = sc.nextLine();
		File file1 = new File(name1);
		if(file1.isFile() && file1.canRead()){
			Scanner scf = new Scanner(file1);
			int linhas =0;
			while(scf.hasNextLine()){
				String s = scf.nextLine();
				linhas++;
			}
			scf.close();
			String [] forfile = new String[linhas];
			int i=0;
			scf = new Scanner(file1);
			while(scf.hasNextLine()){
				String line = scf.nextLine();
				forfile[i++] = line;
			}
			scf.close();
			for(i=0;i<forfile.length;i++) System.out.println(forfile[i]);
			File file2 = new File(name2);
			if(file2.createNewFile()){
				System.out.printf("Ficheiro %s criado com sucesso\n",file2);
				PrintWriter writer = new PrintWriter(name2);
				for(i=0;i<forfile.length;i++) writer.println(forfile[i]);
				System.out.printf("Copia com sucesso");
				writer.close();
			}else System.out.println("Ficheiro ja extiste");
		}else System.out.printf("Ficheiro %s nao existe",file1);
	}
}

