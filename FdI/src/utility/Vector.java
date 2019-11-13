package utility;

import java.util.Scanner;

public class Vector {

	private int[] vector;
	private static Scanner sc = new Scanner(System.in);

	public Vector(int length) {
		if (length <= 0)
			throw new IllegalArgumentException("La dimensione deve essere maggiore di zero.");
		vector = new int[length];
	}

	public void readVector() {
		System.out.println("Lettura vettore ... ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Inserire elemento posizione #" + i + ": ");
			vector[i] = sc.nextInt();
		}
	}

	public void writeVector() {
		System.out.print("Vettore: [");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i != vector.length - 1)
				System.out.print(" - ");
		}
		System.out.println(']');
	}

	public int getMaxElement() {
		int max = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (max < vector[i])
				max = vector[i];
		}
		return max;
	}

	public boolean isAsymmetric() {
		for (int i = 0; i < vector.length / 2; i++) {
			if (vector[i] != vector[vector.length - 1 - i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print("Inserire la dimensione del vettore: ");
		int size = sc.nextInt();
		Vector v = new Vector(size);
		v.readVector();
		v.writeVector();
		System.out.println("Max: " + v.getMaxElement());
		System.out.println("E\' simmetrico :" + v.isAsymmetric());
	}
}
