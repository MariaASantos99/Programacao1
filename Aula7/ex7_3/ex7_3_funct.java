import java.util.*;
import java.io.*;
public class ex7_3_funct {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException {
		
		int opc = -1;
		System.out.println("Nome do ficheiro");
		String filename = sc.next();
		int linhas = dim(filename);
		int addnum = 0;
		int[] num = new int[linhas];
		int [] newnum = new int[linhas+addnum];
		do
		{
			System.out.println("Menu");
			System.out.println("1-Ler dados de um ficheiro");
			System.out.println("2-Adicionar dados ao ficheiro");
			System.out.println("3-Fazer uma copia para um novo ficheiro");
			System.out.println("0-Sair");
			opc = sc.nextInt();
			switch (opc)
			{
				case 1:
					num = dados(filename,linhas);
					for (int i = 0; i < num.length; i++){
						System.out.println(num[i]);
					}
					break;
				case 2:
					System.out.println("Numeros a adicionar");
					addnum = sc.nextInt();				
					newnum = new int[linhas+addnum];
					newnum = newdados(filename, num, addnum,linhas);
					
					for (int i = 0; i < newnum.length; i++){
						System.out.print(newnum[i]+" ");
					}
					break;
				case 3:
					save(newnum);
					break;
				case 0:
					System.out.println("A sair...");
					break;
				default:
					System.out.println("Opcao invalida");
					break;
			}
			
		} while (opc !=0);
		
	}
	
	//Dimensão do ficheiro
	public static int dim(String filename) throws IOException{
		File file = new File(filename+".txt");
		Scanner scf = new Scanner(file);
		int linhas=0, linha=0;
		while (scf.hasNextLine()){
			linha = scf.nextInt();
			linhas++;
		}
		scf.close();
		return linhas;
	}
	
	//Dados do ficheiro
	public static int[] dados(String filename,int linhas) throws IOException{
		File file = new File(filename+".txt");
		Scanner scf = new Scanner(file);
		int linha=0, i=0;
		int [] num = new int[0];
		if (file.isFile() && file.canRead()){
			num = new int[linhas];
			while(scf.hasNextLine()){
				linha = scf.nextInt();
				num[i] = linha;
				i++;
			}
			scf.close();	
		}else System.out.println("Error!");
		
		return num;
		
	}

	//Adicionar novos dados
	public static int[] newdados(String filename, int[] num, int newnum, int linhas) throws IOException{
		File file = new File(filename+".txt");
		Scanner scf = new Scanner(file);
		int [] numnew = new int[linhas+newnum];
		if(file.isFile() && file.canRead()){
			for (int i = 0; i < numnew.length; i++){
				if(i<linhas){
					numnew[i] = num[i];
				}else{
					System.out.println("Numero");
					int numero = sc.nextInt();
					numnew[i] = numero; 
				}
						
			}
		}else System.out.println("Error!");
		return numnew;
	}

	//Salvar num ficheiro novo
	public static void save(int[] newnum) throws IOException{
		System.out.println("Nome do ficheiro");
		String newfilename = sc.next();
		File file = new File(newfilename+".txt");
		if(file.createNewFile()){
			System.out.println("Ficheiro criado: " + file.getName());
			PrintWriter print = new PrintWriter(newfilename+".txt");
			for (int i = 0; i < newnum.length; i++){
				print.println(newnum[i]);
			}
			print.close();
			System.out.println("Copia feita");
		}else{
			PrintWriter print = new PrintWriter(newfilename+".txt");
			for (int i = 0; i < newnum.length; i++){
				print.println(newnum[i]);
			}
			print.close();
			System.out.println("Copia feita");
		}
	}
}

