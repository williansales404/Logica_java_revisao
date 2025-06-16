import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mult1, mult2, calc;
		
		for(int i = 1; i<= n; i++) {
			mult2 = i;
			
			mult1 = i * mult2;
			mult2 = i * mult1;
			System.out.printf("%d %d %d%n",i,mult1,mult2);
			
			mult2 = i;
			
			mult1 = (i * mult2) + 1;
			mult2 = (i * (mult1-1)) + 1;
			System.out.printf("%d %d %d%n",i,mult1,mult2);
			
			
			
			
			
		}
		
		
		
		
		
		sc.close();

	}

}
