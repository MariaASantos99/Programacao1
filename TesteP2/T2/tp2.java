import java.util.*;
import java.io.*;
public class tp2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		//f1
		//~ System.out.println(retirarEspaco("  Maria      Santos"));
		
		//f2
		//~ Aluno a = new Aluno();
		//~ a.nome = "Maria";
		//~ a.nmec = 1234;
		//~ a.idade = 12;
		//~ System.out.println(converterAluno(a));
		
		//f3
		Aluno [] a = lerAluno();
		//~ imprimir(a);
		
		//f4
		Aluno[] aluno = filtrar(a);
		imprimir(aluno);
		//f5
		
		//f6
		System.out.print("Novo Ficheiro: ");
		String ficheiro = sc.nextLine();
		copiarFile(ficheiro, aluno);
	}
	
	
	//f1
	public static String retirarEspaco(String frase){
		frase = frase.replaceAll("\\s+"," ").trim();
		return frase;
	}
	
	//f2
	public static String converterAluno(Aluno a){
		String s="";
		s = s.format("%d %d %s",a.nmec, a.idade, a.nome);
		return s;
	}
	
	//f3
	public static Aluno[] lerAluno() throws IOException{
		System.out.println("Nome de ficheiro: ");
		String filename = sc.nextLine();
		File file = new File(filename);
		if(!file.exists())System.out.println("Ficheiro nao existe!");
		else if(!file.isFile())System.out.println("Nao e um ficheiro!");
		else if(!file.canRead())System.out.println("Ficheiro nao possivel de ler!");
		else if(file.isDirectory())System.out.println("E um diretorio");
		Scanner scf = new Scanner(file);
		int count = 0;
		while(scf.hasNextLine()){
			String s = scf.nextLine();
			count++;
		}
		scf.close();
		Aluno[] al = new Aluno[count];
		scf = new Scanner(file);
		for(int i = 0; i<al.length; i++){
			al[i] = new Aluno();
			al[i].nmec = scf.nextInt();
			al[i].idade = scf.nextInt();
			al[i].nome = scf.nextLine();
			al[i].nome = " " + retirarEspaco(al[i].nome); 
		}
		scf.close();
		return al;
	}
	
	//f4
	public static Aluno[] filtrar(Aluno[] a){
		imprimir(a);
		System.out.print("Filtrar-> ");
		String nome = sc.nextLine();
		Aluno[] b = new Aluno[a.length];
		int count =0;
		for(int i=0; i<a.length; i++){
			if(a[i].nome.toLowerCase().indexOf(nome.toLowerCase())>=0){
				b[count] = new Aluno();
				b[count] = a[i];
				count++;
			}
		}
		Aluno [] aluno = new Aluno[count];
		for(int i =0; i<aluno.length; i++){
			aluno[i] = b[i];
		}
		return aluno;
	}
	
	//f5
	public static void imprimir(Aluno[] a){
		for(int i =0; i< a.length; i++){
			System.out.printf("%d %d %s\n",a[i].nmec, a[i].idade, a[i].nome);
		}
	}
	
	//f6
	public static void copiarFile(String filename, Aluno[] a)throws IOException{
		File file = new File(filename+".txt");
		if(file.createNewFile())System.out.println("Ficheiro criado");
		else System.out.println("Ficheiro ja existe");
		if(a.length != 0){
			PrintWriter pw = new PrintWriter(file);
			for(int i=0; i<a.length; i++){
				pw.printf("%d %d %s \n",a[i].nmec, a[i].idade, a[i].nome);
			}
			pw.close();
		}
	}
}
class Aluno{
	String nome;
	int nmec, idade;
}
