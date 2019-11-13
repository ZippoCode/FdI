package esercizi_matrici;

public class Elementomassimo_elementominimo {

	public static void main(String[] args) {
		int [][]m ={{1,3,15,0},
					{8,4,2,1},
					{7,5,3,1},
					{1,0,0,5}};
		for(int i=0;i<m.length; i++){
			for(int j=0;j<m[0].length; j++){
				System.out.print(m[i][j] + " ");
				}
			System.out.println(" ");
		}
		System.out.println(" ");
		int [] differenza = new int [m.length];
		int [] max = elementoMassimo(m);
		int [] min = elementoMinimo(m);
		for (int i=0; i<m.length; i++){
			differenza[i] = max[i]-min[i];
		
		System.out.print(differenza [i] + " ");
		}
		
		
	}
	
	public static int [] elementoMassimo(int [][]m){
		int []v= new int [m.length];
		for(int i=0;i<m.length;i++){
			v[i]= m[i][0];
			for(int j=0;j<m[0].length;j++){
				if(m[i][j] > v[i]){
					v[i] = m[i][j];
				}
		}
	}
		return v;
		}

	


	public static int [] elementoMinimo(int [][]m){
		int []v= new int [m.length];
		for(int i=0;i<m.length;i++){
			v[i]= m[i][0];
			for(int j=0;j<m[0].length;j++){
				if(m[i][j]< v[i]){
					v[i] = m[i][j];
				}
		}
	}
		return v;
		}

}
