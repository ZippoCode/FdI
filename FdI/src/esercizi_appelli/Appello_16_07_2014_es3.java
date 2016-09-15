package esercizi_appelli;

import utility.InOut;

public class Appello_16_07_2014_es3 {

	public static void main(String[] args) {
		int[][] P = { 
				{ 18, 0, 15, 6, 0, 10, 0 }, 
				{ 8, 0, 0, 10, 15, 7, 0 },
				{ 0, 0, 8, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 8 } };
		System.out.println(partnerSingolo(P));
	}

	public static int partnerSingolo(int[][] P) {
		int[] aus = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			int npfi = P[0].length;
			for (int j = 0; j < P[0].length; j++) {
				if (P[i][j] != 0) {
					for (int h = 0; h < P.length; h++) {
						if (P[h][j] != 0 && h != i) {
							npfi--;
							break;
						}
					}
				} else {
					npfi--;
				}
			}
			aus[i] = npfi;
		}
		int indiceMax = 0;
		int valoreMax = aus[0];
		for (int i = 1; i < aus.length; i++) {
			if (valoreMax < aus[i]) {
				indiceMax = i;
				valoreMax = aus[i];
			}
		}
		InOut.stampaVettore(aus);
		return indiceMax;
	}

}
