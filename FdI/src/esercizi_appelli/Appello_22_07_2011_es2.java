package esercizi_appelli;
/*Si scriva un metodo Java comprimi che riceve in ingresso un vettore di interi V e restituisce un vettore di interi C che ne 
 * rappresenta la versione compressa. Il processo di compressione fa corrispondere ad una sequenza ininterrotta di  K interi N 
 * nel vettore V,  la sequenza (K,N) nel vettore C. Ad esempio, se V=[1,1,1,1,3,3,3,7,7,7,7,7]  allora  C=[4,1,3,3,5,7].
 */

public class Appello_22_07_2011_es2 {

	public static void main(String[] args) {
		int[] v ={1,1,1,1,3,3,3,7,7,7,7,7};
		int k = quantevolte(v);
			System.out.println(k);
		}

	
	
	public static int quantevolte (int []v){
		int k=0;
		for (int i=0; i<v.length-1;i++){
			k = ripetizione(v);
				k++;
		}
		return k;
	}
	
	
	
	
	public static int ripetizione (int []v){
		for (int i=0; i<v.length-1; i++){
			while (v[i]==v[i+1])
				return v[i];
		}
	return -1;
	}
	
}
