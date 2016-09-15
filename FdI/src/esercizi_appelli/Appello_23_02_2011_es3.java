package esercizi_appelli;

public class Appello_23_02_2011_es3 {

	public static void main(String[] args) {
		boolean[][] P = { { true, false, true, true, false, false, false, true, false, false },
				{ false, true, true, true, true, false, false, true, true, true },
				{ false, false, false, false, false, true, true, false, false, true },
				{ false, true, false, false, false, false, false, false, false, false },
				{ false, true, false, true, false, false, false, true, false, true } };
		for (int i = 0; i < P.length; i++) {
			for (int j = 0; j < P[0].length; j++) {
				System.out.print(P[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int p = 1;
		int[] ciao = autori(P, p);
		for (int i = 0; i < ciao.length; i++) {
			System.out.print(ciao[i] + " ");
		}
		System.out.println(" ");
		int[] miao = singoliautori(P);
		for (int i = 0; i < miao.length; i++) {
			System.out.print(miao[i] + " ");
		}

	}

	public static int[] autori(boolean P[][], int p) {
		int h = 0;
		int[] aus = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			if (P[i][p] == true) {
				aus[i] = h;
			}
			h++;
		}
		int[] ritorno = new int[aus.length];
		int k = 0;
		for (int i = 0; i < ritorno.length; i++) {
			if (aus[i] != 0)
				if (numeroOccorrenze(P, aus[i]) >= 2) {
					ritorno[k] = aus[i];
					k++;
				}
		}
		int[] ritornoSenza0 = new int[k];
		for (int i = 0; i < k; i++) {
			ritornoSenza0[i] = ritorno[i];
		}
		return ritornoSenza0;
	}
	
	public static int numeroOccorrenze(boolean P[][], int indiceRiga) {
		int numeroOccorrenze = 0;
		for (int i = 0; i < P[0].length; i++) {
			if (P[indiceRiga][i])
				numeroOccorrenze++;
		}
		return numeroOccorrenze;
	}

	
	public static int[] singoliautori(boolean[][] P) {
		int[] aus = new int[P[0].length];
		for (int i = 0; i < P[0].length; i++) {
			for (int j = 0; j < P.length; j++) {
				if (P[j][i])
					aus[i] = i;
			}

		}
		int[] ritorno = new int[aus.length];
		int k = 0;
		for (int i = 0; i < ritorno.length; i++) {
			if (numOcc(P, aus[i]) == 1) {
				ritorno[k] = aus[i];
			}
			k++;
		}
	return ritorno;
	}		
		public static int numOcc(boolean[][] P, int indicecolonna) {
		int numOccorrenze = 0;
		for (int i = 0; i < P.length; i++) {
			if (P[i][indicecolonna])
				numOccorrenze++;
		}
		return numOccorrenze;
	}
}
