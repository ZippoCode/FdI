package esercizi_matrici;

public class MatriceTriangolareInferiore {

	public static void main(String[] args) {
		int [][]m= {{1,0,0,0},{1,4,0,0},{5,6,1,0},{10,5,15,10}};
		for(int i=0;i<m.length; i++){
			for (int j=0;j<m[0].length;j++){
				System.out.print(m[i][j] + " ");
				}
			System.out.println("");
		}	
		if (triangolareinferiore(m))
			System.out.println("la matrice è triangolare inferiore");
		else
			System.out.println("la matrice non è triangolare inferiore");

	}
	
	
	public static boolean triangolareinferiore(int [][]m){
		for(int i=0;i<m.length; i++){
			for(int j=m.length-1-i; j>i; j--){
				if(m[i][j]==0)
					return true;
			}
		}
		return false;
	}
}
