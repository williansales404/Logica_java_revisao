import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int maior = 0, posicao = 0;
		
		for(int i = 1; i <= 100; i++) {
			int n = sc.nextInt();
			if(n > maior) {
				maior = n;
				posicao = i;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();

	}

}
