import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int min, max, soma = 0;
		
		while(m > 0 && n > 0) {
			
			if(m < n) {
				min = m;
				max = n;
			} else {
				min = n;
				max = m;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.printf("%d ",i);
				soma += i;

			}
			
			System.out.printf("Sum=%d%n",soma);
			
			m = sc.nextInt();
			n = sc.nextInt();
			
			soma = 0;
		}
		
		
		
		sc.close();

	}

}
