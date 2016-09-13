package EserciziVettori;
import java.util.Scanner;
public class Concatenazione {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []a =leggi (sc);
	int []b = leggi (sc);
	int [] v= concatena (a,b);
	System.out.println("il vettore che si ottiene dalla concatenazione è:" + " ");
	Stampa (v);
	sc.close();
}
		
		
public static int [] concatena (int[]a , int[]b){
	int []v = new int[a.length + b.length];
	for (int i=0; i<v.length; i++)
		if (i<a.length)
			v[i]= a[i];
		else 
			v[i]= b[i-a.length];
	return v;
	}

public static int [] leggi (Scanner sc){
	System.out.println("inserire la dimensione di a");
	int n = sc.nextInt();
	int [] v= new int [n];
	System.out.println("inserire l'elemento a[0]");
	for (int i=0; i<n; i++)
	{
		System.out.println("inserire elemento [" + i + "]");
		v[i]= sc.nextInt();
	}
	return v;
}

public static void Stampa (int [] v){
	for (int i=0; i<v.length; i++)
		System.out.println(v[i] + " ");
}
}
