import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cont = 0, i = 0;
		
		while(i < 6) {
			Double n = sc.nextDouble();
			i += 1;
			if(n > 0) {
				cont += 1;
			}
			
		}
		System.out.printf("%d valores positivos%n",cont);
		
		sc.close();

	}

}
