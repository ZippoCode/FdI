package EserciziAppelli;

public class Appello_29_01_2013_es3 {

	public static void main(String[] args) {
		int [][] M = {{0,1,0,2,1,1,0},{0,1,0,2,1,1,2}, {1,1,2,2,1,1,2},{1,0,2,1,0,0,2},{1,2,1,1,2,0,2},
						{2,2,0,0,2,2,2}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int [] v= statistica (M);
			for (int i = 0; i < v.length; i++) {
				System.out.print(v[i]+ " ");
			}
		System.out.println();
		boolean c= stressante(M);
			System.out.println(c);
		System.out.println();
		boolean p = aggiungiAttività(M,0,3);
			System.out.print(p);
			System.out.println();
		int [] V = {2,2,0,1,1,2};
		int [][] N= aggiungi (M,V);
			for (int i = 0; i < N.length; i++) {
				for (int j = 0; j < N.length; j++) {
					System.out.print(N[i][j] + " ");
				}
			System.out.println();
			}
		
	}

	public static int [] statistica (int [][]M){
		int [] contatore= new int [M[0].length];
		int [] v= new int [M[0].length];
		for (int j = 0; j <M[0].length; j++) {
			for (int i = 0; i < M.length; i++) {
				if (M[i][j] != 0){
					contatore[j]++;
				}
			}
			v[j]= contatore[j];
		}
		return v;
	}
	
	
	public static boolean stressante (int [][]M){
		int [] contatore= new int [M[0].length];
		int [] v= new int [M[0].length];
		for (int j = 0; j <M[0].length; j++) {
			for (int i = 0; i < M.length; i++) {
				if (M[i][j] == 1){
					contatore[j]++;
				}
			}
			v[j]= contatore[j];
		}
		int k=0;
		for (int i = 0; i < v.length; i++) {
			if (v[i]>2){
					k++;
			}
		}
			if (k> M.length/2){
					return true;
			}
		return false;
	}
	
	public static boolean aggiungiAttività (int[][]M, int i,int j){
			if (M[i][j]== 0){
				return true;
			}	
		return false;	
	}
	
	public static int [][] aggiungi (int[][]M,int []V){
		int[][]N= new int [M.length][M[0].length];
		for (int j = 0; j <M[0].length; j++) {
			for (int i = 0; i < M.length; i++) {
				N[i][j]= M[i][j];
				if (aggiungiAttività(M,i,j)){
					N[i][j] = V[i];
				}
			}
		}
		return N;
}
}