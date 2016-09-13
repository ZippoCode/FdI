package EserciziVettori;
public class StessiElementi {

	public static void main(String[] args) {
		int v []= {3,5,6};
		int w []= {3,5,5};
		if (stessielementi(v,w))
			System.out.println("i due vettori sono uguali");
		else
			System.out.println("i due vettori non sono uguali");
	}


	public static boolean stessielementi (int [] v, int []w) {
		return primoContenutoinSecondo(v,w) && primoContenutoinSecondo(w,v);
	}
	
	public static boolean primoContenutoinSecondo (int []v, int []w){
		for (int i=0; i<v.length; i++){
		if (!contenuto(w[i],v))
			return false;
			}
		return true;
	}
	
	public static boolean contenuto (int v, int []w){
		for(int i=0; i<w.length;i++){
			if (v==w[i])
				return true;
		}
		return false;
	}
	


}
