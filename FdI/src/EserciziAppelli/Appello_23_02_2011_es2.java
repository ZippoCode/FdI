package EserciziAppelli;

/*Si scriva un metodo Java verifica che, dato un vettore di interi V di dimensione pari ed un intero k, restituisca un valore booleano. 
 * In particolare, il metodo restituisce true se ogni elemento della prima metà di V è sottomultiplo di almeno k elementi della seconda metà
 *  di V. Ad esempio, per V={2, 4, 3, 8, 24, 9} e k=2 restituisce true, poiché  gli elementi 2, 3 e 4 che compaiono nella prima metà 
 *  del vettore hanno almeno k=2 multipli nella seconda metà del vettore ({8,24} per gli interi 2 e 4 e {9,24} per il 3). 
 */
public class Appello_23_02_2011_es2 {

	public static void main(String[] args) {
		int[] x = { 2, 4, 3, 8, 24, 9 };
		System.out.println(verifica(x, 2));
	}

	public static boolean verifica(int[] v, int k) {
		int n = numeriMultipli(v);
		return k <= n;
	}

	public static int numeriMultipli(int[] n) {
		int multipliMax = 0;
		for (int i = 0; i < n.length / 2; i++) {
			int multipli = 0;
			for (int j = n.length / 2; j < n.length; j++) {
				if (n[j] % n[i] == 0) {
					multipli++;
				}
			}
			System.out.println(multipli);
			if (multipli > multipliMax)
				multipliMax = multipli;
		}
		return multipliMax;
	}
}
