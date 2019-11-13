package esercizi_appelli;

import java.util.Arrays;

import utility.InOut;

/* si scriva un metodo java estrai che riceve in ingresso un array di interi a1 e restituisce un array a2 contenente i numeri primi x che compaiono in a1
 * tali che:
  1) x si trova in una posizione dispari (consideriamo 0 una posizione pari) OPPURE
  2) x è minore di tutti gli elementi che lo precedono in a.
  Si noti che non è necessario eliminare i duplicati di a2.
  es:
  a1[11,7,3,4,5,13] -----> a2[11,7,3,13]
 
 */

public class Simulazione_06_06_2016_es1 {
	public static void main(String[] args) {
		//int[] a = { 11, 7, 3, 4, 5, 13 };
		int[] a = InOut.leggiVettoreInt(6);
		InOut.stampaVettore(a);
		int[] b = estrai(a);
		InOut.stampaVettore(b);
	}

	public static int[] estrai(int[] a) {
		int[] b = new int[a.length];
		int indice = 0;
		for (int i = 0; i < a.length; i++) {
			if (primo(a[i])) {
				if (posizionedispari(i) || minoredi(a, i)) {
					b[indice] = a[i];
					indice++;
				}
			}
		}
		b = Arrays.copyOfRange(b, 0, indice);
		return b;
	}

	public static boolean posizionedispari(int indice) {
		if (indice % 2 == 0)
			return false;
		return true;
	}

	public static boolean minoredi(int[] a, int k) {
		for (int i = 0; i < k; i++) {
			if (a[i] < a[k]) {
				return false;
			}
		}
		return true;
	}

	public static boolean primo(int a) {
		if (a != 2 && a % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(a); i += 2) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

}
