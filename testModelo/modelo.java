import java.util.*;

public class modelo {
	static Scanner teclado = new Scanner (System.in);
	public static void main (String[] args) {
		
		
		//~ double XI,XF;
		//~ int escolha;
		
		//~ do escolha = (int) ler ("1- ler valores teclado, 2- gerar valores: ");
		//~ while ((escolha !=1) && (escolha!=2));
			//~ do {
			//~ XI = ler ("valor incial de X: ");
			//~ XF = ler ("valor final de X: "); }
			//~ while (XI>=XF);
			
			
		//~ int npM = (int) ler("Numero pontos funcao: ");
		
//f2
			double XI = 3, XF=5;
			double[]ar=new double[4];
			int npV= lerF(ar);
			
			double dX=(XF-XI)/npV;
			printF(ar,npV,XI,dX);
			
//~ //f3
			//~ double XI = 3, XF=5;
			//~ double[] fun1=new double[4];
			//~ int npM= 4;
			//~ int npV=npM;
			//~ fun1 = f(npV,XI,npM);
			//~ double dX=(XF-XI)/npV;
			
//f4
			//~ double XI = 3, XF=5;
			//~ double[]fun1=new double[4];
			//~ int npM= 4;
			//~ int npV=npM;
			//~ fun1=f(XI,XF,npM);
			//~ double dX=(XF-XI)/npV;
			//~ printF(fun1,npV,XI,dX);
			
			//~ int[]r = mudar_posicao(fun1,npV);
			//~ for (int i=1;i<=r[0];i++)
				//~ System.out.printf("R %d x=%f\n", i, r[i]*dX+ XF);
					
//f5
			//~ double XI = 3, XF=5;
			//~ double[]fun1=new double[4];
			//~ int npM= 4;
			//~ int npV = npM;
			//~ fun1 = f(XI,XF,npM);
			//~ double dX=(XF-XI)/npV;
			//~ printF(fun1,npV,XI,dX);
			//~ System.out.printf("Minimo para x= %5f\n", XI + x_Min(fun1, npV)*dX);
			
	}
		//~ //funçao 1 ler valores do teclado
		//~ public static double ler (String mensagem){
			//~ System.out.print(mensagem);
		
			//~ double n;
			//~ n = teclado.nextDouble();
			//~ return n;
		//~ }
		
		//funçao 2
		public static int lerF(double []a){
			System.out.printf("Introduza %d pontos de uma funcao ou ate 0 0 %n", a.length);
			int y0 = -1, i=0;
			double y=-1;
			do{
				y0=(int)y;
				y=teclado.nextDouble();
				a[i++]=y;
			} while (!(y0==0 && (int)y==0) && i<a.length);
			if (y0==0 && (int)y==0) i-=2;
			return i; 
		}
		
		public static void printF(double[]f,int npV, double XI, double dX){
			for (int x=0;x<npV;x++)
			System.out.printf("Pos= %3d x=%8.5f y=%8.5f%n",x,XI + x*dX,f[x]);
		}
		
		//~ //funcao 3
		//~ public static double[] f(double Max_x, double Min_x, int np){
				//~ double[]a=new double[np];
				//~ double dX= (Max_x - Min_x)/np;
				//~ for (int i=0; i<a.length; i++){
					//~ a[i]=Math.cos(Min_x + dX*i);
					//~ System.out.printf("   ponte%d=%f\n", i, a[i]);
				//~ }
				//~ return a;
			//~ }
			
		
		//funcao 4
			static int [] mudar_posicao(double[] fun, int npV){
				int nr=0;
				double a, b;
				int[]rz = new int[npV];
				b=fun[0];
				for(int i=1;i<npV;i++){
					a=fun[i];
					if ((b>0 && a<=0) || (b<0 && a>=00)){
						nr=nr+1;
						rz[nr]=i;
						b=a;
					}
				rz[0]=nr;
				
				}
				return rz;
			}
		
			//funcao 5
			static int x_Min(double[]funcao, int npV){
				int x_Min=0;
				for(int i =1;i<npV; i++){
					if(funcao[i]<funcao[x_Min])x_Min=i;
				}
				return x_Min;
		}
}


