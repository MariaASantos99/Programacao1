import java.util.*;
import java.lang.System.*;
import java.io.*;

public class test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o nome do ficheiro:");
		String filename = sc.nextLine();
		System.out.print("Insira o numero mecanografico:");
		int nmec = sc.nextInt();

		File file = new File(filename+".txt");

		Scanner scf = new Scanner(file);
		int lineCount = 0;
		int rowCount = 0;
		while (scf.hasNextLine()) {
			String line = scf.nextLine();
			String[] elem = line.split("\t");
			if (elem.length > rowCount)
				rowCount = elem.length;
			lineCount++;
		}
		scf.close();

		scf = new Scanner(file);
		String[] name = new String[lineCount];
		int[][] arr = new int[lineCount][rowCount - 1];
		while (scf.hasNextLine()) {
			for (int i = 0; i < name.length; i++) {
				name[i] = scf.next();
				for (int j = 0; j < rowCount - 1; j++) {
					arr[i][j] = scf.nextInt();
					
				}
				
			}
			
		}
		scf.close();

		//~ for (int i = 0; i < name.length; i++) {
			//~ if (arr[i][0] == nmec) {
				//~ System.out.printf("%s", name[i]);
				//~ for (int j = 0; j < rowCount - 1; j++) {
					//~ System.out.print(" " + arr[i][j]);
				//~ }
				//~ System.out.println();
				//~ break;
			//~ }
		//~ }
	}
}
