package EserciziVettori;
import java.util.Scanner;
public class CalcoloFattoriale {

	public static void main(String[] args) {
		Scanner kb= new Scanner (System.in);
		System.out.println ("inserire numero naturale");
		int n = kb.nextInt();
		for (int i=0;i<=n;i++)
			System.out.println(fact(n));
kb.close();
			
	}

	public static int fact (int n){
		int f=1;
		for (int i =1; i<=n;i++)
			f*=i;
		return f;
	}
}



