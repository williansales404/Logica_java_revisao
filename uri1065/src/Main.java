import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double cont = 0, i = 0;
		
		while(i < 5) {
			Double n = sc.nextDouble();
			i += 1;
			if(n % 2 == 0) {
				cont += 1;
			}
			
		}
		
		System.out.printf("%.0f valores pares%n",cont);
		
		sc.close();

	}

}
