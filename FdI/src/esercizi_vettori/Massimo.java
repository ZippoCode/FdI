package esercizi_vettori;

public class Massimo {

	public static void main(String[] args) {
		int []a = {2,5,65,96,52};
		int max = indiceMassimo(a);
			System.out.println("il valore massimo è: " + max);
		
	}
	
	public static int indiceMassimo (int []a){
		int max=a[0];
		for (int i=0;i<a.length;i++)
			if (max < a[i])
				max = a[i];
		return max;
	}
		
}
