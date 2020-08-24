//~ function1 é entrada de dados (feita)
//~ function2 ler dados que são inseridos pelo teclado (feito)
//~ function3 gerar dados com base numa função (feito)
//~ function4 número de raízes  
//~ function5 neste caso é descobrir minimo/maximo
import java.util.*;
public class testModelo {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		double xi, xf, n;
		int escolha;
		//~ //função1
		do escolha = (int) ler ("1- ler valores teclado, 2- gerar valores: ");
		while ((escolha !=1) && (escolha!=2));
		do{
			xi = ler("Numero inicial: ");
			xf = ler("Numero final:");
		}while (xi>=xf );
		int np = (int)ler("Numero de pontos:");		
		
		//funçao2
		int dim = (int)ler("Tamanho do array:");
		double[] a = new double[dim];
		//~ int nP = lerT(a);
		//~ for (int i = 0; i < a.length; i++)
		//~ {
			//~ System.out.println(a[i]);
		//~ }
		
		//~ double dx = (xf-xi)/nP;
		//~ printF(a, nP, xi, dx);
		
		//~ //funçao3
		//~ //f3, f4 e f5 em comum
		double max =(int) np;
		a = f(max,xi,np);
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		//~ printF(a,np,xi,dx);

		//~ //função5
		//~ System.out.printf("Minimo para x= %5f\n", xi + min(a, np)*dx);
		//~ System.out.printf("Maximo para x= %5f\n", xi + max(a, np)*dx);
			
			
//f4 e f5 comum
			//~ 
//~ //f4
				
			//~ int[]r = mudar_posicao(fun1,npV);
			//~ for (int i=1;i<=r[0];i++)
				//~ System.out.printf("R %d x=%f\n", i, r[i]*dX+ XF);



		
	}
	
	//funçao1: entrada dos valores
	public static double ler(String mensagem){
		double num;
		System.out.print(mensagem);
		num = sc.nextDouble();
		return num;
	}
	
	//funçao2: ler dados que são inseridos pelo teclado
	public static int lerT(double[] a){
		System.out.printf("Digite %d pontos da funcao ou ate 0 0 \n",a.length);
		int na=-1, i=0;
		double ns =-1;
		do
		{
			na = (int)ns;
			ns=sc.nextDouble();
			a[i++]=ns;
		} while (!(na==0 && ns==0) && i<a.length);
		if(na==0 && ns==0)i-=2;
		return i;
	}
	
	//funçao3: gerar dados com base numa funçao
	public static double[] f(double maxX, double minX, int np){
		double[] a = new double[np];
		double dx = (maxX-minX)/np;
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			a[i] = Math.cos(minX + i*dx);
			System.out.printf("Ponto %d= %.4f\n",i,a[i]);
		}
		return a;
		
	}
	
	//funçao4:
	
	//funçao5/min:
	public static int min(double[] a, int np){
		int	min = 0;
		for (int i = 1; i < np; i++)
		{
			if(a[min]>a[i])min=i;
		}
		return (int)min;
	}
	
	//funçao5/max:
	public static int max(double[] a, int np){
		int max = 0;
		for (int i = 1; i < np; i++)
		{
			if(a[max]<a[i])max=i;
		}
		return (int)max;
	}
	
	//funçao6: saida de dados
	public static void printF(double[]f, int nP, double xi, double dx){
		for (int i = 0; i < nP; i++)
		{
			System.out.printf("Pos= %d x=%.4f y=%.4f\n",i,xi + i*dx,f[i]);
		}
		
	}
}

