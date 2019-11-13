package esercizi_appelli;

/*Si consideri	una	matrice	M di interi	avente	dimensioni	n x	n. Due elementi	di	tale matrice sono detti	accorpabili se	si	
trovano	in	una	delle	seguenti	condizioni:
• hanno	 lo	 stesso	 valore,sono adiacenti e si	 trovano sulla stessa riga	(in	 tal	 caso	 sono	 detti	 accorpabili	
orizzontalmente) - cioè	due	elementi	adiacenti	 sulla	 stessa	 riga	 M[i][j]	 e	 M[i][j+1]	sono accorpabili	
orizzontalmente	se	M[i][j]	=	M[i][j+1];
• hanno	 lo	 stesso	 valore,sono adiacenti	e si trovano sulla stessa colonna (accorpabili verticalmente) - cioè due	
elementi	adiacenti	sulla	stessa	colonna	M[i][j]	e	M[i+1][j]	sono	accorpabili	verticalmente	se	M[i][j]	=	M[i+1][j].
Il	guadagno associato	a	due	elementi accorpabili è definito	come somma dei	loro valori - cioè	il	doppio	del	valore	di	
ognuno	dei	due	elementi in	quanto,	essendo	accorpabili,	hanno	uguali	valori.
Si	 scriva	 un	metodo	mossaPreferita che	 riceve	la	matrice	M e	 restituisce true se e solo	 se	la	 somma	 dei	guadagni	
associati	a	tutte	le	coppie	di	elementi accorpabili orizzontalmente è maggiore	della	somma dei	guadagni associati	a	
tutte	le	coppie	di	elementi	accorpabili	verticalmente.
 * 
 */
public class Appello_20_06_2014_es2 {

	public static void main(String[] args) {
		int[][] m = { {3,8,8,4}, { 2, 3, 5, 0 }, { 2, 5, 5, 2 }, { 3, 2, 4, 3 } };
		boolean k = guadagnototale(m);
		for (int i=0; i<m.length;i++){
			for (int j=0; j<m[0].length;j++){
				System.out.print(m[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println(k);
	}

	public static boolean guadagnototale(int[][] m) {
		int sommaRighe = 0;
		int sommaColonna = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (ugualeRiga(m, i, j)) {
					sommaRighe += m[i][j];
					
				}
				if (ugualeColonna(m, i, j)) {
					sommaColonna += m[i][j];
				}
			}
		}
		sommaRighe = sommaRighe*2;
		sommaColonna = sommaColonna*2;
		System.out.println(sommaRighe);
		System.out.println(sommaColonna);
		if (sommaRighe > sommaColonna)
			return true;
		return false;
	}

	public static boolean ugualeRiga(int[][] m, int riga, int colonna) {
		if (colonna == m[0].length - 1)
			return false;
		if (m[riga][colonna] == m[riga][colonna+1]) {
			return true;
		}
		return false;	
	}

	public static boolean ugualeColonna(int[][] m, int riga, int colonna) {
		if (riga == m.length - 1)
			return false;
		if (m[riga][colonna] == m[riga+1][colonna]) {
			return true;
		}
		return false;
	}
}
