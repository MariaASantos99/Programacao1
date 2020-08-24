/*
 * ficheiros.java
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
import java.util.Scanner;
public class ficheiros {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		String nome;
		int opc = -1;
		do
		{
			System.out.println("1-Criar ficheiros");
			System.out.println("2-Adicionar conteudo ao ficheiro");
			System.out.println("3-Ler conteudo do ficheiro");
			System.out.println("4-Eliminar ficheiro");
			opc = sc.nextInt();
			switch (opc){
				case 1:
					System.out.println("Numero de ficheiros a inserir");
					int num = sc.nextInt();
					for (int i = 0; i < num; i++)
					{
						try{
							System.out.print("Nome do ficheiro:");
							nome = sc.next();
							File f = new File(nome+".txt");
							if (f.createNewFile()){
								System.out.println("Ficheiro criado: " + f.getName());
								
							}else System.out.println("Ficheiro ja existe");
							//~ f.close();
						}catch (IOException e){
							System.out.println("An error occurred.");
							e.printStackTrace();
						}
					}
					
				break;
				case 2:
					try {
						System.out.print("Nome do ficheiro:");
						nome = sc.next();
						FileWriter myWriter = new FileWriter(nome+".txt");
						myWriter.write("Hello word!");
						myWriter.close();
						System.out.println("Successfully wrote to the file.");
						//~ f.close();
					} catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}
					
				break;
				case 3:
					System.out.print("Nome do ficheiro:");
					nome = sc.next();
					File f = new File(nome+".txt");
					if (f.isFile() && f.canRead()){
						try {					
							Scanner ler = new Scanner(f);
							while (ler.hasNextLine()) {
								String data = ler.nextLine();
								System.out.println(data);
							}
							ler.close();
						} catch (FileNotFoundException e) {
							System.out.println("An error occurred.");
							e.printStackTrace();
						}
					}else System.out.println("Nao le");
					//~ f.close();
				break;
				case 4:
					System.out.println("Numero de ficheiros a eliminar");
					int n = sc.nextInt();
					for (int i = 0; i < n; i++)
					{
						System.out.print("Nome do ficheiro:");
						nome = sc.next();
						File fi = new File(nome+".txt");
						if (fi.delete()){
							System.out.println("Ficheiro"+fi.getName()+"eliminado com sucesso");
						}else {System.out.println("Falha ao eliminar o ficheiro"+fi.getName());}
						//~ f.close();
					}
				break;
				
				case 0:
					System.out.println("A sair...");
					break;
				default:
					System.out.println("Opc invalida");
			}
		} while (opc !=0);
		
		
		
			
		}
		

	}
