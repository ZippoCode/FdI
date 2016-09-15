package esercizi_matrici;

public class MatriceTriangolareSuperiore {

	public static void main(String[] args) {
		int [][]m= {{1,3,5,5},{0,4,2,1},{0,0,3,1},{0,0,0,10}};
		for(int i=0;i<m.length; i++){
			for (int j=0;j<m[0].length;j++){
				System.out.print(m[i][j] + " ");
				}
			System.out.println("");
		}	
		if (triangolaresuperiore(m))
			System.out.println("la matrice è triangolare superiore");
		else
			System.out.println("la matrice non è triangolare superiore");
		
	
	}
	
	public static boolean triangolaresuperiore(int[][]m){
		for (int i=1;i<=m.length-1;i++){
			for (int j=0; j<i ; j++){
				if (m[i][j]!=0){
					return false;
				}
			}
		}
		
		return true;
	}
}
