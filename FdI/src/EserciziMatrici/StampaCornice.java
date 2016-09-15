package EserciziMatrici;

public class StampaCornice {

	public static void main(String[] args) {
		int[][] m = { { 1, 3, 5, 0 }, { 8, 4, 2, 1 }, { 7, 0, 3, 1 }, { 1, 4, 5, 5 } };
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		int [] ciao= Cornice(m);
			for (int i = 0; i < ciao.length; i++) {
				System.out.print(ciao[i]+ " ");
			}
	}

	public static int[] Cornice(int[][] M) {
		int h = 0;
		int[] v = new int[(M.length * 2 + M[0].length * 2) - 4];
		for (int i = 0; i < M.length; i++) {
			v[h] = M[0][i];
			h++;
		}
		for (int i = 1; i < M.length; i++) {
			v[h] = M[i][M[0].length - 1];
			h++;
		}
		for (int i = 1; i < M.length; i++) {
			v[h] = M[i][0];
			h++;
		}
		for (int i = 1; i < M[0].length - 1; i++) {
			v[h] = M[M.length - 1][i];
			h++;
		}
		return v;
	}
}
