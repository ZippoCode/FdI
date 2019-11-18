package esercizi_appelli;
/*Si scriva un metodo verifica che riceve in ingresso due vettori di caratteri V1 e V2 ed un intero k>0 e restituisce true se il
suffisso di V1 � uguale al prefisso di V2, cio� se esiste una sequenza X di k caratteri tale che X costituisce la parte finale di
V1 e la parte iniziale di V2.
Ad esempio, se V1= [ �a�,�c�,�a�,�c�,�i�,�a�], V2= ['c','i','a','o'] e k=3, il risultato sar� true.
 * 
 */
public class Appello_20111125 {

	public static void main(String[] args) {
		char [] v1 = {'a','c','a','c','i','o'};
		char [] v2 = {'c','i','a','o'};
		int k=3;	
		System.out.println(verifica(v1,v2,k));
	}
	
	public static boolean verifica (char []v, char []w, int k){
		for (int i=0; i<k; i++){
				if (v[v.length-k+i]!=w[i])
					return false;
			}
		return true;
	}

}
