package Utility;

public class Operazioni {

	public static double addizione(double x, double y) {
		return x + y;
	}

	public static double sottrazione(double x, double y) {
		return x - y;
	}

	public static double moltiplicazione(double x, double y) {
		return x * y;
	}

	public static double divisione(double x, double y) {
		return x / y;
	}

	public static double potenza(double x, double y) {
		if (x == 0 && y == 0) {
			return Double.POSITIVE_INFINITY;
		}
		double potenza = 1;
		while (y > 0) {
			potenza *= x;
			y--;
		}
		return potenza;
	}

}
