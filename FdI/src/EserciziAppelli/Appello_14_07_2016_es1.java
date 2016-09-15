package EserciziAppelli;

import java.util.Scanner;

public class Appello_14_07_2016_es1 {

	public static void main(String[] args) {
		int[][] M = { { 192, 10, 12, 4 }, { 4, 48, 3, 6 }, { 4, 3, 12, 4 }, { 4, 4, 10, 4 } };
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println(" ");
		}
		boolean c = Verifica(M);
		System.out.println(c);
	}

	public static boolean Verifica(int[][] M) {
		int[] v = Cornice(M);
		for (int i = 0; i < v.length; i++) {
			if (primo(v[i])) {
				return false;
			}
		}
		if (!diagPrinc(M)) {
			return false;
		}
		for (int i = 0; i < M.length; i++) {
			int n = occminimo(M[i]);
			if (n % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean diagPrinc(int[][] M) {
		int[] v = new int[M.length];
		for (int i = 0; i < M.length - 1; i++) {
			for (int j = 0; j < M[0].length - 1; j++) {
				if (i == j) {
					v[i] = M[i][j];
				}
			}
		}
		for (int i = 0; i < v.length - 1; i++) {
			if (triplo(v, i)) {
				return true;
			}
		}
		return false;
	}

	public static boolean triplo(int[] v, int indice) {
		int somma = 0;
		for (int i = indice + 1; i < v.length; i++) {
			somma += v[i];
		}
		if (somma * 3 == v[indice]) {
			return true;
		}
		return false;
	}

	public static boolean primo(int n) {
		if (n != 2 && n % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int[] Cornice(int[][] M) {
		int h = 0;
		int[] v = new int[(M.length * 2 + M[0].length * 2) - 4];
		for (int i = 0; i < M.length; i++) {
			v[h] = M[0][i];
			h++;
		}
		for (int i = 1; i < M.length; i++) {
			v[h] = M[i][M[0].length - 1];
			h++;
		}
		for (int i = 1; i < M.length; i++) {
			v[h] = M[i][0];
			h++;
		}
		for (int i = 1; i < M[0].length - 1; i++) {
			v[h] = M[M.length - 1][i];
			h++;
		}

		for (int i = 0; i < v.length; i++) {
		}
		return v;
	}

	public static int occminimo(int[] v) {
		int min = v[0];
		int k = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < min) {
				min = v[i];
				k++;
			}
		}
		return k;
	}
}
