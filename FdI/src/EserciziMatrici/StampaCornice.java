package EserciziMatrici;

public class StampaCornice {

	public static void main(String[] args) {
		int [][]m ={{1,3,5,0},
				{8,4,2,1},
				{7,0,3,1},
				{1,0,0,5}};
		for(int i=0;i<m.length; i++){
			for(int j=0;j<m[0].length; j++){
				System.out.print(m[i][j] + " ");
			}
		System.out.println(" ");
		}
		System.out.println(" ");
		
		stampacornice(m);
		

	}
	
	public static void stampacornice (int[][]m){
		for (int i=0; i<m.length; i++) 
			System.out.print(m[0][i] + " "); //prima riga
		System.out.println();
		for (int i=0;i<=m.length-1;i++)
			System.out.print(m[i][m.length-1] + " "); //ultima colonna
		System.out.println();
		for (int i=m.length-1; i>=0; i--)
			System.out.print(m[m.length-1][i] + " "); //ultima riga
		System.out.println();
		for (int i=m[0].length-1; i>=0;i--)
			System.out.print(m[i][0] + " "); //prima colonna
		}
}
