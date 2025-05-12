import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		
		double area = b * h;
		double perimetro = 2.0 * (b + h);
		//double diagonal = Math.pow(b, 2.0) + Math.pow(h, 2.0);
		double diagonal = Math.sqrt(Math.pow(b, 2.0) + Math.pow(h, 2.0));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n",perimetro);
		//System.out.printf("DIAGONAL = %.4f%n",Math.sqrt(diagonal));
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		
		sc.close();

	}

}
