package EserciziAppelli;

public class Appello_22_07_2011_es3 {

	public static void main(String[] args) {
		int [][]M= {{-5,-2,4,12},{-1,10,5,6},{2,9,20,12},{-1,11,16,11}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int k=15;
		boolean c= pendenza(M,k);
		System.out.println(c);
		System.out.println(" ");
		
		int [][]M2 = {{-2,2,-1,-3},{3,7,10,-8},{1,4,13,8},{2,3,6,5}};
		for (int i = 0; i < M2.length; i++) {
			for (int j = 0; j < M2[0].length; j++) {
				System.out.print(M2[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		boolean p= verifica(M,M2);
			System.out.println(p);
	}
	


	public static boolean pendenza (int [][]M, int k){
		for (int i = 0; i < M.length-1; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (Math.abs(M[i][j]-M[i+1][j]) > k)
					return false;
			}
		}
		return true;
	}
	
	public static boolean verifica (int [][]M, int [][]M2){
		int h=0;
		int z=0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j]>0){
				h++;
				}
			}
		}
		for (int j = 0; j < M2[0].length; j++) {
			for (int i = 0; i < M2.length; i++) {
			if (M[i][j]>0){
				z++;
			}
		}
	}
		for (int i = 0; i < M.length; i++) {
			if(h==z)
				return true;
		}	
		return false;
	}

}
	




