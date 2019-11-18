package esercizi_appelli;

public class Appello_20110411 {

	public static void main(String[] args) {
		int [][]M= {{3,8,8,4},{2,3,5,6},{2,5,5,2}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int indice= massimaVendita(M);
			System.out.print(indice);
		System.out.println();
		int angelo = massimadifferenza(M);
			System.out.println(angelo);
			System.out.println();
		int [] Negozio = {6,8,2,3};
		int [][]N= aggiungiNegozio(M,Negozio);
			for (int k = 0; k < N.length; k++) {
				for (int k2 = 0; k2 < N[0].length; k2++) {
					System.out.print(N[k][k2] + " ");
				}
				System.out.println();
		}
			System.out.println();
			boolean c= venditeCrescenti(M);
				System.out.print(c);
	}
		
			

	
	public static int massimaVendita(int [][]M){
		int [] somma= new int [M.length];
		int max=0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				somma[i]+= M[i][j];
			}
		}
		int h=-1;
		for (int i = 0; i < somma.length; i++) {
			if (somma[i]>max){
				max= somma[i];
				i=h;
				h++;
			}
		}
	return h;
	}
	
	
	public static int massimadifferenza(int [][]M){
		int [][] diff= new int [M.length][M[0].length];
		int max=0;
		for (int j=0; j<M[0].length; j++) {
			for (int i = 0; i < M.length-1; i++) {
				diff [i][j]= M[i][j]- M[i+1][j];
			}
		}
		int h=0;
		for (int i = 0; i < diff.length; i++) {
			if (diff[i][h] > max){
				max= diff[h][i];
				i=h;
				h++;
			}
	}
	return h;
		}
	
	public static int [][] aggiungiNegozio (int [][]M, int [] Negozio){
		int [][] N= new int [M.length+1][M[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				N[i][j]= M[i][j];
					}
			}
		for (int i=0; i<Negozio.length; i++) {
			N[M.length][i]= Negozio[i];
		}
		return N;
	
	}
	
	public static boolean venditeCrescenti (int [][]M){
		boolean [] ciao= new boolean [M.length];
		int h=0;
		for (int i = 0; i < M.length; i++) {
			if (M[i][h] < M[i][h]){
				ciao [i]= true;
				h++;
			}
				System.out.print(ciao[i]+ " ");
			}
	return true;
	}
}
