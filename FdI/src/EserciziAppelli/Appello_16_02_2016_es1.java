package EserciziAppelli;

public class Appello_16_02_2016_es1 {

	public static void main(String[] args) {
		int[][] m = { { 5, 3, 4, 7, 14, 5 }, 
					{ 8, 2, 2, 2, 1, 12 }, 
					{ 16, 15, 3, 3, 5, 11 }, 
					{ 9, 4, 4, 4, 3, 4 },
					{ 13, 8, 4, 6, 7, 4 } };
		if (verifica(m))
			System.out.println("il metodo funziona,vaia a Dio");
		else
			System.out.println("vaia la madonna cunsacrata");
	}
	
	public static boolean verifica (int [][]m){
		if (matriceinterna(m) <= occorrenzanumeripriminellacornice(ritornacornice(m)))
			return true;
		return false;
	
	}
	
	public static int matriceinterna (int [][]m){
		int max=0;
		for (int i=1;i<m.length-1;i++){
			for (int j=1; j<m[0].length-1;j++){
				if (m[i][j]>max)
					max = m[i][j];
			}
			
		}
		return max;
	}
	
	
	public static int occorrenzanumeripriminellacornice(int []v){
		int k=0;
		for (int i=0; i<v.length;i++){
			if (primi (v[i]))
				k++;
		}
		return k;
	}
	
	public static int[] ritornacornice(int[][] m) {
		int k=0;
		int[] v = new int[m.length * m[0].length];
		for (int i = 0; i <= m.length; i++) {
			v[k] = m[0][i];
			k++;
		}
		for (int i = 1; i < m.length; i++) {
			v[k] = m[i][m[0].length-1];
			k++;
		}
		for (int i = m.length - 1; i >= 0; i--) {
			v[k] = m[m.length-1][i];
			k++;
		}
		for (int i = m.length - 2; i > 0; i--) {
			v[k] = m[i][0];
			k++;
		}
		return v;
		
	
	
	}
	
	public static boolean primi (int n){
		if (n!=2 && n%2==0)
			return false;
		for (int i=3; i<Math.sqrt(n);i+=2){
			if (n%i==0)
				return false;
		}
		return true;	
	}
}
