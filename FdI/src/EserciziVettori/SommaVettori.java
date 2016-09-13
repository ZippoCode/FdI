package EserciziVettori;

public class SommaVettori {

	public static void main(String[] args) {
		int []a = {2,4,5,7};
		int []b= {4,5,4,5};
		int somma = sommavettori(a,b);
		System.out.println ("la somma è " + somma);
	
	}
	public static int sommavettori (int []a,int []b){
		int somma= 0;
		for (int i=0;i<a.length;i++){
			somma += a[i] + b[i];
				}
			return somma;
	}
}
