package esercizi_appelli;

public class Appello_20130716 {

	public static void main(String[] args) {
		char [] s1 = {'l','o','c','a','n','d','i','e','r','e'};
		char [] s2= {'c','a','l','e','n','d','a','r','i','o'};
		System.out.println(anagramma(s1,s2));
	
	}

	public static boolean anagramma(char[] v, char[] w) {
		if (v.length != w.length) {
			return false;
		}
		for (int i = 0; i < v.length; i++) {
			char lettere = v[i];
			if (numerooccorrenze(v,lettere) != numerooccorrenze(w,lettere))
					return false;
		}
		return true;
	}

	public static int numerooccorrenze(char []v, char n){
		int numeroOccorrenze = 0;
		for (int i=0; i<v.length; i++){
			if(v[i]==n)
				numeroOccorrenze++;
		}
		return numeroOccorrenze;
	}

}

