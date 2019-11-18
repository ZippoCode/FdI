package esercizi_appelli;

public class Appello_20180213 {

	public static void main(String[] args) {
		esercizioDue();
	}

	public static void esercizioDue() {
		int[] v = { 7, 10, 25, 8, 12, 15, 20, 30, 6, 15 };
		int k = 5;
		int[] v2 = costruisciVettore(v, k);
		for (int i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + " - ");
		}
		System.out.println();
		int[] v3 = { 3, 1, 2, 7 };
		v2 = costruisciVettore(v3, k);
		for (int i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + " - ");
		}
	}

	public static int[] costruisciVettore(int[] v, int k) {
		int[] vector = new int[v.length];
		int index = 0;
		for (int i = 0; i < vector.length; i++) {
			if (v[i] > k && cercaNumeroMaggiori(v[i], v) > k) {
				vector[index] = v[i];
				index += 1;
			}
		}
		if (index == 0) {
			vector = new int[1];
			vector[0] = -1;
		}
		return vector;
	}

	public static int cercaNumeroMaggiori(int elementoMax, int[] v) {
		int count = 0;
		for (int i = 0; i < v.length; i++) {
			if (elementoMax >= v[i])
				count = count + 1;
		}
		return count;
	}

}
