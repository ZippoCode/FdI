package esercizi_appelli;

import java.util.Arrays;

public class Appello_20160216 {

	public static void main(String[] args) {
		int[][] P = { { 0, 0, 9, 0, 1 }, { 10, 6, 3, 10, 1 }, { 5, 0, 2, 0, 3 }, { 20, 6, 2, 0, 4 } };
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[0].length; j++) {
				System.out.print(P[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		int[][] C = { { 4, 6, 0, 0, 2, 0 }, { 1, 2, 3, 4, 5, 6 }, { 8, 2, 10, 0, 0, 5 }, { 10, 5, 0, 10, 0, 0 } };
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		int x = 2;
		int sommafin = bilancioProdotto(P, C, x);
		System.out.println(sommafin);
		System.out.println();
		int[] c = piuRichiesti(C);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println();

		int[][] fin = daRichiedere(P, C);
		for (int j = 0; j < fin.length; j++) {
			for (int j2 = 0; j2 < fin[0].length; j2++) {
				System.out.print(fin[j][j2] + " -  ");
			}
			System.out.println();
		}
	}

	public static void esercizioUno() {
		int[][] m = { { 5, 3, 4, 7, 14, 5 }, { 8, 2, 2, 2, 1, 12 }, { 16, 15, 3, 3, 5, 11 }, { 9, 4, 4, 4, 3, 4 },
				{ 13, 8, 4, 6, 7, 4 } };
		if (verifica(m))
			System.out.println("il metodo funziona,vaia a Dio");
		else
			System.out.println("vaia la madonna cunsacrata");
	}

	public static boolean verifica(int[][] m) {
		if (matriceinterna(m) <= occorrenzanumeripriminellacornice(m)) {
			return true;
		}
		return false;

	}

	public static int matriceinterna(int[][] m) {
		int max = 0;
		for (int i = 1; i < m.length - 1; i++) {
			for (int j = 1; j < m[0].length - 1; j++) {
				if (m[i][j] > max)
					max = m[i][j];
			}

		}
		return max;
	}

	public static int occorrenzanumeripriminellacornice(int[][] M) {
		int k = 0;
		int[] vettore = ritornacornice(M);
		for (int i = 0; i < vettore.length; i++) {
			if (primi(vettore[i]))
				k++;
		}
		return k;
	}

	public static int[] ritornacornice(int[][] m) {
		int k = 0;
		int[] v = new int[m.length * m[0].length];
		for (int i = 0; i <= m.length; i++) {
			v[k] = m[0][i];
			k++;
		}
		for (int i = 1; i < m.length; i++) {
			v[k] = m[i][m[0].length - 1];
			k++;
		}
		for (int i = m.length - 1; i >= 0; i--) {
			v[k] = m[m.length - 1][i];
			k++;
		}
		for (int i = m.length - 2; i > 0; i--) {
			v[k] = m[i][0];
			k++;
		}
		return v;

	}

	public static boolean primi(int n) {
		if (n != 2 && n % 2 == 0)
			return false;
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int bilancioProdotto(int[][] P, int[][] C, int x) {
		int sommafin = 0;
		int sommaP = 0;
		int sommaC = 0;
		for (int j = 0; j < P[0].length; j++) {
			sommaP += P[x][j];
		}
		for (int j = 0; j < C[0].length; j++) {
			sommaC += C[x][j];
		}
		sommafin = sommaP - sommaC;
		return sommafin;
	}

	public static int[] piuRichiesti(int[][] C) {
		int somma[] = new int[C.length];
		int[] aus = new int[C.length];
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				somma[i] += C[i][j];
				aus[i] = somma[i];
			}
		}
		int max = 0;
		for (int i = 0; i < aus.length; i++) {
			if (aus[i] > max) {
				max = aus[i];
			}
		}
		int k = 0;
		int[] c = new int[aus.length];
		for (int i = 0; i < aus.length; i++) {
			if (aus[i] == max) {
				c[k] = i;
				k++;
			}
		}
		c = Arrays.copyOf(c, k);
		return c;
	}

	public static int[][] daRichiedere(int[][] P, int[][] C) {
		int[] sommaP = new int[P.length];
		int[] sommaC = new int[C.length];
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[0].length; j++) {
				sommaP[i] += P[i][j];
			}
		}
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				sommaC[i] += C[i][j];
			}
		}
		int[] resto = new int[C.length];
		for (int i = 0; i < sommaC.length; i++) {
			if (sommaC[i] > sommaP[i])
				resto[i] = sommaC[i] - sommaP[i];
		}
		int[][] fin = new int[2][C.length];
		int[] indice = new int[C.length];
		for (int i = 0; i < C.length; i++) {
			if (sommaC[i] > sommaP[i]) {
				indice[i] = i;
			}
			fin[0][i] = indice[i];
			fin[1][i] = resto[i];
		}
		return fin;
	}
}
