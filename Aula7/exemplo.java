import java.util.*;
import java.io.*; //! Import da library que tem as classes e funções dos ficheiros
import static java.lang.System.*;

public class exemplo {
	public static void main(String[] args) throws IOException {
		// ! Esta função (a main) vai usar ficheiros, por isso tem que ter o throws
		// !IOException depois dos argumentos
		Scanner sc = new Scanner(System.in); // ! Cria scanner para leres do teclado
		out.println("Insere o nome do ficheiro para ler: "); // ! Pede nome do ficheiro de onde vai ler
		String filename = sc.nextLine();
		out.println("Insere o nome do ficheiro para escrever: "); // ! Pede nome do ficheiro de onde vai escrever
		String filename1 = sc.nextLine();
		File fin = new File(filename); // ! Cria ficheiro de leitura
		File fout = new File(filename1); // ! Cria ficheiro de escrita
		PrintWriter pw = new PrintWriter(fout); // ! Cria PrintWriter (é o que usas para escrever nos ficheiros)
		if (!fin.exists() || !fin.isFile() || !fin.canRead()) {
			// ! Verifica se fin existe se é ficheiro e se dá para ler
			out.println("Ficheiro inválido!");
		} else {
			Scanner scf = new Scanner(fin); // ! Cria Scanner do fin para ler os seus conteudos
			int c = 0; // ! Cria variavel int usada como contador de linhas, neste caso
			while (scf.hasNextLine()) { // ! Enquando scf.hasNextLine() é enquanto houver proxima linha no ficheiro
				c += 1; // ! Incrementa o contador
				scf.nextLine(); // ! Passa para a proxima linha
			}
			scf.close(); // ! Aqui o scanner está no fim do ficheiro, por isso fecha-se o scanner scf
			scf = new Scanner(fin); // ! Reabre-se o scanner do ficheiro para agora estar no inicio do ficheiro
			String z = new String(); // ! Cria-se uma string que vai ser a linha do ficheiro
			while (scf.hasNextLine()) { // ! Outra vez, enquanto ouver proxima linha....
				z = scf.nextLine(); // ! Atribuis a linha à variável z
				for (int i = 0; i < z.length(); i++) { // ! For para correr todas as letras da linha em que está o scf
					if (Character.isLowerCase(z.charAt(i))) {
						// ! Verifica se a letra da posição i da linha atual é minuscula
						pw.print(z.charAt(i) + " ");
						// ! Se for, então escreve essa letra num novo ficheiro "fout" com o PrintWriter
						// pw
					}
				}
				pw.println("são minusculas"); // ! Escreve à frente das letras dessa linha
			}
			scf.close();
			pw.close();
			sc.close();

			// ! Aqui só fecho os scanners (scf e sc) e o printwriter (pw)
		}
	}
}