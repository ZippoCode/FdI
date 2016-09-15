package esercizi_matrici;

public class DiagonalePrincipale_DiagonaleSecondaria {

	public static void main(String[] args) {
		int [][]m= {{1,3,5,5},{1,4,2,1},{1,2,3,1},{2,1,5,3}};
		for(int i=0;i<m.length; i++){
			for (int j=0;j<m[0].length;j++){
				System.out.print(m[i][j] + " ");
				}
			System.out.println("");
		}
		boolean somma= sommadiagonaleprincipale(m) == sommadiagonalesecondaria(m);
			
		System.out.println(somma);
	
	}
	
	public static int sommadiagonaleprincipale(int[][]m){
		int somma=0;
		for(int i=0;i<m.length;i++){
			somma+= m[i][i];
		}
		/*for(int i=0;i<m.length; i++){                   
			for(int j=0;j<m[0].length;j++){
				if (i==j){
					somma += m[i][j];
					}
				}
		}*/
		return somma;
	}

	public static int sommadiagonalesecondaria(int[][]m){
		int somma=0;
		for (int i=0;i<m.length;i++){
			somma+= m[i][m.length-1-i];
		}
		
		/*
		 for(int i=0;i<m.length; i++){
		 
			for(int j=m.length-1;j>=0;j--){
				if (i+j==m.length-1){
					somma += m[i][j];
					}
				}
		}
		*/
		return somma;
	}

}

