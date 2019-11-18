package esercizi_appelli;
/*Si scriva un metodo Java verifica che riceve un vettore di interi V e restituisce un boolean.
 * In particolare restituisce true se la differenza fra ciascuna coppia di elementi consecutivi del vettore � un numero 
 * primo positivo e false altrimenti. Ad esempio, se V={4, 15, 22, 35} il metodo restituisce true 
 * (poich� 15-4=11 � un numero primo; 22-15=7 � un numero primo; 35-22 =13 � un numero primo); 
 * mentre se V={4, 15, 22, 28} il metodo restituisce false (poich� 15-4=11 � un numero primo; 22-15=7 � un numero primo; 
 * ma 28-22 =6 non � un numero primo).
*/

import java.util.Scanner;
public class Appello_20110310 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		System.out.println("inserire la dimensione di a");
		int n=sc.nextInt();
		int []a= new int[n];
		for(int i=0;i<n;i++){
			System.out.println("inserire l'elemento " + i);
			a[i]=sc.nextInt();
		}
		System.out.println("verifica: " + verifica(a));
		sc.close();
	}
	
	public static boolean verifica (int []a){
		int diff=0;
		for (int i=1; i<a.length; i++){
			diff= a[i]-a[i-1];
			if (diff<0 || !primo(diff))
				return false;
			}
		return true;
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
