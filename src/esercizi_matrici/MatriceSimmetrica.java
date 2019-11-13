package esercizi_matrici;

public class MatriceSimmetrica {

	public static void main(String[] args) {
		int [][]m= {{1,1,1,5},
				    {1,5,1,1},
				    {1,1,6,1},
			     	{1,1,1,7}};
		if (simmetriadiagonaleprincipale(m))
			System.out.println("la matrice è simmetrica rispetto alla diagonale principale");
		else
			System.out.println("la matrice non è simmetrica rispetto alla diagonale principale");

	}
	public static boolean simmetriadiagonaleprincipale (int [][]m){
		for (int i=1; i<m.length-1; i++){
			for(int j=i+1; j<m[i].length; j++){
				if (m[i][j]!=m[j][i])
					return false;
			}
		}
		return true;
	}
}
