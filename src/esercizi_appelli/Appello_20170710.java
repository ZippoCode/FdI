package esercizi_appelli;

public class Appello_20170710 {

	public static boolean[] costruisciVettori(int[] v1, int[] v2) {
		boolean[] B = new boolean[v1.length];
		for (int i = 0; i < v1.length; i++) {
			B[i] = conta(v1[i], v2);
		}
		return B;
	}

	public static boolean conta(int x, int[] v) {
		int conta = 0;
		for (int i = 0; i < v.length; i++) {
			if (x == v[i])
				conta++;
		}
		return conta >= 2;
	}

	public static void main(String[] args) {
		int[] v1 = { 13, -11, 4, 7, -17, 5 };
		int[] v2 = { 12, 5, 7, 5, 7 };
		boolean[] c = costruisciVettori(v1, v2);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
