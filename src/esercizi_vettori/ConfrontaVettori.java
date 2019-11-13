package esercizi_vettori;
public class ConfrontaVettori {

	public static void main(String[] args) {
		int a []= {2,5,7,10};
		int b []= {1,2,6,11};
		boolean [] confronto= confrontavettori(a,b);
			for(int i=0; i<a.length;i++)
				System.out.println("il vettore:" + confronto[i] + " ");
		
	}
	
	public static boolean [] confrontavettori (int[]a, int []b) {
		boolean []ret=new boolean [a.length];
		for (int i=0; i<a.length; i++){
			if (a[i]>=b[i])
				ret[i]= true;
			else
				ret [i]=false;
			}
		return ret;
	}
 
}	
