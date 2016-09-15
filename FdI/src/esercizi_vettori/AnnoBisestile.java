package esercizi_vettori;
import java.util.Scanner;
public class AnnoBisestile {

	public static void main (String [] args){ 
	Scanner sc = new Scanner (System.in);
		System.out.println("inserire l'anno");
	int n= sc.nextInt();
	if (n>1600)
		if (n%4==0)
			if (n%100==0)
				if (n%400==0)
					System.out.println("l'anno è bisestile");
				else 
					System.out.println("l'anno non è bisestile");
			else
				System.out.println("l'anno è bisestile");
		else
			System.out.println("l'anno non è bisestile");
	else 
		System.out.println("l'anno deve essere maggiore di 1600");
	sc.close();
	}
	
}
