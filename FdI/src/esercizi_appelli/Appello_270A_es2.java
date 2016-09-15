package esercizi_appelli;
/*Si scriva un metodo verifica che, riceve in input un vettore di caratteri S ed una matrice di caratteri M e restituisce true se S è 
una parola palindroma e tutti gli elementi che si trovano nelle posizioni pari di S occorrono almeno una volta in M, 
false altrimenti. Una parola è palindroma se letta in entrambi i versi è uguale. Ad esempio, se l’input è costituito da  
S = { ‘r’, ‘a’, ‘d’, ‘a’, ‘r’ } ed  M = { { ‘a’, ‘r’ }, { ‘c’, ‘b’} }  restituirà false 
(S è palindroma, ma il carattere 'd' non occorre in M), mentre se l’input è costituito da S = { ‘r’, ‘a’, ‘d’, ‘a’, ‘r’ } ed  
M = { { ‘a’, ‘r’ }, { ‘d’, ‘b’} }  allora restituirà true.

 * 
 */
public class Appello_270A_es2 {

	public static void main(String[] args) {
		char []s= {'r','a','d','a','r'};
		char [][] m= {{'a','c'},{'d','b'}};
		boolean c= verifica (s,m);	
			System.out.println(c);
	}

	public static boolean verifica (char []s ,char [][]m){
		if (palindromo(s) && occorrenzamatricepari(m,s))
				return true;
		return false;
	}

	
public static boolean occorrenzamatricepari (char [][]m, char []v){
		for (int i=0; i<v.length; i=i+2){
			if(!occorrenza(v[i],m))
				return false;
					}
		return true;
	}
	
	public static boolean occorrenza(char x ,char [][]m){
		for (int i=0; i<m.length; i++){
			for (int j=0; j<m[0].length; j++){
				if (x== m[i][j])
					return true;
			}
		}
		return false;
	}
	
	public static boolean palindromo (char []v){
		for (int i=0; i<v.length/2;i++){
			if(v[i] != v[v.length-1-i])
				return false;
			}
		return true;
	}

}
