package utility;

public class TorreDiHanoi {

	public static void main(String[] args) {
		hanoi(2, 'O', 'F', 'A');
	}

	public static void hanoi(int n, char D, char A, char S) {
		if (n == 1)
			spostaDisco(D, A);
		else {
			hanoi(n - 1, D, S, A);
			spostaDisco(D, A);
			hanoi(n - 1, S, A, D);
		}
	}

	public static void spostaDisco(char D, char A) {
		System.out.println("Sposta disco da " + D + " a " + A);
	}

}
