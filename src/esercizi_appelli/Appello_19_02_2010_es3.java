package esercizi_appelli;

public class Appello_19_02_2010_es3 {

	public static void main(String[] args) {
		char[][] R = { { 'N', 'O', 'B', 'N', 'N', 'A', 'N', 'N' }, { 'N', 'O', 'N', 'A', 'N', 'N', 'B', 'N' },
				{ 'N', 'O', 'N', 'N', 'N', 'A', 'B', 'N' }, { 'N', 'N', 'O', 'N', 'N', 'B', 'A', 'N' },
				{ 'A', 'N', 'N', 'N', 'N', 'O', 'N', 'B' } };
		for (int i = 0; i < R.length; i++) {
			System.out.print("Gara " + i + " : ");
			for (int j = 0; j < R[0].length; j++) {
				System.out.print(R[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
		char[][] N = annullaGara(R, 1);
		for (int i = 0; i < N.length; i++) {
			System.out.print("Gara " + i + " : ");
			for (int j = 0; j < N[0].length; j++) {
				System.out.print(N[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static int[][] medagliere(char[][] R) {
		int[][] N = new int[R[0].length][3];
		for (int j = 0; j < R[0].length; j++) {
			int oro = 0;
			int argento = 0;
			int bronzo = 0;
			for (int i = 0; i < R.length; i++) {
				if (R[i][j] == 'O')
					oro++;
				if (R[i][j] == 'A')
					argento++;
				if (R[i][j] == 'B')
					bronzo++;
			}
			N[j][0] = oro;
			N[j][1] = argento;
			N[j][2] = bronzo;
		}
		return N;
	}

	public static char[][] annullaGara(char[][] R, int i) {
		char[][] R1 = new char[R.length - 1][R[0].length];
		for (int h = 0; h < i; h++) {
			for (int j = 0; j < R[0].length; j++) {
				R1[h][j] = R[h][j];
			}
		}
		for (int h = i; h < R1.length; h++) {
			for (int j = 0; j < R[0].length; j++) {
				R1[h][j] = R[h + 1][j];
			}
		}
		return R1;
	}
}
