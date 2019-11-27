package esercizi_vettori;

import java.util.Scanner;

public class CalcoloPotenza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserire la base");
		int base = sc.nextInt();
		System.out.println("inserire l'esponente");
		int esponente = sc.nextInt();
		int potenza = 1;
		for (int i = 1; i <= esponente; i++) {
			potenza *= base;
		}
		System.out.println("la potenza di " + base + " elevato a " + esponente + " � uguale a " + potenza);
		sc.close();
	}
}