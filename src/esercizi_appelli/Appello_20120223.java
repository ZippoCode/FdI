package esercizi_appelli;

/*Si scriva un metodo Java MaxMin3D che riceve in ingresso due vettori di double di ugual dimensione V e W, di numeri
reali, che rappresentano una funzione f(x) reale attraverso i suoi punti notevoli. Si assume che il vettore V sia ordinato. I
punti notevoli della funzione sono quelli riportati nel vettore V. Per ogni punto notevole V[i], in W[i] � memorizzato il
valore f(V[i]). Si scriva un metodo che restituisca in un vettore di dimensione appropriata i punti notevoli corrispondenti ai
minimi locali della funzione f. Ad esempio, se V=[1.4, 2.2, 5.5, 6.1, 7.3, 8.0, 9.1] e W=[1.5, 3.6, 4.4, 3.9, 1.0, 2.2, 0.7]
allora il metodo restituisce il vettore [1.4, 7.3, 9.1], poich� questi sono i punti notevoli in cui la funzione presenta i valori
di minimo locale (rispettivamente, i valori 1.5, 1.0 e 0.7).
 * 
 */
public class Appello_20120223 {

	public static void main(String[] args) {
		double[] a = { 1.4, 2.2, 5.5, 6.1, 7.3, 8.0, 9.1 };
		double[] b = { 1.5, 3.6, 4.4, 3.9, 1.0, 2.2, 0.7 };
		double[] c = MaxMin3D(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public static double[] MaxMin3D(double[] a, double[] b) {
		int k = 0;
		double[] v = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i == 0 && minsuccessore(b[i], b[i + 1])) {
				v[k] = a[i];
				k++;
			} else if (i == a.length - 1 && minpredecessore(b[i - 1], b[i])) {
				v[k] = a[i];
				k++;
			} else if (minsuccessore(b[i], b[i + 1]) && minpredecessore(b[i - 1], b[i])) {
				v[k] = a[i];
				k++;
			}
		}
		return v;
	}

	public static boolean minpredecessore(double a, double b) {
		if (b < a)
			return true;
		return false;
	}

	public static boolean minsuccessore(double a, double b) {
		if (a < b)
			return true;
		return false;
	}

	public static void esercizioTre() {
		int[][] M = { { -1, 2, -1, 7 }, { -1, 10, 5, 6 }, { 2, -1, 1, 12 }, { 3, 9, 2, 10 }, { -1, 11, 16, 11 } };
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		int[] T = { 1, 2, 2, 1 };
		for (int i = 0; i < T.length; i++) {
			System.out.print(T[i] + " ");
		}
		System.out.println();
		int i = 1;
		int t = 1;
		int max = bestScore(M, i, t, T);
		System.out.println(max);
		int[][] N = graduatoria(M, t, T);
		for (int j = 0; j < N.length; j++) {
			for (int j2 = 0; j2 < N[0].length; j2++) {
				System.out.print(N[j][j2] + " ");
			}
			System.out.println();
		}
	}

	public static int bestScore(int[][] M, int i, int t, int[] T) {
		int max = 0;
		for (int j = 0; j < M[0].length; j++) {
			if (t == T[j]) {
				if (M[i][j] > max) {
					max = M[i][j];
				}
			}
		}
		return max;
	}

	public static int[][] graduatoria(int[][] M, int t, int[] T) {
		int[] somma = new int[M.length];
		int[] media = new int[M.length];
		int[][] N = new int[M.length][2];
		for (int i = 0; i < M.length; i++) {
			somma[i] += M[i][t];
		}
		for (int i = 0; i < somma.length; i++) {
			media[i] = somma[i] / 2;
		}
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N.length; j++) {
				N[i][0] = i;
				N[i][1] = media[i];
			}
		}
		return N;
	}

}
