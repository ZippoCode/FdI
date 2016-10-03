package utility;

public class Permuta {

	public static void main(String[] args) {
		char [] s= {'a', 'b', 'c'};
		permuta (s,0);
		

	}
	public static void permuta (char[]x, int k){
		if (k==x.length-1)
				StampaVettore(x);
		for(int i =k; i<x.length;i++){
			Scambia(x,i,k);
			permuta (x,k+1);
			Scambia(x,i,k);
		}
	}
	public static void StampaVettore (char []x){
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	public static void Scambia (char[]x, int i, int k){
		char temp = x[i];
		x[i]= x[k];
		x[k]= temp;
	}
}

