package esercizi_matrici;

public class ElementiSopraDiagonalePrincipale {

	public static void main(String[] args) {
		int [][]m =	{{1,6,3},
					{4,5,6},
					{7,8,9}};
			for(int i=0; i<m.length;i++){
				for(int j=0;j<m[0].length;j++){
					System.out.print(m[i][j] + " ");
				}
				System.out.println("");
		}
			if(sopradiagonaleprincipale(m))
				System.out.println("il metodo è verificato");
			else
				System.out.println("il metodo non è verificato");
	}
	
	public static boolean sopradiagonaleprincipale(int[][]m){
		for (int i=0;i<m.length;i++){
			for(int j=i; j<m[0].length; j++){
				if(m[i][j]<0)
					return false;
			}
		}
		return true;
	}
	
}
