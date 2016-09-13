package EserciziAppelli;

public class Appello_05_09_2014_es3 {

	public static void main(String[] args) {
		int [][]M= {{0,0,3,0,6},{0,0,0,5,0},{3,0,0,0,9},{0,3,0,0,0},{4,0,2,0,0}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int i=4;
		int somma=numMessutente(M,i);
			System.out.print(somma);
		System.out.println();
		
		int utentemassimo = utenteProlifico(M); 
			System.out.println(utentemassimo);
	}
	
	public static int numMessutente(int [][]M, int i){
		int somma=0;
		for (int j = 0; j < M[0].length; j++) {
			somma += M[i][j];
		}
		return somma;
	}
	
	public static int utenteProlifico (int [][]M){
		int [] aus= new int[M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				aus[i]+= M[i][j];
				}
		}
		int h=-1;
		int max=0;
		for (int i = 0; i < aus.length; i++) {
			if (aus[i] > max){
				max = aus[i];
				h=i;
			}
		}
		return h;
	}

}
