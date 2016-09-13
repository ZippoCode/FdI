package EserciziVettori;

public class EquazioneDiSecondoGrado {

	public static void main(String[] args) {
		double a = 2;
		double b = -5;
		double c = 2;
		double D = b*b- 4*a*c;
		double x1;
		double x2;
		if (D>=0) {
			x1=(-b-Math.sqrt(D))/(2*a);
			x2=(-b+Math.sqrt(D))/(2*a);
			System.out.println(x1+ " " +x2);
		}
			else
				System.out.println("non esistono soluzioni");
		
	}

}
