import java.util.*;
import java.io.*;
public class ex11_3{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		NewContacto[] array = new NewContacto[3];
		int i=0;
		char opc;
		do{
			System.out.println("\nGestao de uma agenda:");
			System.out.println("I - Inserir um contacto");//feito
			System.out.println("P - Pesquisar contacto por nome");//feito
			System.out.println("E - Eliminar um contacto");
			System.out.println("M - Mostrar os contactos");
			System.out.println("O - Mostrar contactos Ordenados pelo nome");
			System.out.println("V - Validar enderecos de email");
			System.out.println("A - Apagar a agenda");
			System.out.println("T - Terminar o programa");
			System.out.print("Opcao-> ");
			opc = sc.nextLine().charAt(0);
			switch(opc){
				case 'I':
					if(i<array.length){
						NewContacto contacto = adicionar();
						array[i]=contacto ;
						i++;
						System.out.println("Contacto adicionada a agenda");
					}
				break;
				case 'P':
				System.out.println("ola");
					int t = pesquisar(array);
					System.out.println(t+"ola");
					if(t== -1)System.out.println("Contacto nao existe");
					else {
						System.out.println("Aqui");
						imprimir(array,t);
					}
					break;
				case 'E':break;
				case 'M':break;
				case 'O':break;
				case 'V':break;
				case 'A':break;
				case 'T':
					System.out.println("Ate a proxima...");
					break;
				default:
					System.out.println("Opcao invalida");
					break;
			}
		}while(opc !='T'); 
	} 
	
	
	
	public static NewContacto adicionar(){
		NewContacto contacto = new NewContacto();
		System.out.print("Nome: ");
		contacto.nome = sc.nextLine();
		System.out.print("Morada: ");
		contacto.morada = sc.nextLine();
		System.out.print("Telemovel: ");
		String tel = sc.nextLine();
		contacto.telemovel = Integer.parseInt(tel);
		System.out.print("Email: ");
		contacto.email = sc.nextLine();
		return contacto;
	}
	
	static int pesquisar(NewContacto a[]){
		int index = -1;
		System.out.print("Nome a pesquisar: ");
		String nome = sc.nextLine();
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++){
			if(a[i] != null){
				if(a[i].nome.toLowerCase().equals(nome.toLowerCase())){
					index=i;
					System.out.println(index);
					break;
				}
			}
			System.out.println(index);
		}
		return index;
	}
	
	public static void imprimir(NewContacto a[], int posicao){
		System.out.printf("%s  %s  %d  %s",a[posicao].nome,a[posicao].morada,a[posicao].telemovel,a[posicao].email);
	}
}
class NewContacto{
	String nome, morada, email;
	int telemovel; 
}
