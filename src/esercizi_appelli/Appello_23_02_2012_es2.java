package esercizi_appelli;

/*Si scriva un metodo Java MaxMin3D che riceve in ingresso due vettori di double di ugual dimensione V e W, di numeri
reali, che rappresentano una funzione f(x) reale attraverso i suoi punti notevoli. Si assume che il vettore V sia ordinato. I
punti notevoli della funzione sono quelli riportati nel vettore V. Per ogni punto notevole V[i], in W[i] è memorizzato il
valore f(V[i]). Si scriva un metodo che restituisca in un vettore di dimensione appropriata i punti notevoli corrispondenti ai
minimi locali della funzione f. Ad esempio, se V=[1.4, 2.2, 5.5, 6.1, 7.3, 8.0, 9.1] e W=[1.5, 3.6, 4.4, 3.9, 1.0, 2.2, 0.7]
allora il metodo restituisce il vettore [1.4, 7.3, 9.1], poiché questi sono i punti notevoli in cui la funzione presenta i valori
di minimo locale (rispettivamente, i valori 1.5, 1.0 e 0.7).
 * 
 */
public class Appello_23_02_2012_es2 {

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

}
