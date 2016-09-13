package EserciziAppelli;
/*Si scriva un metodo verifica che, riceve in input un vettore di interi V ed una matrice di interi M e restituisce true se gli 
 * elementi di V in una posizione con indice pari sono ordinati in modo crescente e tutti gli elementi che si trovano nelle posizioni 
 * con indice dispari di V occorrono almeno una volta in M, false altrimenti. 
 * Ad esempio, se l’input è costituito da V = {5,3,6,2,7,4} ed  M={{3,4},{1,2}} il metodo restituirà il valore true 
 * (gli elementi in posizione pari V[0]=5, V[2]=6, V[4]=7 sono ordinati in modo crescente e tutti gli elementi in posizione dispari 
 * V[1]=3, V[3]=2, V[5]=4 sono contenuti in M), mentre se l’input è costituito da V = {5,3,6,2,7,4} ed M={{3,5},{1,2}} 
 * il metodo restituirà il valore false (sebbene gli elementi in posizione con indice pari di V siano ordinati in modo crescente, 
 * il valore V[5]=4 non è contenuto nella matrice M).
 * 
 */
public class Appello_270B_es2 {

	public static void main(String[] args) {
		int []v= {5,3,6,2,7,4};
		int [][]m= {{3,4},{1,2}};
		boolean c= verifica(v,m);
			System.out.println(c);
	}
	
	public static boolean verifica (int[]v, int [][]m ){
		if (crescente(v) && indicedispari(v,m))
			return true;
		return false;
	}
	
	
	public static boolean indicedispari(int []v, int[][]m){
		for (int i=1;i<v.length;i+=2){
			if(!occorrenza (v[i],m))
				return false;
		}
		return true;
	
	}
	
	public static boolean crescente(int []v){
		for(int i=0;i<v.length-2; i+=2){
			if(v[i]> v[i+2])
				 return false;
		}
		return true;
	}
	
	public static boolean occorrenza (int x , int [][]m){
		for (int i=0; i<m.length; i++){
			for (int j=0; j<m[0].length; j++){
				if(x==m[i][j])
					return true;
				}
		}
		return false;
	}
}
