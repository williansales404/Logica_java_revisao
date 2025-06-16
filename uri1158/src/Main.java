import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int cont = 0, soma = 0;
		for(int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			while(cont < y) {
				if(x % 2 != 0) {
					soma += x;
					cont++;
				}
				
				x++;
				
			}
			System.out.println(soma);
			soma = 0;
			cont = 0;
			
		}
		
		
		
		sc.close();

	}

}
