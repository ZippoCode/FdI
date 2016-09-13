package EserciziAppelli;

public class Appello_06_02_2012_es3 {

	public static void main(String[] args) {
		int[][] M = { { 5, 8, 5, 9 }, { 10, 7, 10, 10 }, { 10, 8, 5, 3 }, { 4, 3, 3, 1 } };
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println(" ");
		}
		int vaia = massimoSbalzo(M);
		System.out.print(vaia);
		System.out.println(" ");
		int[] v = sbalzi(M);
		int[][] N = aggiungiProdotto(M, v);
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[0].length; j++) {
				System.out.print(N[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		int[][] x = ordina(M);
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int massimoSbalzo(int[][] M) {
		int[] max = new int[M.length];
		int[] min = new int[M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] > max[i]) {
					max[i] = M[i][j];
				}
				min[i] = minimo(M[i]);
			}
		}
		int[] x = new int[max.length];
		for (int i = 0; i < x.length; i++) {
			x[i] = max[i] - min[i];
		}
		int aus = 0;
		int valoreMin = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > valoreMin) {
				valoreMin = x[i];
				aus = i;
			}
		}
		return aus;
	}

	public static int minimo(int[] V) {
		int min = V[0];
		for (int i = 1; i < V.length; i++) {
			if (V[i] < min) {
				min = V[i];
			}
		}
		return min;
	}

	public static int[] sbalzi(int[][] M) {
		int[] max = new int[M.length];
		int[] min = new int[M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] > max[i]) {
					max[i] = M[i][j];
				}
				min[i] = minimo(M[i]);
			}
		}
		int[] x = new int[max.length];
		for (int i = 0; i < x.length; i++) {
			x[i] = max[i] - min[i];
		}
		return x;
	}

	public static int[][] aggiungiProdotto(int[][] M, int[] v) {
		int[][] N = new int[M.length + 1][M[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				N[i][j] = M[i][j];
			}
		}
		for (int i = M.length; i < M.length + 1; i++) {
			for (int j = 0; j < M[0].length; j++) {
				N[i][j] = v[j];
			}
		}
		return N;
	}

	public static int[][] ordina(int[][] M) {
		int[] somma = new int[M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				somma[i] += M[i][j];
			}
		}
		for (int i = 0; i < somma.length - 1; i++) {
			int min = somma[i];
			int pos = i;
			for (int j = i + 1; j < somma.length; j++) {
				if (somma[j] < min) {
					min = somma[j];
					pos = j;
				}
				int temp = somma[i];
				somma[i] = somma[pos];
				somma[pos] = temp;
				ScambiaMatrice(M[i], M[pos]);
			}
		}
		return M;
	}

	public static void ScambiaMatrice(int[] v, int[] w) {
		for (int i = 0; i < w.length; i++) {
			int temp = v[i];
			v[i] = w[i];
			w[i] = temp;
		}
	}

}
