package esercizi_appelli;

public class Appello_20170621 {

	public static boolean esercizioDue(int[] v) {
		for (int i = 0; i < v.length; i++) {
			if ((i + 1) % 2 == 0) {
				if (!numeroPerfetto(v[i]))
					return false;
			} else {
				if (!numeroPrimo(v[i]))
					return false;
			}
		}
		return true;
	}

	private static boolean numeroPerfetto(int n) {
		int somma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				somma += i;
		}
		if (somma == n)
			return true;
		else
			return false;
	}

	private static boolean numeroPrimo(int n) {
		if (n <= 3)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i < n; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		//Vector v = new Vector(6);
		// v.readVector();
		int[] vector = { 11, 28, 17, 496, 13, 6 };
		System.out.println(esercizioDue(vector));
	}
}
