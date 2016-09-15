package esercizi_vettori;
/*Scrivere un metodo che riceve in ingresso due vettori a e b di interi e che restituisce un vettore di c di booleani così 
 * formato: in valore nella i-esima di c sarà true se e solo se il valore nella i-esima posizione 
 * di a è multiplo oppure sottomultiplo del valore contenuto nee’i-esima posizione di b, false altrimenti*/
 

public class ConfrontaVettori2 {

	public static void main(String[] args) {
	int []a= {1,2,5};
	int []b= {2,4,10};
	boolean[]confronto = confrontavettori(a,b);
	for (int i=0;i<a.length; i++){
		System.out.println("il vettore risultato è" + confronto);
		}
	}
	
	public static boolean[] confrontavettori (int []a, int []b){
	boolean [] ret= new boolean [a.length];
	for (int i=0; i<a.length; i++){
		if (multipli (a,b))
			ret[i]= true;
		else
			ret[i]=false;
		}
	return ret;
	}
	
	public static boolean multipli (int []a,int []b){
		for (int i =0; i<a.length; i++){
			if (a[i]%b[i]==0 || b[i]%a[i]==0)
				return true;
		}
		return false;
	
	}
		
}
