
public class Angelo {

	public static void main(String[] args) {
		int m[] = { 1,1,1,2,3,4,5,6,7,8,9,1,2,3,4 };
		int[] comprimi = comprimi(m);
		for (int i = 0; i < comprimi.length; i++) {
			System.out.print(comprimi[i] + " ");
		}
	}

	public static int sommaDiagonale(int m[][]) {
		int somma = 0;
		for (int i = 0; i < m.length; i++) {
			somma = somma + m[i][i];
		}
		return somma;
	}

	public static int sommaDiagonaleS(int[][] m) {
		int somma = 0;
		for (int i = 0; i < m.length; i++) {
			somma = somma + m[i][m.length - 1 - i];
		}
		return somma;
	}

	public static int[] comprimi(int[] vettore) {
		int[] ritorno = new int[vettore.length * 2 + 1];
		// nella peggiore delle ipotesi tutti gli elementi del vettore sono
		// diversi quindi si
		// raddoppia
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < vettore.length) {
			int uguali = 0;
			// questa variabile è utilizzata per conteggiare gli elementi uguali
			j = i;
			while (j < vettore.length && vettore[i] == vettore[j]) {
				// Questo ciclo conta quanti sono gli elementi uguali. Dunque
				// due sono le condizioni di uscita. Ho indice è arrivato
				// all'ultimo elemento, oppure non sono uguali. Da notare come i
				// rimane fisso mentre j cambia viene incrementato di uno ogni
				// volta che i due numeri sono uguali
				System.out.println("Confronto: " + vettore[i] + " - " + vettore[j]);
				uguali++;
				j++;
			}
			// Quando esco dal ciclo ho il numero di volte che si ripete un
			// determinato numero e ho il numero. Ricorda che l'indice i non
			// cambia
			ritorno[k] = vettore[i];
			System.out.print("Ho scritto " + ritorno[k]);
			k++;
			ritorno[k] = uguali;
			System.out.println(". Con valore: " + uguali);
			k++;
			// i è uguale a j perché in questo modo saltiamo gli elementi uguali
			i = j;
		}
		return ritorno;
	}

}
