package esercizi_vettori;

public class VerificaDifferenza {

	public static void main(String[] args) {
	int []a={1,2,3,5,8,13,21};
	if (verifica(a))
		System.out.println("il metodo è verificato");
	else
		System.out.println("il metodo non è verificato");
	}
		
	public static boolean verifica(int []a){
		for (int i=1; i<a.length-1;i++){
			if (a[i]!= a[i+1]-a[i-1])
				return false;
			}
		return true;
		}
}
		