import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		int n = sc.nextInt();
		int cont = 2, mult, soma = 0;
		for(int i = 1; i <= n; i++) {
			System.out.printf("%d ",i);
			soma = i;
			for(int j = 0; j < cont; j++) {
				mult = i * soma;
				soma = mult;
				System.out.printf("%d ",mult);
			}
			System.out.println();
		}
		*/
		
		int n = sc.nextInt();
		int mult1, mult2;
		for(int i = 1; i <= n; i++) {
			mult1 = i * i;
			mult2 = i * mult1;
			
			System.out.printf("%d %d %d%n",i,mult1,mult2);
			
			}
		
		sc.close();

	}

}
