package utility;

public class Ordinamento {
	public static void main(String[] args) {
		int []V= {3,6,9,1,2,5,4,8};
		insertionSort(V);
		for (int i=0;i<V.length; i++){
			System.out.print(V[i]);
		}
	}
	
	public static void insertionSort(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int key = v[i];
			int j = i - 1;
			while (j >= 0 && v[j] > key) {
				v[j + 1] = v[j];
				j--;
				System.out.println("j=" + j);
			}
			v[j + 1] = key;
			System.out.println("key=" + key);
			System.out.println("v[j+1]=" + v[j + 1]);
		}

	}

}
