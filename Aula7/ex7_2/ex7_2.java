import java.util.*;
import java.io.*;
public class ex7_2{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException {
		System.out.println("Nome do ficheiro");
		String filename = sc.nextLine();
		File file = new File(filename+".txt");//File file = new File(filename);
		int count = 0;
		if(file.isFile() && file.canRead()){
			Scanner scf = new Scanner(file);
			while(scf.hasNextLine() || count==20){
				int linha = scf.nextInt();
				if(linha>0)count++;
			}
		}else System.out.println("Error!");
		System.out.println(count);
	}
}

