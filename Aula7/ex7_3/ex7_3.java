import java.util.*;
import java.io.*;
public class ex7_3 {
	public static void main (String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		File file = new File(filename + ".txt");
		Scanner scf = new Scanner(file);
		if (file.isFile() && file.canRead()){
			int linhas = 0, linha=0;
			//Verificar numero de linhas
			while(scf.hasNextLine()){
				linha = scf.nextInt();
				linhas++;
			}
			scf.close();
				
			//Guardar valores dentro de um array
			int[] num = new int[linhas];
			int i =0;
			scf = new Scanner(file);
			while(scf.hasNextLine()){
				linha = scf.nextInt();
				num[i] = linha;
				i++;
			}
			System.out.println("Quantos numeros a adicionar: ");
			int nadd = sc.nextInt();
			int[] newnum = new int[linhas+nadd];
			for (i = 0; i < newnum.length; i++)
			{
				if(i<linhas)newnum[i] = num[i];
				else{
					System.out.println("Numero:");
					int nume = sc.nextInt();
					newnum[i] = nume;
				}
			}
			//imprimir novo array com os numeros todos
			for (i = 0; i < newnum.length; i++)
			{
				System.out.println(newnum[i]);
			}
			
			//Colocar num novo ficheiro
			System.out.println("Nome do novo ficheiro:");
			String newfilename = sc.next();
			file = new File(newfilename+".txt");
			if (file.createNewFile()){
				System.out.println("Ficheiro criado: " + file.getName());
				PrintWriter writer = new PrintWriter(newfilename+".txt");
				for ( i = 0; i < newnum.length ; i++){
					writer.println(newnum[i]);
				}
				System.out.println("Copia feita");
				writer.close();		
			}else{
				PrintWriter writer = new PrintWriter(newfilename+".txt");
				for ( i = 0; i < newnum.length ; i++){
					writer.println(newnum[i]);
				}
				System.out.println("Copia feita");
				writer.close();	
			}
		}else System.out.println("Error!");
		
			
			
			
		
			
			
		
	}
}

