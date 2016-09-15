package esercizi_appelli;

import java.util.Arrays;

public class Appello_16_02_2016_es2 {

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
