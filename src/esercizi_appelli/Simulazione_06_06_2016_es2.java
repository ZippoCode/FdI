package esercizi_appelli;

public class Simulazione_06_06_2016_es2 {

	public static void main(String[] args) {
		int[][] M = { { 9, 9, 7 }, { 5, 4, 5 }, { 8, 9, 7 }, { 5, 8, 4 }, { 3, 5, 6 } };
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[] P = { 100, 10, 50, 30, 10 };
		for (int i = 0; i < P.length; i++) {
			System.out.print(P[i] + "  ");
		}
		
		
		System.out.println(giuratoBuono(M));
		System.out.println(" ");
	
		double []V = CalcoloPunteggioPubblico(P); 
			for (int i=0; i<V.length; i++){
		System.out.print(V[i] + " ");
		}
			
			System.out.println(" ");
		double [][]C= calcoloGraduatoria(M,V);
			for (int i = 0; i < C.length; i++) {
				for (int j = 0; j < C[0].length; j++) {
					System.out.print(C[i][j]+ "|");
				}
				System.out.println();
			}
	}

	public static int giuratoBuono(int[][] M) {
		int max = 0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] > max)
					max = M[i][j];
			}
		}
		int[] aus = new int[M[0].length];
		for (int h = 0; h < aus.length; h++) {
			for (int j = 0; j < M.length; j++) {
				if (M[j][h] == max) {
					aus[h]++;
				}
			}
		}
		int indice = -1;
		int indiceMax = 0;
		for (int i = 0; i < aus.length; i++) {
			if (aus[i] > indiceMax) {
				indiceMax = aus[i];
				indice = i;
			}
		}
		return indice;
		}
	
	
	public static double [] CalcoloPunteggioPubblico (int []P){
		int somma=0;
		double [] V = new double[P.length];
				for (int i=0; i<P.length;i++){
					somma += P[i];
					}
			for (int i=0; i<P.length;i++){
			V[i] = (P[i]*20)/somma ;
		}
		return V;
	}
		
	public static double [][] calcoloGraduatoria(int [][]M,double[] V){
		double [][]C= new double [M.length][5];
		for(int i = 0; i < M.length; i++) {
			for (int j = 0; j <3; j++) {
				C[i][j]= M[i][j];
			}
		}
		for (int i = 0; i < M.length; i++) {
			C[i][3]=V[i];
		}
		double []aus = new double [M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				aus [i] += M[i][j];
			}
			aus[i]+=V[i];
		}
		for (int i = 0; i < M.length; i++) {
			C[i][4]=aus[i];
		}
		return C;
	}
}
