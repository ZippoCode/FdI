package esercizi_appelli;

public class Appello_07_07_2011_es2 {

	public static void main(String[] args) {
		int[] v1 = { 1, 2, 3, 4 };
		int[] v2 = { 1, 2, 2, 2, 1, 1 };
		int[] v3 = { 1, 3, 3, 3, 5 };
		int[] risultato = estrai(v1, v2, v3);
		for (int i = 0; i < v1.length; i++) {
			System.out.print(risultato[i] + " ");
		}

	}

	public static int[] estrai(int[] a, int[] b, int[] c) {
		int[] risultato = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (noripetizioni(a, i) && presentealmeno2volte(b, a[i]) && presentemenodiduevolte(c, a[i])) {
				risultato[k] = a[i];
				k++;
			}
		}
		return risultato;
	}

	public static boolean noripetizioni(int[] x, int indice) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == x[indice] && i != indice)
				return false;
		}
		return true;
	}

	public static boolean presentealmeno2volte(int[] x, int k) {
		int somma = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == k) {
				somma++;
				if (somma >= 2)
					return true;
			}
		}
		return false;
	}

	public static boolean presentemenodiduevolte(int[] x, int k) {
		int somma = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == k) {
				somma++;
				if (somma >= 3)
					return false;
			}
		}
		return true;
	}

}
