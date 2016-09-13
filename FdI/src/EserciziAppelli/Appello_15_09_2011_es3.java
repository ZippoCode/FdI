package EserciziAppelli;

public class Appello_15_09_2011_es3 {

public static void main(String[] args) {
	int [][]M= {{10,1,0,0},{2,2,1,1},{10,8,5,1},{4,3,3,1}};
	for (int i = 0; i < M.length; i++) {
		for (int j = 0; j < M[0].length; j++) {
			System.out.print(M[i][j]+ " ");
}
System.out.println(" ");
}
System.out.println(" ");
	int n= 0;
	int indice= citationIndex(M,n);
		System.out.print(indice);
	System.out.println();
	int indicemassimo= piuCitato(M);
		System.out.print(indicemassimo);
System.out.println();
		int k=2;	
		int [] fine = autoriCitazioni(M,k);
			for (int i = 0; i < fine.length; i++) {
		System.out.print(fine[i]+ " ");
			}
	}
	
	public static int citationIndex (int[][]M, int n){
	for (int i= M[0].length;i>0; i--) {
		int count=0;	
		for (int j = 0; j < M[0].length; j++) {
				if (M[n][j] >= i){
					count++;
					}
				}
			if (count >= i){
				return i;
		}
	}
	return 0;
	}
	
	public static int piuCitato (int[][]M){
		int indicemassimo=0;
		int max=0;
		for (int i=0; i<M.length; i++){
		int citation = citationIndex (M,i);
			if(citation > max){
				indicemassimo=i;
				max = citation;
			}
	}
	return indicemassimo;
	}
	
	public static int [] autoriCitazioni(int [][]M, int k){
		int [] aus = new int [M.length*2];
		int h=0 ;
		for (int i = 0; i < M.length; i++) {
			int citation = citationIndex(M,i);
			if (citation >= k){
				aus[h]= i ;
				aus[++h]= Somma (M,i) ;
				h++;
			}
		}
		int [] result= new int [h];
		for (int i = 0; i <h; i++) {
			result[i]= aus[i];
		}
	return result;
	}
	
	public static int Somma (int [][]M, int i){
		int somma = 0;
		for (int j = 0; j < M[0].length; j++) {
			somma += M[i][j];
		}
		return somma;
	}
}
