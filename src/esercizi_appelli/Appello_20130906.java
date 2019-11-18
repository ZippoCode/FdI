package esercizi_appelli;

public class Appello_20130906 {

	public static void main(String[] args) {
		double[][] M = { { -1, 1, 0.5, 0.3, 1, 1 }, { 1, -1, 0.5, 0.3, -1, -1 }, { 1, 1, 1, 1, 1, 1 },
				{ 0.5, 0.5, 0.5, -1, 0.5, -1 }, { -1, 1, 0.5, 0.3, 0.2, 1 } };
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int[] k = { 5, 8, 5, 5, 5, 2 };
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println();
		double[] voto = votoComplessivo(M, k);
		for (int i = 0; i < voto.length; i++) {
			System.out.print(voto[i] + " ");
		}
		System.out.println();
		int c1 = 1;
		int c2 = 3;
		double[][] N = estraiEsercizi(M, c1, c2);
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[0].length; j++) {
				System.out.print(N[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int[] c = ordinaEsercizi(M);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static double[] votoComplessivo(double[][] M, int[] k) {
		double[] aus = new double[M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] != -1)
					aus[i] += M[i][j] * k[j];
			}
		}
		return aus;
	}

	public static double[][] estraiEsercizi(double[][] M, int c1, int c2) {
		double[][] N = new double[M.length][c2 + c1];
		for (int i = 0; i < M.length; i++) {
			for (int j = c1; j <= c2; j++) {
				N[i][j] = M[i][j];
			}
		}
		return N;
	}

	public static int[] ordinaEsercizi(double[][] M) {
		double[][] aus = new double[2][M[0].length];
		for (int j = 0; j < M[0].length; j++) {
			for (int i = 0; i < M.length; i++) {
				aus[0][j] += M[i][j];
				aus[1][j] = j;
			}
		}
		for (int i = 1; i < M[0].length; i++) {
			double key = aus[0][i];
			double keyIndice = aus[1][i];
			int j = i - 1;
			while (j >= 0 && aus[0][j] > key) {
				aus[0][j + 1] = aus[0][j];
				aus[1][j + 1] = aus[1][j];
				j--;
			}
			aus[0][j + 1] = key;
			aus[1][j + 1] = keyIndice;
		}
		int[] ritorno = new int[aus[1].length];
		for (int i = 0; i < ritorno.length; i++) {
			ritorno[i] = (int) aus[1][i];
		}
		return ritorno;

	}
}
