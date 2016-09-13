package EserciziVettori;
import java.util.Scanner;
public class Ordinamento3Vettori {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("inserisci un valore");
	int a = sc.nextInt();
	System.out.println("inserisci un valore");
	int b =sc.nextInt();
	System.out.println("inserisci un valore");
	int c= sc.nextInt();
	if (a<=b && a<=c)
		if (b<=c)
			System.out.println (a + "" + b + "" + c);
		else
			System.out.println(a + " " + c + " " + b );
	else
		if (b<=c)
			if (a<=c)
			System.out.println(b + " " + a + " " + c );
			else
			System.out.println(b + " " + c + " " + a );
		else
			if (a<=b)
				System.out.println(c + " " + a + " " + b);
			else 
				System.out.println(c + " " + b + " " + a);
	sc.close();		
	}

}
