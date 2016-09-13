package EserciziVettori;

public class VettorePari {

	public static void main(String[] args) {
		int []v={2,2,6};
		if (vettorepari(v))
			System.out.println("il vettore è composto solo da elementi pari");
		else
			System.out.println("il vettore è composto da elementi non tutti pari");
		
	}
	
	public static boolean vettorepari (int []a){
		for (int i =0;i<a.length; i++){
			if (a[i]%2!=0)
				return false;
		}
		return true;
	}
}
