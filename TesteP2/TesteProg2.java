import java.util.*;
import java.io.*;
public class TesteProg2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args)throws IOException {
		//~ String frase=sc.nextLine();
		//~ String frasenova = retirarEspaco(frase);
		//~ System.out.println(frasenova);
		//~ Aluno al = new Aluno();
		//~ al.nome = "Marta";n 
		//~ al.nmec = 1234;
		//~ String aluno = converterAluno(al);
		//~ System.out.println(aluno);
		Aluno[] al = lerAluno();
		//~ imprimirAlunos(al);
		//~ for (int i = 0; i < al.length; i++)
		//~ {
			//~ System.out.println(al[i].nmec + al[i].nome);
		//~ }
		Aluno[] a = filtrar(al);
		//~ for (int i = 0; i < a.length; i++)
		//~ {
			//~ System.out.println(a[i].nmec + a[i].nome);
		//~ }
		
		System.out.println("Nome do ficheiro a gravar:");
		String ficheiro = sc.nextLine();
		copiarFile(ficheiro,al);
		
	}
	
	public static String retirarEspaco(String frase){
		String frasefinal = frase.replaceAll("\\s+"," ").trim();
		return frasefinal;
	}
	
	public static String converterAluno(Aluno a){
		String s="";
		s = s.format("%d  %s",a.nmec,a.nome);
		return s;
	}
	
	public static Aluno[] lerAluno() throws IOException{
		String ficheiro = sc.nextLine();
		File file = new File(ficheiro+".txt");
		if(!file.exists())System.out.println("Ficheiro nao existe");
		else if(!file.isFile())System.out.println("Nao e ficheiro");
		else if(!file.canRead())System.out.println("Nao é possivel");
		else if(file.isDirectory())System.out.println("E um diretorio");
		Scanner scf = new Scanner(file);
		int linha =0;
		while(scf.hasNextLine()){
			String linhas = scf.nextLine();
			linha++; 
		}
		scf.close();
		Aluno[] aluno = new Aluno[linha];
		scf = new Scanner(file);
		for(int i=0; i<aluno.length; i++){
			aluno[i] = new Aluno();
			aluno[i].nome = scf.nextLine();
			aluno[i].nmec = scf.nextInt();
			
			aluno[i].nome = retirarEspaco(aluno[i].nome);
			aluno[i].nome = " " + aluno[i].nome;
		}
		scf.close();
		return aluno;	
	}
	
	public static Aluno[] filtrar(Aluno[] aluno){
		imprimirAlunos(aluno);
		System.out.println("Filtrar-> ");
		String n = sc.nextLine();
		int count=0;
		Aluno[] b = new Aluno[aluno.length];
		for(int i=0; i<aluno.length; i++){
			if(aluno[i].nome.toLowerCase().indexOf(n.toLowerCase())>=0){//toLowerCase() tornar a variavel q esta antes em pequeno
				b[count] = new Aluno();
				b[count] = aluno[i];
				count++;
			}
		}
		Aluno[] newAluno = new Aluno[count];
		for(int j=0; j < count; j++){
			newAluno[j] = b[j];
		}
		return newAluno;
	}
	
	public static void imprimirAlunos(Aluno[] a){
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i].nmec + a[i].nome);
		}
	}
	
	public static void copiarFile(String file, Aluno[] a) throws IOException{
		File filename = new File(file+".txt");
		if(filename.createNewFile()) System.out.println("Ficheiro criado");
		else System.out.println("Ficheiro ja existe");
		
		PrintWriter writer = new PrintWriter(file);
		for(int i =0; i<a.length; i++){
			writer.println(a[i].nmec + a[i].nome);
		}
		writer.close();
	}
}
class Aluno{
	int nmec;
	String nome;
	
}
