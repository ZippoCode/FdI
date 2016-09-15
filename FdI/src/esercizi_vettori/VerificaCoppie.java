package esercizi_vettori;
/*Si scriva un metodo metodo che riceve un array V di interi e verifica se tutte le coppie non sovrapposte di elementi consecutivi all’interno dello stesso hanno prodotto maggiore del massimo valore in V. 
Se è vero restituisce true, false altrimenti. 
Esempio: se V=[3,4,5,6,2,7,6] il risultato è true perché il valore massimo è 7 ed i prodotti sono tutti 
maggiori di 7 (3*4, 5*6, 2*7). 
Notare che se il vettore ha dimensione dispari l’ultimo valore non viene considerato poiché non fa coppia con nessuno.
*/

public class VerificaCoppie {

	public static void main(String[] args) {
		int []v = {3,4,5,6,2,7};
		if (verificacoppie(v))
			System.out.println("il prodotto della coppia è maggiore dell'elemento massimo");
		else
			System.out.println("il prodotto della coppia non è maggiore dell'elemento massimo");

	}
	public static boolean verificacoppie(int []a){
	int max = indiceMassimo(a);
	for (int i=0;i<a.length; i+=2){
		int prodotto = a[i]*a[i+1];
		if (prodotto <= max)
			return false;
			}
	return true;
		
	}
	
	public static int indiceMassimo (int []a){
		int max=a[0];
		for (int i=0;i<a.length;i++)
			if (max < a[i])
				max = a[i];
		return max;
	}
}
