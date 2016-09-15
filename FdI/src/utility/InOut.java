package utility;

import java.util.Scanner;

public class InOut {

	private static Scanner sc;

	/**
	 * Il metodo stampa un vettore usando la sintassi "[elem, elem,... , elem]"
	 * @param vettore
	 */
	public static void stampaVettore(int[] vettore) {
		System.out.print('[');
		for (int i = 0; i < vettore.length; i++) {
			System.out.print(vettore[i]);
			if (i < vettore.length - 1)
				System.out.print(", ");
		}
		System.out.println(']');
	}

	/**
	 * Data la dimensione di un vettore legge e inserisce gli elementi in un vettore
	 * @param dimensione
	 * @return il vettore con gli elementi
	 */
	public static int[] leggiVettoreInt(int dimensione) {
		sc = new Scanner(System.in);
		int[] vettore = new int[dimensione];
		System.out.println("Inserisci gli elementi che compongono il vettore.");
		for (int i = 0; i < dimensione; i++) {
			System.out.print("Scrivi il numero in posizione "+i+": ");
			vettore[i] = sc.nextInt();
		}
		return vettore;
	}
	
}
