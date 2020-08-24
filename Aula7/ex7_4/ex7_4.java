import java.io.*;
import java.util.*;
import java.lang.System.*;

public class ex7_4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException {
		//Nome do ficheiro e Nmec
		System.out.println("Nome do ficheiro:");
		String filename = sc.nextLine();
		System.out.println("N mec:");
		String mec = sc.nextLine();
		File file = new File(filename+".txt");
		
		//Verificar se o ficheiro existe
		if (file.isFile() && file.canRead()){
				int linhas = 0, colunas = 0, count=0;
				Scanner scf = new Scanner(file);
				while (scf.hasNextLine()){
					
					String linha = scf.nextLine();
					String[] elem = linha.split(" ");
					System.out.println(elem.length);
					//toma o numero de colunas do array o maior
					if(elem.length > colunas){
						colunas = elem.length;
					}
					//conta o numero de linhas do ficheiro
					linhas++; 
					//System.out.println(elem[1]);
				}				
				scf.close();
				
				//guardar os nomes
				String[] nome = new String[linhas];
				//guardar o resto da informação
				String [][] dados = new String[linhas][colunas-1];
				int ld = -1, coluna=0, ln=0;
				scf = new Scanner(file);
				while (scf.hasNextLine()){
					char c;
					String word = scf.next();
					boolean res = true;
					for (int i = 0; i < word.length(); i++){
						c = word.charAt(i);
						res = Character.isLetter(c);
						break;
					}
					if (res){
						nome[ln]=word;
						ln++;
					}else{
						if (0<coluna && coluna <=2){
							dados[ld][coluna]=word;
							coluna++;
						}else{
							ld++;coluna=0;
							dados[ld][coluna]=word;
							coluna++;
						}		
					}
										
				}
				scf.close();
							
				//Saida de dados de acordo com o nmec 
				resultado(mec, nome, dados, colunas);
		}else System.out.println("Error");
	}
	
	
	public static void resultado(String mec, String[] nomes, String[][] dados, int colunas){
		for (int i = 0; i < nomes.length; i++) {
			if(mec.equals(dados[i][0])) {
				System.out.println("Nome  NMec N1 N2");
				System.out.printf("%s", nomes[i]);
				for (int j = 0; j < colunas - 1; j++) {
					System.out.print(" " + dados[i][j]);
				}
				System.out.println();
				break;
			}
		}
	}
}


