package esercizi_matrici;

public class StampaMatrice {

	public static void main(String[] args) {
		int [][]m= {{2,1,2},{1,1,1},{2,5,6}};
		stampa(m);
	}


public static void stampa (int[][]m){
	for (int i=0; i<m.length; i++){
		for (int j=0; j<m[0].length; j++){
			System.out.print(m[i][j] + " ");
			}
		System.out.println("");
		}
	}
}
