package esercizi_appelli;

public class Appello_20130222 {

	public static void main(String[] args) {
		int[][] mG = { { 8, 7, 5, 6 }, { 5, 4, 5, 6 }, { 8, 9, 8, 9 }, { 5, 5, 4, 2 }, { 9, 9, 9, 2 } };
		for (int i = 0; i < mG.length; i++) {
			for (int j = 0; j < mG[0].length; j++) {
				System.out.print(mG[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int cattivo = crudele(mG);
		System.out.print(cattivo);

		System.out.println();
		double[] media = calcolopercentualegiuria(mG);
		for (int i = 0; i < media.length; i++) {
			System.out.print(media[i] + " ");
		}
		System.out.println();

		int[] tv = { 2500, 450, 200, 3000, 4500 };
		double[][] N = calcoloGraduatoria(mG, tv);
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[0].length; j++) {
				System.out.print(N[i][j] + " ");
			}
			System.out.println();
		}
		String [] partecipanti= {"Annalisa", "Francesca", "Marco", "Elio", "Sara"};
			for (int i = 0; i < N.length; i++) {
				System.out.println(partecipanti[(int)N[i][0]]);
			}
	}

	public static int crudele(int mG[][]) {
		int min = 0;
		int indice = 0;
		for (int i = 0; i < mG.length; i++) {
			for (int j = 0; j < mG[0].length; j++) {
				if (mG[i][j] < min) {
					min = mG[i][j];
				}
				indice = j;
			}
		}
		return indice;
	}

	public static double[] calcolopercentualegiuria(int[][] mG) {
		double somma = 0;
		double[] media = new double[mG.length];
		for (int i = 0; i < mG.length; i++) {
			for (int j = 0; j < mG[0].length; j++) {
				somma += mG[i][j];
			}
		}
		double[] l = new double[mG.length];
		for (int i = 0; i < mG.length; i++) {
			for (int j = 0; j < mG[0].length; j++) {
				l[i] += mG[i][j];
			}
		}
		for (int i = 0; i < l.length; i++) {
			media[i] = l[i] / somma;
		}
		return media;
	}

	public static double[][] calcoloGraduatoria(int[][] mG, int[] tv) {
		double[][] N = new double[mG.length][3];
		double[] media = calcolopercentualegiuria(mG);
		for (int i = 0; i < mG.length; i++) {
			N[i][1] = media[i];
		}
		double somma = 0;
		for (int i = 0; i < tv.length; i++) {
			somma += tv[i];
		}
		for (int i = 0; i < tv.length; i++) {
			N[i][2] = tv[i] / somma;
		}
		for (int i = 0; i < mG.length; i++) {
			N[i][0] = i;
		}
		for (int i = 0; i < N.length - 1; i++) {
			for (int j = 0; j < N.length - 1; j++) {
				if (valoreOrdine(N[j][1], tv[j]) > valoreOrdine(N[j + 1][1], tv[j])) {
					double scambioIndice = N[j][0];
					double scambioMediaG = N[j][1];
					double scambioMediaTV = N[j][2];
					N[j][0] = N[j + 1][0];
					N[j][1] = N[j + 1][1];
					N[j][2] = N[j + 1][2];
					N[j + 1][0] = scambioIndice;
					N[j + 1][1] = scambioMediaG;
					N[j + 1][2] = scambioMediaTV;
				}
			}
		}
		return N;
	}

	public static double valoreOrdine(double valoreGiudici, int valoreTV) {
		return 0.75 * valoreGiudici + 0.25 * valoreTV;
	}
}
