package esercizi_vettori;
import java.util.Scanner;
public class Ordinamento2Vettori {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("inserire il valore");
	double a = sc.nextDouble();
	System.out.println("inserire il valore");
	double b = sc.nextDouble();
		if (a<=b)
			System.out.println(a + " " + b);
		else
			System.out.println(b + " " + a);
	sc.close();
	}

}
