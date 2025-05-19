import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, raizDelta, divisor, r1, r2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if(a != 0 && delta > 0) {
			b = -b;
			raizDelta = Math.sqrt(delta);
			divisor = 2 * a;
			
			r1 = (b + raizDelta) / divisor;
			r2 = (b - raizDelta) / divisor;
			
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R2 = %.5f%n",r2);
 		}
		else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}

}
