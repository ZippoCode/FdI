package EserciziVettori;

public class Anagramma {

	public static void main(String[] args) {
		char [] w = {'a', 'l','t','u','r','a'};
		char [] v = {'u','r','l','a','t','a'};
		char c=0;
		if (anagramma(w,v,c))
			System.out.println("i due vettori sono uno l'anagramma dell'altro");
		else
			System.out.println("i due vettori non sono uno l'anagramma dell'altro");
		

	}
	
	public static boolean anagramma(char []w, char []v, char c){
		if (w.length!= v.length)
			return false;
		for (int i=0; i<w.length;i++){
			if (!StessoNumero(w,v,c))
				return false;
			}
		return true;
	}

	public static boolean StessoNumero(char[]a,char[]b,char c){
		int conta =0;
		int contb=0;
		for (int i=0; i<a.length; i++){
			if (a[i]==c)
				conta++;
			if (b[i]==c)
				contb++;
		}
		if (conta==contb)
			return true;
		return false;
	}



}
