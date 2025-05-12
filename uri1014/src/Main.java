import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int kmTotal = sc.nextInt();
		double combustivel = sc.nextDouble();
		
		double resultado = kmTotal / combustivel;
		
		System.out.printf("%.3f km/l%n", resultado);
		
		
		
		sc.close();
		

	}

}
