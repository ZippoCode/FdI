package EserciziVettori;

public class Verifica {

	public static void main(String[] args) {
		int []a = {3,0,5,6};
		int []b= {2,1,2,5};
		boolean ver= verifica(a,b);
		System.out.println (ver);
}
	public static boolean verifica (int []a, int []b){
		if (maggioredi(a,b))
			return true;
		return false;
	}

	public static boolean maggioredi (int []a, int []b){
		for (int i=0;i<a.length;i++){
			if (a[i]<b[i])
				return false;
			}
		return true;	
	}

}
