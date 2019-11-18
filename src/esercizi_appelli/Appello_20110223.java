package esercizi_appelli;

public class Appello_20110223 {

	public static void main(String[] args) {
		int[] x = { 2, 4, 3, 8, 24, 9 };
		System.out.println(esercizioDue(x, 2));
	}

	public static boolean esercizioDue(int[] n, int k) {
		/*
		 * Si scriva un metodo Java verifica che, dato un vettore di interi V di
		 * dimensione pari ed un intero k, restituisca un valore booleano. In
		 * particolare, il metodo restituisce true se ogni elemento della prima met� di
		 * V � sottomultiplo di almeno k elementi della seconda met� di V. Ad esempio,
		 * per V={2, 4, 3, 8, 24, 9} e k=2 restituisce true, poich� gli elementi 2, 3 e
		 * 4 che compaiono nella prima met� del vettore hanno almeno k=2 multipli nella
		 * seconda met� del vettore ({8,24} per gli interi 2 e 4 e {9,24} per il 3).
		 */
		return verifica(n, k);
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

	public static void esercizioTre() {
		boolean[][] P = { { true, false, true, true, false, false, false, true, false, false },
				{ false, true, true, true, true, false, false, true, true, true },
				{ false, false, false, false, false, true, true, false, false, true },
				{ false, true, false, false, false, false, false, false, false, false },
				{ false, true, false, true, false, false, false, true, false, true } };
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[0].length; j++) {
				System.out.print(P[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int p = 1;
		int[] ciao = autori(P, p);
		for (int i = 0; i < ciao.length; i++) {
			System.out.print(ciao[i] + " ");
		}
		System.out.println(" ");
		int[] miao = singoliautori(P);
		for (int i = 0; i < miao.length; i++) {
			System.out.print(miao[i] + " ");
		}

	}

	public static int[] autori(boolean P[][], int p) {
		int h = 0;
		int[] aus = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			if (P[i][p] == true) {
				aus[i] = h;
			}
			h++;
		}
		int[] ritorno = new int[aus.length];
		int k = 0;
		for (int i = 0; i < ritorno.length; i++) {
			if (aus[i] != 0)
				if (numeroOccorrenze(P, aus[i]) >= 2) {
					ritorno[k] = aus[i];
					k++;
				}
		}
		int[] ritornoSenza0 = new int[k];
		for (int i = 0; i < k; i++) {
			ritornoSenza0[i] = ritorno[i];
		}
		return ritornoSenza0;
	}

	public static int numeroOccorrenze(boolean P[][], int indiceRiga) {
		int numeroOccorrenze = 0;
		for (int i = 0; i < P[0].length; i++) {
			if (P[indiceRiga][i])
				numeroOccorrenze++;
		}
		return numeroOccorrenze;
	}

	public static int[] singoliautori(boolean[][] P) {
		int[] aus = new int[P[0].length];
		for (int i = 0; i < P[0].length; i++) {
			for (int j = 0; j < P.length; j++) {
				if (P[j][i])
					aus[i] = i;
			}

		}
		int[] ritorno = new int[aus.length];
		int k = 0;
		for (int i = 0; i < ritorno.length; i++) {
			if (numOcc(P, aus[i]) == 1) {
				ritorno[k] = aus[i];
			}
			k++;
		}
		return ritorno;
	}

	public static int numOcc(boolean[][] P, int indicecolonna) {
		int numOccorrenze = 0;
		for (int i = 0; i < P.length; i++) {
			if (P[i][indicecolonna])
				numOccorrenze++;
		}
		return numOccorrenze;
	}

}
