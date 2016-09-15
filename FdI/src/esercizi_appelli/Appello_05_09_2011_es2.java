package esercizi_appelli;
/*Si scriva un metodo Java verificaSottoVettori che riceve in ingresso due vettori di interi V e W, ognuno dei quali contiene 
 * valori distinti, restituisce true se e solo se gli elementi di W sono una sotto-sequenza inversa degli elementi di V, cioè  
 * gli elementi di W sono tutti contenuti in V (anche se ne possono mancare alcuni di essi) e sono riportati nella stessa sequenza 
 * inversa in cui occorrono nel vettore V. Ad esempio, se V=[5,6,1,4,9,2,8,7] e W=[7,4,6,5] allora il metodo 
 * restituisce true mentre con W = [5,6,4,7] o W = [4,7,6,5] il metodo restituisce false.
*/

public class Appello_05_09_2011_es2 {

	public static void main(String[] args) {
		int[] w = { 5, 6, 1, 4, 9, 2, 8, 7 };
		int[] v = { 0, 4, 6, 5 };
		if (sottosequenzainversa(w, v))
			System.out.println("il metodo è verificato");
		else
		System.out.println("il metodo non è verificato");
	}

	public static boolean sottosequenzainversa(int[] v, int[] w) {
		for (int i = 0; i < v.length; i++) {
			if (!valoridistinti(v, i))
				return false;
		}
		for (int i = 0; i < v.length; i++) {
			if (presente(v, w[i]))
				if (dovesitrova(v, w[i]) > i)
					return true;
		}
		return false;

	}

	public static boolean valoridistinti(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[k] && i!= k)
				return false;
		}
		return true;

	}

	public static boolean presente(int[] grande, int k) {
		for (int j = 0; j < grande.length; j++) {
			if (grande[j] == k)
				return true;
		}
		return false;
	}

	public static int dovesitrova(int[] grande, int numero) {
		for (int i = 0; i < grande.length; i++) {
			if (grande[i] == numero)
				return i;
		}
		return -1;
	}

}
