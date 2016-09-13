package EserciziVettori;

public class MediaAritmetica {

	public static void main(String[] args) {
		int []a = {10,21,30,55,49,78,95,87};
		float media = mediavettori(a);
		System.out.println ("la media aritmetica del vettore è " + media);
	}
	
	public static float mediavettori (int[]a){
		int somma =0;
		float media = 0;
		for (int i=0; i<a.length;i++){
			somma += a[i];
			media= somma/a.length;
				}
		return media;
		}
}
