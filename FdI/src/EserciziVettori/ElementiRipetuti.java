package EserciziVettori;
/*Scrivere un metodo elementiRipetuti che riceve in ingresso un vettore di interi v e restituisce 
 * il numero di elementi ripetuti al suo interno
 */

public class ElementiRipetuti {

	public static void main(String[] args) {
		int []a={1,1,1,2,2,3,5};
		int contatore = elementiripetuti (a);
		System.out.println ("il numero di elementi è " + contatore);
	}
	
	public static int elementiripetuti (int []a){
		int k=0;
		for (int i =0; i<a.length;i++){
			if (!presente (a, a[i],k) && ripetuto (a, i))
				k++;
		}
		return k;
}		
	
	
	public static boolean ripetuto (int []a, int k){
		for (int i= k+1; i<a.length;i++){
			if (a[k]==a[i])
				return true;
		}
		return false;
	}
	
	public static boolean presente (int []a, int k, int indiceMax){
		for (int i =0; i<indiceMax; i++){
			if (a[i]==k)
				return true;
		}
		return false;
	}



}
