import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int cont = 0, soma = 0;
		
		//x != 0 || cont < 5
		
		while (x != 0) {
			cont = 0;
			soma = 0;
			while(cont < 5) {
				
				if(x % 2 == 0) {
					soma += x;
					cont += 1;
				}
				x += 1;
			}
			
			System.out.println(soma);
			x = sc.nextInt();
		}

		sc.close();

	}

}
