package esercizi_vettori;

public class EserciziSimone {

	public static int[] costruisciVettori(int[] v1, int[] v2) {
		int maxV2 = getMax(v2);
		int pos = 0;
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] > maxV2)
				pos++;
		}
		if (pos == 0) {
			int[] vettore = new int[1];
			vettore[0] = maxV2;
			return vettore;
		}
		int[] vettore = new int[pos];
		int k = 0;
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] > maxV2) {
				vettore[k] = v1[i];
				k++;
			}
		}
		return vettore;
	}

	public static int getMax(int[] v) {
		int max = v[0];
		for (int i = 0; i < v.length; i++)
			if (max < v[i])
				max = v[i];
		return max;
	}

	public static int[] rimuoviMultipli(int[] v1, int[] v2) {
		int pos = 0;
		for (int i = 0; i < v2.length; i++) {
			if (nonMultiplo(v1, v2[i]) == true) {
				pos++;
			}
		}
		if (pos == 0) {
			int[] vettore = new int[1];
			vettore[0] = -1;
			return vettore;
		}
		int k = 0;
		int[] vettore = new int[pos];
		for (int i = 0; i < v2.length; i++) {
			if (nonMultiplo(v1, v2[i]) == true) {
				vettore[k] = v2[i];
				k++;
			}
		}
		return vettore;
	}

	public static boolean nonMultiplo(int[] v, int numero) {
		for (int i = 0; i < v.length; i++) {
			if (numero % v[i] == 0)
				return false;
		}
		return true;
	}

	public static int[] creaVettore(int[] v) {
		/*
		 * int[] S = new int[v.length]; for (int i = 0; i < v.length; i++) { if (v[i] >
		 * 0) { int somma = v[i]; for (int j = i + 1; j < v.length; j++) { if (v[j] > 0)
		 * { somma += v[j]; } } S[i] = somma; for (int j = i + 1; j < v.length && v[j] <
		 * 0; j++) { S[j] = somma; } } } return S;
		 */
		int[] risultato = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			for (int j = i; j < risultato.length; j++) {
				if (v[j] > 0)
					risultato[i] += v[j];
			}
		}
		return risultato;
	}

	public static int[] selezionaVettore(int[] v1, int[] v2) {
		if (v1.length != v2.length) {
			return null; // I due vettori non hanno la stessa dimensione
		}
		int numeroElementiTrovati = 0;
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] < sommaElementiV2(v2, i + 1)) {
				numeroElementiTrovati++;
			}
		}
		if (numeroElementiTrovati == 0) {
			int[] ritorno = new int[1];
			ritorno[0] = 0;
			return ritorno;
		}
		int pos = 0;
		int[] vettore = new int[numeroElementiTrovati];
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] < sommaElementiV2(v2, i + 1)) {
				vettore[pos] = v1[i];
				pos++;
			}
		}
		return vettore;

	}

	public static int sommaElementiV2(int[] v, int posizione) {
		int somma = 0;
		for (int i = posizione; i < v.length; i++) {
			somma += v[i];
		}
		return somma;
	}

	public static void main(String[] args) {
		int[] v1 = { 7, 10, 3, 2 };
		int[] v2 = { 2, 8, 1, 4 };
		int[] vettore = selezionaVettore(v1, v2);
		for (int i = 0; i < vettore.length; i++) {
			System.out.print(vettore[i] + "- ");
		}
	}

}
