package esercizi_vettori;

public class Palindromo {
	public static void main(String[] args) {
	char [] b= {'i', 't', 'o', 'p', 'i', 'n','o','n','a','v','e','v','a','n','o','n','i','p','o','t','i'};
	if (palindromo(b))
		System.out.println ("la parola inserita è palindroma");
	else
		System.out.println("la parola inserita non è palindroma");
	}
	
	public static boolean palindromo (char[]a){
		for (int i=0; i<= a.length/2; i++)
			if (a[i]!=a[a.length-i-1])
				return false;
		return true;
		}
		
}
