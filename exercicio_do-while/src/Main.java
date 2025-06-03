import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double calculo;
		char continuar;
		
		
		do {
			double celsius = sc.nextDouble();
			calculo = 9 * celsius / 5 + 32;
			System.out.printf("temperatura em f %.1f%n",calculo);
			
			System.out.println("deseja continuar s / n");
			continuar = sc.next().charAt(0);
			
		} while (continuar == 's');
		
		
		
		
		sc.close();

	}

}
