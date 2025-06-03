import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 1, soma = 0;
		
		while(n != 0) {
			n = sc.nextInt();
			soma += n;
			
		}
		
		System.out.println(soma);
		
		
		sc.close();

	}

}
