import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = n, mult = 0;
		
		for(int i = 1; i < n; i++) {
			//mult recebe a multiplicação
			//soma conserva o resultado de mult para multiplica pelo novo numero de i < n=10 e vai ate 1 a 9
			mult = i * soma;
			soma = mult;
		}
		
		System.out.println(mult);
		
		sc.close();

	}

}
