package esercizi_vettori;
import java.util.Scanner;
public class EsercizioTriangolo {

	public static void main(String[] args) {
		System.out.println("inserire un lato");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		System.out.println("inserire un lato");
		int b = sc.nextInt();
		System.out.println("inserire un lato");
		int c= sc.nextInt();
		if (a>0 && b>0 && c>0 && a<b+c && b<a+c && c<a+b && a>b-c && a>c-b && b>a-c && b>c-a && c>a-b && c>b-a)
			System.out.println("I tre numeri rappresentano i lati di un triangolo");
		int uguali=0;
		if (a==b)
			uguali++;
		if (b==c)
			uguali++;
		if (a==c)
			uguali++;
		if (uguali==0)
			System.out.println("Il triangolo è scaleno");
		else
			if (uguali ==1)
				System.out.println("Il triangolo è isoscele");
			else
				System.out.println("Il trangolo è equilatero");
	sc.close();		
	}

}
