package esercizi_vettori;
import java.util.Scanner;
public class NumeriPrimi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("inserire numero naturale: ");
		int n= sc.nextInt();
		if (primo(n))
				System.out.println("il numero � primo");
			else
				System.out.println("il numero non � primo");
sc.close();
}
	
	public static boolean primo (int n){
		if (n!=2 && n%2==0)
			return false;
		for (int i=3; i<=Math.sqrt(n); i+=2){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
