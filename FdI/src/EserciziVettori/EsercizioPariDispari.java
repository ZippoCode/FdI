package EserciziVettori;

public class EsercizioPariDispari {

	public static void main(String[] args) {
		int []v={1,3,5,7};
		int []w={2,7,9,11};
		boolean [] c= verifica(v,w);
			System.out.print("il vettore è: " + "[");
			for (int i=0;i<v.length;i++){
				System.out.print(c[i] + ",");
				}
			System.out.print("]");

	}
	
	public static boolean [] verifica (int []a, int []b){
		boolean [] c= new boolean [a.length];
		for (int i=0; i<a.length; i++){
			if ((a[i]%2==0 && b[i]%2==0) || (a[i]%2!=0 && b[i]%2!=0))
				c[i]= true;
			else
				c[i]=false;
			}
		return c;
	}


}
