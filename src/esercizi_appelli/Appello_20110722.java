package esercizi_appelli;

public class Appello_20110722 {

	public static void main(String[] args) {
		int[] v = { 1, 1, 1, 1, 3, 3, 3, 7, 7, 7, 7, 7 };
		int n = esercizioDue(v);
		System.out.println(n);
		esercizioTre();
	}

	public static int esercizioDue(int[] v) {
		/*
		 * Si scriva un metodo Java comprimi che riceve in ingresso un vettore di interi
		 * V e restituisce un vettore di interi C che ne rappresenta la versione
		 * compressa. Il processo di compressione fa corrispondere ad una sequenza
		 * ininterrotta di K interi N nel vettore V, la sequenza (K,N) nel vettore C. Ad
		 * esempio, se V=[1,1,1,1,3,3,3,7,7,7,7,7] allora C=[4,1,3,3,5,7].
		 */
		int k = quantevolte(v);
		return k;
	}

	public static int quantevolte(int[] v) {
		int k = 0;
		for (int i = 0; i < v.length - 1; i++) {
			k = ripetizione(v);
			k++;
		}
		return k;
	}

	public static int ripetizione(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			while (v[i] == v[i + 1])
				return v[i];
		}
		return -1;
	}

	public static void esercizioTre() {
		int[][] M = { { -5, -2, 4, 12 }, { -1, 10, 5, 6 }, { 2, 9, 20, 12 }, { -1, 11, 16, 11 } };
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int k = 15;
		boolean c = pendenza(M, k);
		System.out.println(c);
		System.out.println(" ");

		int[][] M2 = { { -2, 2, -1, -3 }, { 3, 7, 10, -8 }, { 1, 4, 13, 8 }, { 2, 3, 6, 5 } };
		for (int i = 0; i < M2.length; i++) {
			for (int j = 0; j < M2[0].length; j++) {
				System.out.print(M2[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		boolean p = verifica(M, M2);
		System.out.println(p);
	}

	public static boolean pendenza(int[][] M, int k) {
		for (int i = 0; i < M.length - 1; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (Math.abs(M[i][j] - M[i + 1][j]) > k)
					return false;
			}
		}
		return true;
	}

	public static boolean verifica(int[][] M, int[][] M2) {
		int h = 0;
		int z = 0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] > 0) {
					h++;
				}
			}
		}
		for (int j = 0; j < M2[0].length; j++) {
			for (int i = 0; i < M2.length; i++) {
				if (M[i][j] > 0) {
					z++;
				}
			}
		}
		for (int i = 0; i < M.length; i++) {
			if (h == z)
				return true;
		}
		return false;
	}

}
