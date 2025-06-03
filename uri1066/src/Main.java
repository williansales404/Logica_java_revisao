import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i = 0, par = 0, imp = 0, positivo = 0, negativo = 0;
		
		while(i < 5) {
			i += 1;
			int n = sc.nextInt();
			
			if(n % 2 == 0) {
				par += 1;
				
			} else if(n % 2 != 0) {
				imp += 1;
				
			}
			
			if(n > 0) {
				positivo += 1;
				
			} else if(n < 0) {
				negativo += 1;
				
			}
			
			
		}
		
		System.out.printf("%d valor(es) par(es)%n",par);
		System.out.printf("%d valor(es) impar(es)%n",imp);
		System.out.printf("%d valor(es) positivo(s)%n",positivo);
		System.out.printf("%d valor(es) negativo(s)%n",negativo);
		
		sc.close();

	}

}
