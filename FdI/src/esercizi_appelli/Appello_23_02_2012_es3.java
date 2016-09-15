package esercizi_appelli;

public class Appello_23_02_2012_es3 {

	public static void main(String[] args) {
		int [][] M = {{-1,2,-1,7},{-1,10,5,6}, {2,-1,1,12},{3,9,2,10},{-1,11,16,11}};
				for (int i = 0; i < M.length; i++) {
					for (int j = 0; j < M[0].length; j++) {
						System.out.print(M[i][j] + " ");
					}
					System.out.println(" ");
				}
			System.out.println();
		int [] T = {1,2,2,1};
			for (int i = 0; i < T.length; i++) {
				System.out.print(T[i]+ " ");
			}
			System.out.println();
		int i=1;
		int t=1;
		int max= bestScore(M,i,t,T);
			System.out.println(max);
		int [][] N = graduatoria(M,t,T);
			for (int j = 0; j < N.length; j++) {
				for (int j2 = 0; j2 < N[0].length; j2++) {
					System.out.print(N[j][j2]+ " " );
				}
			System.out.println();
			}
	}
	
	public static int bestScore (int [][]M, int i, int t, int []T){
		int max=0;
		for (int j = 0; j < M[0].length; j++) {
			if (t == T[j]){
			if (M[i][j] >max){
				max= M[i][j];
				}
			}
		}
		return max;
	}

	public static int [][] graduatoria (int [][]M, int t, int [] T){
		int [] somma= new int [M.length];
		int [] media= new int [M.length];
		int [][]N= new int [M.length][2];
		for (int i = 0; i < M.length; i++) {
			somma [i]+= M[i][t];
				}
		for (int i=0; i<somma.length; i++){
			media[i]= somma[i]/2;
		}
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N.length; j++) {
				N[i][0]= i;
				N[i][1]= media[i];
			}
		}
		return N;
	}
}
	
		