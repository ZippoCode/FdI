package EserciziMatrici;

public class MatriceTrasposta {

	public static void main(String[] args) {
		int [][]m =	{{1,2,3},{4,5,6},{7,8,9}};
		int [][]n= trasposta(m);
			for(int i=0; i<m.length;i++){
				for(int j=0;j<m[0].length;j++){
					System.out.print(m[i][j]);
				}
				System.out.println("");
		}
			System.out.println("");
			for (int i=0;i<m.length;i++){
				for(int j=0; j<m[0].length;j++){
					System.out.print(n[i][j]);	
				}
				System.out.println("");
			}
			
}
	
	public static int [][] trasposta(int[][]m){
		int [][]trasp = new int [m[0].length][m.length];
		for (int i=0;i<m.length;i++){
			for(int j=0; j<trasp[i].length;j++){
				trasp [i][j]= m[j][i];
			}
		}
		return trasp;
	}
}
