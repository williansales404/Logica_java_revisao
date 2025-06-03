import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double cont = 0, i = 0, positivo = 0;
		
		while(i < 6) {
			Double n = sc.nextDouble();
			i += 1;
			if(n > 0) {
				positivo += n;
				cont += 1;
			}
			
		}
		
		double media = (double) positivo / cont;
		
		System.out.printf("%.0f valores positivos%n",cont);
		System.out.printf("%.1f%n", media);
		sc.close();

	}

}
